package com.xworkz.lombok.runner;


import com.xworkz.lombok.dto.CountryDTO;
import com.xworkz.lombok.repository.CountryRepository;
import com.xworkz.lombok.repository.CountryRepositoryImp;



import java.util.Collection;
import java.util.Optional;

import static java.util.Arrays.stream;

public class CountryRunner {

    public static void main(String[] args) {

        CountryRepository countryRepository = new CountryRepositoryImp();
        Collection<CountryDTO> country = countryRepository.countryFetch();

        System.out.println("1. All countries");
        country.forEach(countryDTO -> System.out.println(countryDTO));

        System.out.println("------");

        System.out.println("2. All countries ending with 'a'");
        country.stream()
                .filter(c->c.getName().toLowerCase().endsWith("a"))
                .forEach(c-> System.out.println("Country Name:"+c.getName()));

        System.out.println("------");

        System.out.println("3. All countries starting with 'R'");
        country.stream()
                .filter(c-> c.getName().toUpperCase().startsWith("R"))
                .forEach(c-> System.out.println("Country Name:"+c.getName()));

        System.out.println("------");

        System.out.println("4.  Country by pin code 1095");
        country.stream()
                .filter(p -> p.getPinCode() == 1095)
                .forEach(c -> System.out.println("Country Name: " + c.getName()));

        System.out.println("------");

        System.out.println("5.  An optional country by Prime Minister 'Modi'");
        Optional<CountryDTO> pm = country.stream()
                .filter(p -> "Modi".equalsIgnoreCase(p.getPrimeMinister()))
                .findFirst();

        pm.ifPresent(p -> System.out.println("Country Name: " + p.getName()));

        System.out.println("------");

        System.out.println("6.All countries where primary language is English");
        country.stream()
                .filter(l -> "English".equalsIgnoreCase(l.getPrimaryLang()))
                .forEach(l -> System.out.println("Country Name: " + l.getName()));

        System.out.println("------");

        System.out.println("7.All countries where mass is between 10,000,000 and 20,000,000 sq km");
        country.stream()
                .filter(m -> m.getMassInSqKms() >= 10000000 && m.getMassInSqKms() <= 20000000)
                .forEach(m -> System.out.println("Country Name: " + m.getName()));

        System.out.println("------");

        System.out.println("8.countries with number of states > 14");
        country.stream()
                .filter(s -> s.getNoOfStates() > 14)
                .forEach(s -> System.out.println("Country Name: " + s.getName()));

        System.out.println("*** END ***");
    }
}




