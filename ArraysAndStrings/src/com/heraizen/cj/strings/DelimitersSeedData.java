package com.heraizen.cj.strings;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class DelimitersSeedData {
	public static Delimiters[] getNames() {
		Delimiters name1=new Delimiters("Sharmila", "shetty", "T");
		Delimiters name2=new Delimiters("Nitha", "Devi", "A");
		Delimiters name3=new Delimiters("Ranjith", "Kumar", "R");
		Delimiters [] name =null;
		
		try {
			List<String> lines=Files.readAllLines(Paths.get("name.txt"));
			name=new Delimiters[lines.size()+2];
			int count=0;
			for(String line:lines) {
				name[count++]=convertToName(line);
//				name[count++]=name1;
//				name[count++]=name2;
//				name[count++]=name3;
			}
			name[count++]=name1;
			name[count++]=name2;
			name[count++]=name3;
		} catch (IOException e) {
						e.printStackTrace();
		}
		
		return name;

	}

	private static Delimiters convertToName(String line) {
		String[] arr=line.split("-");
		Delimiters name=new Delimiters(arr[0],arr[1],arr[2]);
//		Delimiters name=new Delimiters(line, line, line);

		return name;
	}

}
