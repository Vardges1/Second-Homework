import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CreateAnimalService createAnimalService = new CreateAnimalServiceImpl();
        SearchService searchService = new SearchServiceImpl();

        createAnimalService.createTenAnimals();
        createAnimalService.createNAnimals(5);
        createAnimalService.createAnimalsWithDoWhile(7);

        Animal[] animals = new Animal[10];
        for (int i = 0; i < 10; i++) {
            animals[i] = new Pet("Breed" + i, "Pet" + i, 100.0, "Friendly", LocalDate.of(2016, 2, 20));
        }

        String[] leapYearNames = searchService.findLeapYearNames(animals);
        System.out.println("Animals born in leap years: " + Arrays.toString(leapYearNames));
    }
}
