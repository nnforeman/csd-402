import java.util.ArrayList;

public class UseFans {

    public static void displayFan(Fan fan) {
        System.out.println("Fan Status: " + (fan.isOn() ? "ON" : "OFF"));
        System.out.println("Speed: " + fan.getSpeed());
        System.out.println("Color: " + fan.getColor());
        System.out.println("Radius: " + fan.getRadius());
        System.out.println();
    }

    public static void displayFans(ArrayList<Fan> fans) {
        for (Fan fan : fans) {
            displayFan(fan);
        }
    }

    public static void main(String[] args) {

        ArrayList<Fan> fanList = new ArrayList<>();

        Fan fan1 = new Fan();
        Fan fan2 = new Fan(Fan.FAST, true, 10, "blue");
        Fan fan3 = new Fan(Fan.MEDIUM, true, 8, "yellow");

        fanList.add(fan1);
        fanList.add(fan2);
        fanList.add(fan3);

        fan1.setOn(true);
        fan1.setSpeed(Fan.SLOW);
        fan1.setColor("red");
        fan1.setRadius(7);

        displayFans(fanList);
    }
}
