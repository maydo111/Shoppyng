package com.shoppyng.service.Impl;


import java.util.List;

import org.springframework.stereotype.Service;

import com.shoppyng.modele.Panier;
import com.shoppyng.modele.Produit;
import com.shoppyng.service.PanierService;

@Service
public class PanierServiceImpl implements PanierService{
	

	@Override
	public void addProduit(Panier panier , Produit produit) {
		panier.getListProduits().add(produit);	
	}

	@Override
	public void deleteProduit(Panier panier ,Produit produit) {
		panier.getListProduits().remove(produit);
		
	}

	@Override
	public List<Produit> getAllProduits(Panier panier ) {
		return panier.getListProduits();	
	}

	@Override
	public Double getMontantTotal(Panier panier) {
	Double montantTotal = 0D;
	for(Produit p : panier.getListProduits()){
		montantTotal +=  p.getPrix();
	}
	return montantTotal;
		
	}

	

}
