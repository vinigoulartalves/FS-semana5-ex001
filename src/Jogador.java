public class Jogador {

    private String nome;
    private int idade;
    private int pontuacao;
    private int numeroTentativas;

    public void adicionaPontos(int pontos) {
        this.pontuacao += pontos;
    }

    public void perdePontos(int pontos) {
        if (this.pontuacao < 0) {
            this.pontuacao = 0;
        } else {
            this.pontuacao -= pontos;
        }
    }
}
