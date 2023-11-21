package com.dh.catalog.repository.DTO;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

public class SerieDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String genre;

    private List<Seasons> seasons = new ArrayList<>();

    public static class Seasons {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private String id;
        private String seasonNumber;
        private List<Chapters> chapters = new ArrayList<>();

        public static class Chapters {
            @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
            private String id;
            private String name;
            private String number;
            private String urlStream;
        }
    }

    public Long getId() {
        return id;
    }
}

