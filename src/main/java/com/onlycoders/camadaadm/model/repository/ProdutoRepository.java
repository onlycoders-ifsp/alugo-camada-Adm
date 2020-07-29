package com.onlycoders.camadaadm.model.repository;

import com.onlycoders.camadaadm.model.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
    List<Produto> getByNome(String nome);
}
