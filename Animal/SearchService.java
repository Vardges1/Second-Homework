public interface SearchService {
    String[] findLeapYearNames(AbstractAnimal[] animals);
    AbstractAnimal[] findOlderAnimal(AbstractAnimal[] animals, int n);
    void findDuplicate(AbstractAnimal[] animals);
}
