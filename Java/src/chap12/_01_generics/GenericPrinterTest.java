package chap12._01_generics;

public class GenericPrinterTest {
    public static void main(String[] args) {
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();

        powderPrinter.setMaterial(new Powder());
        //Powder powder = (Powder)powderPrint.getMaterial(); -> GenericPrinter<T>로 선언 안했을 시 다운캐스팅 필요
        Powder powder = powderPrinter.getMaterial();
        System.out.println(powderPrinter);

        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();

        plasticPrinter.setMaterial(new Plastic());
        Plastic plastic = plasticPrinter.getMaterial();
        System.out.println(plasticPrinter);

        GenericPrinter<Water> waterPrinter = new GenericPrinter<Water>();

        waterPrinter.setMaterial(new Water());
        Water water = waterPrinter.getMaterial();
        System.out.println(waterPrinter);


    }
}
