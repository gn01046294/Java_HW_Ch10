package Ch10;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/*承前一題，請寫一程式Q10_06.java，由C:\data\ObjectQ10_05.dat內讀取前一題所寫入的四個物件，然後執行它們的smile()，請用多型來簡化程式的設計。
 * (也就是說，你要設計一個父類別)，如Mammal，在其內定義共有方法，然後依照講義所列的步驟來撰寫)。*/
public class Q10_06 {

	public static void main(String[] args) throws IOException, ClassNotFoundException, FileNotFoundException  {

		File fileIn = new File("C:\\data", "ObjectQ10_05.dat");
		Object o = null;
		Mammal m = null;
		try (FileInputStream fis = new FileInputStream(fileIn); 
			ObjectInputStream ois = new ObjectInputStream(fis);
				){
			while (true) {//true只是為了要讓迴圈跑起來!!! 
				try {
					o = ois.readObject();
					if (o instanceof Mammal) {       
						m = (Mammal) o;
						m.smile();
					}
				} catch (ClassNotFoundException e) {
					break;
				}
			}
		} catch (IOException e) {
			System.out.println("end");;
		}
	}
}