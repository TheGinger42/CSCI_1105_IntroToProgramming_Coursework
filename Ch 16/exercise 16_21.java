package media;
/**
 * Author: Troy Aiken
 * Class: Object-Oriented Programming
 * Date: 02/19/2020
 * Music on a Timer.
 */
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class Exercise16_21 extends Application {
	TextField sec = new TextField();
	String johan = ("https://liveexample.pearsoncmg.com/common/audio/anthem/anthem0.mp3");
	Media bach = new Media(johan);
	MediaPlayer music = new MediaPlayer(bach);
	
	Timeline timeline = new Timeline(new KeyFrame(Duration.millis(1000), e -> {
		String in = sec.getText();
		int passback = Integer.parseInt(in) - 1;
		sec.setText("" + (passback));
		System.out.println(passback);
		if (passback <= 0) {
			stTimeline();

			music.play();
		}
	}
			));

	@Override

	public void start(Stage primaryStage) {
		sec.setEditable(true);
		sec.setMaxWidth(50);

		Label k = new Label("Enter timer countdown in seconds");
		timeline.setCycleCount(Timeline.INDEFINITE);
		music.setCycleCount(MediaPlayer.INDEFINITE);
		BorderPane pane = new BorderPane();
		pane.setLeft(k);
		pane.setCenter(sec);

		sec.setOnAction(e -> {
		
			timeline.play();
		});
		
		Scene scene = new Scene(pane, 400, 100);
		primaryStage.setTitle("Media");
		primaryStage.setScene(scene);
		primaryStage.show();
	}


	public static void main(String[] args) {
		launch(args);
	}
	public void stTimeline() {
		timeline.stop();
	}
}
