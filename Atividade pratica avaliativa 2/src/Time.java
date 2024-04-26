import java.util.ArrayList;

public class Time {
    private String nome;
    private Tecnico tecnico;
    private ArrayList<Jogador> jogadores = new ArrayList<>();

    public Time(String nome, Tecnico tecnico) {
        this.nome = nome;
        this.tecnico = tecnico;
    }

    public String getNome() {
        return nome;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public ArrayList<Jogador> getJogadores() {
        return jogadores;
    }

    public void adicionarJogador(Jogador jogador) {
        jogadores.add(jogador);
    }

    public void removerJogador(Jogador jogador) {
        jogadores.remove(jogador);
    }


}
