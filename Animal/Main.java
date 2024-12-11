import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CreateAnimalServiceImpl createService = new CreateAnimalServiceImpl();
        SearchServiceImpl searchService = new SearchServiceImpl();

        List<AbstractAnimal> tenAnimals = createService.createTenAnimals();
        List<AbstractAnimal> nAnimals = createService.createNAnimals(5);
        List<AbstractAnimal> doWhileAnimals = createService.createAnimalsDoWhile(7);

        List<AbstractAnimal> allAnimals = new ArrayList<>();
        allAnimals.addAll(tenAnimals);
        allAnimals.addAll(nAnimals);
        allAnimals.addAll(doWhileAnimals);

        AbstractAnimal[] animalArray = allAnimals.toArray(new AbstractAnimal[0]);

        String[] leapYearNames = searchService.findLeapYearNames(animalArray);
        System.out.println("Животные, родившиеся в високосные годы: " + Arrays.toString(leapYearNames));

        AbstractAnimal[] olderAnimals = searchService.findOlderAnimal(animalArray, 5);
        System.out.println("Животные старше 5 лет: " + Arrays.toString(olderAnimals));

        searchService.findDuplicate(animalArray);
    }
}