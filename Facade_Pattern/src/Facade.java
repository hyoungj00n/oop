public class Facade {

    DB db = new DB();
    Cache cache = new Cache();

    public void insert(String n,String name){
        db.insert(n,new Row(name));
    }


}
