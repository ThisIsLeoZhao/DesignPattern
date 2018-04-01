package Prototype;

import java.util.Date;

public class Resume implements Cloneable {
    private String mName;
    private boolean mGender;
    private Experience mExperience = new Experience();

    public Resume(String name) {
        mName = name;
    }

    public void setName(String name) {
        mName = name;
    }

    public void setGender(boolean gender) {
        mGender = gender;
    }

    public void setExperience(String startDate, String endDate, String description) {
        mExperience.setStartDate(startDate);
        mExperience.setEndDate(endDate);
        mExperience.setDescription(description);
    }

    public void display() {
        String builder = "Name: " + mName + '\n' +
                "Gender: " + (mGender ? "Male" : "Female") + '\n' +
                "Experience: " + mExperience + '\n';
        System.out.println(builder);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Resume newObject = (Resume) super.clone();
        newObject.mExperience = (Experience) mExperience.clone();
        return newObject;
    }
}
