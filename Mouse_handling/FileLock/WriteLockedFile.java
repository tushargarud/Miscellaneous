package FileLock;

public class WriteLockedFile {

	public static void main(String[] args) {
		
		FileWriterThread fileWriter1 = new FileWriterThread("First");
		fileWriter1.run();
		
		FileWriterThread fileWriter2 = new FileWriterThread("Second");
		fileWriter2.run();
	}

}
