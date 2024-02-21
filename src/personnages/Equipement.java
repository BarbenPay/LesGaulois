package personnages;

public enum Equipement {
    CASQUE("casque"), PLASTRON("plastron"), BOUCLIER("bouclier");

    private String equipmentName;

    private Equipement(String equipmentName){
        this.equipmentName = equipmentName;
    }

    @Override
    public String toString(){
        return equipmentName;
    }
}
