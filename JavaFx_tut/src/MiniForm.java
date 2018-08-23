import javafx.application.Application;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;


public class MiniForm extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	
	@Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Welcome");
        
        GridPane gridpane = new GridPane();
        gridpane.setAlignment(Pos.CENTER);
        gridpane.setVgap(5);
        gridpane.setHgap(5);
        gridpane.setPadding(new Insets(50, 25, 25, 25));
        
        Label scenetitle = new Label("Welcome");
        gridpane.add(scenetitle, 0, 0, 1, 1);

        Label userName = new Label("User Name:");
        gridpane.add(userName, 0, 1);

        TextField userTextField = new TextField();
        gridpane.add(userTextField, 1, 1, 1, 1);

        Label pw = new Label("Password:");
        gridpane.add(pw, 0, 2);

        PasswordField pwBox = new PasswordField();
        gridpane.add(pwBox, 1, 2);
        
        Button btn = new Button("Sign in");        
        gridpane.add(btn, 0 , 2);
        
        
//        gridpane.setGridLinesVisible(true);
        
        Scene scene = new Scene(gridpane, 300, 275);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
