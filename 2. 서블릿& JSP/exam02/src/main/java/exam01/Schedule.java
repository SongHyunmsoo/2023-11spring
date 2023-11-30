package exam01;

public class Schedule {
   private int year;
   private int moth;
   private int day;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMoth() {
        return moth;
    }

    public void setMoth(int moth) {
        this.moth = moth;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {

        if(day > 28 ) day = 28;

        this.day = day;
    }

    void showDate(){
        System.out.printf("year=%d,moth=%d,day=%d%n",year,moth,day);

    }

    @Override
    public String toString() {
        return "Schedule{" +
                "year=" + year +
                ", moth=" + moth +
                ", day=" + day +
                '}';
    }
}
