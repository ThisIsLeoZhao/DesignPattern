package TemplateMethod;

public interface Paper {
    // Template method
    public default void q1() {
        System.out.println("Q1");
        a1();
    }

    // Template method
    public default void q2() {
        System.out.println("Q2");
        a2();
    }

    public void a1();
    public void a2();
}
