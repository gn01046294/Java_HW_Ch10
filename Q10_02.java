package Ch10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Q10_02 {
/* ���]��r�� Sample.txt�����e�p�U�G
�����U�b���إ�(�s�D�B�Ϥ��B�ӫ~)�J��ìy�A�Q�B�ʮa�����X�Ⱖ�w���A���إ��S��X�⦸�O�e�A���襴��4:4�A�v���`���Y����W���A���U���إ��A
�Ѥ��~��ⴵ�S������A�����������襴���A���إ����~���Ĥ@���n�O�A�T�w�P���ɳӭt�L���C�B�ʮa�����̦b�K���U���@���r��A�Y�Ϭv�򴫤F�T�����]�פ���A����F�����A
�N��ƩԤj��9:4�C�E���W�v��ϧ�L�O�A�̲׿鱼�o�����ɡC
�мg�@�{��Q10_02.java��Ū�����ɮת����e�A�M���ù��W��ܤU�C�T��: sample.txt �t�� xxx �Ӧ줸�աA yyy �Ӧr���A mmm�C��ơC 
( �n�HFileInputStream�AFileReader�ABufferedReader���O�ӳB�z )*/
	public static void main(String[] args) throws IOException {

		File inFile = new File("D:\\Sample.txt");
		if(!inFile.exists())
		{inFile.createNewFile();}
		try (FileInputStream fis = new FileInputStream(inFile);) {//FileInputStream()��()���Ѽƪ�ܭnŪ�����ɮ� �����n�s�b
			int count = 0;
			int i1 = 0;
			byte[] ba = new byte[1024];
			while ((count = fis.read(ba)) != -1) {//read(byte[] b) Ū��b.length�Ӧ줸�� ���b�}�C (���Ь�0�}�l��) �^�ǭȬ����Ū�����줸�խӼ� �S��� �^��-1
				i1 += count;
			}
			System.out.println("sample.txt �t��  " + i1 + " �Ӧ줸��");
		} /*
			 * catch (IOException e) { e.printStackTrace(); }���Ϋŧi�k�h,�i�g�i���g
			 */
		try (FileReader fr = new FileReader(inFile)) {
			int count = 0;
			int i2 = 0;
			while ((count = fr.read()) != -1) {
				i2 += count;
			}
			System.out.println("sample.txt �t��  " + i2 + " �Ӧr��");
		} /*
			 * catch (IOException e) { e.printStackTrace(); } ���Ϋŧi�k�h,�i�g�i���g
			 */
		try (BufferedReader brd = new BufferedReader(new FileReader(inFile));) { // BufferedReader()���A�J�����Ѽƥ����O�n�r��άO"File"����
			String s = null;
			int i3 = 0;
			while ((s = brd.readLine()) != null) { //.readLine()���NŪ���쪺����ഫ���r�ꪫ��Ǧ^
				i3++;
			}
			System.out.println("sample.txt �t��  " + i3 + " �C���");
		} /*
			 * catch (IOException e) { e.printStackTrace(); }���Ϋŧi�k�h,�i�g�i���g
			 */
	}
}