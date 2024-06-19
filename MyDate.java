import java.util.Date;

public class MyDate {

    @RandomDate()
    private Date myDate;

    public void setMyDate(long msDate) {
        this.myDate = new Date(msDate);
    }

    public Date getMyDate() {
        return this.myDate;
    }
}