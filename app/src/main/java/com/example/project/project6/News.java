package com.example.project.project6;

public class News {


    private String title;
    private String section;
    private String author;
    private String date;
    private String url;



        public News(String title, String url, String section, String author,String date ) {
           this.title= title;
            this.section = section;
            this.author=author;
            this.date=date;
            this.url = url;
        }

    public String getTitle() {
        return title;
    }

    public String getSection() {
        return section;
    }

    public String getAuthor() {
        return author;
    }

    public String getDate() {
        return date;
    }

    public String getUrl() {
        return url;
    }
}
