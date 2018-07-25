package Ch10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*請寫一程式Q10_03.java，在程式內
請將浮點數17.625以ObjectOutputStream類別的writeDouble()將其寫至檔案上C:\data\DataQ10_03.txt。需要判斷C:\data\是否存在，如果不存在，程式必須建立。
關檔後，再以ObjectInputStream類別的readDouble()讀回，顯示在螢幕上。
提示：會用到類別有FileOutputStream、ObjectOutputStream、FileInputStream、ObjectInputStream等類別。 */
public class Q10_03 {
	public static void main(String[] args) throws IOException {

		try(FileOutputStream fos = new FileOutputStream("C:\\data\\DataQ10_03.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);){
			oos.writeDouble(17.625);
		}catch(IOException ioe) {
			System.out.println("發生錯誤:" +  ioe);
		}
		try(FileInputStream fis = new FileInputStream("C:\\data\\DataQ10_03.txt");
				ObjectInputStream ois = new ObjectInputStream(fis);){
			double d = ois.readDouble();
			System.out.println(d);
		}catch(IOException ioe) {
			System.out.println("發生錯誤:" +  ioe);
		}
		
		
	}

}
