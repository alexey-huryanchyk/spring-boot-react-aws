package com.ovsyanka.springbootreactaws.student;

import lombok.*;

@ToString
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private Long id;
    private String name;
    private  String email;
    private Gender gender;
}
