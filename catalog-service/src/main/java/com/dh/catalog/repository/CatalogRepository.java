package com.dh.catalog.repository;

import com.dh.catalog.model.Catalog;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CatalogRepository extends MongoRepository<Catalog,Long> {
}
