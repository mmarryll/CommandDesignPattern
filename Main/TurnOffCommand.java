//Выключение света
public class TurnOffCommand implements ICommand {

    Light light;

    public TurnOffCommand(Light light) {
        super();
        this.light = light;
    }

    public void execute() {
        System.out.println("Turning off light.");
        light.turnOff();
    }
}
