
class Main {
    public static void main(String[] args) {
        Robot robot = new Robot(0, 0);
        moveRobot(robot, 3, 0);
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        robot.turnRight();
        robot.stepForward();
        robot.stepForward();
        robot.stepForward();
    }
}