/*
Name: Natasha Foreman
Course: CSD 402 – Java for Programmers
Date: January 31, 2026
Assignment: Module 6
Purpose: Write a program with a class titled Fan.
*/

public class Fan {

    // Constants
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Fields
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // Getter and Setter methods
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    // No-argument constructor
    public Fan() {
        speed = STOPPED;
        on = false;
        radius = 6;
        color = "white";
    }

    // Argument constructor
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // toString method
    @Override
    public String toString() {
        if (on) {
            return "Fan is ON\n"
                 + "Speed: " + speed
                 + "\nColor: " + color
                 + "\nRadius: " + radius;
        } else {
            return "Fan is OFF\n"
                 + "Color: " + color
                 + "\nRadius: " + radius;
        }
    }

    // Test code
    public static void main(String[] args) {

        // Fan using default constructor
        Fan fan1 = new Fan();
        System.out.println("Fan 1:");
        System.out.println(fan1);

        System.out.println();

        // Fan using argument constructor
        Fan fan2 = new Fan(FAST, true, 10, "blue");
        System.out.println("Fan 2:");
        System.out.println(fan2);

        System.out.println();

        // Setter methods
        fan1.setOn(true);
        fan1.setSpeed(MEDIUM);
        fan1.setColor("yellow");
        fan1.setRadius(8);

        System.out.println("Fan 1 after changes:");
        System.out.println(fan1);
    }
}