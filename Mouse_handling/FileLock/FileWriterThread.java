package FileLock;

import java.io.*;
import java.lang.management.ManagementFactory;
import java.util.Scanner;

public class FileWriterThread extends Thread{

	private String filePath;
	FileOutputStream out;
	FileInputStream in;
	String name;
	
	public FileWriterThread(String name)
	{
		this.name = name;		
	}

	public void run()
	{
		filePath="C:\\Academic\\test.txt";
		String line;
		
		int pid = Integer.parseInt(ManagementFactory.getRuntimeMXBean().getName().split("@")[0]);
		System.out.println(pid);   

	/*	try 
		{
			out = new FileOutputStream(filePath);
			java.nio.channels.FileLock lock = out.getChannel().lock();
			in = new FileInputStream(filePath);
			
			byte[] bytArr = (new String(in.rename)).getBytes();
			out.write(bytArr);
			lock.release();
		}
		catch(Exception ex)
		{
				ex.printStackTrace();
		}
		finally 
		{
			try
			{
				out.close();
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}	*/

	}

}
