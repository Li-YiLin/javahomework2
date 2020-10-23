# JAVA第三次实验报告——PC机模拟程序
## 实验目的
---
* 
* 
* 
* 
---
## 实验内容
* 
* 
## 实验方法
  提前阅读课本了解构造方法与属性类型相关知识，快速将基本要求完成。大致阅读书中关于public、private、protect、default的使用范围内容，尝试将修饰符加入程序。在添加的过程中找到错误，代码的编写过程遵循先易后难的原则，在编写完成后在网络上搜索遇到的相关的问题或知识，再次学习。
## 代码设计
  流程图
     
## 核心代码
主类中的具体内容
```
        //对象创建
        PC pc = new PC();
        Cpu cpu = new Cpu();
        HardDisk HD = new HardDisk(4000, (float) 2.5,true);
        //方法使用
        cpu.setSpeed(2200);
        HD.setAmount(200);
        pc.setCPU(cpu);
        pc.setHardDIsk(HD);
        pc.show();
        System.out.println("cpu品牌："+cpu.getbrand("AMD"));
        System.out.println("硬盘类型:");
        HD.gettype();
        Teacher ZSB = new Teacher(pc,"男");
        pc.setName("vegetable");
        Teacher.showname();
```
主类同包下的类的定义
```
 Cpu cpu;
    HardDisk HD;
    private String name;
   ···
    void show(){
        System.out.println("硬盘的容量是"+HD.getAmount());
        System.out.println("cpu的运行速度是"+cpu.getSpeed());
        }
```
Teacher跨包定义类的具体实现
```
    //Teacher类定义
    static PC pc;   //使用静态的PC类
    private String sex;       
    
    public Teacher(PC pc,String sex){
        this.pc=pc;
        this.sex=sex;
    }
    String getSex(String sex){
        return sex;
    }
    void setPc(PC pc){
        this.pc=pc;
    }
    public static void showname(){   //public类型静态方法
        System.out.println("主机名："+pc.getName());
    }
```
## 实验结果
---
实例化cpu，pc，hard disk，并输出cpu速度品牌，硬板的容量以及类型。建立名为ZSB的Teacher对象，定义其性别与主机名并输出主机名。
![实验结果截图](实验结果.png)
## 实验感想
---
尝试用markdown编辑。在Java中学习中对构造方法的使用更加灵活：通过定义构造方法可以直接对某些属性初始化或者进行一些操作，了解了新的类型：String类型。并且使用其作为方法的返回类型。初步了解了修饰符的作用，规范了代码的风格：尽量避免直接调用类中的属性，尽量通过调用接口的方法来进行操作属性。对static进行重新的理解。
知识点：
* main（）方法是静态方法。
* 静态方法下只能调用静态的方法属性
## 实验相关链接
