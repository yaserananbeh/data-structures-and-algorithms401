package stack.and.queue;

public class AnimalShelter {
    private final Queue<DogShelter> dogs;
    private final Queue<CatShelter> cats;

    public AnimalShelter() {
        dogs = new Queue<DogShelter>();
        cats = new Queue<CatShelter>();
    }

    public void enqueue(DogShelter dog) {
        dogs.enqueue(dog);
    }

    public void enqueue(CatShelter cat) {
        cats.enqueue(cat);
    }

    public Animal dequeue(String animal) {
        if (animal.toLowerCase().equals("dog") && !dogs.isEmpty()) {
            return dogs.dequeue();
        } else if (animal.toLowerCase().equals("cat") && !cats.isEmpty()) {
            return cats.dequeue();
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        return "AnimalShelter{" +
                "dogs=" + dogs +
                ", cats=" + cats +
                '}';
    }
}
