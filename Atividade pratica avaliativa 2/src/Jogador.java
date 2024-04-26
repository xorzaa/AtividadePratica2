public class Jogador extends Pessoa {
    private String numeroCamisa;
    private double altura;
    private String posicao;

    public Jogador(String nome, String email, String numeroCamisa, double altura, String posicao) {
        super(nome, email);
        this.numeroCamisa = numeroCamisa;
        this.altura = altura;
        this.posicao = posicao;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNúmero da Camisa: " + numeroCamisa + "\nAltura: " + altura + "m" + "\nPosição: " + posicao;
    }
    

    public void setNumeroCamisa(String numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getNome() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNome'");
    }

    public String getNumeroCamisa() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNumeroCamisa'");
    }
}
