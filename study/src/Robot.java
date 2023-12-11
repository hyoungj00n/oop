public class Robot {
    MoveStrategy moveStrategy;
    TranslateStrategy translateStrategy;

    public Robot(MoveStrategy moveStrategy, TranslateStrategy translateStrategy){
        this.moveStrategy = moveStrategy;
        this.translateStrategy = translateStrategy;

    }

    public void move(){
        moveStrategy.move();;
    }

    public void translate(){
        translateStrategy.translate();
    }
}
