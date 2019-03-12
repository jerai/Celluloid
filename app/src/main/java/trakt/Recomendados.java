package trakt;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;

import dominioTrakt.Movie;

public class Recomendados {
	
	public static String WEEKLY = "weekly";
	public static String MONTHLY = "monthly";
	public static String YEARLY = "yearly";
	public static String ALL = "all";

	public static List<Movie> trending(){
		return null;
	}

	public static List<Movie> popular(){
		try {
			String data = Conexion.getJSON(new URL("https://api.trakt.tv/movies/popular"));
			Movie[] listaMovies = new Gson().fromJson(data, Movie[].class);
			List<Movie> list = Arrays.asList(listaMovies);
			return list;
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static List<Movie> played(String period){
		return null;
	}

	public static List<Movie> watched(String period){
		return null;
	}

	public static List<Movie> played(){
		return played(WEEKLY);
	}

	public static List<Movie> watched(){
		return watched(WEEKLY);
	}
}
