package com.api.countries.apicountries.repositories;

import com.api.countries.apicountries.models.Country;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CountryRepository extends MongoRepository<Country, String> {
    Country findBy_id(ObjectId _id);
}
