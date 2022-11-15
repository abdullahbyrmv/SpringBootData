package com.company.JPA.dao;



import com.company.JPA.entity.Country;

import java.util.List;

public interface CountryInterface {
    public List<Country> getCountryById(int id);

    public List<Country> getAllCountries();
}
