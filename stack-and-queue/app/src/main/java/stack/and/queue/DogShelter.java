package stack.and.queue;

public class DogShelter extends Animal {
    public DogShelter(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Dog : "+getName()+" - age : "+getAge();
    }
}
