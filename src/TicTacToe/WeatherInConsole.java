/*
 * package small_Projects;
 * 
 * import java.util.Scanner; import java.io.IOException; import
 * java.net.HttpURLConnection; import java.net.URL; import
 * java.io.BufferedReader; import java.io.InputStreamReader; import
 * org.json.JSONObject;
 * 
 * public class WeatherInConsole {
 * 
 * private static final String API_KEY = "Your_API_Key"; private static final
 * String BASE_URL = "http://api.openweathermap.org/data/2.5/weather?";
 * 
 * public static void main(String[] args) { Scanner scanner = new
 * Scanner(System.in); System.out.print("Enter city name: "); String cityName =
 * scanner.nextLine(); scanner.close();
 * 
 * String completeUrl = BASE_URL + "appid=" + API_KEY + "&q=" + cityName;
 * 
 * try { String jsonResponse = makeApiRequest(completeUrl); JSONObject
 * jsonObject = new JSONObject(jsonResponse);
 * 
 * if (jsonObject.getInt("cod") != 404) { JSONObject main =
 * jsonObject.getJSONObject("main"); double currentTemperature =
 * main.getDouble("temp"); int currentPressure = main.getInt("pressure"); int
 * currentHumidity = main.getInt("humidity");
 * 
 * JSONObject weather = jsonObject.getJSONArray("weather").getJSONObject(0);
 * String weatherDescription = weather.getString("description");
 * 
 * System.out.println("Temperature (in Kelvin) = " + currentTemperature);
 * System.out.println("Atmospheric Pressure (in hPa) = " + currentPressure);
 * System.out.println("Humidity (in Percentage) = " + currentHumidity);
 * System.out.println("Description = " + weatherDescription); } else {
 * System.out.println("City Not Found"); } } catch (IOException e) {
 * e.printStackTrace(); } }
 * 
 * private static String makeApiRequest(String url) throws IOException { URL
 * apiUrl = new URL(url); HttpURLConnection connection = (HttpURLConnection)
 * apiUrl.openConnection(); connection.setRequestMethod("GET");
 * 
 * int responseCode = connection.getResponseCode();
 * 
 * try (BufferedReader reader = new BufferedReader(new
 * InputStreamReader(connection.getInputStream()))) { StringBuilder response =
 * new StringBuilder(); String line;
 * 
 * while ((line = reader.readLine()) != null) { response.append(line); }
 * 
 * return response.toString(); } } }
 */