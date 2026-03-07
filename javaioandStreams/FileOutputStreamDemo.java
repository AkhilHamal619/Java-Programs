package javaioandStreams;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
			public static void main(String[]args)
			{
				try
				{
					FileOutputStream fout = new FileOutputStream("C:\\ram/save.txt");
					String s = "Welcome to FileOutputStream";
					byte b[] = s.getBytes();
					fout.write(b);
					fout.close();
					System.out.print("Text written to the file succesfully.");
				} catch(IOException e)
				{
					System.out.print(e.getMessage());
				}

	}
}