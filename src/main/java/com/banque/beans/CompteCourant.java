package com.banque.beans;

public class CompteCourant extends Compte {

    protected int allowedOverdraft;

    public CompteCourant(int id, int solde, int overdraft) {
        super(id, solde);
        this.allowedOverdraft = overdraft;
    }


    @Override
    public void crediter(int montant) {
        this.solde = this.solde + montant;
    }

    @Override
    public int getId() {
        return this.id;
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

    public int getAllowedOverdraft() {
        return allowedOverdraft;
    }

    public void setAllowedOverdraft(int allowedOverdraft) {
        this.allowedOverdraft = allowedOverdraft;
    }

    @Override
    public String toString() {
        return "CompteCourant : " +
                " | Id : " + id  +
                " | Solde : " + solde +
                " | Découvert : " + allowedOverdraft;

    }
}
