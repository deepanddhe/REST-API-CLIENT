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
                System.out.println("Response from API:");
                System.out.println(result);
              } else {
                System.out.println("Error in API call");
            }
        } catch (Exception e) {
            System.out.println("Exception occurred");
        }
    }
}
