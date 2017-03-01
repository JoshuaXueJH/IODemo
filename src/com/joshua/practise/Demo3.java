package com.joshua.practise;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo3 {

	public static void main(String[] args) throws IOException {
		File file1 = new File("c:\\a.txt");
		File file2 = new File("c:\\f.txt");

		BufferedInputStream in = new BufferedInputStream(new FileInputStream(file1));
		BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(file2));

		int by = 0;
		byte[] bys = new byte[1024];
		while ((by = in.read(bys)) != -1) {
			out.write(bys, 0, by);
		}
		
		in.close();
		out.close();
	}

}
