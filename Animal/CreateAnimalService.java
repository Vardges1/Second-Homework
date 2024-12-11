import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public interface CreateAnimalService {
    default List<AbstractAnimal> createTenAnimals() {
        List<AbstractAnimal> animals = new ArrayList<>();
        int count = 0;
        while (count < 10) {
            animals.add(new Pet("Breed" + count, "PetName" + count, 100.0 + count, "Friendly", LocalDate.of(2018, 1, count + 1)));
            System.out.println("Создано: " + animals.get(count).getName());
            count++;
        }
        return animals;
    }

    List<AbstractAnimal> createNAnimals(int n);
}
