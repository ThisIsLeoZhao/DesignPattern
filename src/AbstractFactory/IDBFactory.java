package AbstractFactory;

public interface IDBFactory {
    IDBUser makeUser();
    IDBDepartment makeDepartment();
}
