package Homework2;
import java.util.Scanner;

public class Test {
	static void cls(){
		System.out.println("\n\n\n\n\n\n");
	}
public static void main(String[] args) {
	Teacher you= new Teacher("游煦",201002,"男");
	Course math = new Course("01","高数","教学楼101","周一第一节",you);
	Course english = new Course("02","视听说","图书馆503","周二第三节",you);
    Scanner sc = new Scanner(System.in);

	Student li = new Student(2019311,"LYL");
	System.out.println("老师基本信息"+you);
	li.getcourse(math);
	li.getcourse(english);
    int i = 1;
    System.out.println("进入选课系统：");
    while(i != 0){
	    System.out.println("请选择：\n1：选课    2：退课   3：显示已选   0：退出");

		i = sc.nextInt();
		sc.nextLine();     //抛弃剩下内容便于下次调用nextLine
		if(i == 1){
			cls();
			System.out.println("目前课程：01 高数;02 视听说 \n 	请选择：");
			String i1 = sc.nextLine();
			if(i1.equals("01")){
                 li.xuanke(1);
                 System.out.println("选课成功");
			}
			else if(i1.equals("02")){
				li.xuanke(2);
				System.out.println("选课成功");
			}
            else System.out.println("暂无此选课，返回上级");
		}
		else if(i == 2){
			cls();
			System.out.println("目前课程：01 高数;02 视听说 \n 	请选择：");
			String i1 = sc.nextLine();
			if(i1.equals("01")){
				li.tuike(1);
			}
			else if(i1.equals("02")){
				li.tuike(2);
			}
			else System.out.println("暂无此选课,无法退课，返回上级");
		}

        else if(i == 3){
			li.showall();
		}
        System.out.println("课程信息已更新");
    }


	//math.show();

	
}
}
