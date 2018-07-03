package com.shoppyng.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Produit {
	@Id @GeneratedValue
  private long id ;
  private String libelle;
  private Double prix ;
  
  public Produit() {
		super();
	}
  

public Produit(long id, String libelle, Double prix) {
	super();
	this.id = id;
	this.libelle = libelle;
	this.prix = prix;
}

  
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getLibelle() {
	return libelle;
}
public void setLibelle(String libelle) {
	this.libelle = libelle;
}
public Double getPrix() {
	return prix;
}
public void setPrix(Double prix) {
	this.prix = prix;
}
  
}
