package cn.myringle;

public class DayVarible1 {
    //版本1.5（5） 以前 没有enum接口

    private  final Integer num ;
    private  final String name;

    public DayVarible1(Integer num, String name) {
        this.num = num;
        this.name = name;
    }

    //定义实例常量
    public static  final  DayVarible1 daysVarible1 = new DayVarible1(1,"qlb");
    public static final  DayVarible1 daysVarible2 = new DayVarible1(2,"xxx");

    public Integer getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "DayVarible1{" +
                "num=" + num +
                ", name='" + name + '\'' +
                '}';
    }
}
