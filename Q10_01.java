package Ch10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Q10_01 {
	/* �мg�@�{��Q10_01.java�A����Ū�J�@�ɮסA�M���ù��W��ܥ����h�֭Ӧ줸�աC */
	public static void main(String[] args) throws IOException {
		File inFile = new File("D:\\Sample.txt");
		if(!inFile.exists())
		{inFile.createNewFile();}
		try (FileInputStream fis = new FileInputStream(inFile);) {//FileInputStream()��()���Ѽƪ�ܭnŪ�����ɮ� �����n�s�b
			int count = 0;
			int i1 = 0;
			byte[] ba = new byte[1024];
			while ((count = fis.read(ba)) != -1) { //read(byte[] b) Ū��b.length�Ӧ줸�� ���b�}�C (���Ь�0�}�l��) �^�ǭȬ����Ū�����줸�խӼ� �S��� �^��-1
				i1 += count;
			}
			System.out.println("sample.txt �t��  " + i1 + " �Ӧ줸��");
		} 
			 catch (IOException e) { e.printStackTrace(); }
		
		
//		File infile = new File("C:\\_Java\\workspace\\JavaLF", "test01");
//
//		System.out.println(sample.txt �t��  " + infile.length() + " �Ӧ줸��");

	}

}
