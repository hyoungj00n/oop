public class Rectangle extends Shape{

    private String name;

    private int x1, y1, x2, y2;

    // Rectangle 클래스는 min~max 사이의 좌표값 두 개를 생성해서
    // 왼쪽 상단 꼭지점을 지정하고, 너비와 높이가 30과 20인 사각형 생성
    public Rectangle(String name, int min, int max) {
        this.name = name;
        this.x1 = MyRandom.randInt(min, max);
        this.y1 = MyRandom.randInt(min, max);
        this.x2 = this.x1 + 30;
        this.y2 = this.y1 + 20;
    }

    // 사각형의 바운딩 박스는 왼쪽 상단 좌표값과 오른쪽 하단 좌표값이 각각
    // minX, minY, maxX, maxY로 지정된다.
    public void calcBounds() {
        setMinBoundsX(x1);
        setMinBoundsY(y1);
        setMaxBoundsX(x2);
        setMaxBoundsY(y2);
    }

    public String getShapeName() { return name; }
}
