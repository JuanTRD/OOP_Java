import src.Animal;
import src.Chicken;
import src.Tiger;
import src.Edible;
import src.Fruit;
import src.Apple;
import src.Orange;

public class App {
    public static void main(String[] args) {
        Animal[] myAnimal = new Animal[2];
        myAnimal[0] = new Tiger();
        myAnimal[1] = new Chicken();
        for (Animal animal : myAnimal) {
            System.out.println(animal.makeSound());
            if(animal instanceof Chicken){
                Edible edible = (Chicken) animal;
                System.out.println(((Chicken) animal).howToEat());
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
        }
    }
}
