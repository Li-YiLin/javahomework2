# JAVA第三次实验报告——PC机模拟程序
## 实验目的
---
* 初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；
* 掌握面向对象的类设计方法（属性、方法）；
* 掌握类的继承用法，通过构造方法实例化对象；
* 学会使用super()，用于实例化子类；
* 掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。
---
## 实验方法
  实验课堂上讲基本的架构基本功能进行实现，课后结合资料与人讨论完善系统，期间对每个重要版本进行保存。尽可能去尝试新的东西，在运用的过程中发现问题，解决问题。
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

![实验结果截图](实验结果.png)
## 实验感想
---

知识点：
* java数组创建不能在声明中指定数组元素的个数，需要创建数组，为数组分配内存。
*
## 实验相关链接
* https://blog.csdn.net/qq_35038153/article/details/79577464?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522160355362019724839255273%2522%252C%2522scm%2522%253A%252220140713.130102334..%2522%257D&request_id=160355362019724839255273&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~first_rank_v2~rank_v28-1-79577464.first_rank_ecpm_v3_pc_rank_v2&utm_term=java+nextint+nextline&spm=1018.2118.3001.4187
* https://blog.csdn.net/xingzhiqing/article/details/93177671?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522160355397219724839209481%2522%252C%2522scm%2522%253A%252220140713.130102334..%2522%257D&request_id=160355397219724839209481&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~first_rank_v2~rank_v28-1-93177671.first_rank_ecpm_v3_pc_rank_v2&utm_term=java%E5%AD%97%E7%AC%A6%E4%B8%B2%E5%88%A4%E6%96%AD&spm=1018.2118.3001.4187
