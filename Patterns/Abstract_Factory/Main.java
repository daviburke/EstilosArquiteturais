package Abstract_Factory;

public class Main {
    public static void main(String[] args) {
       new Tela(new FabricaAndroid()).renderizar();
       new Tela(new FabricaIOS()).renderizar();
    }
}