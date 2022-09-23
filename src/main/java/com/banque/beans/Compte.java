package com.banque.beans;

public abstract class Compte {
    protected int id;
    protected int solde;

    public Compte(int id, int solde) {
        this.id = id;
        this.solde = solde;
    }

    public abstract void crediter(int montant);

    public abstract  int getId();

    public abstract  void setId();

    public abstract  int getSolde();

    public abstract void setSolde();

    @Override
    public String toString() {
        return "Compte{" +
                "id=" + id +
                ", solde=" + solde +
                '}';
    }
}
