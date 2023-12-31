package vue;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class BadgeMatelot extends AnchorPane{
	protected ImageView ecusson = new ImageView();
	protected ImageView vagues = new ImageView();
	protected Label motto = new Label();
	protected ImageView dauphin = new ImageView();
	
	public BadgeMatelot() {
		this.setPrefHeight(200);
		this.setPrefWidth(166);
	}
	
	public BadgeMatelot ajouterEcusson() {
		ecusson.setImage(new Image("vue/badge/armoirie.png")); // 300 x 356
		this.getChildren().add(ecusson);
		return this;
	}
	
	public BadgeMatelot ajouterVagues() {
		vagues.setImage(new Image("vue/badge/vagues-ondulees.png")); // 300 x 356
		vagues.setLayoutX(50);
		vagues.setLayoutY(40);
		this.getChildren().add(vagues);	
		return this;
	}
	public BadgeMatelot ajouterMotto() {
		motto.setText("Faire face");
		motto.setLayoutX(95);
		motto.setLayoutY(250);
		motto.setStyle("-fx-font: 25px Tahoma;");
		this.getChildren().add(motto);
		return this;
	}
		
	public BadgeMatelot ajouterDauphinBleu() {
		dauphin.setImage(new Image("vue/badge/dauphin-bleu.png")); // 100 x 100
		dauphin.setLayoutX(100);
		dauphin.setLayoutY(130);
		this.getChildren().add(dauphin);
		return this;
	}
	public BadgeMatelot ajouterDauphinRose() {
		dauphin.setImage(new Image("vue/badge/dauphin-rose.png")); // 100 x 100
		dauphin.setLayoutX(100);
		dauphin.setLayoutY(130);
		this.getChildren().add(dauphin);
		return this;
	}
	public BadgeMatelot ajouterFondBleu() {
		this.setStyle("-fx-background-color: blue;");
		return this;
	}
	public BadgeMatelot ajouterFondRouge() {
		this.setStyle("-fx-background-color: red;");
		return this;
	}
	public BadgeMatelot ajouterCitation() {
		motto.setText("Il n'y a pas d'essai");
		motto.setLayoutX(95);
		motto.setLayoutY(250);
		motto.setStyle("-fx-font: 25px Tahoma;");
		this.getChildren().add(motto);
		return this;
	}
	public BadgeMatelot ajouterVaguesBleu() {
		vagues.setImage(new Image("vue/badge/vagues.png")); // 300 x 356
		vagues.setLayoutX(0);
		vagues.setLayoutY(0);
		this.getChildren().add(vagues);	
		return this;
	}
}
			

 