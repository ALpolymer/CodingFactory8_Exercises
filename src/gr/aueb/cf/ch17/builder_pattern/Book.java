package gr.aueb.cf.ch17.builder_pattern;

import java.util.Locale;

public class Book {
    private long id;
    private String isbn;
    private String author;
    private String title;

    private Book(Builder builder){

    }

    public static class Builder {
        private final long id;
        private  final String isbn;
        private String author = "";
        private String title = "";

        public Builder(long id, String isbn){
            this.id = id;
            this.isbn = isbn;
        }

    }
}
