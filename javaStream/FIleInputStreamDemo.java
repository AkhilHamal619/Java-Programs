package javaStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FIleInputStreamDemo 
{
		public static void main(String[]args)
		{
			try
			{
				FileInputStream fin = new FileInputStream("C:\\ram/save.txt");
				int i=0;
				while((i=fin.read()) !=-1);
				{
					System.out.println((char)i);
				}
				fin.close();
			} catch(IOException e)
			{
				System.out.print(e.getMessage());
			}
		}
	}
