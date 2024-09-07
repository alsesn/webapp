package me.alsesn.webapp.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "clients")
public class ClientModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String firstName;
    private String lastName;

    @Column(unique = true, insertable = false)
    private String email;

    private String phone;
    private String address;
    private String status;
    private Date createAt;
}
