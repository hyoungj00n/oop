public class KoreanUser implements Observer{
    String name;

    public KoreanUser(String name){
        this.name = name;
    }
    @Override
    public void display(WeatherAPI weatherAPI) {
        System.out.println(name + " temp: "+ weatherAPI.getTmep()+ " pressure: " + weatherAPI.getPressure());
    }
}
