public class Triangle extends ShapeFactoryInterface{

    MyRandom r = new MyRandom();
    private int x1 = r.randInt(10,20);
    private int x2 = r.randInt(10,20);
    private int x3 = r.randInt(10,20);
    private int y1 = r.randInt(10,20);
    private int y2 = r.randInt(10,20);
    private int y3 = r.randInt(10,20);

    public Triangle(String name, int min, int max){

    }
    Shape createShape(String type, int min, int max){

    };

    public void calcBounds(){

    }
    public String getShapeName(){
        return "삼각형";
    }
}
