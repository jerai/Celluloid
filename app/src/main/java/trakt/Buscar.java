package trakt;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;

import dominioTrakt.Busqueda;
import dominioTrakt.Movie;


public class Buscar {

	public static List<Busqueda> buscar(String query) {
		try {
			URL url = new URL("https://api.trakt.tv/search/movie?query=" + query);
			String data = Conexion.getJSON(url);
			Busqueda[] listaMovies = new Gson().fromJson(data, Busqueda[].class);
			List<Busqueda> list = Arrays.asList(listaMovies);
			return list;
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static Movie movieInfo(int query) {
		try {
			URL url = new URL("https://api.trakt.tv/movies/" + query + "?extended=full");
			String data = Conexion.getJSON(url);
			Movie peli = new Gson().fromJson(data, Movie.class);
			return peli;
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static Movie movieInfo(Movie movie) {
		return movieInfo(movie.getIds().getTrakt());
	}
}
