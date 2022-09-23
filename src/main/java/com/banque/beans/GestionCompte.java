package com.banque.beans;

import java.util.ArrayList;
import java.util.List;

public class GestionCompte {
    List<CompteCourant> listCompteCourant = new ArrayList<>();
    List<CompteEpargne> listCompteEpargne = new ArrayList<>();
    List<CompteRemu> listCompteRemu = new ArrayList<>();

    public void createAccountCurrent(int id, int solde) {
        CompteCourant compte = new CompteCourant(id, solde);
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



    public void getListCompteCourant() {
        for (CompteCourant compte : this.listCompteCourant) {
            System.out.println(compte.toString());;
        }
    }
}
