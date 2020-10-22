package ball;

public class TestBall {
    public static void main(String[] args) {
        Ball green = new Ball(21.21,17.17);
        Ball purple = new Ball(15.15, 11.11);
        green.move(25,15);
        System.out.println(green);
        purple.move(11,39);
        System.out.println(purple);
    }
}
