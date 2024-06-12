package com.sample.mongo.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document(collection = "details")
@Data
@AllArgsConstructor
public class User {
    @MongoId
    private String id;
    @Field(name = "user_folio")
    private String user;
    @Field(name = "user_name")
    private String folio;
}
