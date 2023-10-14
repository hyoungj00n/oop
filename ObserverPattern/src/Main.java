public class Main {

    public static void main(String[] args) {
        WeatherServer server = new WeatherServer();
        int Duration = 10000;



        Thread serverThread = new Thread(server);
        serverThread.start();
        WeatherReader2 wr= new WeatherReader2(server,2,1000);
        Thread readerThread = new Thread(wr);
        readerThread.start();
        server.registerObserver(wr);
        try{
            Thread.sleep(Duration);
        }
        catch(Exception e){
            e.printStackTrace();
        }

        server.stopThread();
        wr.stopThread();



    }
}
