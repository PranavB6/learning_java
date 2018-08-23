import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
	
	Button button;
	Stage window;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryWindow) {
		window = primaryWindow;
		
        window.setTitle("thenewboston");
        button = new Button("Click Me");

        button.setOnAction(e -> {
        	closeApplication();
        });
        
        window.setOnCloseRequest(event -> {
        	event.consume();
        	closeApplication();
        });
        

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
		
	}
	
	private void closeApplication() {
		Boolean result = ConfirmBox.display("Are you sure you want to quit?");
		
		if (result)
			window.close();
	}
}