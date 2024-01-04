import processing.core.PApplet;

public class Main extends PApplet {
    private final int width = 640;
    private final int height = 480;

    private Ball[] balls;

    public static void main(String[] args) {
        PApplet.main("Main");
    }

    @Override
    public void settings() {
        super.settings();
        size(width, height);
        initializeBalls();
    }

    private void initializeBalls() {
        balls = new Ball[]{
                new Ball(10, height / 5, 1),
                new Ball(10, 2 * height / 5, 2),
                new Ball(10, 3 * height / 5, 3),
                new Ball(10, 4 * height / 5, 4)
        };
    }

    @Override
    public void draw() {
        moveAndDisplayBalls();
    }

    private void moveAndDisplayBalls() {
        for (Ball ball : balls) {
            ball.moveAndDisplay(this);
        }
    }

    private static class Ball {
        private float x, y, diameter, speed;

        public Ball(float diameter, float y, float speed) {
            this.x = 0;
            this.y = y;
            this.diameter = diameter;
            this.speed = speed;
        }

        public void moveAndDisplay(PApplet parent) {
            parent.ellipse(x, y, diameter, diameter);
            x += speed;
        }
    }
}
