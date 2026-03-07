//Character Stream.
package javaioandStreams;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo 
{
		public static void main(String[]args)
		{
			try
			{
				FileWriter fileWriter = new FileWriter("C:/ram/readwrite.txt");
				String str = "Welcome to FileWriter";
				fileWriter.write(str);
				fileWriter.close();
				System.out.print("Text written to the file succesfully.");
			} catch(IOException e)
			{
				System.out.print("Error:"+e.getMessage());
			}
		}
}

