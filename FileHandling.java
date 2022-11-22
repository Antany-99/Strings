package Strings;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
public class FileHandling {
	public static void main(String[] args)throws IOException{
			File Create=new File("C:\\Users\\Lenovo\\Desktop\\Zoho.txt");
			if(Create.createNewFile()) {
				System.out.println("File"+Create.getName()+"is Created");}
			FileWriter Write=new FileWriter(Create);
			Write.write("வான்நின்று உலகம் வழங்கி வருதலால்");
			Write.flush();
			Write.close();
			FileReader a=new FileReader(Create);
			BufferedReader Read=new BufferedReader(a);
			String Line=Read.readLine();
			int LineCount=0;
			int WordCount=0;
			int CharCount=0;
			while(Line!=null) {
				String Word[]=Line.split(" ");
				WordCount+=Word.length;
				CharCount+=Line.length();
				LineCount++;
				System.out.println(Line);
				Line=Read.readLine();}
			System.out.println("Number of Characters "+CharCount);
			System.out.println("Number of Words "+WordCount);
			System.out.println("Number of Lines "+LineCount);	
			InputStream Input=new FileInputStream(Create);
			OutputStream Output=new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\ZSGS.txt");
			int content=Input.read();
			while(content!=-1) {
				Output.write(content);
				content=Input.read();}
			Output.flush();
	}

}
