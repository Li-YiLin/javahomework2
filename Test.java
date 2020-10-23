package Homework2;
import java.util.Scanner;

public class Test {
	static void cls(){
		System.out.println("\n\n\n\n\n");
	}
public static void main(String[] args) {
	Teacher you= new Teacher("游煦",201002,"男");
	Course math = new Course("01","高数","教学楼101","周一第一节",you);
	Course english = new Course("02","视听说","图书馆503","周二第三节",you);
    Scanner sc = new Scanner(System.in);
	Student li = new Student(2019311,"LYL",math,english);
    int i = 1;
    while(i != 0){
    	System.out.println("课程信息已更新");
	    System.out.println("输入：1 选课    2 退课    0  退出");
		i = sc.nextInt();
		if(i == 1){
			cls();
			System.out.println("目前课程：01 高数;02 视听说 \n 	请选择：");
			String i1 = sc.nextLine();
			if(i1 == "01"){

			}

		}
    }

	System.out.println("老师基本信息"+you);
	li.showall();
	//math.show();
	li.tuike();
	
}
}
