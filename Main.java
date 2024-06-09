import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) {
        try {
            // HttpClient is a class for sending Http request
            HttpClient client = HttpClient.newHttpClient();

            // HttpRequest is a class for showing Http requests
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("https://faal.spclashers.workers.dev/api")) // With uri method we can specify our URL address
                    .build(); // finally with build method we build this request

            //  Now we send and get the response in here
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString()); // second paramether make respose to be ridden in string

            // showing the response in terminal
            System.out.println(response.body());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
