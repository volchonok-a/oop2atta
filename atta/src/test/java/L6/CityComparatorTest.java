package L6;


import L6.comparator.TitleCityComparator;
import L6.model.City;
import L6.model.Country;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;


class CityComparatorTest {

    City city1 = new City()
            .setTitle("Москва")
            .setPopulation(100000)
            .setCountry(
                    new Country()
                            .setName("Россия")
                            .setContinent("Евразия")
                            .setSquare(200000)
            );

    City city2 = new City()
            .setTitle("Волгоград")
            .setPopulation(10000)
            .setCountry(
                    new Country()
                            .setName("Россия")
                            .setContinent("Евразия")
                            .setSquare(200000)
            );

    @Test
    @DisplayName("Сортировка только по названию")
    void test1(){
        var cities = new ArrayList<City>();
        cities.add(city1);
        cities.add(city2);

        cities.sort(new TitleCityComparator());

        Assertions.assertEquals(cities.get(0), city2);
        Assertions.assertEquals(cities.get(1), city1);
    }


    @Test
    @DisplayName("Сортировка только по количеству населения и стране")

    void test2(){
        var cities = new ArrayList<City>();
        cities.add(city1);
        cities.add(city2);

        cities.sort(Comparator.comparing(City::getPopulation).thenComparing(City::getCountry));

        Assertions.assertEquals(cities.get(0), city2);
        Assertions.assertEquals(cities.get(1), city1);
    }

}