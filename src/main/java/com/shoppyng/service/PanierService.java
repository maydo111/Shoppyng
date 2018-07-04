package com.shoppyng.service;

import java.util.List;

import com.shoppyng.modele.Panier;
import com.shoppyng.modele.Produit;

public interface PanierService {
	public void addProduit(Panier panier ,Produit produit);
	public void deleteProduit(Panier panier ,Produit produit);
	public List<Produit> getAllProduits(Panier panier);
	public Double getMontantTotal(Panier panier);
	

}
