package com.school.school.entities;

import lombok.*;

import java.util.List;

/**
 * @author WIAM
 **/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FullSchoolResponse {

    private String name;
    private String email;
    List<Student> students;
}