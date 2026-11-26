public class Robot {

    // Attribute:
    private String name;
    private int buildYear;
    private int height;
    private String color;
    private int batteryPower;

    // Konstruktor:
    public Robot(String name, int height, String color){
        this.setName(name);
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

    public void setBuildYear(int buildYear){
        this.buildYear = buildYear;
    }

    public int getBuildYear(){
        return buildYear;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        if (name != null && !name.isEmpty()){
            this.name = name;
        }
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        if (height > 0){
            this.height = height;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(int batteryPower) {
        this.batteryPower = batteryPower;
    }
}
