//Включение света
public class TurnOnCommand implements ICommand {

    Light light;

    public TurnOnCommand(Light light) {
        super();
        this.light = light;
    }

    public void execute() {
        System.out.println("Turning on light.");
        light.turnOn();
    }
}
