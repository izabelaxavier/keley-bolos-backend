package com.izabelaxavier.keleybolosapi.repository;

import com.izabelaxavier.keleybolosapi.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}