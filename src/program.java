import java.util.Scanner;

import entidades.Estudante;
import entidades.Local;
import entidades.Professor;
import entidades.Seminario;
public class program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Estudante estudante = new Estudante("Maria", 18);
       // Estudante estudante2 = new Estudante("Joao", 20);
        Professor professor = new Professor("Claudineia", "Matematica");
        Local local = new Local("Casa da Mae Joana");
        Estudante[] estudantes = {estudante};
        Seminario seminario = new Seminario("Mamamia",estudantes,local);
       // Seminario seminario2 = new Seminario("Escarlate",estudantes,local);
        Seminario[] seminarios = {seminario};
        professor.setSeminarios(seminarios);

        professor.exibirDados();










                scanner.close();
    }
}