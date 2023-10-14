public class WeatherReader1 implements Observer,Runnable{

    WeatherServer server;
    int num;
    int duration;
    public WeatherReader1(WeatherServer server,int num,int duration){
        this.server = server;
        this.num = num;
        this.duration = duration;

    }
    @Override
    public void run(){

    }

    @Override
    public void update(Object o){

    }
}
