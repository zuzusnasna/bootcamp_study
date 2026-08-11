package chap12._01_generics;

public class GenericPrinterTest2 {
    public static void main(String[] args) {
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
        powderPrinter.setMaterial(new Powder());
        powderPrinter.printing();

        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
        plasticPrinter.setMaterial(new Plastic());
        plasticPrinter.printing();

        GenericPrinter<Water> waterPrinter = new GenericPrinter<Water>();
        waterPrinter.setMaterial(new Water());
        waterPrinter.printing();
    }
}
