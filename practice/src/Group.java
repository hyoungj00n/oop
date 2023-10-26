public class Group extends ShapeDecorator {
    String name;
    Shape newShape;

    public Group(String name, Shape existingShape, Shape newShape) {
        super(existingShape);
        this.name = name;
        this.newShape = newShape;
    }

    public void calcBounds() {
        existingShape.calcBounds();
        newShape.calcBounds();
        int minX = existingShape.getMinBoundsX();
        int minY = existingShape.getMinBoundsY();
        int maxX = existingShape.getMaxBoundsX();
        int maxY = existingShape.getMaxBoundsY();
        setMinBoundsX(Math.min(newShape.getMinBoundsX(), minX));
        setMinBoundsY(Math.min(newShape.getMinBoundsY(), minY));
        setMaxBoundsX(Math.max(newShape.getMaxBoundsX(), maxX));
        setMaxBoundsY(Math.max(newShape.getMaxBoundsY(), maxY));
    }

    public String toString() {
        return super.toString() + newShape.toString() + existingShape.toString();
    }

    public String getShapeName() {
        return name;
    }
}
