package L6.comparator;

import L6.model.City;

import java.util.Comparator;


/**
 * Сортировка городов по названию
 */
public class TitleCityComparator implements Comparator<City> {

    @Override
    public int compare(City o1, City o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }

}
