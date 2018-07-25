package Ch10;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Q10_04 {
	/*
	 * 請寫一程式Q10_04.java
	 * 1.請將十個整數亂數(1-1000)以DataOutputStream類別的writeInt()將其寫至檔案上C:\data
	 * \DataQ10_04.txt ，不過要以「附加模式(Append)寫出」。需要判斷C:\data\是否存在，如果不存在，程式必須建立。
	 * 2.以DataOutputStream類別的readInt()讀回C:\data\DataQ10_04.txt檔案內的整數亂數，然後顯示在螢幕上。
	 * 記得多測試幾次，觀察「附加模式」的效果。
	 * 
	 * DataOutputStream類別又writeInt(int
	 * n)可以寫出一個整數。DataOutputStream類別有readInt()可以讀入一個整數。
	 */
	public static void main(String[] args) {
		File fq4 = new File("C:\\data\\DataQ10_04.txt");
		if (!fq4.exists()) {
			try {
				fq4.createNewFile();
			} catch (IOException e) {
				System.out.println("錯誤訊息: "+ e );;
			}
		}
		try (FileOutputStream fos = new FileOutputStream(fq4, true);
				DataOutputStream dos = new DataOutputStream(fos);) {
			for (int i = 1; i <= 10; i++) {
				
				dos.writeInt(new Integer((int)(Math.random()*999)+1));
				
			}
		} catch (IOException ioe) {
			System.out.println("錯誤訊息: " + ioe);
		}
		try (FileInputStream fis = new FileInputStream(fq4); 
			DataInputStream dis = new DataInputStream(fis);) 
		{   int t = 0;
			while (t<10) {
			
			System.out.print(dis.readInt() + ",");
			t++;
		}
			

		} catch (IOException ioe) {
			System.out.println("錯誤訊息: " + ioe);
		}

	}

}
