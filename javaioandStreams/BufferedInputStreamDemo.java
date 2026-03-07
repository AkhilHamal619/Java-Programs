package javaioandStreams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamDemo
{
	public static void main(String[]args)
	{
		try
		{
			FileInputStream finput = new FileInputStream("C:/ram/text.txt");
			BufferedInputStream binput = new BufferedInputStream(finput);
			int i;
			while((i=binput.read()) !=-1)
			{
				System.out.print((char)i);
			}
		} catch(IOException e)
			{
				System.out.print(e.getMessage());
			}
}
}