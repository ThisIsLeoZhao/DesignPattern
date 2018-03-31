package FactoryMethod;

public class Volunteer implements ILeiFeng {
    @Override
    public void work() {
        System.out.println("Volunteer work");
    }

    public static class Creator implements ILeiFengFactory {

        @Override
        public ILeiFeng make() {
            return new Volunteer();
        }
    }
}
