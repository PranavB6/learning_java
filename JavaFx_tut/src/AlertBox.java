import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class AlertBox {

	public static void display(String message) {
		
		Stage popup_window = new Stage();		
		popup_window.setTitle("Popup");
		popup_window.setMinWidth(300);
		popup_window.setMinHeight(300);
		popup_window.initModality(Modality.APPLICATION_MODAL);
		
		Button button = new Button("Close me");
		button.setOnAction(event -> popup_window.close());
		
		Label label = new Label(message);
		
		VBox layout = new VBox(10);
		layout.getChildren().addAll(label, button);
		layout.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(layout);
		
		popup_window.setScene(scene);
		popup_window.showAndWait();
		
		
	}
}
