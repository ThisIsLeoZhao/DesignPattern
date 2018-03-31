package FactoryMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeiFengTest {
    @Test
    void volunteerTest() {
        ILeiFengFactory leiFengFactory = new Volunteer.Creator();

        ILeiFeng leiFeng1 = leiFengFactory.make();
        ILeiFeng leiFeng2 = leiFengFactory.make();
        ILeiFeng leiFeng3 = leiFengFactory.make();
        ILeiFeng leiFeng4 = leiFengFactory.make();

        leiFeng1.work();
        leiFeng2.work();
        leiFeng3.work();
        leiFeng4.work();
    }

    @Test
    void studentTest() {
        ILeiFengFactory leiFengFactory = new Student.Creator();

        ILeiFeng leiFeng1 = leiFengFactory.make();
        ILeiFeng leiFeng2 = leiFengFactory.make();
        ILeiFeng leiFeng3 = leiFengFactory.make();
        ILeiFeng leiFeng4 = leiFengFactory.make();

        leiFeng1.work();
        leiFeng2.work();
        leiFeng3.work();
        leiFeng4.work();
    }
}