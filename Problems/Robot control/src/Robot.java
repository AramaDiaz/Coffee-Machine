public class Robot {

    public int x;
    public int y;

    public Robot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Direction getDirection() {
        Direction[] directions = Direction.values();
        for (Direction direction : directions) {
            switch (direction) {
                case UP:
                    stepForward();
                    break;
                case DOWN:
                    stepForward();
                    break;
                case LEFT:
                    turnLeft();
                    break;
                case RIGHT:
                    turnRight();
                    break;
            }
        }
        return getDirection();
    }

    public int getX() {
        // current X coordinate
        return x;
    }

    public int getY() {
        // current Y o
        return y;
    }

    public void turnLeft() {
        // rotate the robot 90 degrees counterclockwise
        int position = getX();
        position += (Math.toDegrees(0) - 90);
    }

    public void turnRight() {
        // rotate the robot 90 degrees clockwise
        int position = getX();
        position += (Math.toDegrees(0) + 90);
    }

    public void stepForward() {
        // take one step in the current direction
        // x or y coordinate will be changed by 1
        int position = getY();
        if (position >0) {
            position++;
        } else {
            position--;
        }
    }
}



