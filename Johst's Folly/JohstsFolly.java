package game;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Rectangle;

public class JohstsFolly extends Application{
	static Stage window;
	Scene scene1, scene2;
	static Label hp;
	static Character haze;
	@Override
	public void start(Stage primaryStage) {
		window = primaryStage;
		
		haze = new Character();
		Character wolf = new Character();
		wolf.setStr(13);
		wolf.setDex(15);
		wolf.setCon(15);
		wolf.setIntell(2);
		wolf.setWis(12);
		wolf.setCha(6);
		wolf.setLevel(1);
		wolf.setDice(6);
		wolf.setHP(((wolf.getCon() - 10) / 2) + 8);
		wolf.setDamage(1);
		wolf.setNaturalArmor(2);
		wolf.setAC(1);
		wolf.setOneHand(true);
		wolf.setDodge(1);


		Text w = new Text("The Wizard casts magic to attack, defend, and dominate. \nCannot wear armor. Begins play with a dagger and some spells.");
		Text f = new Text("The Fighter wields powerful weapons to defeat his enemies. \nMay wear any type of armor. Begins play with a great axe and chainmail armor.");
		Text r = new Text("Use a bow or small melee weapons to strike vital places. May \nwear only Light Armor. Begins play with a bow and leather armor.");
		Text hero = new Text("Welcome to Gannon");
		StackPane centerPane = centerPane();

		//Button wizard = new Button("Wizard");
		Button fighter = new Button("Fighter");
		Button rogue = new Button("Rogue");
		//Display description of classes
		//wizard.setOnMouseEntered(e -> {
		//	w.setVisible(true);
		//});
		//wizard.setOnMouseExited(e -> {
		//	w.setVisible(false);
		//});
		fighter.setOnMouseEntered(e -> {
			f.setVisible(true);
		});

		fighter.setOnMouseExited(e -> {
			f.setVisible(false);
		});
		rogue.setOnMouseEntered(e -> {
			r.setVisible(true);
		});
		rogue.setOnMouseExited(e -> {
			r.setVisible(false);
		});
		//center pane
		HBox center = new HBox(20);
		center.setStyle("-fx-background-color: sandybrown");
		VBox cc = new VBox(20);
		cc.setStyle("-fx-background-color: sandybrown");
		Label choice = new Label("Choose your Hero");
		StackPane text = new StackPane();
		text.getChildren().addAll(w, f, r);
		cc.getChildren().addAll(hero, choice, center, text);
		center.setAlignment(Pos.CENTER);
		center.getChildren().addAll(fighter, rogue);
		cc.setAlignment(Pos.CENTER);
		w.setVisible(false);
		f.setVisible(false);
		r.setVisible(false);
		StackPane stackPane = new StackPane();
		stackPane.getChildren().addAll(centerPane, cc);
		//Set the class to use
		//wizard.setOnMouseClicked(e -> { 
		//	haze.setWizard(true);
		//	scene2(haze, wolf, window);	
		//});
		fighter.setOnMouseClicked(e -> {
			haze.setFighter(true);	
			scene2(haze, wolf, window);
			System.out.println("haze HP" + haze.getHP());
		});
		rogue.setOnMouseClicked(e -> {
			haze.setRogue(true);
			scene2(haze, wolf, window);
		});

		Scene scene1 = new Scene(stackPane, 800, 800);	
		window.setTitle("Johst's Folly");
		window.setScene(scene1);
		window.show();


	}
	public static VBox leftPane(Character x) {

		//set up health bar.
		Rectangle hb100 = new Rectangle(100, 20);
		Rectangle hb80 = new Rectangle(20, 20);
		Rectangle hb65 = new Rectangle(35, 20);
		Rectangle hb50 = new Rectangle(50, 20);
		Rectangle hb35 = new Rectangle(65, 20);
		Rectangle hb20 = new Rectangle(80, 20);
		Rectangle hb0 = new Rectangle(100, 20);
		hb80.setStroke(Color.BLACK);
		hb80.setFill(Color.WHITE);
		hb65.setStroke(Color.BLACK);
		hb65.setFill(Color.WHITE);
		hb50.setStroke(Color.BLACK);
		hb50.setFill(Color.WHITE);
		hb35.setStroke(Color.BLACK);
		hb35.setFill(Color.WHITE);
		hb20.setStroke(Color.BLACK);
		hb20.setFill(Color.WHITE);
		hb0.setStroke(Color.BLACK);
		hb0.setFill(Color.WHITE);
		hb100.setStroke(Color.BLACK);
		hb100.setFill(Color.RED);
		hb80.setVisible(false);
		hb65.setVisible(false);
		hb50.setVisible(false);
		hb35.setVisible(false);
		hb20.setVisible(false);
		hb0.setVisible(false);
		StackPane hB = new StackPane();
		hB.getChildren().addAll(hb100,hb80, hb65, hb50, hb35, hb20, hb0 );
		StackPane.setAlignment(hb80, Pos.CENTER_RIGHT);
		StackPane.setAlignment(hb65, Pos.CENTER_RIGHT);
		StackPane.setAlignment(hb50, Pos.CENTER_RIGHT);
		StackPane.setAlignment(hb35, Pos.CENTER_RIGHT);
		StackPane.setAlignment(hb20, Pos.CENTER_RIGHT);
		//place in left border pane
		VBox leftPane = new VBox();
		leftPane.setSpacing(20);
		leftPane.setPadding(new Insets(5,5,5,5));
		leftPane.setStyle("-fx-background-color: sandybrown");
		double hp20 = x.getMaxHP() * .2;
		double hp50 = x.getMaxHP() * .5;
		double hp35 = x.getMaxHP() * .35;
		double hp65 = x.getMaxHP() * .65;
		double hp80 = x.getMaxHP() * .8;
		if (x.getHP() == 0) {
			hb0.setVisible(true);
		}
		else if (x.getHP() <= hp20) {
			hb20.setVisible(true);
		}
		else if(x.getHP() <= hp35) {
			hb35.setVisible(true);
		}
		else if(x.getHP() <= hp50) {
			hb50.setVisible(true);
		}
		else if (x.getHP() <= hp65) {
			hb65.setVisible(true);
		}
		else if (x.getHP() <= hp80) {
			hb80.setVisible(true);
		}
		else {
			hb100.setVisible(true);
		}
		
		hp = new Label("HP: " + x.getHP() + "/" + x.getMaxHP());
		Label xp = new Label("Current XP: " + x.getXP());
		Label str = new Label("Strength: " + x.getStr());
		Label dex = new Label("Dexterity: " + x.getDex());
		Label con = new Label("Constitution: " + x.getCon());
		Label intel = new Label("Intelligence: " + x.getIntell());
		Label wis = new Label("Wisdom: " + x.getWis());
		Label cha = new Label("Charisma: " + x.getCha());
		leftPane.getChildren().addAll(hp, hB, xp, str, dex, con, intel, wis, cha);
		return leftPane;

	}
	public static void hpUpdate() {
		hp.setText("HP: " + haze.getHP() + "/" + haze.getMaxHP());
	
	}
	public static HBox topPane() {
		HBox top = new HBox();
		top .setPadding(new Insets(20, 20, 20, 20));
		top.setStyle("-fx-background-color: sandybrown");
		return top;
		
	}

	private static void scene2(Character a, Character b, Stage window) {

		StackPane center = centerPane();
		HBox top = topPane();
		VBox left = leftPane(a);
		BorderPane borderPane = new BorderPane();
		Label text1 = new Label("\tYou have travelled for a time, looking for adventure. You reached the village Kern, the night before and took a room at the Wine Spring Inn."
				+ "Morning came, as mornings do, and you took breakfast in the common room. The tables are mostly filled with patrons; bread, meat, cheese, and some fruit fill the plates."
				+ "As you eat you food and drink your morning ale the door burst open and a man stumbled in. \n \t'Somebody help me! She's gone! My daughters gone!' he cried. \n"
				+ "\tThe barkeep recognized the merchant and attempted to calm him down. 'Calm yourself, Andrew. What's happened?' \n\t'They took Lilly. The skeletons took her. "
				+ "Spoke to the constable, said there's nothing more they can do. They're still looking for the others that were taken. Said Lilly's probably already dead.' \n\t'Oh Andrew, I'm so sorry.'"
				+ " He turned to the crowd. 'Is there no that can help?' \n\tAndrew chimed in, ' I'm willing to offer a reward to anyone that can bring her back to me.'");
		VBox right = rightPane(a, b);
		HBox bottom = new HBox();
		Button next = new Button("Continue");
		next.setOnAction(e -> {
			scene3(a, b, window);
		});

		bottom.setStyle("-fx-background-color: sandybrown");
		bottom.setPadding(new Insets(20,20,20,20));
		bottom.getChildren().add(next);
		center.getChildren().add(text1);
		text1.setWrapText(true);
		text1.setPadding(new Insets(5, 5, 5, 5));

		borderPane.setPadding(new Insets(10, 10, 10, 10));

		borderPane.setLeft(left);
		borderPane.setCenter(center);
		borderPane.setRight(right);
		borderPane.setBottom(bottom);
		borderPane.setTop(top);
		Scene scene2 = new Scene(borderPane, 800, 720);
		window.setScene(scene2);

	}
	public static void scene3(Character a, Character b, Stage window) {
		HBox top = topPane();
		HBox bottom = new HBox();
		VBox left = leftPane(a);
		VBox right = rightPane(a, b);
		StackPane center = centerPane();
		BorderPane borderPane = new BorderPane();
		Button next2 = new Button("Continue");
		Label text2 = new Label("\tIt seems someone's misfortune is your fortune. If you can succeed where others failed you stand to gain. Find the girl, Lilly and bring her home.\n\t"
				+ "You stand and declair you will give your aid. You are thanked profusely and given time to fetch your things. \n\t Andrew leads you to his house, shows you the window "
				+ "to Lilly's room is open, drapes ripped. He shows you the foot prints and the skeletal foot prints the undead made. The foot prints lead out of town, but you can see that "
				+ "they came from the direction of the cemetary. No doubt the thing was raised not long ago and came from a grave there. \n\tYou decide to follow the prints going North, into the forest.");

		next2.setOnAction(e -> {
			fightScene(a, b, window);
		});
		bottom.getChildren().add(next2);
		center.getChildren().add(text2);
		bottom.setStyle("-fx-background-color: sandybrown");
		bottom.setPadding(new Insets(20,20,20,20));
		text2.setWrapText(true);
		text2.setPadding(new Insets(5, 5, 5, 5));
		borderPane.setPadding(new Insets(10, 10, 10, 10));

		borderPane.setLeft(left);
		borderPane.setCenter(center);
		borderPane.setRight(right);
		borderPane.setBottom(bottom);
		borderPane.setTop(top);
		Scene scene3 = new Scene(borderPane, 800, 720);
		window.setScene(scene3);

	}
	public static VBox rightPane(Character a, Character b) {
		VBox right = new VBox();
		ImageView image = new ImageView("dude.png");
		image.setVisible(true);
		image.setFitHeight(90);
		image.setFitWidth(90);
		right.setStyle("-fx-background-color: sandybrown");
		right.getChildren().addAll(image);
		return right;
	}

	public static StackPane centerPane() {
		StackPane stackPane = new StackPane();
		Rectangle square = new Rectangle(600, 600);
		square.setStroke(Color.BLACK);
		square.setFill(Color.SANDYBROWN);
		stackPane.getChildren().add(square);
		return stackPane;
	}
	public static void main(String[] args) {
		launch(args);
	}

	public static boolean intimidate(Character a, Character b) {
		boolean intimidate;
		int roll = 1 + (int)(Math.random() * 21);
		int cha = ((a.getCha() - 10) / 2) + roll;
		int roll2 = 1 + (int)(Math.random() * 21);
		int fortsave = b.getFort() + roll2;
		if (cha >= fortsave) {
			intimidate = true;
		}
		else {
			intimidate = false;
		}

		return intimidate;
	}
	public static boolean tame(Character a, Character b) {
		boolean tamed;
		int roll = 1 + (int)(Math.random() * 21);
		int tame = ((a.getCha() - 10) / 2) + roll + 4;
		int roll2 = 1 + (int)(Math.random() * 21);
		int willsave = b.getWill() + roll2;
		if(tame >= willsave) {
			b.setTame(true);
			tamed = b.isTame();
		}
		else {
			b.setTame(false);
			tamed = b.isTame();
		}

		return tamed;
	}
	public static boolean hit(Character a, Character b) {
		boolean hit;
		int roll = 1 +(int)(Math.random() * 21);
		int str = (a.getStr() - 10) / 2;
		int dex = (a.getDex() - 10) / 2;
		int toHit = 0;
		if (a.isBow() == true) {
			toHit = roll + dex;
		}
		else {
			toHit = roll + str;
		}
		if (toHit > b.getAC()) {
			hit = true;
		}
		else {
			hit = false;
		}
		return hit;
	}
	public static double attack(Character x) {
		double damage = 0;
		double str = Math.round(((x.getStr() - 10) / 2));
		double bow = Math.round(1 + (Math.random() * 9));
		System.out.println(bow);
		double roll = Math.round(1 + (Math.random() * 7));
		if (x.isBow() == true) {
			damage = bow;
		}
		else if(x.isOneHand() == false) {
			str = str * 1.5;
			damage = str + (roll * 2);
		}
		else {
			damage = str + roll;
		}
		return damage;
	}
	public static void fightScene(Character a, Character b, Stage window) {
		
		BorderPane borderPane = new BorderPane();
		
		StackPane center = centerPane();
		StackPane tamescene = centerPane();
		StackPane failtame = centerPane();
	
		StackPane runScene = centerPane();
		StackPane missScene = centerPane();
		Label mon = new Label("You see a wolf. What will you do?");
		center.getChildren().add(mon);

		VBox left = leftPane(a);
		VBox right = rightPane(a, b);
		HBox bottom = new HBox();
		HBox top = topPane();
		Button attack = new Button("Attack");
		Button tame = new Button("Tame");
		Button run = new Button("Run");
		Button intimidate = new Button("Intimidate");
		Button next = new Button("Continue");
		Label miss = new Label("Your attack missed");
		Label tamed = new Label("The wolf has been tamed. He will follow you and fight for you.");
		Label tamefail = new Label("You failed to tame the wolf. Wolf attacks.");
		Label yourun = new Label("You ran away");
		
		next.setOnAction(e -> {
			scene4(a, b, window);
		});

		runScene.getChildren().add(yourun);
		tamescene.getChildren().add(tamed);
		failtame.getChildren().add(tamefail);
		missScene.getChildren().add(miss);
		tame.setOnAction(e -> {
			tame(a, b);
			if (b.isTame() == true) {
				mon.setText("The wolf has been tamed. He will follow you and fight for you.");
				bottom.getChildren().removeAll(attack, intimidate, run, tame);
				bottom.getChildren().addAll(next);
				
			}
			else {
				center.getChildren().add(failtame);
				if (hit(b, a) == true) {
					double damage = attack(b);
					a.setHP(a.getHP() - damage);
					mon.setText("You have been bitten by the wolf. It did " + damage + " damage");
				}
			}
		});
		attack.setOnAction(e -> {

			if (hit(a, b) == true) {
				double damage = attack(a);
				mon.setText("You hit your target and did " + damage + " damage.");
				b.setHP(b.getHP() - damage);
				
				if (hit(b, a) == true) {
					double mondamage = attack(b);
					a.setHP(a.getHP() - mondamage);
					mon.setText("You hit your target and did " + damage + ". \nYou have been bitten by the wolf. It did " + mondamage + " damage.");
					hpUpdate();
					
				}
				if (hit(b, a) == false) {
					mon.setText("You hit your target and did " + damage + ". \nThe wolf missed");
				}
				if (a.getHP() <= 0) {
					mon.setText("You have died.");
					bottom.getChildren().removeAll(attack, intimidate, run, tame);
					bottom.getChildren().add(next);
				}
				if(b.getHP() <= 0) {
					a.setXP(100);
					mon.setText("You win! You have gained 100 Experience points.");
					bottom.getChildren().removeAll(attack, intimidate, run, tame);
					bottom.getChildren().add(next);
					
				}
			}
			else {
				if (hit(b, a) == true) {
					double damage = attack(b);
					a.setHP(a.getHP() - damage);
					mon.setText("You missed. \nYou have been bitten by the wolf. It did " + damage + " damage.");
					hpUpdate();
					System.out.println(damage);

				}
				if (a.getHP() <= 0) {
					mon.setText("You have died.");
					bottom.getChildren().removeAll(attack, intimidate, run, tame);
					bottom.getChildren().add(next);
				}
				if(b.getHP() <= 0) {
					a.setXP(100);
					mon.setText("You win! You have gained 100 Experience points.");
					bottom.getChildren().removeAll(attack, intimidate, run, tame);
					bottom.getChildren().add(next);
					
				}
				
			}
			hpUpdate();
		});

		intimidate.setOnAction(e -> {
			if (intimidate(a, b) == true) {
				mon.setText("The wolf runs away");
				bottom.getChildren().removeAll(attack, intimidate, run, tame);
				bottom.getChildren().addAll(next);
				
				
			}
			else if (hit(b, a) == true) {
				double damage = attack(b);
				a.setHP(a.getHP() - damage);
				mon.setText("You have been bitten by the wolf. It did " + damage + " damage");
				leftPane(a);
				if (a.getHP() <= 0) {
					mon.setText("You have died.");
					bottom.getChildren().removeAll(attack, intimidate, run, tame);
					
				}
				if(b.getHP() <= 0) {
					a.setXP(100);
					mon.setText("You win! You have gained 100 Experience points.");
					bottom.getChildren().removeAll(attack, intimidate, run, tame);
					bottom.getChildren().addAll(next);
					
				}

			}
		});
		run.setOnAction(e -> {
			center.getChildren().addAll(runScene, next);
		
		});
		
		bottom.setStyle("-fx-background-color: sandybrown");
		bottom.setPadding(new Insets(20,20,20,20));
		bottom.getChildren().addAll(attack, intimidate, tame, run);
		borderPane.setPadding(new Insets(10, 10, 10, 10));
		borderPane.setLeft(left);
		borderPane.setCenter(center);
		borderPane.setRight(right);
		borderPane.setBottom(bottom);
		borderPane.setTop(top);
		Scene fight = new Scene(borderPane, 800, 720);
		window.setScene(fight);
	}
	public static void scene4(Character a, Character b, Stage window) {
		BorderPane borderPane = new BorderPane();
		StackPane center = centerPane();
		HBox top = topPane();
		VBox left = leftPane(a);
		VBox right = rightPane(a, b);
		HBox bottom = new HBox();

		bottom.setStyle("-fx-background-color: sandybrown");
		bottom.setPadding(new Insets(20,20,20,20));
		bottom.getChildren().addAll();
		borderPane.setPadding(new Insets(10, 10, 10, 10));
		borderPane.setLeft(left);
		borderPane.setCenter(center);
		borderPane.setRight(right);
		borderPane.setBottom(bottom);
		borderPane.setTop(top);
		Scene scene4 = new Scene(borderPane, 800, 720);
		window.setScene(scene4);
	}
}
