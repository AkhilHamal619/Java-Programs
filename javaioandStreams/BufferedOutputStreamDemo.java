package javaioandStreams;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamDemo
{
	public static void main(String[]args)
	{
		try
		{
			FileOutputStream fos = new FileOutputStream("C:/ram/text.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			String s = "Welcome to FileOutputStream";
			byte b[] = s.getBytes();
			bos.write(b);
			bos.flush();
			fos.close();
			bos.close();
			System.out.print("Text written to the file succesfully.");
		} catch(IOException e)
		{
			System.out.print(e.getMessage());
		}
}
}