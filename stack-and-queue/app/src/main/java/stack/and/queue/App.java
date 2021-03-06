/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stack.and.queue;


public class App {

    public static void main(String[] args) {
        System.out.println("-----------------------------------");
        System.out.println("-------------- Stack --------------");
        System.out.println("-----------------------------------");
        Stack <String>stack1=new Stack<String>();
        stack1.push("e1");
        stack1.push("e2");
        stack1.push("e3");
        System.out.println("The stack before Any pop : "+stack1);

        System.out.println("Peek : "+stack1.peek());

        System.out.println("Is the Stack Empty : "+stack1.isEmpty());

        System.out.println("Popped node : "+stack1.pop());

        System.out.println("The stack after the pop : "+stack1);

        System.out.println("-----------------------------------");
        System.out.println("-------------- Queue --------------");
        System.out.println("-----------------------------------");
        Queue <Integer>queue1=new Queue<Integer>();
        queue1.enqueue(100);
        queue1.enqueue(200);
        queue1.enqueue(300);
        queue1.enqueue(400);
        System.out.println("The queue before Any pop : "+queue1);

        System.out.println("Peek : "+queue1.peek());

        System.out.println("Is the Queue Empty : "+queue1.isEmpty());

        System.out.println("Dequeued node : "+queue1.dequeue());

        System.out.println("The queue after pop : "+queue1);
        System.out.println("-----------------------------------");
        System.out.println("-------------- Pseudo Queue --------------");
        System.out.println("-----------------------------------");
        PseudoQueue <Integer>pseudoQueue=new PseudoQueue();
        pseudoQueue.enqueue(1);
        pseudoQueue.enqueue(2);
        pseudoQueue.enqueue(3);
        pseudoQueue.enqueue(4);
        pseudoQueue.dequeue();
        System.out.println(pseudoQueue);
        System.out.println("-----------------------------------");
        System.out.println("-------------- Animal Shelter --------------");
        System.out.println("-----------------------------------");
        AnimalShelter animalShelter=new AnimalShelter();
        CatShelter catty=new CatShelter("catty",5);
        CatShelter mishmish=new CatShelter("mishmish",2);
        DogShelter bull=new DogShelter("bull",3);
        animalShelter.enqueue(catty);
        animalShelter.enqueue(mishmish);
        animalShelter.enqueue(bull);
        animalShelter.enqueue(bull);
        System.out.println("AnimalShelter before dequeue : "+animalShelter);
        System.out.println("The dequeued dog is : "+ animalShelter.dequeue("dog"));
        System.out.println("The dequeued cat is : "+ animalShelter.dequeue("cat"));
        System.out.println("AnimalShelter after dequeue : "+animalShelter);
        System.out.println("-----------------------------------");
        System.out.println("-------------- Bracket Validator --------------");
        System.out.println("-----------------------------------");
        BracketsValidator bracketsValidator=new BracketsValidator();
        String stringValueToValidate="{()()}";
        System.out.println("Is "+ stringValueToValidate +" passed the bracket validator ? The result : ");
        System.out.println(bracketsValidator.validateBrackets(stringValueToValidate));
    }
}
