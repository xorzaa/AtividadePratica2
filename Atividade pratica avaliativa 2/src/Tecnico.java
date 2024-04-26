public class Tecnico extends Pessoa {
    private int anosExperiencia;

    public Tecnico(String nome, String email, int anosExperiencia) {
        super(nome, email);
        this.anosExperiencia = anosExperiencia;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAnos de Experiência: " + anosExperiencia;
    }
}
