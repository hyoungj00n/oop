public class Square extends Shape{
    private int x1, y1, x2, y2;
    public Square(String name, int[] arr, int idx){
        super(name);
        this.x1 = arr[idx];
        this.y1 = arr[idx + 1];
        this.x2 = arr[idx + 2];
        this.y2 = arr[idx + 3];
        calcBounds();
    }
    @Override
    public void calcBounds() {
        setMinBoundsX(Math.min(x1, x2));
        setMinBoundsY(Math.min(y1, y2));
        setMaxBoundsX(Math.max(x1, x2));
        setMaxBoundsY(Math.max(y1, y2));
    }
}
