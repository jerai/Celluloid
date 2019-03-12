package trakt;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;

import com.google.gson.Gson;

import dominioTrakt.Busqueda;
import dominioTrakt.Movie;


public class Buscar {

	public static List<Busqueda> buscar(String query) {
		try {
			URL url = new URL("https://api.trakt.tv/search/movie?query=" + query);
			Conexion conexion = new Conexion();
			conexion.execute(url);
			String data = conexion.get();
			Busqueda[] listaMovies = new Gson().fromJson(data, Busqueda[].class);
			List<Busqueda> list = Arrays.asList(listaMovies);
			return list;
		} catch (MalformedURLException | ExecutionException | InterruptedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static Movie movieInfo(int query) {
		try {
			URL url = new URL("https://api.trakt.tv/movies/" + query + "?extended=full");
			Conexion conexion = new Conexion();
			conexion.execute(url);
			String data = conexion.get();
			Movie peli = new Gson().fromJson(data, Movie.class);
			return peli;
		} catch (MalformedURLException | ExecutionException | InterruptedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static Movie movieInfo(Movie movie) {
		return movieInfo(movie.getIds().getTrakt());
	}
}
