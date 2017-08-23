package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@ Override
	public void start(Stage stage) throws Exception{
		Parent parent = (Parent) FXMLLoader.load(getClass().getResource("/application/view/MainView.fxml")); //œcie¿ka dostêpu
		Scene scene= new Scene (parent);
		stage.setScene(scene);
		stage.setTitle("Main Pane JFX2");// nazwa okna
		stage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);// uruchamia aplikacjê
	
	}
}
