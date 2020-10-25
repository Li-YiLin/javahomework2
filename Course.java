package Homework2;

public class Course {
       String bianhao;
       String name;
       String dress;
       String time;
       Teacher teacher;
       Course(){
    	   
       }
       Course(String bianhao,String name,String dress,String time,Teacher teacher){
    	   this.bianhao=bianhao;
           this.name=name;
           this.dress=dress;
           this.time=time;
           this.teacher=teacher;
       }
       @Override
       public String toString() {
     	  return "编号"+bianhao+"  课程名称:"+name+"  授课地址:"+dress+"  时间:"+time+"  授课教师:"+teacher.name+"  授课老师编号:"+teacher.bianhao;
}
       void show() {
    	   System.out.println("mingcheng"+name);
       }
       int getbianhao(){
           int x = Integer.parseInt(bianhao);
           return  x;
       }
}