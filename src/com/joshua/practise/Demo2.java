package com.joshua.practise;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2 {
	public static void main(String[] args) throws IOException {
		FileInputStream in = new FileInputStream("c:\\a.txt");
		FileOutputStream out = new FileOutputStream("c:\\c.txt");
		int by = 0;
		byte[] bys = new byte[1024];
		while ((by = in.read(bys)) != -1) {
			out.write(bys, 0, by);
		}
		in.close();
		out.close();
	}
}
