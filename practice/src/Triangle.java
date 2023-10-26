import java.util.Random;

public class Triangle extends Shape{
    private String name;

    private int x1,x2,x3,y1,y2,y3;
    Triangle(String type, int min, int max){
        name = type;
        MyRandom random = new MyRandom();
        this.x1 = random.randInt(min,max);
        this.x2 = random.randInt(min,max);
        this.x3 = random.randInt(min,max);
        this.y1 = random.randInt(min,max);
        this.y2 = random.randInt(min,max);
        this.y3 = random.randInt(min,max);


    }

    public void calcBounds() {
        setMinBoundsX(Math.min(x1, Math.min(x2, x3)));
        setMinBoundsY(Math.min(y1, Math.min(y2, y3)));
        setMaxBoundsX(Math.max(x1, Math.max(x2, x3)));
        setMaxBoundsY(Math.max(y1, Math.max(y2, y3)));
    }

    public String getShapeName() { return name; }


}
