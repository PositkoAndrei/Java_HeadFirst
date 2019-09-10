package SecondPart_Objects.Array;

public class ArrayDog {
    String name;

    public static void main(String[] args) {
        ArrayDog dog1 = new ArrayDog();
        dog1.name = "Барт";
        dog1.bark();


        //массив типа Dog
        ArrayDog[] myDogs = new ArrayDog[3];
        //поместим в него несколько элементов
        myDogs[0] = new ArrayDog();
        myDogs[1] = new ArrayDog();
        myDogs[2] = dog1;

        //получаем доступ к обьектам с помощью ссылок из массива
        myDogs[0].name = "Фред";
        myDogs[1].name = "Джордж";

        System.out.println("Имя последней собаки - ");
        System.out.println(myDogs[2].name);

        //переберем все элементы массива
        //и вызовем для каждого метод bark
        int x = 0;
        while (x < myDogs.length) {
            myDogs[x].bark();
            x = x + 1;
        }
    }

    public void bark() {
        System.out.println(name + " сказал ГАВ!");
    }

    public void eat() {

    }

    public void chaseCat() {

    }

}