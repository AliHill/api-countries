package com.api.countries.apicountries.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import java.lang.*;

public class Country {

    @Id
    public ObjectId _id;

    public String name;
    public String capitalCity;
    public String mainAttraction;

    // Constructors
    public Country() {}

    public Country(ObjectId _id, String name, String capitalCity, String mainAttraction) {
        this._id = _id;
        this.name = name;
        this.capitalCity = capitalCity;
        this.mainAttraction = mainAttraction;
    }

    public String get_id() { return _id.toString(); }
    public void set_id(ObjectId _id) { this._id = _id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCapitalCity() { return capitalCity; }
    public void setCapitalCity(String capitalCity) { this.capitalCity = capitalCity; }

    public String getMainAttraction() { return mainAttraction; }
    public void setMainAttraction(String mainAttraction) { this.mainAttraction = mainAttraction; }
}