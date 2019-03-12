package trakt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class Conexion {
	
	private static String client_id = "b34b7fa294766d118a9d1b05995121d52dcc5ed3407a28b1274c3dc8d34cd924";
	
	public static String getJSON(URL url) {
		HttpsURLConnection con = null;
		try {
			con = (HttpsURLConnection)url.openConnection();
			con.setRequestProperty("trakt-api-version", "2");
			con.setRequestProperty("trakt-api-key", client_id);

			int estado = con.getResponseCode();
			switch (estado) {
				case 200:
				case 201:
					BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
					StringBuilder sb = new StringBuilder();
					String line;
					while ((line = br.readLine()) != null) {
						sb.append(line+"\n");
					}
					br.close();
					return sb.toString();
			}

		}catch (IOException e) {
			// No se ha establecido la conexion
		} finally {
			if(con != null) {
				con.disconnect();
			}
		}
		return null;
	}
}
