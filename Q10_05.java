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

			oos.writeObject(c1);   //※以下規定請務必死背!!!!!!!!※
			oos.writeObject(c2);   //要將物件寫進檔案內或寫進永久儲存裝置 務必要序列化 
			oos.writeObject(d1);   //所以 在 Cat Dog的類別都有實作java.io.Serialazable !!
			oos.writeObject(d2);   //※以上規定請務必死背!!!!!!!!※

		} catch (IOException e) {}
	}

}
