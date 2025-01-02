package userp;

import exception.NotCorrectUser;

public class Main {

    public static void main(String[] args) {
        User user1 = new User(90);
        try {
            checkUserAge(user1);
        } catch (NotCorrectUser e) {
            System.out.println(e.getMessage());
        }

    }


    public static void checkUserAge(User user) throws NotCorrectUser {
        if (user.getAge() < 65) {
            throw new NotCorrectUser("User not correct !");
        } else {
            System.out.println("User correct !");
        }
    }
}