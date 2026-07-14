public class Task26OOP {
    public enum Direction{
        UP, DOWN, LEFT, RIGHT
    }
    public static class Robot {
        int x;
        int y;
        Direction direction;
    public Robot (int x, int y, Direction direction){
        this.x = x;
        this.y = y;
        this.direction = direction;
        }
        public int getX() {return x;}
        public int getY() {return y;}
        public Direction getDirection() {return direction;}

        public void turnLeft(){
            if (direction == Direction.UP) direction = Direction.LEFT;
            else if (direction == Direction.LEFT) direction = Direction.DOWN;
            else if (direction == Direction.DOWN) direction = Direction.RIGHT;
            else if (direction == Direction.RIGHT) direction = Direction.UP;
        }
        public void turnRight() {
            if (direction == Direction.UP) direction = Direction.RIGHT;
            else if (direction == Direction.RIGHT) direction = Direction.DOWN;
            else if (direction == Direction.DOWN) direction = Direction.LEFT;
            else if (direction == Direction.LEFT) direction = Direction.UP;
        }
        public void stepForward() {
            if (direction == Direction.UP) y++;
            else if (direction == Direction.DOWN) y--;
            else if (direction == Direction.LEFT) x--;
            else if (direction == Direction.RIGHT) x++;
        }
    }
    public static void moveRobot (Robot robot, int toX, int toY){
        if (toX > robot.getX()){
            while (robot.getDirection() != Direction.RIGHT){
                robot.turnRight();
            }
            while (robot.getX() < toX){
                robot.stepForward();
            }
        }
    }
    public static void main (String[] args){
        Robot Atlas = new Robot(0, 0, Direction.UP);
        moveRobot(Atlas, 3, 0);
        System.out.println ("Робот пришел в точку X: " + Atlas.getX()+ ", Y: " + Atlas.getY());
    }

}
