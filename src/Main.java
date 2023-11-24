import display.DisplayAsText;
import fly.NoFly;
import quack.SimpleQuack;

public class Main {
    public static void main(String[] args) {
        DisplayAsText displayAsText = new DisplayAsText();
        displayAsText.display();
        NoFly noFly = new NoFly();
        noFly.fly();
        SimpleQuack simpleQuack = new SimpleQuack();
        simpleQuack.quack();

        Duck duck = new Duck(noFly,simpleQuack,displayAsText);
        System.out.println(duck);
    }
}