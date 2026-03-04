package javaStream;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo
{
			public static void main(String[]args)
			{
				try
				{
					FileReader fileReader = new FileReader("C:/ram/readwrite.txt");
					int i;
					while((i=fileReader.read()) !=-1);
					System.out.print((char)i);
					fileReader.close();
				} catch(IOException e)
					{
						System.out.print("Error:"+e.getMessage());
					}
			}
}



