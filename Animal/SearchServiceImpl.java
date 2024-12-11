import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class SearchServiceImpl implements SearchService {
    @Override
    public String[] findLeapYearNames(AbstractAnimal[] animals) {
        List<String> leapYearNames = new ArrayList<>();
        for (AbstractAnimal animal : animals) {
            if (animal.getBirthDate().isLeapYear()) {
                leapYearNames.add(animal.getName());
            }
        }
        return leapYearNames.toArray(new String[0]);
    }

    @Override
    public AbstractAnimal[] findOlderAnimal(AbstractAnimal[] animals, int n) {
        List<AbstractAnimal> olderAnimals = new ArrayList<>();
        LocalDate currentDate = LocalDate.now();
        for (AbstractAnimal animal : animals) {
            if (currentDate.minusYears(n).isAfter(animal.getBirthDate())) {
                olderAnimals.add(animal);
            }
        }
        return olderAnimals.toArray(new AbstractAnimal[0]);
    }

    @Override
    public void findDuplicate(AbstractAnimal[] animals) {
        for (int i = 0; i < animals.length; i++) {
            for (int j = i + 1; j < animals.length; j++) {
                if (animals[i].equals(animals[j])) {
                    System.out.println("Duplicate found: " + animals[i].getName());
                }
            }
        }
    }
}