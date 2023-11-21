package com.dh.catalog.repository.DTO;

import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

public class ResponseSeriesDTO {
    private String genre;
    private List<Series> series = new ArrayList<>();

    public static class Series {
        @Id
        private String id;
        private String name;
        private String genre;
        private List<Seasons> seasons = new ArrayList<>();
    }

    public static class Seasons {
        @Id
        private String id;
        private String seasonNumber;
        private List<Chapters> chapters = new ArrayList<>();
    }
    public static class Chapters {
        @Id
        private String id;
        private String name;
        private String number;
        private String urlStream;
    }
}