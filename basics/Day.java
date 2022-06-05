package basics;

public enum Day {

    SUNDAY("sunday h bc"),
    MONDAY("monday h bc"),
    TUESDAY("tuesday h bc"),
    WEDNESDAY("wednesday h bc"),
    THURSDAY("thrusday h bc"),
    FRIDAY("friday h bc"),
    SATURDAY("saturday h bc");

    private String value;

    private Day(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    
}