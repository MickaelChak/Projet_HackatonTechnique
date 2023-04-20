package com.rtit.esilv.bin1.esilv.basics;
import java.util.ArrayList;

public class Session {
	//Attributs
  private String specialite;
	private int jour;
	private int mois;
	private ArrayList<Presentation> presentations;

	//Constructeur 1
	public Session(String specialite, int jour, int mois){ 
	  this.specialite = specialite;
    this.jour = jour;
    this.mois = mois;
    this.presentations = new ArrayList<Presentation>();
	}
  
	//Constructeur 2
	public Session(String specialite, int jour, int mois, ArrayList<Presentation> presentations) {
		this.specialite = specialite;
		this.jour = jour;
		this.mois = mois;
		this.presentations = presentations;
	}

	//Ajouter un objet présentation au vecteur
	public void addPresentation(Presentation presentation){ 
		presentations.add(presentation);
	}
	/*Retourner la chaîne d'affichage du contenu d'une session.*/
	@Override
	public String toString() {
		return "Session de la " + specialite + ", le" + jour + "/" + mois + " la présentation" + presentations + "]";
	}
}
