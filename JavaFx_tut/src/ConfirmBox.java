import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class ConfirmBox {
	
	static boolean ans;
	
	public static boolean display(String message) {
	
	Stage window = new Stage();		
	window.setTitle("Popup");
	window.setMinWidth(300);
	window.setMinHeight(200);
	window.initModality(Modality.APPLICATION_MODAL);
	
	Button yes_btn = new Button("Yes");
	Button no_btn = new Button("No");
	
	yes_btn.setOnAction(event -> {
		ans = true;
		window.close();
	});
	
	no_btn.setOnAction(event -> {
		ans = false;
		window.close();
	});
	Label label = new Label(message);
	
	VBox layout = new VBox(10);
	layout.getChildren().addAll(label, yes_btn, no_btn);
	layout.setAlignment(Pos.CENTER);
	
	Scene scene = new Scene(layout);
	
	window.setScene(scene);
	window.showAndWait();
	
	return ans;
	}
}
