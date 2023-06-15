package com.example.backendheroe.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="hero")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Hero {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    public int id;

    @NonNull
    @Column
    public String name;

    @Column
    @NonNull
    public int age;

    @Column
    @NonNull
    public String ville;

    @Column
    @NonNull
    public String skill;

}
