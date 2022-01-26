package com.itea.dshymanskyi.Lesson7_22122021;

import java.util.Objects;

public class UserInfo {

    private String username;
    private String password;

    private static final UserInfo userCredentials = new UserInfo("Username1","Password1!");

    public UserInfo(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserInfo userInfo = (UserInfo) o;
        return username.equals(userInfo.username) && password.equals(userInfo.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password);
    }

    public String login() {
        if (this.username.equals(userCredentials.username) && this.password.equals(userCredentials.password)) {
            return "Имя пользователя и пароль совпадают";
        } else {
            return "Имя пользователя и пароль НЕ совпадают";
        }
    }
}
