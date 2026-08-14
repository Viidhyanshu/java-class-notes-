class timeadd{
    private int hr, min, sec;
    timeadd(){

    }
    timeadd(int hr, int min, int sec){
        this.hr=hr;
        this.min=min;
        this.sec=sec;
    }

    void addtime(timeadd t1, timeadd t2){
        sec = t1.sec + t2.sec;
        min = t1.min + t2.min;
        hr = t1.hr + t2.hr;
        if(sec >= 60){
            sec -= 60;
            min += 1;
        }
        if(min >= 60){
            min -= 60;
            hr += 1;
        }
    }
    void show(){
        System.out.println(hr + ":" + min + ":" +sec);
    }
}

class time{
    public static void main(String[] args) {
        timeadd t1 = new timeadd (7,55,59);
        timeadd t2 = new timeadd (7,55,59);
        timeadd t3 = new timeadd ();
        t3.addtime(t1, t2);
        t3.show();
    }
}