package Homework2;

public class Teacher extends people{
    String name;
    int bianhao;
    Teacher(String name,int bianhao,String sex){
    	this.name=name;
    	this.bianhao = bianhao;
    	this.sex = sex;
    }
    public String toString() {
    	return "老师姓名："+name+"  性别："+sex+"  编号："+bianhao;
    }
}
