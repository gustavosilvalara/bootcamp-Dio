package java.interfaceandlambdas.taxcalculate.domain;

public enum Types {
    ALIMENTO(1),
    SAUDE(1.5),
    VESTUARIO(2.5),
    CULTURA(4);



    private final double tax;

    Types(double tax) {
        this.tax = tax;
    }

    public double getTax() {
        return tax;
    }
}
