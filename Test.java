package Homework2;
import java.util.Scanner;

public class Test {
	static void cls(){
		System.out.println("\n\n\n\n\n");
	}
public static void main(String[] args) {
	Teacher you= new Teacher("����",201002,"��");
	Course math = new Course("01","����","��ѧ¥101","��һ��һ��",you);
	Course english = new Course("02","����˵","ͼ���503","�ܶ�������",you);
    Scanner sc = new Scanner(System.in);
	Student li = new Student(2019311,"LYL",math,english);
    int i = 1;
    while(i != 0){
    	System.out.println("�γ���Ϣ�Ѹ���");
	    System.out.println("���룺1 ѡ��    2 �˿�    0  �˳�");
		i = sc.nextInt();
		if(i == 1){
			cls();
			System.out.println("Ŀǰ�γ̣�01 ����;02 ����˵ \n 	��ѡ��");
			String i1 = sc.nextLine();
			if(i1 == "01"){

			}

		}
    }

	System.out.println("��ʦ������Ϣ"+you);
	li.showall();
	//math.show();
	li.tuike();
	
}
}
