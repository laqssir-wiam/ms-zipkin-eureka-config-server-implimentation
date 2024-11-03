package com.school.school.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
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
public class School {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String email;
}
