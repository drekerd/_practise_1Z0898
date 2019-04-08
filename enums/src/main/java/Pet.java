public enum Pet {
    CAT("MIAU_MIAU"),
    DOG("AO_AO"),
    HAMSTER("KRI_KRI");

    private String sound;

    Pet(String sound){
        this.sound = sound;
    }

    public String getSound(){
        return sound;
    }

}
