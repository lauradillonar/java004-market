package com.confluenciacreativa.market.persistence;

import com.confluenciacreativa.market.persistence.crud.ProductoCrudRepository;
import com.confluenciacreativa.market.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository {

    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll() {
        return (List<Producto>) productoCrudRepository.findAll();
    }
}
