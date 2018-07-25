package Ch10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*�мg�@�{��Q10_03.java�A�b�{����
�бN�B�I��17.625�HObjectOutputStream���O��writeDouble()�N��g���ɮפWC:\data\DataQ10_03.txt�C�ݭn�P�_C:\data\�O�_�s�b�A�p�G���s�b�A�{�������إߡC
���ɫ�A�A�HObjectInputStream���O��readDouble()Ū�^�A��ܦb�ù��W�C
���ܡG�|�Ψ����O��FileOutputStream�BObjectOutputStream�BFileInputStream�BObjectInputStream�����O�C */
public class Q10_03 {
	public static void main(String[] args) throws IOException {

		try(FileOutputStream fos = new FileOutputStream("C:\\data\\DataQ10_03.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);){
			oos.writeDouble(17.625);
		}catch(IOException ioe) {
			System.out.println("�o�Ϳ��~:" +  ioe);
		}
		try(FileInputStream fis = new FileInputStream("C:\\data\\DataQ10_03.txt");
				ObjectInputStream ois = new ObjectInputStream(fis);){
			double d = ois.readDouble();
			System.out.println(d);
		}catch(IOException ioe) {
			System.out.println("�o�Ϳ��~:" +  ioe);
		}
		
		
	}

}
