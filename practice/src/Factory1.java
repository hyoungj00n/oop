public class Factory1 extends AbstractFactory{

    public IProduct create(){

        return new Product1("과자");
    }
}
