package com.ecommerce.AngularSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.AngularSpring.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
