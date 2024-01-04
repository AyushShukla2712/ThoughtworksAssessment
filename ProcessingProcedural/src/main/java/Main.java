import processing.core.PApplet;

public class Main extends PApplet {
    public static void main(String[] args) {

        PApplet.main("Main");
    }

    private final int  width = 640;
    private final int height = 480;

    private int a,b,c,d = 0;

    private final int ball_one = 10;
    private final int ball_two= 10;
    private final int ball_three = 10;
    private final int ball_four = 10;


    @Override
    public void settings() {
        super.settings();
        size(width,height);
    }

    @Override
    public void draw() {
        ellipse(a,height/5,ball_one,ball_one);
        a++;
        ellipse(b,2*height/5,ball_two, ball_two);
        b+=2;
        ellipse(c,3*height/5,ball_three,ball_three);
        c+=3;
        ellipse(d, 4*height/5,ball_four,ball_four);
        d+=4;
    }

}