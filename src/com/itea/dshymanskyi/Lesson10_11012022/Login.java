package com.itea.dshymanskyi.Lesson10_11012022;

public class Login {

    public static boolean login(String login, String password, String confirmPassword) {
        try {
            if (!checkCredentials(login)) {
                throw new WrongLoginException("Wrong login");
            }
            if (!(checkCredentials(password) && password.equals(confirmPassword))) {
                throw new WrongPasswordException("Wrong password");
            }
            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            return false;
        }
    }


    private static boolean checkCredentials(String credential) {
        return credential.length() < 20 && credential.matches("[A-Za-z0-9_]+");
    }
}


