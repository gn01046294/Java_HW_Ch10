package Ch10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Q10_02 {
/* 假設文字檔 Sample.txt的內容如下：
五局下半王建民(新聞、圖片、商品)遇到亂流，被運動家隊擊出兩隻安打，王建民又投出兩次保送，雙方打成4:4，洋基總教頭托瑞上場，換下王建民，
由中繼投手斯特茲接手，五局結束雙方打平，王建民今年的第一次登板，確定與比賽勝負無關。運動家隊打者在八局下的一輪猛攻，即使洋基換了三任投手也擋不住，海灌了五分，
將比數拉大為9:4。九局上洋基反攻無力，最終輸掉這場比賽。
請寫一程式Q10_02.java來讀取此檔案的內容，然後於螢幕上顯示下列訊息: sample.txt 含有 xxx 個位元組， yyy 個字元， mmm列資料。 
( 要以FileInputStream，FileReader，BufferedReader分別來處理 )*/
	public static void main(String[] args) throws IOException {

		File inFile = new File("D:\\Sample.txt");
		if(!inFile.exists())
		{inFile.createNewFile();}
		try (FileInputStream fis = new FileInputStream(inFile);) {//FileInputStream()←()內參數表示要讀取的檔案 必須要存在
			int count = 0;
			int i1 = 0;
			byte[] ba = new byte[1024];
			while ((count = fis.read(ba)) != -1) {//read(byte[] b) 讀取b.length個位元組 放到b陣列 (註標為0開始放) 回傳值為實際讀取的位元組個數 沒資料 回傳-1
				i1 += count;
			}
			System.out.println("sample.txt 含有  " + i1 + " 個位元組");
		} /*
			 * catch (IOException e) { e.printStackTrace(); }有用宣告法則,可寫可不寫
			 */
		try (FileReader fr = new FileReader(inFile)) {
			int count = 0;
			int i2 = 0;
			while ((count = fr.read()) != -1) {
				i2 += count;
			}
			System.out.println("sample.txt 含有  " + i2 + " 個字元");
		} /*
			 * catch (IOException e) { e.printStackTrace(); } 有用宣告法則,可寫可不寫
			 */
		try (BufferedReader brd = new BufferedReader(new FileReader(inFile));) { // BufferedReader()←括胡內的參數必須是要字串或是"File"物件
			String s = null;
			int i3 = 0;
			while ((s = brd.readLine()) != null) { //.readLine()→將讀取到的資料轉換為字串物件傳回
				i3++;
			}
			System.out.println("sample.txt 含有  " + i3 + " 列資料");
		} /*
			 * catch (IOException e) { e.printStackTrace(); }有用宣告法則,可寫可不寫
			 */
	}
}