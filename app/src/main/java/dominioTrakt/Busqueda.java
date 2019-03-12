package dominioTrakt;

public class Busqueda {
/*
	{
	    "type": "movie",
	    "score": 26.019499,
	    "movie": {...}
	}
*/
	private String type;
	private float score;
	private Movie movie;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	
	@Override
	public String toString() {
		return movie + ", Valoracion: " + score;
	}
	
	
}
