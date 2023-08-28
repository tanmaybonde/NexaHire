package com.indeed.server.dto;

import lombok.Data;
//@DATA Annotation will be use for auto genrate the getter ahe setter in our code
@Data
public class PostDTO {

    private String profile;

    private String type;

    private String decription;

    private String experience;

    private String technology[];

    private String Salary;



}
