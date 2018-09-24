package lab3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class beolvas {

	public beolvas() {
		// TODO Auto-generated constructor stub
	}

	public static String[] beolvaso(InputStream in) throws IOException {
		String arr = new String();
		InputStreamReader inr = new InputStreamReader(in);
		BufferedReader r = new BufferedReader(inr);

		arr = r.readLine();

		String[] s = arr.split(" ");

		return s;
	}

}
