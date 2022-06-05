package basics;

public class EnumInSameClass {
    enum color {
        RED("lal"), BLUE("nila"), GREEN("hara");

        private String value;

        private color(String value) {
            this.value = value;

        }

        public String getValue() {
            return value;
        }

    }

    public static void main(String[] args) {
        color c = color.RED;

        System.out.println(c.getValue());

        // this values function will iterate around each of the values of enum
        for (color c1 : color.values()) {
            System.out.println(c1.getValue());
        }
    }
}
