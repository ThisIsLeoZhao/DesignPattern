package AbstractFactory;

public class MongoDBFactory implements IDBFactory {
    @Override
    public IDBUser makeUser() {
        return new MongoDBUser();
    }

    @Override
    public IDBDepartment makeDepartment() {
        return new MongoDBDepartment();
    }
}
