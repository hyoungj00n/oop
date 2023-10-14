public class WeatherReader2 implements Observer,Runnable{
    WeatherServer server;
    int num;
    int duration;
    private boolean stop = false;

    private int temparature;
    public WeatherReader2(WeatherServer server,int num,int duration){
        this.server = server;
        this.num = num;
        this.duration = duration;

    }
    @Override
    public void run(){
        while (!stop){
            try{
                System.out.println(temparature);
                Thread.sleep(duration);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public void stopThread(){
        stop = true;
    }

    @Override
    public void update(Object o){
        temparature = (Integer)o;
    }
}
