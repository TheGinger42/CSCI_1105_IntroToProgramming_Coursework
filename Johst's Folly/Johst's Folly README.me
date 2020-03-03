# Java-Johst's Folly
## Synopsis
This is a text-based rpg based mostly on D&D. The Story is one I made up myself and ran for my friends a few years ago. 
They enjoyed the game, I hope you do too.
##Why Johst's Folly?
I went into programming because I wanted to learn how to make a game, it seemed only right that my first game is this. I think 
I made this a bit hard on myself, and I spent way more time on it than I needed to and have only a few scenes to show for it.
##How to Play.
It's quite simple, push the buttons to progress through the game. Read what is written and make a choice when one is given. 

##Code Example
This is the method that runs through a fight scene:
'''
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
		'''
    **This sets up the scene**
    '''
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
    '''
    **The actions each button does**
    '''
		
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
    '''
    
