package Homework2;

public class Student extends people {
	int bianhao;
	String name;
	//      int course[];
	Course course[];
	int xuanke[]= new int[20];

	Student(int bianhao, String name, Course... cour) {
		this.bianhao = bianhao;
		this.name = name;
		Course[] courses = new Course[cour.length];
		//System.out.println(course.length);
		for (int i = 0; i < cour.length; i++) {
			// System.out.println(course[i].name);
			courses[i] = cour[i];
			//System.out.println("ѡ��"+courses[i]);
		}
	    }
	void showall() {
		if(course==null)
		{System.out.println("ѧ��Ŀǰδѡ��");}
		else {
			System.out.println("ѧ����"+name);
			for(int i=0;i<course.length;i++)
			{System.out.println("ѡ��"+course[i]); }
		}
	}
	public String toString() {
		return name+"  ��ţ�"+bianhao;
	}

	Student(int bianhao, String name) {
		this.bianhao = bianhao;
		this.name = name;

	}
    void getcourse(int x){
		this.xuanke[x] = x;
	}
	void tuike() {
		course = null;
	}

}
