package vue;
import com.sun.media.jfxmedia.logging.Logger;

import architecture.Vue;
import controleur.ControleurJardinator;
import javafx.scene.layout.AnchorPane;


public class VueJardinator extends Vue {

	protected ControleurJardinator controleur;
	protected static VueJardinator instance = null; 
	public static VueJardinator getInstance() {if(null==instance)instance = new VueJardinator();return VueJardinator.instance;}; 
	
	private VueJardinator() 
	{
		super("jardinator.fxml", VueJardinator.class, 1294,743);
		super.controleur = this.controleur = new ControleurJardinator();
		Logger.logMsg(Logger.INFO, "new VueJardinator()");
	}
		
	public void activerControles()
	{
		super.activerControles();
		BadgeMatelot badge = new BadgeMatelot().ajouterFondRouge().ajouterDauphinBleu().ajouterEcusson().ajouterMotto().ajouterVagues();
		BadgeMatelot badge2= new BadgeMatelot().ajouterFondBleu().ajouterDauphinRose().ajouterEcusson().ajouterCitation().ajouterVaguesBleu();

		AnchorPane espace = (AnchorPane)lookup("#espace-travail");
		espace.getChildren().add(badge2);


	}
}
