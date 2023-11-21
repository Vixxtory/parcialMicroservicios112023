package com.dh.catalog.repository.DTO;

import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

public class ResponseMoviesDTO {

    private String genre;
    private List<Movies> movies = new ArrayList<>();

    public static class Movies {
        @Id
        private String id;
        private String name;
        private String genre;
        private String urlStream;
    }

}
