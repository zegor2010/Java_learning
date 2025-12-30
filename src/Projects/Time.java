package Projects;

public class Time {
    long hour;
    long minute;
    long second;


    public Time(){
        System.currentTimeMillis();
    }
    public Time(long hour, long minute, long second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public long getHour() {
        return hour;
    }
    public long getMinute() {
        return minute;
    }
    public long getSecond() {
        return second;
    }

    public void setTime(long elapsedTime){
        long totalSeconds = elapsedTime / 1000;
        second = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        minute = (int)(totalMinutes % 60);
        long totalHours = totalMinutes / 60;
        hour = (int)(totalHours % 24);
    }
}
