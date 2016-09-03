package HTML;

import java.io.BufferedInputStream;//
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class HTML {
	public static void main(String[] args) {
		BufferedInputStream in = null;
		Scanner input_url = new Scanner(System.in);
		String strUrl = input_url.nextLine();
		StringBuffer sb = new StringBuffer();
		
		try{
			URL url = new URL(strUrl);
			URLConnection urlConnection = url.openConnection();
in = new BufferedInputStream(urlConnection.getInputStream());
			
			byte[] bufRead = new byte[4096];
			int lenRead = 0;
			while ((lenRead = in.read(bufRead)) > 0)
				sb.append(new String(bufRead, 0, lenRead));

		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
		System.out.println(sb.toString());		
	}
}


