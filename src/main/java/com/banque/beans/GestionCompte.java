package com.banque.beans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GestionCompte {

    CompteCourant compte1 = new CompteCourant(1, 500, 300);
    CompteCourant compte2 = new CompteCourant(2, 200, 300);
    CompteCourant compte3 = new CompteCourant(3, 400, 100);
    CompteCourant compte4 = new CompteCourant(4, 5000, 2000);
    CompteCourant compte5 = new CompteCourant(5, 1500, 300);
    List<CompteCourant> listCompteCourant = new ArrayList<>(Arrays.asList(compte1, compte2, compte3, compte4, compte5));
    List<CompteEpargne> listCompteEpargne = new ArrayList<>();
    List<CompteRemu> listCompteRemu = new ArrayList<>();

    // ------------------------------------------------------------------------
    public void createAccountCurrent(int id, int solde, int overdraft) {
        CompteCourant compte = new CompteCourant(id, solde, overdraft);
        this.listCompteCourant.add(compte);

        System.out.println("le compte crée est : " + compte);
    }

    // ------------------------------------------------------------------------
    public void createAccountSaving(int id, int solde) {
        CompteEpargne compte = new CompteEpargne(id, solde);
        this.listCompteEpargne.add(compte);

        System.out.println("le compte crée est : " + compte);
    }

    // ------------------------------------------------------------------------
    public void createAccountRemunerated(int id, int solde) {
        CompteRemu compte = new CompteRemu(id, solde);
        this.listCompteRemu.add(compte);

        System.out.println("le compte crée est : " + compte);
    }

    // ------------------------------------------------------------------------
    public void accountOperation(List liste) {
        boolean correctChoice = false;


        while (!correctChoice) {
            System.out.println("Selectionner un compte");
            System.out.println("");

            Scanner scanner = new Scanner(System.in);
            int selected = scanner.nextInt();
            System.out.println("Selectionner une operation : ");
            if (selected < liste.size()) {
                correctChoice = true;

                System.out.println("Le compte séléctionné est : " +
                        "id : " + this.listCompteCourant.get(selected).getId() +
                        " Solde : " + this.listCompteCourant.get(selected).getSolde() +
                        " Découvert : " + this.listCompteCourant.get(selected).getAllowedOverdraft());
            } else {
                System.out.println("Ce compte n'existe pas, recommencez : ");
            }
        }
    }

    // ------------------------------------------------------------------------
    public void affichageEtSelectionCourant() {
        for (int i = 0; i < this.listCompteCourant.size(); i++) {
            System.out.println(i + "- compte " + "id : " +
                    this.listCompteCourant.get(i).getId() +
                    " Solde : " + this.listCompteCourant.get(i).getSolde() +
                    " Découvert : " + this.listCompteCourant.get(i).getAllowedOverdraft());
        }
        this.accountOperation(this.listCompteCourant);
    }


    // ------------------------------------------------------------------------
    public void getListCompteCourant() {
        for (CompteCourant compte : this.listCompteCourant) {
            System.out.println(compte.toString());
            ;
        }
    }
}
