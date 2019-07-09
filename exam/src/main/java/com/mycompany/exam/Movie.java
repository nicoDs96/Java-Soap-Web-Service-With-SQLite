/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exam;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author biar
 */

@XmlRootElement(name="MOVIE")
public class Movie {
    private String title;
    private String director;
    private String year;
    private String id;

    public Movie() {
        this.director="";
        this.id="";
        this.title="";
        this.year="";
    }

    public String getTitle() {
        return title;
    }
    @XmlElement(name="title")
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }
    @XmlElement(name="director")
    public void setDirector(String director) {
        this.director = director;
    }

    public String getYear() {
        return year;
    }
    @XmlElement(name="year")
    public void setYear(String year) {
        this.year = year;
    }

    public String getId() {
        return id;
    }
    @XmlElement(name="identifier")
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Movie{" + "title=" + title + ", director=" + director + ", year=" + year + ", id=" + id + '}';
    }
    
    
    
    
}
