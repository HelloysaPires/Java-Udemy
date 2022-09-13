package layout;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AppLayout extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
	

		// Scene principal = new Scene (new TesteAnchorPane(), 800, 600);
		// Scene principal = new Scene (new TestarBorderPane(), 800, 600);
		// Scene principal = new Scene (new TestarFlowPane(), 800, 600);
		// Scene principal = new Scene (new TestarGridPane(), 800, 600);
		// Scene principal = new Scene (new TesteSctackPane(), 800, 600);
		Scene principal = new Scene (new TesteTilePane(), 800, 600);

		
		primaryStage.setScene(principal);
		primaryStage.setTitle("Gerenciador de layout");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
