package com.lqas.filestutorial;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReaderWriter {
	
	public static ArrayList<String> readFileToArrayList(String fileToRead) throws FileNotFoundException{
		File file = new File(fileToRead);
	    ArrayList<String> names = new ArrayList<String>();
	    Scanner in = new Scanner(file);
	    while (in.hasNextLine()){
	        names.add(in.nextLine());
	    }
	    in.close();
	    
	    return names;
	}
	
	public static void writeArrayToFile(String fileToWrite, ArrayList<String> arrayListToWrite) throws IOException{
	     FileWriter fw = new FileWriter(fileToWrite);
	     BufferedWriter bw = new BufferedWriter(fw);
	     for (String s : arrayListToWrite){
	    	 bw.write(s + "\n");//write text to the file using write method
	     }
	    // bw.flush();//write any buffered text to the file
	     bw.close();//close file using close() method   
	}
	
	public static void printParsedFile(ArrayList<String> arrayListFromFile){
		for (String s : arrayListFromFile){
			System.out.println(s);
		}
	}

}
