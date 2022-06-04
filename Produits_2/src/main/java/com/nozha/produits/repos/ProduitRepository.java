package com.nozha.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nozha.produits.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
}