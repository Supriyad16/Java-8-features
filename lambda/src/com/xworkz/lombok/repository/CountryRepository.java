package com.xworkz.lombok.repository;


import java.util.Collection;

public interface CountryRepository<T> {
        Collection<T> countryFetch();
    }

