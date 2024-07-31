public class Main {
    public static void main(String[] args) {
        DispositivosElectronicos dispositivo = new DispositivosElectronicos();
        Computadora computadora = new Computadora();
        Laptop laptop = new Laptop();
        Desktop desktop = new Desktop();
        DispositivoMovil dispositivoMovil = new DispositivoMovil();
        Smartphone smartphone = new Smartphone();
        Tablet tablet = new Tablet();
        Electrodomestico electrodomestico = new Electrodomestico();
        Refrigerador refrigerador = new Refrigerador();

        System.out.println("DispositivosElectronicos:");
        dispositivo.metodo1();
        dispositivo.metodo2();

        System.out.println("\nComputadora:");
        computadora.metodo1();
        computadora.metodo2();

        System.out.println("\nLaptop:");
        laptop.metodo1();
        laptop.metodo2();

        System.out.println("\nDesktop:");
        desktop.metodo1();
        desktop.metodo2();

        System.out.println("\nDispositivoMovil:");
        dispositivoMovil.metodo1();
        dispositivoMovil.metodo2();

        System.out.println("\nSmartphone:");
        smartphone.metodo1();
        smartphone.metodo2();

        System.out.println("\nTablet:");
        tablet.metodo1();
        tablet.metodo2();

        System.out.println("\nElectrodomestico:");
        electrodomestico.metodo1();
        electrodomestico.metodo2();

        System.out.println("\nRefrigerador:");
        refrigerador.metodo1();
        refrigerador.metodo2();
    }
}
