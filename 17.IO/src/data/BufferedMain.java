package data;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedMain {
	public static void main(String[] args) {
		String readFilename = "C:\\Users\\admin\\Documents\\src.zip";
		String writeFilename = "src/data/src.zip";
		
		BufferedInputStream in = null;
		BufferedOutputStream out = null;
		
		try {
			out = new BufferedOutputStream(new FileOutputStream(writeFilename));
			in = new BufferedInputStream(new FileInputStream(readFilename));
			byte[] buf = new byte[1024];
			int count;
			while ((count = in.read(buf)) != -1 ) {
				out.write(buf, 0, count);
			}
			out.flush();
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		} finally {
			try {in.close();} catch(Exception e) {}
			try {out.close();} catch(Exception e) {}
		}
	}
}
