package com.banque.beans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GestionCompte {

    CompteCourant compte1 = new CompteCourant(1, 500, 300);
    CompteCourant compte2 = new CompteCourant(1, 200, 300);
    CompteCourant compte3 = new CompteCourant(1, 400, 100);
    CompteCourant compte4 = new CompteCourant(1, 5000, 2000);
    CompteCourant compte5 = new CompteCourant(1, 1500, 300);
    List<CompteCourant> listCompteCourant = new ArrayList<>(Arrays.asList(compte1, compte2, compte3, compte4, compte5));
    List<CompteEpargne> listCompteEpargne = new ArrayList<>();
    List<CompteRemu> listCompteRemu = new ArrayList<>();

    public void createAccountCurrent(int id, int solde, int overdraft) {
        CompteCourant compte = new CompteCourant(id, solde, overdraft);
        this.listCompteCourant.add(compte);

        System.out.println("le compte crée est : " + compte);
    }

    public void createAccountSaving(int id, int solde) {
        CompteEpargne compte = new CompteEpargne(id, solde);
        this.listCompteEpargne.add(compte);

        System.out.println("le compte crée est : " + compte);
    }

    public void createAccountRemunerated(int id, int solde) {
        CompteRemu compte = new CompteRemu(id, solde);
        this.listCompteRemu.add(compte);

        System.out.println("le compte crée est : " + compte);
    }

    public void accountOperation() {
        boolean correctChoice = false;
        System.out.println("Selectionner une operation : ");

        while (!correctChoice) {

        }
    }

    public void affichageEtSelectionCourant() {
        for (int i = 0; i < this.listCompteCourant.size(); i++) {
            System.out.println(i + "- compte " + "id : " + this.listCompteCourant.get(i).getId() + " Solde : " + this.listCompteCourant.get(i).getSolde() + " Découvert : " + this.listCompteCourant.get(i).getAllowedOverdraft());
        }
        System.out.println("Selectionner un compte");
        Scanner scanner = new Scanner(System.in);
        int selected = scanner.nextInt();
        if (selected == 0) {

        }
    }



    public void getListCompteCourant() {
        for (CompteCourant compte : this.listCompteCourant) {
            System.out.println(compte.toString());;
        }
    }
}
