package NOV18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test2 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("�ŷ�", 3));
		list.add(new Student("����", 2));
		//1.��ͨforѭ��
		/*for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}*/
		
		//2.foreachѭ��
		/*for (Student s : list) {
			System.out.println(s);
		}*/
		
		//3.iterator����
		Iterator<Student> it = list.iterator();
		while(it.hasNext()){
			Student s = it.next();
			System.out.println(s);
		}
	}

}





