package lab3;

import java.io.File;
import java.io.IOException;
import lab3.Fugvenyek;

public class Main {

	public Main() {
	}

	public static void main(String[] args) {
		String[] cmd = null;
	
		while(true){
		try {

			cmd = beolvas.beolvaso(System.in);
		} catch (IOException e) {

		}
		
		Fugvenyek.eloszto(cmd);

	}
	}
}
