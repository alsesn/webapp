package me.alsesn.webapp.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
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
