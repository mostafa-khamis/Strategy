package fly;

public class NoFly implements IFly{
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
