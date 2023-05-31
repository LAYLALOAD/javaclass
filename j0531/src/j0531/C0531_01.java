package j0531;

import java.util.ArrayList;
import java.util.List;

public class C0531_01 {

	public static void main(String[] args) {
		// 다형성 : 부모의 참조변수로 자손의 객체를 다루는 것
		List list = new ArrayList<>();
		list.add("aaa"); // list 안에 들어가있는 데이터는 object 객체임
		list.add("bbb");
		list.add("ccc");
		list.add("aaa");
		
		System.out.println(list.get(1));
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("--------------------------");
		
		List list2 = new ArrayList<>();
		//Student s1 = new Student(1,"홍길동",100,100,99);	//a
		//list.add(s1);										//b
		list2.add(new Student(1,"홍길동",100,100,99));			//a, b 축약해서 작성
		list2.add(new Student(2,"유관순",99,99,98)); // object type
		//list2.add(1);
		
		
		Student s = (Student) list2.get(1);
		System.out.println(s.getName());
		System.out.println(((Student)list2.get(1)).getName());
		
		System.out.println("--------------------------");
		
		//기본적 형식 (외우기)
		List<Student> list3 = new ArrayList<>(); //지네릭스
		list3.add(new Student(1,"홍길동",100,100,100));
		list3.add(new Student(2,"유관순",99,99,98));
		//list3.add(1);
		//list3.add("abc");
		
		Student ss = list3.get(0);
		System.out.println(ss.getName());
		System.out.println(list3.get(0).getName());
		
	}

}
