public class Exercise10_02 {
    public static void main(String[] args) {

        Time test1 = new Time();

        Time test2 = new Time(555550000);

        Time test3 = new Time(5, 23, 55);

        System.out.println( test1.getHour() + ":" + test1.getMin() + ":" +
                test1.getSec());

        System.out.println(test2.getHour() + ":" + test2.getMin() + ":" +
                test2.getSec());

        System.out.println(test3.getHour() + ":" + test3.getMin() + ":" +
                test3.getSec());

    }
}
class Time {

    private long hour;
    private long min;
    private long second;

    public Time() {

        long theTime = System.currentTimeMillis();

        this.setTime(theTime);
    }

    public Time(long newTime) {

        this.setTime(newTime);

    }

    public Time(long newHour, long newMin, long newSec) {

        second = newSec;

        min = newMin;

        hour = newHour;

    }

    public void setTime(long elapsedTime) {

        hour = (((elapsedTime / 1000) / 60) / 60) % 24;

        second = (elapsedTime / 1000) % 60;

        min = ((elapsedTime / 1000) / 60) % 60;


    }

    public long getHour() {

        return hour;

    }

    public long getMin() {

        return min;
    }

    public long getSec() {

        return second;
    }


}