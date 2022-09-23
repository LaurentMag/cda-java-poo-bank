package com.banque.beans;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    GestionCompte gestion = new GestionCompte();

    // ------------------------------------------------------------------------
    // MAIN MENU
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

                } else if (choice == 2) {
                    this.clientCreation();

                } else {
                    throw new Exception("Main menu wrong choice :");
                }
            } catch (Exception e) {
                // System.out.println(e.getMessage());
                System.out.println(e.getMessage() + "\n" + "Veillez recommencer" + "\n");
            }
        }
    }

    // ------------------------------------------------------------------------
    // ACCOUNT MANAGEMENT :
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

            } else if (accountChoice == 2) {
                System.out.println("Afficher Liste de compte");
                this.getAccountList();
                accountCorrect = true;

            } else {
                throw new Exception("account management incorrect choice :");
            }
        }
    }

    // ------------------------------------------------------------------------
    // ACCOUNT CREATION
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
                System.out.println("Indiquer le decouvert autorisé: ");
                int decouvert = scanner.nextInt();
                gestion.createAccountCurrent(id, solde, decouvert);
                this.display();

            } else if (createChoice == 2) {
                gestion.createAccountSaving(id, solde);
                this.display();

            } else if (createChoice == 3) {
                gestion.createAccountRemunerated(id, solde);
                this.display();

            } else {
                throw new Exception("create account incorrect choice :");
            }
        }
    }

    // ------------------------------------------------------------------------
    // GET ACCOUNT LIST
    public void getAccountList() throws Exception  {
        System.out.println("===== Afficher Liste de compte =====");

        boolean stopLoop = false;

        while (!stopLoop) {


            boolean done = false;

            while(!done) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Afficher et séléctionner un : ");
                System.out.println("1 - Compte courant");
                System.out.println("2 - Compte épargne (not aviable for now)");
                System.out.println("3 - Compte rémunéré (not aviable for now)");

                int choice = scanner.nextInt();
                if(choice == 1) {
                    gestion.affichageEtSelectionCourant();
                    done = true;
                    stopLoop = true;
                } else {
                    throw new Exception("Account list incorrect choice");
                }
            }

        }
    }


    // ------------------------------------------------------------------------
    public void clientCreation() throws Exception  {

        System.out.println("===== Creation de Client =====");

        boolean done = false;
        while (!done) {
            System.out.println(" can't create client for now ☹️ ");
            System.out.println("");
            System.out.println("0 - retour : ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            if (choice == 0) {
                this.display();
            } else {
                throw new Exception("Client creation incorrect choice :");
            }
        }
    }


}
