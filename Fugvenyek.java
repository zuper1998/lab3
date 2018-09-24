package lab3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Fugvenyek {

	public Fugvenyek() {
		// TODO Auto-generated constructor stub
	}

	public static File wd = new File(System.getProperty("user.dir"));

	public static void eloszto(String[] cmd) {
		if (cmd[0].equals("exit")) {
			exit(cmd);
		} else if (cmd[0].equals("pwd")) {
			try {
				pwd(cmd);
			} catch (IOException e) {
			}

		} else if (cmd[0].equals("cd")) {
			try {
				cd(cmd);
			} catch (IOException e) {
			}
		} else if (cmd[0].equals("ls")) {
			ls(cmd);
		} else if (cmd[0].equals("length")) {
			try {
				length(cmd);
			} catch (FileNotFoundException e) {

			}
		} /*
			 * else if (cmd[0].equals("tail")) { tail(cmd); } else if
			 * (cmd[0].equals("grep")) { grep(cmd); }
			 */

	}

	public static void exit(String[] cmd) {
		String[] s = new String[Integer.MAX_VALUE];
		exit(cmd);
	}

	public static void pwd(String[] cmd) throws IOException {
		System.out.println(wd.getCanonicalPath());
	}

	public static void cd(String[] cmd) throws IOException {
		if (cmd[1].equals("..")) {
			wd = new File(wd.getParent());
			System.out.println(wd.getCanonicalPath());

		} else {
			wd = new File(cmd[1]);
			System.out.println(wd.getCanonicalPath());

		}

	}

	public static void ls(String[] cmd) {
		String[] s = wd.list();
		if (s.length < 1) {
			System.out.println("no filles");
		} else {
			for (int i = 0; i < s.length; i++) {

				if (cmd.length> 1 ) {
					if (cmd[1].equals("-l")) {
						File f = new File(s[i]);
						if (f.isFile()) {
							System.out.println(s[i] + "   " + f.length() + " kb  "
									+ s[i].substring(Math.max(s[i].lastIndexOf('/'), s[i].lastIndexOf('\\')) + 1));
						} else {
							System.out.println(s[i]);
						}

					}
				} else {
					System.out.println(s[i]);

				}
			}
		}
	}

	public static void length(String[] cmd) throws FileNotFoundException {
		File f = new File(cmd[1]);
		System.out.println(cmd[1] + "  " + f.length() + " kb");
	}

}
