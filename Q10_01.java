package Ch10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Q10_01 {
	/* 請寫一程式Q10_01.java，它能讀入一檔案，然後於螢幕上顯示它有多少個位元組。 */
	public static void main(String[] args) throws IOException {
		File inFile = new File("D:\\Sample.txt");
		if(!inFile.exists())
		{inFile.createNewFile();}
		try (FileInputStream fis = new FileInputStream(inFile);) {//FileInputStream()←()內參數表示要讀取的檔案 必須要存在
			int count = 0;
			int i1 = 0;
			byte[] ba = new byte[1024];
			while ((count = fis.read(ba)) != -1) { //read(byte[] b) 讀取b.length個位元組 放到b陣列 (註標為0開始放) 回傳值為實際讀取的位元組個數 沒資料 回傳-1
				i1 += count;
			}
			System.out.println("sample.txt 含有  " + i1 + " 個位元組");
		} 
			 catch (IOException e) { e.printStackTrace(); }
		
		
//		File infile = new File("C:\\_Java\\workspace\\JavaLF", "test01");
//
//		System.out.println(sample.txt 含有  " + infile.length() + " 個位元組");

	}

}
