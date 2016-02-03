package com.training;

import java.io.*;

public class BookSerializer 
{
	//Serialize method
	
	public String serialize(Book obj)
	{
		String msg = null;
		ObjectOutputStream out=null;
		try 
		{
			out = new ObjectOutputStream(new FileOutputStream(new File("Book.ser")));
			out.writeObject(obj);
			msg = "One Object Serialized-Press F5 to view the file";
		} 
		catch (IOException e) 
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			try 
			{
				out.close();
			} 
			catch (IOException e2) 
			{
				System.out.println(e2.getMessage());
			}
		}
		return msg;
	}
	
	//De-serialize method
	
	public Object deSerialize() 
	{
		Object obj = null;
		try(ObjectInputStream oin = new ObjectInputStream(new FileInputStream(new File("Book.ser"))))
		{
			obj = oin.readObject();   // Storing the values from Book.ser into obj

		}catch(Exception e) {System.out.println(e.getMessage());}
		
		return obj;
	}
}
