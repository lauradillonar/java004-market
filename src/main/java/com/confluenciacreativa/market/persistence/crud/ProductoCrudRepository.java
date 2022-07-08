package com.confluenciacreativa.market.persistence.crud;

import com.confluenciacreativa.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
}
