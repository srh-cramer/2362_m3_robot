public class Robot {

    // Attribute:
    private String name;
    private int buildYear;
    private int height;
    private String color;
    private int batteryPower;

    // Konstruktor:
    public Robot(String name, int height, String color){
        this.name = name;
        this.height = height;
        this.color = color;
        this.batteryPower = 100;
    }

    public String getInfo(){
        return "Robot " + this.name
                + ", height: " + this.height
                + ", build year: " + this.buildYear
                + ", color: " + this.color
                + ", batteryPower: " + this.batteryPower
                + ".";
    }

    public int add(int a, int b){
        this.losePower();
        return a + b;
    }

    public void losePower(){
        this.batteryPower = this.batteryPower - 1;
    }

    public void setBuildYear(int newBuildYear){
        this.buildYear = newBuildYear;
    }

    public int getBuildYear(){
        return buildYear;
    }
}
