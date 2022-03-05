package com.thinkitive.day6;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class DemoProperties4 {
	


		public static void main(String[] args) {
			writeFile();
			readFile();
			
		}
		public static void readFile() {
			try(FileReader fr = new FileReader("pqr.txt")) {
				int i = 0;
				while((i=fr.read())!= -1) {
			System.out.print(Character.toString((char)i).toUpperCase());
				}
			} catch (Exception e) {
				System.out.println("Exception: " + e);
			}
		}
		
		public static void writeFile() {
			try(FileWriter fw = new FileWriter("pqr.txt")) {
				fw.write("This is sample for a file");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}


