package com.training;

import java.io.*;
import com.training.Book;


public class BookManager {

	
	public BookManager() {
		super();
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("finally")
	public String addBooks(Book[] bks){
		
		PrintWriter out = null;
		
			try {
				out = new PrintWriter(new FileWriter("bookDatabase.txt"));

				for(Book bookArrayElement : bks )
				{
					out.print(bookArrayElement.getBookName()+" , ");
					out.print(bookArrayElement.getAuthor()+" , ");
					out.print(bookArrayElement.getBookNumber()+" , ");
					out.println(bookArrayElement.getPrice());
				}
				
			}
		
			catch (IOException e) 
			{ 
				System.out.println(e.getMessage());
			}
			
			finally{
				out.close(); 
				return "Exiting addBooks";
			}
		
	}
	
	public void printBooks(File filename){
		
		try { 
			FileReader fr = new FileReader(filename);
			BufferedReader br = new BufferedReader(fr); 
			String line=null;
		
			try
		{ 
				while(( line=br.readLine()) !=null) 
				{ 
					System.out.println(line); 
				} 
		} 
			catch (IOException e) 
			{ 
				System.out.println(e.getMessage());
			} 
		}	
		
		catch (FileNotFoundException e) 
		{ 
			System.out.println(e.getMessage()); 
		}
	}
}