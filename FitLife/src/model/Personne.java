package model;

public class Personne {
	
	/*Attributs*/
	private String nom;
	private String prenom;
	private String email;
	private String password;
	
	/*Getters et setters*/
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
	/*Constructeur(s)*/
	public Personne(String nom, String prenom, String email, String password) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
	}
	
	
	
	/*Méthodes*/
	public Boolean ModifierInfoCompte() {
		return null;
		
	}
}
