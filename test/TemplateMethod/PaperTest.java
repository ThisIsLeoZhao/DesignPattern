package TemplateMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaperTest {
    @Test
    void test() {
        Paper paperA = new PaperA();
        paperA.q1();
        paperA.q2();

        Paper paperB = new PaperB();
        paperB.q1();
        paperB.q2();
    }

}