package AbstractFactory;

public interface IDBDepartment {
    default void insert(Department department) {
        System.out.println("Insert " + department.toString() + " to " + this);
    }

    default void get(String name) {
        System.out.println("Get " + name + " from " + this);
    }
}
