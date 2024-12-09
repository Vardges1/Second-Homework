import java.time.Year;
import java.util.Arrays;

public class SearchServiceImpl implements SearchService {
    @Override
    public String[] findLeapYearNames(Animal[] animals) {
        return Arrays.stream(animals)
                     .filter(animal -> Year.isLeap(animal.getBirthDate().getYear()))
                     .map(Animal::getName)
                     .toArray(String[]::new);
    }
}
