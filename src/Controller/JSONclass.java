package Controller;
import Model.Item;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;
/**
 *
 * @author Anthony
 */
public class JSONclass {
    
    private static final String USER_AGENT = "Mozilla/5.0";
    private static final String USER_LOG_GET_URL = "http://jsontest.localhost/public/js/user_log.txt";
    private static final String ITEMS_GET_URL = "http://jsontest.localhost/public/js/items.txt";
    private static final String POST_URL = "http://jsontest.localhost/index.php/welcome/addJSON";
 
    public void AddItemJSON() throws IOException{
//        Gson g = new Gson();
//        String output = sendGET(ITEMS_GET_URL);
//        List<Item> list = new ArrayList<Item>();
//        if(output != "")
//        {
//            Type items = new TypeToken<List<Item>>() {}.getType();
//            list = g.fromJson(output, items);
//        }
        Item item = new Item();
        List<Item> listo = item.items();
//        Gson g = new Gson();
//        Type items = new TypeToken<List<Item>>() {}.getType();
//        ArrayList<Item> listOfItems = g.fromJson(listo.toString(), items);
        
        
        
        //list.add(item);
        //String json = "array=" + g.toJson(listOfItems);
        System.out.println(listo);
//        System.out.println(json);
//        sendPOST(json, POST_URL);
    }
    
    private static String sendGET(String url) throws IOException {
        String output = "";
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", USER_AGENT);
        int responseCode = con.getResponseCode();
        //System.out.println("GET Response Code :: " + responseCode);
        if (responseCode == HttpURLConnection.HTTP_OK) { // success
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
 
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            output = response.toString();
            // print result
            //System.out.println(response.toString());
        } else {
            //System.out.println("GET request not worked");
        }
        return output;
    }
    
    private static void sendPOST(String json, String url) throws IOException {
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("POST");
        con.setRequestProperty("User-Agent", USER_AGENT);
 
        // For POST only - START
        con.setDoOutput(true);
        OutputStream os = con.getOutputStream();
        os.write(json.getBytes());
        os.flush();
        os.close();
        // For POST only - END
 
        int responseCode = con.getResponseCode();
        //System.out.println("POST Response Code :: " + responseCode);
 
        if (responseCode == HttpURLConnection.HTTP_OK) { //success
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
 
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
 
            // print result
            //System.out.println(response.toString());
        } else {
            //System.out.println("POST request not worked");
        }
    }
}
