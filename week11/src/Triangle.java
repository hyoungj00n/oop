public class Triangle extends Shape{
    private int x1, y1, x2, y2, x3, y3;

    public Triangle(String name, int[] arr, int idx) {
        super(name);

        this.x1 = arr[idx];
        this.y1 = arr[idx + 1];
        this.x2 = arr[idx + 2];
        this.y2 = arr[idx + 3];
        this.x3 = arr[idx + 4];
        this.y3 = arr[idx + 5];
        calcBounds();
    }

    public void calcBounds() {
        setMinBoundsX(Math.min(x1, Math.min(x2, x3)));
        setMinBoundsY(Math.min(y1, Math.min(y2, y3)));
        setMaxBoundsX(Math.max(x1, Math.max(x2, x3)));
        setMaxBoundsY(Math.max(y1, Math.max(y2, y3)));
    }
}
