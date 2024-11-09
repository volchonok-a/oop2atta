package L6.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Objects;


@NoArgsConstructor
@Data
@Accessors(chain = true)
public class City {
    private String title;
    private int population;
    private Country country;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        City city = (City) o;
        return Objects.equals(title, city.title) && Objects.equals(country, city.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, country);
    }

}
