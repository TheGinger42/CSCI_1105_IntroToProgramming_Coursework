package clockwork;
import javafx.application.Application;
import javafx.event.ActionEvent;
//import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;

public class ShowClock extends Application{
	@Override
	public void start(Stage primaryStage) {
		ClockPane clock = new ClockPane();
		clock.setHourHandVisible(true);
		clock.setMinuteHandVisible(true);
		clock.setSecondHandVisible(true);
	
		String timeString = clock.getHour() + ":" + clock.getMinute() + ":" + clock.getSecond();
		Label lblCurrentTime = new Label(timeString);
		Button secondHand = new Button("Show Second Hand");
		
		/*secondHand.setOnAction(new EventHandler(Event e))( {
		
				clock.setSecondHandVisible(false);
			}
		});*/
		EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				if (clock.isSecondHandVisible() == true) {
					clock.setSecondHandVisible(false);
				}
				else {
					clock.setSecondHandVisible(true);
				}
			}
		};
		secondHand.setOnAction(event);
		BorderPane pane = new BorderPane();
		pane.setCenter(clock);
		pane.setBottom(lblCurrentTime);
		pane.setLeft(secondHand);
		BorderPane.setAlignment(lblCurrentTime, Pos.TOP_CENTER);
		
		Scene scene = new Scene(pane, 500, 250);
		primaryStage.setTitle("DisplayClock");
		primaryStage.setScene(scene);
		
		primaryStage.show();
		
		
	}
	public static void main(String[] args) {
		Application.launch(args);
	}
}
