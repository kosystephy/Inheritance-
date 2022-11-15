package dkit.sd2;

public class bug {
    private int position;
    private int direction;

    public bug(int position) {
        this.position = position;
        this.direction = 0;
    }


    public void setPosition(int position) {
        this.position = position;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getPosition() {
        return position;
    }

    public int getDirection() {
        return direction;
    }

    public void turn() {

        if (direction == 0) {
            direction = 1;
            System.out.println("turned to left");
        } else if (direction == 1) {
            direction = 0;
            System.out.println("turned to right");
        }
    }

    public void move() {
        if (direction == 0) {
            position = position + 1;
        } else {
            position = position - 1;
        }
        System.out.println("now the position is:" + getPosition());
    }


}
