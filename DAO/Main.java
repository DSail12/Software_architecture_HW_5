package HW5.DAO;

public class Main {
    public static void main(String[] args) {
        UserDao userDao = new UserDaoImpl();
        
        User user1 = new User("Дмитрий", 17);
        userDao.addUser(user1);
        
        User user2 = userDao.getUser("Ольга");
        user2.setAge(22);
        userDao.updateUser(user2);
        
        userDao.deleteUser(user2);
    }
}