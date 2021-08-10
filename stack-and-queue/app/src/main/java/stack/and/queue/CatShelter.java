package stack.and.queue;

public class CatShelter extends Animal {
    public CatShelter(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Cat : "+getName()+" -  age : "+getAge();
    }
}
