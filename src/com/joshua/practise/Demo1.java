package com.joshua.practise;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1 {

	public static void main(String[] args) throws IOException {
		FileInputStream in = new FileInputStream("c:\\a.txt");
		FileOutputStream out = new FileOutputStream("c:\\b.txt");
		int by = 0;
		while ((by = in.read()) != -1) {
			out.write(by);
		}
		in.close();
		out.close();
	}
}
