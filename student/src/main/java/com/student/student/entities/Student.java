package com.student.student.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

/**
 * @author WIAM
 **/
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Builder
public class Student {
    @Id
    @Column(name="identi")
    private Integer id;
    @Column(name="nom")
    private String firstname;
    @Column(name="prenom")
    private String lastname;
    @Column(name="gmail")
    private String email;
    @Column(name="valueFrom")
    private Integer schoolId;
}
