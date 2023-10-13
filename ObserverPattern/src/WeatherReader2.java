public class WeatherReader2 implements Runnable,Observer{
    WeatherServer server;
    int num;
    int duration;
    public WeatherReader2(WeatherServer server,int num,int duration){
        this.server = server;
        this.num = num;
        this.duration = duration;

    }
    @Override
    public void run(){

    }

    @Override
    public void update(){
        System.out.println("온도:" + server.temperature);
    }
}
