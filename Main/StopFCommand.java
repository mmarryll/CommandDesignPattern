//Выключение вентилятора
public class StopFCommand implements ICommand {

    Fan fan;

    public StopFCommand(Fan fan) {
        super();
        this.fan = fan;
    }

    public void execute() {
        System.out.println("Stopping fan.");
        fan.stop();
    }
}
