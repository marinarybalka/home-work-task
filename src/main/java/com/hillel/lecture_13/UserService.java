package com.hillel.lecture_13;

public class UserService {

    private String[] users = {"Alex", "Bob", "Anna"};

    public String findUserByName(String userName) throws CustomException {
        for (String user : users) {
            if (user.equalsIgnoreCase(userName)) {
                return user;
            }
        }
        throw  new CustomException("User with name " + userName + " not found");
    }
}
