package com.training;

public class Application {

	public static void main(String[] args) {
		
		
		Book b = new Book(101, "HP", "JKR", 9000);
		Book b2 = new Book();
		
		BookSerializer bookSerializer = new BookSerializer();
		bookSerializer.serialize(b);
		
		b2 = (Book) bookSerializer.deSerialize();
		System.out.println(b2.toString());
		
		String message = bookSerializer.serialize(b);
				
				if(message!=null)
					{
						System.out.println(message);
						b2 = (Book)bookSerializer.deSerialize();
						System.out.println(b2.toString());
					}
				
				else
					System.out.println(message);
			}

}
