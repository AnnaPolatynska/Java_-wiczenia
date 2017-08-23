package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
// musz� dziedzi�zy� i doda� @ Override

public class Main extends Application {
	
	public Main(){
		System.out.println("wywo�uje konstruktor");
		
		
	}
	@ Override
	
	public void init() throws Exception{
		System.out.println("wywo�uje metod� init ");
	}@ Override
	public void stop() throws Exception{
		System.out.println("wywo�uje metod� stop ");
			
	}@ Override
	public void start(Stage stage) throws Exception{
		Parent parent = (Parent) FXMLLoader.load(getClass().getResource("/application/view/MainView.fxml")); //�cie�ka dost�pu
		Scene scene= new Scene (parent);
		stage.setScene(scene);
		stage.setTitle("first java APP");
		stage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);// uruchamia aplikacj�
	}
}
