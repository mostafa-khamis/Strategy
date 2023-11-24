import display.IDisplay;
import fly.IFly;
import quack.IQuack;

public class Duck {
    IFly iFly;
    IQuack iQuack;
    IDisplay iDisplay;

    public Duck(IFly iFly, IQuack iQuack, IDisplay iDisplay) {
        this.iFly = iFly;
        this.iQuack = iQuack;
        this.iDisplay = iDisplay;
    }

    public void fly(){
        this.iFly.fly();
    }
    public void display(){
        this.iDisplay.display();
    }
    public void quack(){
        this.iQuack.quack();
    }

}
