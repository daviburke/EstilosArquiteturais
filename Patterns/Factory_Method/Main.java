package Factory_Method;

public class Main {
    public static void main(String[] args) {
       new FactoryEmail().notificar();
       new FactorySMS().notificar();
    }
}
