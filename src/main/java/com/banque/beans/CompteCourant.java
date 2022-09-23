package com.banque.beans;

public class CompteCourant extends Compte {

    public CompteCourant(int id, int solde) {
        super(id, solde);
    }


    @Override
    public void crediter(int montant) {
        this.solde = this.solde + montant;
    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public void setId() {

    }

    @Override
    public int getSolde() {
        return this.solde;
    }

    @Override
    public void setSolde() {

    }



}
