package com.banque.beans;

public class CompteRemu extends Compte{

    public CompteRemu(int id, int solde) {
        super(id, solde);
    }

    @Override
    public void crediter(int montant) {

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
        return 0;
    }

    @Override
    public void setSolde() {

    }
}
