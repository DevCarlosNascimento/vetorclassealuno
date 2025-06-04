import java.util.Scanner;

class Aluno {
    String nome;
    String matricula;
    double mediaFinal;

    Aluno(String nome, String matricula, double mediaFinal) {
        this.nome = nome;
        this.matricula = matricula;
        this.mediaFinal = mediaFinal;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno[] alunos = new Aluno[10];

        // Leitura dos dados dos alunos
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o nome do aluno " + (i + 1) + ":");
            String nome = scanner.nextLine();
            System.out.println("Digite a matrícula do aluno " + (i + 1) + ":");
            String matricula = scanner.nextLine();
            System.out.println("Digite a média final do aluno " + (i + 1) + ":");
            double mediaFinal = scanner.nextDouble();
            scanner.nextLine(); // Limpar o buffer

            alunos[i] = new Aluno(nome, matricula, mediaFinal);
        }

        // Vetores para aprovados e reprovados
        Aluno[] aprovados = new Aluno[10];
        Aluno[] reprovados = new Aluno[10];
        int countAprovados = 0;
        int countReprovados = 0;

        // Divisão dos alunos em aprovados e reprovados
        for (Aluno aluno : alunos) {
            if (aluno.mediaFinal >= 5.0) {
                aprovados[countAprovados++] = aluno;
            } else {
                reprovados[countReprovados++] = aluno;
            }
        }

        // Exibição dos alunos aprovados
        System.out.println("\nAlunos Aprovados:");
        for (int i = 0; i < countAprovados; i++) {
            System.out.println("Nome: " + aprovados[i].nome + ", Matrícula: " + aprovados[i].matricula + ", Média Final: " + aprovados[i].mediaFinal);
        }

        // Exibição dos alunos reprovados
        System.out.println("\nAlunos Reprovados:");
        for (int i = 0; i < countReprovados; i++) {
            System.out.println("Nome: " + reprovados[i].nome + ", Matrícula: " + reprovados[i].matricula + ", Média Final: " + reprovados[i].mediaFinal);
        }

        scanner.close();
    }
}
