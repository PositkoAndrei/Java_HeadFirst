package SecondPart_Objects;

class Sounds {
    boolean topHat = true;
    boolean snare = true;

    void playSnare(){
        System.out.println("бах бах ба - бах");
    }
    void playTopHat(){
        System.out.println("динь динь ди - динь");
    }
}

public class Magnets {
    public static void main(String[] args) {
        Sounds d = new Sounds();

        d.playSnare();
        d.snare = false;
        d.playTopHat();

        if (d.snare == true){
            d.playSnare();
        }

    }
}
