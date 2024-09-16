package com.poo.hospital.entidades.enums;

public enum Status {

    PENDENTE("Exame pendente"),
    CONCLUIDO("Exame Concluido");

    private final String stts;

    Status(String stts){
        this.stts = stts;
    }

    public String getStts() {
        return stts;
    }
}
