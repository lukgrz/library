package com.kodilla.library.domain;

import javax.persistence.*;

@Entity(name = "COPIES")
public class Copy {

    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    @Column(name = "TITLE")
    private Title title;

    @Column(name = "STATUS")
    private Status status;
}
