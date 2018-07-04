package com.shoppyng.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shoppyng.modele.Panier;
import com.shoppyng.modele.Produit;
import com.shoppyng.service.PanierService;

@RestController
public class PanierRestService {
	
	@Autowired
	private PanierService panierService;
	
	@GetMapping(value = "/produits")
	public List<Produit> getProduits(@PathVariable Panier panier){		
		return panierService.getAllProduits(panier);
	}
	@GetMapping(value = "/montant")
	public Double getMontantTotal(@PathVariable  Panier panier){
		return panierService.getMontantTotal(panier);
	}
	
	@PostMapping(value = "/produit")
	public void addProduit(@PathVariable Panier panier , @PathVariable Produit produit){
		panierService.addProduit(panier, produit);
	}
	
	@DeleteMapping(value = "/produit")
	public void deleteProduits(@PathVariable Panier panier , @PathVariable Produit produit){
		 panierService.deleteProduit(panier, produit);
	}
	
	

}
