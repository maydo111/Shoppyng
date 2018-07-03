package com.shoppyng.entities;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Panier {
	
	@Id @GeneratedValue
	  private long id ;
	  private  Client client;
	  private List<Produit> listProduits ;
	  

	  
	public Panier() {
		super();
	}
	
	
	public Panier(long id, Client client, List<Produit> listProduits) {
		super();
		this.id = id;
		this.client = client;
		this.listProduits = listProduits;
	}


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public List<Produit> getListProduits() {
		return listProduits;
	}
	public void setListProduits(List<Produit> listProduits) {
		this.listProduits = listProduits;
	}
	  
	  
}
