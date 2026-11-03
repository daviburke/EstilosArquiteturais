package Abstract_Factory;

public class Tela {
    private final Fabrica fabrica;

    public Tela(Fabrica fabrica) {
        this.fabrica = fabrica;
    }

    public void renderizar(){
        Botao botao = fabrica.criarBotao();
        Input input = fabrica.criarInput();

        botao.renderizarBotao();
        input.renderizarInput();
    }
}