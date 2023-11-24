package quack;

public class NoQuack implements IQuack{
    @Override
    public void quack() {
        System.out.println("I have no quack");
    }
}
