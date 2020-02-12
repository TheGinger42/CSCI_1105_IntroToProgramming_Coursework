package ball;
/**
 * Author: Troy Aiken
 * Class: Object-Oriented Programming
 * Date: 02/12/2020
 * movement.
 */
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
public class BallControl extends Application implements EventHandler<ActionEvent>{
	
	
	@Override
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		double radius = 20;
		double y = 10;
		double x = 10;
		Circle circle = new Circle(x, y, radius);
		pane.getChildren().add(circle);
		circle.setFocusTraversable(true);
		//move on key pressed
		circle.setOnKeyPressed(e -> {
			
			if (e.getCode() == KeyCode.UP) {
				if (circle.getCenterY() > 30) {
					circle.setCenterY(circle.getCenterY() - 5);	
				}
			}
			else if (e.getCode() == KeyCode.DOWN) {
				if (circle.getCenterY() < 170) {
					circle.setCenterY(circle.getCenterY() + 5);
				}
			}
			else if (e.getCode() == KeyCode.LEFT) {
				if(circle.getCenterX() > 30) {
					circle.setCenterX(circle.getCenterX() - 5);
				}
			}
			else if (e.getCode() == KeyCode.RIGHT) {
				if(circle.getCenterX() < 170) {
					circle.setCenterX(circle.getCenterX() + 5);
				}
			}
		});
	
		
		Scene scene = new Scene(pane, 200, 200);
		primaryStage.setTitle("Ball Control");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub
		
	}	
}
