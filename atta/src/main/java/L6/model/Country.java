package L6.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.time.LocalDate;
import java.util.Objects;


@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Country implements Comparable<Country> {

    @Override
    public int compareTo(Country o) {
        if (this.equals(o)) {
            return 0;
        }
       return this.name.compareTo(o.name);
    }

    private String name;
    private String continent;
    private int square;


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Country country = (Country) o;
        return Objects.equals(name, country.name)
                && Objects.equals(continent, country.continent)
                && Objects.equals(square, country.square);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

}
