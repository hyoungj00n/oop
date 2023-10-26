public abstract class Shape {

    private int minBoundsX;
    private int minBoundsY;
    private int maxBoundsX;
    private int maxBoundsY;

    public int getMinBoundsX() {
        return minBoundsX;
    }

    public int getMinBoundsY() {
        return minBoundsY;
    }

    public int getMaxBoundsX() {
        return maxBoundsX;
    }

    public int getMaxBoundsY() {
        return maxBoundsY;
    }

    public void setMinBoundsX(int minBoundsX) {
        this.minBoundsX = minBoundsX;
    }

    public void setMinBoundsY(int minBoundsY) {
        this.minBoundsY = minBoundsY;
    }

    public void setMaxBoundsX(int maxBoundsX) {
        this.maxBoundsX = maxBoundsX;
    }

    public void setMaxBoundsY(int maxBoundsY) {
        this.maxBoundsY = maxBoundsY;
    }

    public abstract void calcBounds();
    public abstract String getShapeName();
}
