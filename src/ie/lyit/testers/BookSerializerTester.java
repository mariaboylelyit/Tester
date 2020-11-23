Bpackage ie.lyit.testers;

import ie.lyit.serialize.BookSerializer;

public class BookSerializerTester {

	public static void main(String[] args) {
		BookSerializer bookSerializer = new BookSerializer();
/*		
		// Add two records to the ArrayList
		bookSerializer.add();
		bookSerializer.add();
				
		// Write the ArrayList to File
		bookSerializer.serializeBooks();
*/
		
		// Read the ArrayList from the File
		bookSerializer.deserializeBooks();
		
		// List all the books in the ArrayList
		bookSerializer.list();
	}
}
