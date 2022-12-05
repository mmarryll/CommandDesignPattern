
/**
 * Demo class for HomeAutomation
 *
 */
public class Client   //client
{
    public static void main(String[] args)
    {
        Light livingRoomLight = new Light();

        Fan livingRoomFan = new Fan();

        Light bedRoomLight = new Light();

        Fan bedRoomFan = new Fan();

        HomeAutomationRemote remote = new HomeAutomationRemote(); 

        remote.setCommand(new TurnOnCommand( livingRoomLight ));
        remote.buttonPressed();

        remote.setCommand(new TurnOnCommand( bedRoomLight ));
        remote.buttonPressed();

        remote.setCommand(new StartFCommand( livingRoomFan ));
        remote.buttonPressed();

        remote.setCommand(new StopFCommand( livingRoomFan ));
        remote.buttonPressed();

        remote.setCommand(new StartFCommand( bedRoomFan ));
        remote.buttonPressed();

        remote.setCommand(new StopFCommand( bedRoomFan ));
        remote.buttonPressed();
    }
}
