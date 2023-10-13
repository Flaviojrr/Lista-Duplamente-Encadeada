import java.util.Scanner;

public class main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ListaDuplamenteEncadeada<Integer> lista1 = new ListaDuplamenteEncadeada<>();
        ListaDuplamenteEncadeada2<Aluno> lista2 = new ListaDuplamenteEncadeada2<>();
        ListaDuplamenteEncadeada3<Integer> lista3 = new ListaDuplamenteEncadeada3<>();
        System.out.println("///// Atividade /////" +
                "\n(1)Questão 1" +
                "\n(2)Questão 2" +
                "\n(3)Questão 3" +
                "\n(4)Questão 4" +
                "\nSua escolha:");
        int op = sc.nextInt();
        do {
            switch (op) {
                case 1:
                    System.out.println("//// Questão 1 ////" +
                            "\n(1)Adicionar no começo" +
                            "\n(2)Adicionar no fim" +
                            "\n(3)Listar registros");
                    int op2 = sc.nextInt();
                    switch (op2) {
                        case 1:
                            addIntComeco(lista1);
                            break;
                        case 2:
                            addIntFim(lista1);
                            break;
                        case 3:
                            print(lista1);
                            break;
                    }
                break;
                case 2:

                break;
                case 3:
                    System.out.println("//// Questão 3 ////" +
                            "\n(1)Adicionar no começo" +
                            "\n(2)Adicionar no fim" +
                            "\n(3)Listar registros");
                    int op3 = sc.nextInt();
                    switch (op3) {
                        case 1:
                            addAlunoComeco(lista2);
                            break;
                        case 2:
                            addAlunoFim(lista2);
                            break;
                        case 3:
                            print(lista2);
                            break;
                    }
                break;
                case 4:
                    System.out.println("//// Questão 4 ////" +
                            "\n(1)Adicionar no começo" +
                            "\n(2)Adicionar no fim" +
                            "\n(3)Remover do começo" +
                            "\n(4)Remover do fim" +
                            "\n(5)Listar registros");
                    int op4 = sc.nextInt();
                    switch (op4) {
                        case 1:
                            addImparComeco(lista3);
                            break;
                        case 2:
                            addImparFim(lista3);
                            break;
                        case 3:
                            removerImparComeco(lista3);
                            break;
                        case 4:
                            removerImparFim(lista3);
                            break;
                        case 5:
                            print(lista3);
                            break;
                    }
                    break;
            }
        } while (op != 6);
    }
    //Questão 1
    public static void addIntComeco (ListaDuplamenteEncadeada lista1) {
        System.out.println("Adicione um numero inteiro no começo da lista:");
        int intComeco = sc.nextInt();
        lista1.adicionarComeco(intComeco);
    }
    public static void addIntFim(ListaDuplamenteEncadeada lista1) {
        System.out.println("Adicione um numero inteiro no fim da lista:");
        int intFim = sc.nextInt();
        lista1.adicionarComeco(intFim);
    }
    public static void print(ListaDuplamenteEncadeada lista1){
        System.out.println(lista1.toString());
    }

    //Questão 3
    public static void addAlunoComeco(ListaDuplamenteEncadeada2 lista2){
        System.out.println("Nome do aluno:");
        String nomeAluno = sc.next();
        System.out.println("Idade do aluno");
        int idadeAluno = sc.nextInt();
        Aluno alunoNovo= new Aluno(nomeAluno,idadeAluno);
        lista2.addAlunoComeco(alunoNovo);
    }
    public static void addAlunoFim (ListaDuplamenteEncadeada2 lista2){
        System.out.println("Nome do aluno:");
        String nomeAluno = sc.next();
        System.out.println("Idade aluno:");
        int idadeAluno = sc.nextInt();
        Aluno alunoNovo = new Aluno(nomeAluno,idadeAluno);
        lista2.addAlunoFim(alunoNovo);
    }
    public static void print(ListaDuplamenteEncadeada2 lista2){
        System.out.println(lista2.toString());
    }

    //Questão 4
    public static void addImparComeco(ListaDuplamenteEncadeada3 lista3){
        System.out.println("Digite um numero impar para adicionar no começo da lista:");
        int imparComeco = sc.nextInt();
        if(imparComeco%2!=0){
            lista3.addImparComeco(imparComeco);
        }else{
            System.out.println("Informe um numero correto!!!");
        }
    }
    public static void addImparFim(ListaDuplamenteEncadeada3 lista3){
        System.out.println("Digite um numero impar para adicionar no fim da lista:");
        int imparComeco = sc.nextInt();
        if(imparComeco%2!=0){
            lista3.addImparFim(imparComeco);
        }else{
            System.out.println("Informe um numero correto!!!");
        }
    }
    public static void removerImparComeco(ListaDuplamenteEncadeada3 lista3){
        lista3.removerImparInicio();
    }
    public static void removerImparFim(ListaDuplamenteEncadeada3 lista3){
        lista3.removerImparFim();
    }
    public static void print(ListaDuplamenteEncadeada3 lista3){
        System.out.println(lista3.toString());
    }
}

