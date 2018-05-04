package AbstractFactory;

public class SQLFactory implements IDBFactory {
    @Override
    public IDBUser makeUser() {
        return new SQLUser();
    }

    @Override
    public IDBDepartment makeDepartment() {
        return new SQLDepartment();
    }
}
