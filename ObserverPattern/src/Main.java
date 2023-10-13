public class Main {

    public static void main(String[] args) {
        WeatherServer server = new WeatherServer();
        Thread threadServer = new Thread(server);
        threadServer.start();



    }
}
