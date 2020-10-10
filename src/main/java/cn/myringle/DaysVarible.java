package cn.myringle;

public enum DaysVarible {
    Monday(1,"星期一"),Saturaday(2,"星期二"),Wensday(3,"星期三");
    private int num;
    private String descrition;

    DaysVarible(int i, String day) {
        this.num =i;
        this.descrition = day;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setDescrition(String descrition) {
        this.descrition = descrition;
    }

    public int getNum() {
        return num;
    }

    public String getDescrition() {
        return descrition;
    }
}
