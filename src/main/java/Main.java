import com.fasterxml.jackson.databind.ObjectMapper;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        // Sending HTTP GET request and getting JSON from URL
        OkHttpGet getJson = new OkHttpGet();

        String url = "https://www.7timer.info/bin/astro.php?lon=74.59&lat=42.88&ac=0&unit=metric&output=json&tzshift=0";
        String response = getJson.getString(url);

        // JSON to class
        ObjectMapper objectMapper = new ObjectMapper();
        MyClass myClass = objectMapper.readValue(response, MyClass.class);

        // Printing
        System.out.println(myClass);

    }
}


class OkHttpGet {
    private OkHttpClient client = new OkHttpClient();

    String getString(String url) {
        Request request = new Request.Builder().url(url).build();

        try {
            Response response = client.newCall(request).execute();
            return response.body().string();
        }catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}