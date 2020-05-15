package rwtest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Rwtest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	    Myfile f = new Myfile();
		f.Writetest1();
		f.Writetest2();
		f.Writetest3();
		f.Readtest1("src/rwtest/txt/1.txt");
		f.Readtest1("src/rwtest/txt/2.txt");
	}

}
class Myfile{
	public void Writetest1() throws IOException
	{
		FileWriter fw = new FileWriter("src/rwtest/txt/1.txt");
		fw.write("1180300109");
		fw.write("duanshuai");
		fw.close();
	}
	public void Writetest2() throws IOException
	{
		String str = System.getProperty("line.separator");
		FileWriter fw = new FileWriter("src/rwtest/txt/2.txt");
		fw.write("1180300109");
		fw.write(str);
		fw.write("duanshuai");
		fw.close();	
	}
	public void Writetest3() throws IOException
	{
		BufferedWriter fw = new BufferedWriter(new FileWriter("src/rwtest/txt/3.txt"));
		fw.write("1180300109");
		fw.newLine();
		fw.write("duanshuai");
		fw.close();
	}
	public void Readtest1(String path) throws IOException
	{
		FileReader fr = new FileReader(path);
		int ch = 0;
		while((ch = fr.read())!=-1)
		{
			System.out.print((char)ch);
		}
		System.out.println();
		fr.close();
	}
	public void Readtest2(String path) throws IOException
	{
		FileReader fr = new FileReader(path);
		BufferedReader br = new BufferedReader(fr);//»º³å
		String str;
		while((str = br.readLine()) != null)
		{
			System.out.println(str);
		}
		br.close();
	}
}
