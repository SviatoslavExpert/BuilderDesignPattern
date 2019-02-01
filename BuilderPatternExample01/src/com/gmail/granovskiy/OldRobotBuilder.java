package com.gmail.granovskiy;

public class OldRobotBuilder implements RobotBuilder {
    //  field
    private Robot robot;  //  defining robot itself

    //  constructor,   new Robot will be created when OldRobotBuilder is called
    //  structure to create robots
    public OldRobotBuilder() {
        this.robot = new Robot();
    }

    @Override
    public void buildRobotHead() {
        robot.setRobotHead("Tin Head");
    }

    @Override
    public void buildRobotTorso() {
        robot.setRobotTorso("Tin Torso");
    }

    @Override
    public void buildRobotArms() {
        robot.setRobotArms("Blowtorch Arms");
    }

    @Override
    public void buildRobotLegs() {
        robot.setRobotLegs("Roller Skates");
    }

    public Robot getRobot() {
        return this.robot;
    }


}
