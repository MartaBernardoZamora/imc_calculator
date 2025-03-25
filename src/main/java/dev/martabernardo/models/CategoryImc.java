package dev.martabernardo.models;

public enum CategoryImc {
    NORMAL("peso normal"),
    SOBREPESO("sobrepeso"),
    OBESIDAD_LEVE("obesidad leve");
    
    private String category;
    
    CategoryImc(String category) {
        this.category = category;
    }
    
    public String getCategory() {
        return category;
    }

}
