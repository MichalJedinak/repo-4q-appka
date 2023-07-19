package javaKniznicaUloha2;

import kniznica.frames.LoginPage;

public class Main {
      public static void main(String[] args) throws ClassNotFoundException {

            //  Prihlásime sa do App cez GUI 
            Id_and_Passwords id_and_Passwords = new Id_and_Passwords();
            LoginPage loginPage = new LoginPage(id_and_Passwords.getLoginInfo());
            System.out.println(loginPage);

            // Pripojenie sa do databazy MySql80
           //JdbcMySQL pako = new JdbcMySQL();pako.getJdbcMySQL();         
      } 
}

