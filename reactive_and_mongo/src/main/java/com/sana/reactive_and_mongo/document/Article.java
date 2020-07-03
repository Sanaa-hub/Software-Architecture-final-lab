package com.sana.reactive_and_mongo.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Article {
    
    @Id
    private int id;
    private String label;
    private String description;
    private String vendor;

    public Article(int id, String label, String description, String vendor) {
        this.id = id;
        this.label = label;
        this.description = description;
        this.vendor = vendor;
    }

    public int getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public String getDescription() {
        return description;
    }

    public String getVendor() {
        return vendor;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }
    
}
