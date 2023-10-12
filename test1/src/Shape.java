
public abstract class Shape{

    private int minBoundsX;
    private int minBoundsY;
    private int maxBoundsX;
    private int maxBoundsY;

    public int getMinBoundsX(){
        return minBoundsX;
    }
    public int getMinBoundsY(){
        return minBoundsY;
    }

    public int getMaxBoundsX(){
        return maxBoundsX;
    }

    public int getMaxBoundsY(){
        return maxBoundsY;
    }

    public void setMinBoundsX(int minX) {
        this.minBoundsX = minX;
    }

    public void setMinBoundsY(int minY) {
        this.minBoundsY = minY;
    }

    public void setMaxBoundsX(int maxX) {
        this.maxBoundsX = maxX;
    }

    public void setMaxBoundsY(int maxY) {
        this.maxBoundsY = maxY;
    }

    public String toString(){
        return "success";
    }

    public abstract void calcBounds();

    public abstract String getShapeName();
}
