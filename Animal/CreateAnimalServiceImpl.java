import java.time.LocalDate;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class CreateAnimalServiceImpl implements CreateAnimalService {
    @Override
    public List<AbstractAnimal> createNAnimals(int n) {
        List<AbstractAnimal> animals = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                animals.add(new Wolf("Breed" + i, "WolfName" + i, 150.0 + i, "Aggressive", LocalDate.of(2020, 2, i + 1)));
            } else {
                animals.add(new Shark("Breed" + i, "SharkName" + i, 200.0 + i, "Ferocious", LocalDate.of(2014, 3, i + 1)));
            }
            System.out.println("Создано: " + animals.get(i).getName());
        }
        return animals;
    }

    public List<AbstractAnimal> createAnimalsDoWhile(int n) {
        List<AbstractAnimal> animals = new ArrayList<>();
        int i = 0;
        do {
            if (i % 2 == 0) {
                animals.add(new Dog("Breed" + i, "DogName" + i, 80.0 + i, "Loyal", LocalDate.of(2019, 3, i + 1)));
            } else {
                animals.add(new Cat("Breed" + i, "CatName" + i, 90.0 + i, "Independent", LocalDate.of(2016, 4, i + 1)));
            }
            System.out.println("Создано: " + animals.get(i).getName());
            i++;
        } while (i < n);
        return animals;
    }
}