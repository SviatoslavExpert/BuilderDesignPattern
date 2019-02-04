package com.gmail.granovskiy;

public class TestRobotBuilder {

    public static void main(String[] args) {

        RobotBuilder oldStyleRobot = new OldRobotBuilder();  //  !!!

        RobotEngineer robotEngineer = new RobotEngineer(oldStyleRobot);

        robotEngineer.makeRobot();

        Robot firstRobot = robotEngineer.getRobot();

        System.out.println("Robot built");

        System.out.println("Robot head type: " + firstRobot.getRobotHead());
        System.out.println("Robot torso type: " + firstRobot.getRobotTorso());
        System.out.println("Robot arm type: " + firstRobot.getRobotArms());
        System.out.println("Robot leg type: " + firstRobot.getRobotLegs());
    }
}
