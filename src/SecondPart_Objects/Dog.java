package SecondPart_Objects;

class DogTest {
    int size;
    String breed;
    String name;

    void bark(){
        System.out.println("Гав - гав!");
    }
}

public class Dog {
    public static void main(String[] args) {
        DogTest d = new DogTest();

        d.size = 40;
        d.breed = "Питбуль";
        d.name = "Макс";
        d.bark();
    }

}
