package com.joshua.practise;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;;

public class Demo4 {
	public static void main(String[] args) throws IOException {
		FileReader reader=new FileReader(new File("C:\\Users\\IBM_ADMIN\\Desktop\\SVN\\svn-book.pdf"));
		FileWriter writer=new FileWriter(new File("C:\\Users\\IBM_ADMIN\\Desktop\\SVN\\svn-book1.pdf"));
		int ch=0;
		while((ch=reader.read())!=-1){
			writer.write(ch);
			writer.flush();
		}
		reader.close();
		writer.close();
	}
}
