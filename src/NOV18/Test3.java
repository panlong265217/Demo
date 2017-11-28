package NOV18;

import java.io.File;

public class Test3 {

	public static void main(String[] args) {
		File file =new File("d:/");
		getName(file);
	}
				public static void getName(File file){
			File[] fs = file.listFiles();//得到所有文件对象
			for (int i = 0;fs!=null && i < fs.length; i++) {
				System.out.println(fs[i].getName());
				if(!fs[i].isFile()){//如果是文件夹
					getName(fs[i]);//递归调用
				}
			}
		}


	

}
