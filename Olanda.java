/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Olanda;
import java.util.Scanner;

public class Olanda {

    
    public static void main(String[] args) {
        
        Scanner sc = new
                Scanner(System.in);

        
        String[][] users = new String[100][2]; 
        int userCount = 0;
        int choice;

        do {
            System.out.println("\n==== LOGIN SYSTEM ====");
            System.out.println("[1] Login");
            System.out.println("[2] Register");
            System.out.println("[3] Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                   
                    System.out.print("Enter username: ");
                    String loginUser = sc.nextLine();
                    System.out.print("Enter password: ");
                    String loginPass = sc.nextLine();

                    boolean found = false;

                    for (int i = 0; i < userCount; i++) {
                        if (users[i][0].equals(loginUser) && users[i][1].equals(loginPass)) {
                            System.out.println("Hello, " + loginUser + "!");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Invalid username or password!");
                    }
                    break;

                case 2:
                    // REGISTER FUNCTION
                    System.out.print("Enter new username: ");
                    String newUser = sc.nextLine();

                    boolean exists = false;
                    for (int i = 0; i < userCount; i++) {
                        if (users[i][0].equals(newUser)) {
                            exists = true;
                            break;
                        }
                    }

                    if (exists) {
                        System.out.println("Username already exists!");
                    } else {
                        System.out.print("Enter password: ");
                        String newPass = sc.nextLine();
                        System.out.print("Confirm password: ");
                        String confirmPass = sc.nextLine();

                        if (!newPass.equals(confirmPass)) {
                            System.out.println("Passwords do not match!");
                        } else {
                            users[userCount][0] = newUser;
                            users[userCount][1] = newPass;
                            userCount++;
                            System.out.println("Registration successful!");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option! Please try again.");
            }

        } while (choice != 3);

        sc.close();
    }
 }