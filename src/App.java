public class App {
    public static void main(String[] args) throws Exception {
        Carro car = new Carro();

        car.acelerar();
        car.frear();

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        Moto motorcycle = new Moto();
        
        motorcycle.acelerar();
        motorcycle.darGrau();
        motorcycle.frear();
    }
}
