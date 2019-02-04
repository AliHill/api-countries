package com.api.countries.apicountries;

import com.api.countries.apicountries.models.Country;
import com.api.countries.apicountries.repositories.CountryRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/pets")
public class CountryController {

    @Autowired
    private CountryRepository repository;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Country> getAllCountries() {
        return repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Country getCountryById(@PathVariable("id") ObjectId id) {
        return repository.findBy_id(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void modifyCountryById(@PathVariable("id") ObjectId id, @Valid
    @RequestBody Country country) {
        country.set_id(id);
        repository.save(country);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Country createCountry(@Valid @RequestBody Country country) {
        country.set_id(ObjectId.get());
        repository.save(country);
        return country;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteCountry(@PathVariable ObjectId id) {
        repository.delete(repository.findBy_id(id));
    }
}