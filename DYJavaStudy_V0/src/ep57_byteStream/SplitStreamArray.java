package ep57_byteStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class SplitStreamArray {

	public static void main(String[] args) {
		
		try {
			OutputStream os = new FileOutputStream("C:/Temp/test3.db");
			
			byte[] array = {10, 20, 30, 40, 50};
			
			os.write(array, 1, 3);
			os.flush();
			os.close();
			
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
