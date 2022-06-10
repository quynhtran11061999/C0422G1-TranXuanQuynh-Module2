package ss4_lop_va_doi_tuong_trong_Java.bai_tap.StopWatch;

import java.util.Date;

public class StopWatch {
    private Date startTime;
    private Date endTime;

    public StopWatch() {
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void start() {
        this.startTime = new Date();
    }

    public void stop() {
        this.endTime = new Date();
    }

    public long getElapsedTime() {
        return this.endTime.getTime() - this.startTime.getTime();
    }
}
