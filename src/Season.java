public enum Season {
    WINTER( "Холодно"),
    SUMMER,
    SPRING,
    BIBI;
    String BALLY;

    int TEMPERATURE;


    String currency;
    Season(String currency){
        this.currency = currency;
    }
    boolean hasSeason(){
        return currency != null;
    }

    Season(){

    }
}

