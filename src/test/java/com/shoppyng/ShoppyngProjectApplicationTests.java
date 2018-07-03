package com.shoppyng;


import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.shoppyng.entities.Client;
import com.shoppyng.entities.Panier;
import com.shoppyng.entities.Produit;
import com.shoppyng.service.PanierService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShoppyngProjectApplicationTests {
    private Panier panier;
    private Produit produit1;
    private Produit produit2;
    private Produit produit3;
    
    @Autowired
    PanierService panierService ;
	
	@Before
	   public void setUp() throws Exception {
		Client client = new Client(1,"client1Nom","client1Prenom");
		 produit1 = new Produit(1,"prouit1",20.50);
		 produit2 = new Produit(2,"prouit2",40.50);
	     produit3 = new Produit(3,"prouit3",60.50);
		List<Produit> listProduits=new ArrayList<>();
		listProduits.add(produit1);
		listProduits.add(produit2);
		listProduits.add(produit3);
		panier=new Panier(1,client,listProduits);
	   }
	@Test
	public void testDeletProduit() {
		panierService.deleteProduit(panier, produit1);
		assertEquals(2,panier.getListProduits().size());
	}
	
	@Test
	public void testAddProduit() {
		 Produit produit4 = new Produit(4,"prouit4",20.50);
		panierService.addProduit(panier, produit4);
		assertEquals(3,panier.getListProduits().size());
	}
	
	@Test
	public void testMontantFinal() {
		Double montantFinal = panierService.getMontantTotal(panier);
		assertEquals(12.5,montantFinal,0.001);
	}

}
