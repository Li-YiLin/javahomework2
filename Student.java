package Homework2;

public class Student extends people {
	int bianhao;
	String name;
	//      int course[];
	Course course[] = new Course[20];
	int xuanke[]= new int[20];
	void xuanke(int x){
		xuanke[x] = 1;
	}
	void tuike(int x) {
		if(xuanke[x] == 1)
		{
			xuanke[x]=0;
		    System.out.println("退课成功");
		}
		else{
			System.out.println("未选此课，无须退课");
		}
	}

	void showall(){
		for(int i=0;i<=19;i++){
			if(xuanke[i] == 1 && course[i] != null){
				System.out.println("已选："+course[i]);
			}
		}
	}
	public String toString() {
		return name+"  编号："+bianhao;
	}
    Student(int bianhao,String name,String sex)
	{
		super(bianhao,name,sex);
	}
	Student(int bianhao, String name) {
		this.bianhao = bianhao;
		this.name = name;
	}
	void getcourse(Course cour){
		course[cour.getbianhao()]=cour;
		System.out.println("导入课程信息"+course[cour.getbianhao()]);
	}


//	void showall() {
//		if(course==null)
//		{System.out.println("学生目前未选课");}
//		else {
//			System.out.println("学生："+name);
//			for(int i=0;i<course.length;i++)
//			{System.out.println("选课"+course[i]); }
//		}
//	}


//	void getcourse(Course  ...cour){
//		for(int i=0;i<cour.length;i++) {
//			course[cour[i].getbianhao()]=cour[i];
//
//		}
//	}



//	void tuike() {
//		course = null;
//	}
//	Student(int bianhao, String name) {
//		this.bianhao = bianhao;
//		this.name = name;
//		//Course[] courses = new Course[cour.length];
//		//System.out.println(course.length);
//		for (int i = 0; i < cour.length; i++) {
//			// System.out.println(course[i].name);
//			courses[i] = cour[i];
//			//System.out.println("选课"+courses[i]);
//		}
//	    }
}
