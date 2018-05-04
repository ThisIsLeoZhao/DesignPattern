package AbstractFactory;

import org.junit.jupiter.api.Test;

class DBUserTest {
    private IDBFactory mSqlFactory = new SQLFactory();
    private IDBFactory mMongoDbFactory = new MongoDBFactory();

    @Test
    void test() {
        IDBUser user1 = mSqlFactory.makeUser();
        user1.insert(new User("hi"));
        user1.get("hi");
        IDBDepartment department1 = mSqlFactory.makeDepartment();
        department1.insert(new Department("kkk"));
        department1.get("kkk");

        IDBUser user2 = mMongoDbFactory.makeUser();
        user2.insert(new User("hi2"));
        user2.get("hi2");
        IDBDepartment department2 = mMongoDbFactory.makeDepartment();
        department2.insert(new Department("kkk"));
        department2.get("kkk");
    }

}