package com.gmail.granovskiy;

public class RobotEngineer {
    //  it will create robot using RobotBuilder interface
    //  field
    private RobotBuilder robotBuilder;  //  robotBuilder defines mechanism for building robots
    //  constructor
    public RobotEngineer(RobotBuilder robotBuilder) {
        this.robotBuilder = robotBuilder;
    }

    public Robot getRobot() {
        return this.robotBuilder.getRobot();
    }

    public void makeRobot() {
        this.robotBuilder.buildRobotHead();
        this.robotBuilder.buildRobotTorso();
        this.robotBuilder.buildRobotArms();
        this.robotBuilder.buildRobotLegs();
    }
}
