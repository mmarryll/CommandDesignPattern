//Покрытие юнит-тестами
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class Tests {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(output));
    }

    @Test
    public void test1() {
        Light livingRoomLight = new Light();
        HomeAutomationRemote remote = new HomeAutomationRemote();
        remote.setCommand(new TurnOnCommand( livingRoomLight ));
        remote.buttonPressed();
        Assertions.assertEquals("Turning on light." + System.lineSeparator() + "Light is on." + System.lineSeparator(), output.toString());
    }

    @Test
    public void test2() {
        Light livingRoomLight = new Light();
        HomeAutomationRemote remote = new HomeAutomationRemote();
        remote.setCommand(new TurnOffCommand( livingRoomLight ));
        remote.buttonPressed();
        Assertions.assertEquals("Turning off light." + System.lineSeparator() + "Light is off." + System.lineSeparator(), output.toString());
    }

    @Test
    public void test3() {
        Fan livingRoomFan = new Fan();
        HomeAutomationRemote remote = new HomeAutomationRemote();
        remote.setCommand(new StartFCommand( livingRoomFan ));
        remote.buttonPressed();
        Assertions.assertEquals("Starting fan." + System.lineSeparator() + "Fan started." + System.lineSeparator(), output.toString());
    }

    @Test
    public void test4() {
        Fan livingRoomFan = new Fan();
        HomeAutomationRemote remote = new HomeAutomationRemote();
        remote.setCommand(new StopFCommand( livingRoomFan ));
        remote.buttonPressed();
        Assertions.assertEquals("Stopping fan." + System.lineSeparator() + "Fan stopped." + System.lineSeparator(), output.toString());
    }

    @AfterEach
    public void cleanUpStreams() {
        System.setOut(standardOut);
    }
}
