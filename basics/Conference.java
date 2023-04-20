package com.rtit.esilv.bin1.esilv.basics;
import java.util.ArrayList;

public class Conference {
	// Attributs
	private ArrayList<Session> sessions;
	private String nom;
	private String lieu;
	private int annee;
  
	// Constructeurs
	public Conference(String nom, String lieu, int annee) {
		//sessions = new ArrayList<>();
		this.nom = nom;
		this.lieu = lieu;
		this.annee = annee;
	}
	public Conference(ArrayList<Session> sessions, String nom, String lieu, int annee) {
		this.sessions = sessions;
		this.nom = nom;
		this.lieu = lieu;
		this.annee = annee;
	}
	// Ajouter Session
	public void addSession(Session session){ 
		sessions.add(session);
	}
	// Retourner une session i
	public Session getUneSession(int i){ 
		return sessions.get(i);
	}
	// Retourner la chaîne contenant tout le programme d'une conférence
	public String toString() {
		//A changer
		return "Conference [sessions=" + sessions + ", nom=" + nom + ", lieu=" + lieu + ", annee=" + annee + "]";
	}
}
