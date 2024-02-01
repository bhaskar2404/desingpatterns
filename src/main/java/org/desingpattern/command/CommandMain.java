package org.desingpattern.command;

public class CommandMain {
    public static void main(String[] args) {
        Light light=new Light();
        LightOnCommand lightOn=new LightOnCommand(light);
        LightTurnOffCommand lightOff=new LightTurnOffCommand(light);
        RemoteControl rc=new RemoteControl();
        rc.setCommand(lightOn);
        rc.pressButton();
        rc.setCommand(lightOff);
        rc.pressButton();
    }
}
