package com.kodilla.library.domain;

import javax.persistence.*;
import javax.print.attribute.standard.Copies;
import java.util.List;

@Entity(name = "TITLES")
public class Title {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "AUTHOR")
    private String author;

    @Column(name = "PUBLICATION_YEAR")
    private int publicationYear;

    @OneToMany
    private List<Copy> copies;
}
