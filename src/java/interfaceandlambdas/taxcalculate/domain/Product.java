package java.interfaceandlambdas.taxcalculate.domain;

public class Product implements TaxCalculator {
    private String name;
    private Types type;
    private double value;


    @Override
    public void calculateTax() {
        double valueWithTax = value += (value * (type.getTax() / 100));
        System.out.println("A taxa do(a) " + name + " será de: " + type.getTax() + "% valor adicionado com a " +
                            " taxa: R$" + valueWithTax);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Types getType() {
        return type;
    }

    public void setType(Types type) {
        this.type = type;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
