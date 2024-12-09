import java.time.LocalDate;
import java.util.Random;

public class CreateAnimalServiceImpl implements CreateAnimalService {
    private Random random = new Random();

    @Override
    public void createTenAnimals() {
        int count = 0;
        while (count < 10) {
            createRandomAnimal();
            count++;
        }
    }

    @Override
    public void createNAnimals(int n) {
        for (int i = 0; i < n; i++) {
            createRandomAnimal();
        }
    }

    @Override
    public void createAnimalsWithDoWhile(int n) {
        int count = 0;
        do {
            createRandomAnimal();
            count++;
        } while (count < n);
    }

    private void createRandomAnimal() {
        String breed = "Breed" + random.nextInt(100);
        String name = "Name" + random.nextInt(100);
        Double cost = 100 + random.nextDouble() * 200;
        String character = random.nextBoolean() ? "Friendly" : "Aggressive";
        LocalDate birthDate = LocalDate.of(2010 + random.nextInt(10), random.nextInt(12) + 1, random.nextInt(28) + 1);
        
        // Случайным образом создаем Predator или Pet
        Animal animal = random.nextBoolean() ? new Predator(breed, name, cost, character, birthDate) 
                                             : new Pet(breed, name, cost, character, birthDate);
        System.out.println("Created animal: " + animal.getName() + ", Breed: " + animal.getBreed() + ", Birthdate: " + animal.getBirthDate());
    }
}
