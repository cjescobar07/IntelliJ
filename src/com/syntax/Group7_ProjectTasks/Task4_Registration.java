package com.syntax.Group7_ProjectTasks;
public class Task4_Registration {
    /*
    Create Registration Class in which you would have
    variables as email, userName and password that
    have an access scope only within its own class. After
    creating an object of the class user should be able to
    call methods and in each method separately pass
    values to set users email, username and password.
    Requirements:
    A.Valid email consider to be only yahoo
    B.Valid userName and password cannot be empty and
    should be of length larger than 6 characters.
    Also, valid password cannot contain userName.
     */
    public static void main(String[] args) {
        Registration registration = new Registration();
        registration.setEmail("cjescobar07@gmail.com");
        registration.setUserName("");
        registration.setPassword("12345");
        System.out.println(registration.getEmail());
        System.out.println(registration.getUserName());
        System.out.println(registration.getPassword());


    }
}

class Registration {
    private String email;
    private String userName;
    private String password;

    public String getEmail() {
        if (email.contains("gmail.com")) {
            return email + " is a valid email";
        } else {
            return email + " is not a valid email. You need a @gmail email to register";
        }
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        if (userName.isEmpty()) {
            return "Username cannot be empty";
        } else {
            return userName + " is a valid username";
        }
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        if (password.isEmpty()) {
            return "Password cannot be empty";
        } else if (password.length() < 6) {
            return "Password to short";
        } else if (password.equals(userName)) {
            return "Password cannot contain username";
        } else {
            return "Password is valid";
        }
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
