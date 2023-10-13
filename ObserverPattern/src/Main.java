public class Main {

    public static void main(String[] args) {
        WeatherServer server = new WeatherServer();

        server.registerObserver(new WeatherReader1(server,1,10));

        server.changetemp();




    }
}
