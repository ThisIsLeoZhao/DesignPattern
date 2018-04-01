package Prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResumeTest {
    @Test
    public void testCreateResume() throws CloneNotSupportedException {
        Resume resume1 = new Resume("resume1");
        resume1.setGender(true);
        resume1.setExperience("2001", "2002", "ex1");

        Resume resume2 = (Resume) resume1.clone();
        resume2.setName("resume2");
        resume2.setGender(true);
        resume2.setExperience("2002", "2003", "ex2");

        Resume resume3 = (Resume) resume1.clone();
        resume3.setName("resume3");
        resume3.setGender(false);
        resume3.setExperience("2003", "2004", "ex3");

        resume1.display();
        resume2.display();
        resume3.display();
    }


}