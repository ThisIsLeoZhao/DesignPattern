package Prototype;

import java.util.Date;

public class Experience implements Cloneable {
    private String mStartDate;
    private String mEndDate;
    private String mDescription;

    public Experience() {}

    public Experience(String startDate, String endDate, String description) {
        mStartDate = startDate;
        mEndDate = endDate;
        mDescription = description;
    }

    public void setStartDate(String startDate) {
        mStartDate = startDate;
    }

    public void setEndDate(String endDate) {
        mEndDate = endDate;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    @Override
    public String toString() {
        return "Start: " + mStartDate + ", End: " + mEndDate + ", Description: " + mDescription;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
