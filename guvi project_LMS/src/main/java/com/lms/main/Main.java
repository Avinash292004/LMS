package com.lms.main;

import com.lms.ui.LoginForm;

public class Main {
    public static void main(String[] args) {
        try {
            LoginForm loginForm = new LoginForm();
            loginForm.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error starting application: " + e.getMessage());
        }
    }
}
