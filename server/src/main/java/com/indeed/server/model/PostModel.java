package com.indeed.server.model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

//mongo db will create the collection and her name wad post
@Document(collation = "post")
@Data
public class PostModel {
//    ALL other are the keys
    @NotNull
    @NotEmpty
    private String profile;

    @NotNull
    private String type;

    @NotNull
    private String decription;

    @NotNull
    private String experience;

    @NotNull
    private String technology[];

    @NotNull
    private String Salary;

    @CreatedDate
    private Date createdAt;
}
