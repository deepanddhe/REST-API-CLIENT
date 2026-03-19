import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
public class ApiClient {
    public static void main(String[] args) {
        try {
            URL url = new URI("https://api.agify.io/?name=deepan").toURL();
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            int status = conn.getResponseCode();
            if (status == 200) {
                        BufferedReader br = new BufferedReader(
                        new InputStreamReader(conn.getInputStream())
                );
                String line;
                String result = "";
                while ((line = br.readLine()) != null) {
                    result = result + line;
                }
                br.close();
                String name = result.split("\"name\":\"")[1].split("\"")[0];
                String age = result.split("\"age\":")[1].split(",")[0];
                String count = result.split("\"count\":")[1].split("}")[0];
                System.out.println("----- API RESULT -----");
                System.out.println("Name   : " + name);
                System.out.println("Age    : " + age);
                System.out.println("Count  : " + count);

            } else {
                System.out.println("Error in API call");
            }
        } catch (Exception e) {
            System.out.println("Exception occurred");
        }
    }
}
