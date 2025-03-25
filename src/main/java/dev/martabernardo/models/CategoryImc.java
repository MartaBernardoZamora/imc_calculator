package dev.martabernardo.models;

public enum CategoryImc {
    DELGADEZ_SEVERA("delgadez severa"),
    DELGADEZ_MODERADA("delgadez moderada"),
    DELGADEZ_LEVE("delgadez leve"),
    NORMAL("peso normal"),
    SOBREPESO("sobrepeso"),
    OBESIDAD_LEVE("obesidad leve"),
    OBESIDAD_MODERADA("obesidad moderada"),
    OBESIDAD_MORBIDA("obesidad morbida");
    
    private String category;
    
    CategoryImc(String category) {
        this.category = category;
    }
    
    public String getCategory() {
        return category;
    }

}
