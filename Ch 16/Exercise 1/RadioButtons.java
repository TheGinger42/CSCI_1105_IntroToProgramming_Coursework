package buttons;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.stage.Stage;

public class RadioButtons extends Application{
	@Override
	public void start(Stage primaryStage) {
		BorderPane pane = new BorderPane();
		
		Pane main = new Pane();
		HBox leftright = new HBox(20);
		HBox buttonBox = new HBox(49);
		buttonBox.setPadding(new Insets(5, 5, 5, 5));
		buttonBox.setStyle("-fx-border-color: black");
		buttonBox.setStyle("-fx-border-width: 3px; -fx-border-color: black");
		Label label = new Label("Perfect Platypus Programming");
		label.setFont(Font.font("Sarif", FontWeight.BOLD, 22));
		label.layoutYProperty().bind(label.heightProperty().add(50));
		
		RadioButton red = new RadioButton("Red");
		RadioButton blue = new RadioButton("Blue");
		RadioButton green = new RadioButton("Green");
		RadioButton black = new RadioButton("Black");
		RadioButton orange = new RadioButton("Orange");
		Button left = new Button("<=");
		Button right = new Button("=>");
		
		ToggleGroup group = new ToggleGroup();
		red.setToggleGroup(group);
		blue.setToggleGroup(group);
		green.setToggleGroup(group);
		black.setToggleGroup(group);
		orange.setToggleGroup(group);
		
		leftright.getChildren().addAll(left, right);
		buttonBox.getChildren().addAll(red, blue, green, black, orange);
		leftright.setAlignment(Pos.BOTTOM_CENTER);
		pane.setCenter(label);
		pane.setTop(buttonBox);
		pane.setBottom(leftright);
		
		main.getChildren().addAll(label, pane);
		left.setOnAction(e ->{
			if (label.getLayoutX() > 0) {
				label.setLayoutX(label.getLayoutX() - 10);
			}
		});
		right.setOnAction(e ->{
			if(label.getLayoutX() < 180) {
				label.setLayoutX(label.getLayoutX() + 10);
			}
		});
		red.setOnAction(e -> {
			label.setTextFill(Color.RED);
		});
		blue.setOnAction(e ->{
			label.setTextFill(Color.BLUE);
		});
		green.setOnAction(e ->{
			label.setTextFill(Color.GREEN);
		});
		black.setOnAction(e ->{
			label.setTextFill(Color.BLACK);
		});
		orange.setOnAction(e ->{
			label.setTextFill(Color.ORANGE);
		});
		
		Scene scene = new Scene(main, 500, 250);
		primaryStage.setTitle("Radio Buttons");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
