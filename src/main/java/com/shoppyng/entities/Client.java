package com.shoppyng.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Client {
	@Id @GeneratedValue
	  private long id ;
	  private  String nom;
	  private String prenom ;
	  
	public Client() {
		super();
	}

	public Client(long id, String nom, String prenom) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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
	
	
	
	  
	  	

}
