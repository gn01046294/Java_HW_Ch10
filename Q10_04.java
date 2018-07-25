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
	 * �мg�@�{��Q10_04.java
	 * 1.�бN�Q�Ӿ�ƶü�(1-1000)�HDataOutputStream���O��writeInt()�N��g���ɮפWC:\data
	 * \DataQ10_04.txt �A���L�n�H�u���[�Ҧ�(Append)�g�X�v�C�ݭn�P�_C:\data\�O�_�s�b�A�p�G���s�b�A�{�������إߡC
	 * 2.�HDataOutputStream���O��readInt()Ū�^C:\data\DataQ10_04.txt�ɮפ�����ƶüơA�M����ܦb�ù��W�C
	 * �O�o�h���մX���A�[��u���[�Ҧ��v���ĪG�C
	 * 
	 * DataOutputStream���O�SwriteInt(int
	 * n)�i�H�g�X�@�Ӿ�ơCDataOutputStream���O��readInt()�i�HŪ�J�@�Ӿ�ơC
	 */
	public static void main(String[] args) {
		File fq4 = new File("C:\\data\\DataQ10_04.txt");
		if (!fq4.exists()) {
			try {
				fq4.createNewFile();
			} catch (IOException e) {
				System.out.println("���~�T��: "+ e );;
			}
		}
		try (FileOutputStream fos = new FileOutputStream(fq4, true);
				DataOutputStream dos = new DataOutputStream(fos);) {
			for (int i = 1; i <= 10; i++) {
				
				dos.writeInt(new Integer((int)(Math.random()*999)+1));
				
			}
		} catch (IOException ioe) {
			System.out.println("���~�T��: " + ioe);
		}
		try (FileInputStream fis = new FileInputStream(fq4); 
			DataInputStream dis = new DataInputStream(fis);) 
		{   int t = 0;
			while (t<10) {
			
			System.out.print(dis.readInt() + ",");
			t++;
		}
			

		} catch (IOException ioe) {
			System.out.println("���~�T��: " + ioe);
		}

	}

}
