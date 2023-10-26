public abstract class ShapeDecorator extends Shape {
    protected Shape existingShape;

    public ShapeDecorator(Shape existingShape) {
        this.existingShape = existingShape;
    }
}
