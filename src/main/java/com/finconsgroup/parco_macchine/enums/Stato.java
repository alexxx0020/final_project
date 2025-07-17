package com.finconsgroup.parco_macchine.enums;

public enum Stato {
    ONLINE("online"),
    OFFLINE("offline"),
    IN_MAINTENANCE("in maintenance");

    private final String stato;

    Stato(String stato) {
        this.stato = stato;
    }

    public String getStato() {
        return stato;
    }

    public static Stato check(String stato){
        for (Stato stato1 : Stato.values()){
            if (stato1.getStato().equalsIgnoreCase(stato)){
                return stato1;
            }
        }
        throw new IllegalArgumentException("Stato non valido: " + stato);
    }
}
