package lec50_java_read_write;

import java.io.File;
import java.util.Scanner;

public class CreatAFolder {
	
	public static void main(String[] args) {
		File folder = new File("/Users/sarker/Desktop/New");
		folder.mkdir();
		if (folder.exists()) {
			System.out.println(folder.getName() + "folder is created");
			File file = new File("/Users/sarker/Desktop/New/info.text");
			try {
				file.createNewFile();
			} catch (Exception e) {
				System.out.println("exeption is :" + e);
			}
			
			if (file.exists()) {
				System.out.println(file.getName());
				System.out.println("type something in the text file");
				Scanner sc = new Scanner(System.in);
				try {
					String userInput= Scanner.nextLine(sc);
				
			}
		}
	}

}
