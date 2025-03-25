package dev.martabernardo.models;

public enum CategoryImc {
    NORMAL("peso normal");
    
    private String category;
    
    CategoryImc(String category) {
        this.category = category;
    }
    
    public String getCategory() {
        return category;
    }

}
