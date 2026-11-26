void main() {
    Robot myRobot = new Robot("", 100, "black");
    IO.println(myRobot);
    myRobot.setBuildYear(2000);
    IO.println(myRobot.getBuildYear());
    IO.println("Größe davor: " + myRobot.getHeight());
    myRobot.setHeight(-10);
    IO.println("Größe danach: " + myRobot.getHeight());

    Robot mySecondRobot = new Robot("C3PO", 180, "green");
    IO.println(mySecondRobot);
    //mySecondRobot.buildYear = 1974;

    //IO.println(myRobot.name);
    //IO.println(mySecondRobot.name);

    //IO.println(myRobot.color);

    IO.println(myRobot.getInfo());
    String info = mySecondRobot.getInfo();
    IO.println(info);

//    int result = myRobot.add(5, 7);
//    IO.println(result);
//    IO.println(mySecondRobot.add(20, 4));

//    IO.println("Batteriestand vorher: " + myRobot.batteryPower);
//    myRobot.losePower();
//    IO.println("Batteriestand nachher: " + myRobot.batteryPower);
//
//    IO.println("Batteriestand vorher: " + myRobot.batteryPower);
//    myRobot.add(10, 25);
//    IO.println("Batteriestand nachher: " + myRobot.batteryPower);
}
