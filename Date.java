package regdno2241001090;

public class Date {
    int date;
    int month;
    int year;
    Date(int date,int month,int year){
        this.date=date;
        this.month=month;
        this.year=year;
    }
    void showDate(){
        System.out.println(date+"-"+month+"-"+year);
    }
}
