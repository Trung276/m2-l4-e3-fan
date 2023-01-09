public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";
    public Fan() {

    }
    public int getSpeed() {
        return speed;
    }
    public String getColor() {
        return color;
    }
    public double getRadius() {
        return radius;
    }
    public boolean isOn() {
        return on;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setOn(boolean on) {
        this.on = on;
    }
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        if(isOn() == false)
            return
                    "FAN is off" +"\n"
                            + "speed is " + getSpeed() + "\n"
                            + "color is " + getColor() + "\n"
                            + "radius is " + getRadius() + "\n";

        else return
                "FAN is on" +"\n"
                        + "speed is " + getSpeed() + "\n"
                        + "color is " + getColor() + "\n"
                        + "radius is " + getRadius() + "\n";
    }
}
