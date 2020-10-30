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

    /*
    DALLAS(3.50, "Dallas"), AUSTIN(5.99,"Austin"), SAN_ANTONIO(7.65,"SanAntonio"),ARLINGTON(5.75,"Arlington"), FAIRFAX(7.55,"Fairfax"),MCLEAN(8.99,"McLean");
    private double unitPrice;
    private String name;
    City(double unitPrice, String name){
        this.unitPrice = unitPrice;
        this.name = name;
    }
    public double getUnitPrice(){
        return unitPrice;
    }
    public String getName(){
        return name;
    }
     */
}
