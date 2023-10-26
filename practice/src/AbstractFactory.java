public abstract class AbstractFactory {


    public IProduct operate(){
        IProduct product = create();
        return product;
    }

    protected abstract IProduct create();
}
