package animate;
/**
 * Author: Troy Aiken
 * Class: Object-Oriented Programming
 * Date: 02/13/2020
 * animate objects play/pause with mouse click.
 */
import javafx.animation.FadeTransition;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class AnimatingRectangle extends Application {
	@Override
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		Polygon poly = new Polygon();
		poly.setStroke(Color.DARKRED);
		Rectangle square = new Rectangle(0, 0, 15, 20);
		square.setFill(Color.DARKRED);
		poly.setFill(Color.DARKOLIVEGREEN);
		poly.setRotate(55);
		ObservableList<Double> list = poly.getPoints();
		double centerX = 200 / 2, centerY = 200 / 2;
		double radius = Math.min(200, 200) * 0.4;
		int s = 5;
		for (int i = 0; i < s; i++) {
			list.add(centerX + radius * Math.cos(2 * i * Math.PI / s)); 
			list.add(centerY - radius * Math.sin(2 * i * Math.PI / s));
		} 
		pane.getChildren().add(poly);
		pane.getChildren().add(square);
		
		//path transition
		PathTransition pt = new PathTransition();
		pt.setDuration(Duration.millis(4000));
		pt.setPath(poly);
		pt.setNode(square);
		pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);;
		pt.setCycleCount(Timeline.INDEFINITE);
		//pt.setAutoReverse(true);
		pt.play();
		//fade the rectangle
		FadeTransition ft = new FadeTransition(Duration.millis(4000), square);
		ft.setFromValue(1.0);
		ft.setToValue(0.1);
		ft.setCycleCount(Timeline.INDEFINITE);
		ft.setAutoReverse(true);
		ft.play();
		
		//play/pause
		poly.setOnMouseClicked(e -> {
			if (e.getButton() == MouseButton.PRIMARY){
				ft.play();
				pt.play();
			}
			else if (e.getButton() == MouseButton.SECONDARY) {
				ft.pause();
				pt.pause();
			}
		});
		BorderPane bPane = new BorderPane();
		bPane.setCenter(pane);
		Scene scene = new Scene(bPane, 250, 250);
		
		primaryStage.setTitle("Animate!");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
