package com.dh.catalog.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serial;

@Document
public class CatalogSeries {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    private long movieId;
}
