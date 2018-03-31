package FactoryMethod;

public class Student implements ILeiFeng {

    @Override
    public void work() {
        System.out.println("Student work");
    }

    public static class Creator implements ILeiFengFactory {

        @Override
        public ILeiFeng make() {
            return new Student();
        }
    }
}
