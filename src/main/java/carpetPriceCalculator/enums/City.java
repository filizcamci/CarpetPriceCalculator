package carpetPriceCalculator.enums;

public enum City {
    DALLAS("Dallas"), AUSTIN("Austin"), SAN_ANTONIO("SanAntonio"), ARLINGTON("Arlington"), FAIRFAX("Fairfax"), MCLEAN("McLean");
    private String name;
    City(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
