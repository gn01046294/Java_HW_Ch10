package Ch10;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Q10_05 {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\data");
		if (!f.exists()) {
			f.mkdirs();
		}
		File cf = new File(f, "ObjectQ10_05.dat");
		if (!cf.exists()) {
			cf.createNewFile();
		}
		try (FileOutputStream fis = new FileOutputStream(cf); 
			 ObjectOutputStream oos = new ObjectOutputStream(fis);
			) {
			Cat c1 = new Cat("c1");  
			Cat c2 = new Cat("c2");
			Dog d1 = new Dog("d1");
			Dog d2 = new Dog("d2");

			oos.writeObject(c1);   //���H�U�W�w�аȥ����I!!!!!!!!��
			oos.writeObject(c2);   //�n�N����g�i�ɮפ��μg�i�ä[�x�s�˸m �ȥ��n�ǦC�� 
			oos.writeObject(d1);   //�ҥH �b Cat Dog�����O������@java.io.Serialazable !!
			oos.writeObject(d2);   //���H�W�W�w�аȥ����I!!!!!!!!��

		} catch (IOException e) {}
	}

}
