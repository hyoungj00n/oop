public class Client {
    public static void main(String[] args) {
        WeatherAPI api = new WeatherAPI();

        api.registerObserver(new KoreanUser("joon"));

        api.notifyObserver();
    }
}
