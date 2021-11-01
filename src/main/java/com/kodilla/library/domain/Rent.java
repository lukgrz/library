package com.kodilla.library.domain;

import javax.persistence.*;
import java.time.LocalDate;

@Entity(name = "COPIES")
public class Rent {

    @Id
    @GeneratedValue
    private long id;

    @OneToOne
    @Column(name = "USER_ID")
    private User user;

    @OneToOne
    @Column(name = "COPY_ID")
    private Copy copy;

    @Column(name = "DATE_OF_RENT")
    private LocalDate rentalDate;

    @Column(name = "DATE_OF_RETURN")
    private LocalDate returnDate;
}
