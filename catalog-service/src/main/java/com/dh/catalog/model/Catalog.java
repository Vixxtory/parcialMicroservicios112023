package com.dh.catalog.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Document
public class Catalog implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    private long id;

    private List<CatalogMovies> movies = new ArrayList<>();
    private List<CatalogSeries> series = new ArrayList<>();
}
