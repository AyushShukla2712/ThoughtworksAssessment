import processing.core.PApplet;

public class TryProcessing extends PApplet {
    private final int  width = 640;
    private final int height = 480;
    private  int x = 0;
    private int y = 0;
    private int z= 0;
    private int a = 0;
    private final int first_ball = 10;
    private final int second_ball = 20;
    private final int third_ball = 30;
    private final int fourth_ball = 40;
    public static void main(String[] args) {

        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(width,height);
    }

    @Override
    public void draw() {
        ellipse(x,height/5,first_ball,first_ball);
        x++;
        ellipse(y,2*height/5,second_ball,second_ball);
        y+=2;
        ellipse(z,3*height/5,third_ball,third_ball);
        z+=3;
        ellipse(a, 4*height/5,fourth_ball,fourth_ball);
        a+=4;
    }

}