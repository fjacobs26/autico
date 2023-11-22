package com.autico.auticoapp.Shared.Enums;

public enum Role {
    PACIENTE(1),
    ADMINISTRADOR(2),
    TERAPEUTA(3);

    private final int rol;

    Role(int rol) {
        this.rol = rol;
    }

    public int getRol() {
        return rol;
    }
}
