package com.banque.beans;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    GestionCompte gestion = new GestionCompte();

    // ------------------------------------------------------------------------
    public void getAccountList() {
        System.out.println("===== Afficher Liste de compte =====");

        boolean stopLoop = false;

        while (!stopLoop) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Afficher la list des : ");
            System.out.println("1 - Compte courant");
            System.out.println("2 - Compte épargne");
            System.out.println("3 - Compte rémunéré");

        }
    }

    // ------------------------------------------------------------------------
    public void accountCreation() throws Exception {
        System.out.println("===== Creation de compte =====");

        boolean stoploop = false;

        while (!stoploop) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ajouter un id : ");
            int id = scanner.nextInt();
            System.out.println("Indiquer le solde du compte : ");
            int solde = scanner.nextInt();

            System.out.println("Type de compte a créer : ");
            System.out.println("1 - Compte courant");
            System.out.println("2 - Compte épargne");
            System.out.println("3 - Compte rémunéré");

            int createChoice = scanner.nextInt();
            if (createChoice == 1) {
                gestion.createAccountCurrent(id, solde);
                stoploop = true;
            } else if (createChoice == 2) {
                gestion.createAccountSaving(id, solde);
                stoploop = true;
            } else if (createChoice == 3) {
                gestion.createAccountRemunerated(id, solde);
                stoploop = true;
            } else {
                throw new Exception("create account wrong choice :");
            }
        }
    }

    // ------------------------------------------------------------------------
    public void accountManagement() throws Exception {
        System.out.println("===== Gestion de comptes =====");

        boolean accountCorrect = false;
        while (!accountCorrect) {

            System.out.println("Choississez : ");
            System.out.println("1 - Créer un compte");
            System.out.println("2 - Afficher la liste des comptes");
            Scanner scanner = new Scanner(System.in);
            int accountChoice = scanner.nextInt();
            if (accountChoice == 1) {
                System.out.println("creation de compte");
                accountCreation();
                accountCorrect = true;
            } else if (accountChoice == 2) {
                System.out.println("Afficher Liste de compte");
                accountCorrect = true;
            } else {
                throw new Exception("account management wrong choice :");
            }
        }
    }

    // ------------------------------------------------------------------------
    public void clientCreation() {
        System.out.println("===== Creation de Client =====");
    }

    // ------------------------------------------------------------------------
    public void display() {

        System.out.println("===== MENU =====");

        boolean correct = false;
        while (!correct) {

            try {
                System.out.println("Choississez : ");
                System.out.println("1 - Gestion de comptes");
                System.out.println("2 - Créer un client");
                Scanner scanner = new Scanner(System.in);
                int choice = scanner.nextInt();
                if (choice == 1) {
                    this.accountManagement();
                    correct = true;
                } else if (choice == 2) {
                    this.clientCreation();
                    correct = true;
                } else {
                    throw new Exception("Main menu wrong choice :");
                }
            } catch (Exception e) {
                // System.out.println(e.getMessage());
                System.out.println("Choix inconnu" + "\n" + "Veillez recommencer" + "\n");
            }
        }
    }
}
