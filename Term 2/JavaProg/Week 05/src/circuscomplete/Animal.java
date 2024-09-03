package circuscomplete;

public class Animal {

    private AnimalType animalType;

    public Animal(AnimalType animal) {
        this.animalType = animal;
    }

    public AnimalType getAnimalType()
    {
        return animalType;
    }
}
