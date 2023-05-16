package entidades;

public class Professor {
    private String nome;
    private String especialidade;

    private  Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }
    public void exibirDados (){
        System.out.println(this.nome);
        System.out.println(this.especialidade);
        for (Seminario seminario : seminarios) {
            System.out.println(seminario.getTitulo());
            System.out.println(seminario.getLocal().getEndereco());
            for(Estudante estudante : seminario.getEstudantes()){
                System.out.println(estudante.getNome() + estudante.getIdade());
            }
        }

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
