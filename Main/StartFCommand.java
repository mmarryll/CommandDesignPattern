//Включение вентилятора
public class StartFCommand implements ICommand {

    Fan fan;

    public StartFCommand(Fan fan) {
        super();
        this.fan = fan;
    }

    public void execute() {
        System.out.println("Starting fan.");
        fan.start();
    }
}
