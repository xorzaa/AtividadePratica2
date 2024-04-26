import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
    private static ArrayList<Time> times = new ArrayList<>();

    public static void exibirMenu(Scanner scanner) {
        int opcao;
        do {
            System.out.println("\n---CAMPEONATO DE BASQUETE DA UNIVERSIDADE POSITIVO---");
            System.out.println("1 - Cadastrar Time");
            System.out.println("2 - Buscar Time");
            System.out.println("3 - Excluir Time");
            System.out.println("4 - Listar Times");
            System.out.println("5 - Adicionar Jogador a Time");
            System.out.println("6 - Buscar Jogador");
            System.out.println("7 - Excluir Jogador de Time");
            System.out.println("8 - Listar Jogadores");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    cadastrarTime(scanner);
                    break;
                case 2:
                    buscarTime(scanner);
                    break;
                case 3:
                    excluirTime(scanner);
                    break;
                case 4:
                    listarTimes();
                    break;
                case 5:
                    adicionarJogadorAoTime(scanner);
                    break;
                case 6:
                    buscarJogador(scanner);
                    break;
                case 7:
                    excluirJogadorDoTime(scanner);
                    break;
                case 8:
                    listarJogadores();
                    break;
                case 0:
                    System.out.println("______________________Obrigado!!__________________\r\n" + //
                                                "______________________1¶¶¶¶¶¶¶1___________________\r\n" + //
                                                "_____________________1¶¶¶¶¶¶¶¶¶1__________________\r\n" + //
                                                "____________________1¶¶¶¶¶¶¶¶¶¶¶__________________\r\n" + //
                                                "____________________¶¶¶¶¶¶¶¶¶¶¶___________________\r\n" + //
                                                "___________________1¶¶¶¶¶¶¶¶¶¶____________________\r\n" + //
                                                "___________________1¶¶¶¶¶¶¶¶¶_____________________\r\n" + //
                                                "______111111__________1¶¶¶¶¶¶111__________________\r\n" + //
                                                "____1¶¶¶¶¶¶¶1__________¶¶¶¶¶¶¶¶¶¶¶1_______________\r\n" + //
                                                "___¶¶1111¶11¶¶______1¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶1_____________\r\n" + //
                                                "__1¶1¶¶¶111¶¶¶1___1¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_____________\r\n" + //
                                                "___¶¶¶¶¶¶¶¶1¶¶¶__¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶____________\r\n" + //
                                                "___1¶¶¶¶¶¶¶¶¶¶1_1¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶____________\r\n" + //
                                                "____1¶¶¶¶¶¶¶¶¶1_¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶____________\r\n" + //
                                                "_________1¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶____________\r\n" + //
                                                "__________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶1___________\r\n" + //
                                                "__________1¶¶¶1¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶___________\r\n" + //
                                                "___________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶___________\r\n" + //
                                                "____________¶¶¶¶¶¶¶¶1¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶___________\r\n" + //
                                                "_____________¶¶¶¶¶¶1_1¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶1__________\r\n" + //
                                                "______________1¶¶¶1___¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶__________\r\n" + //
                                                "________________1______¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶__________\r\n" + //
                                                "________________________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶__________\r\n" + //
                                                "_______________________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶__________\r\n" + //
                                                "______________________1¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶__________\r\n" + //
                                                "______________________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶1_________\r\n" + //
                                                "_____________________1¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶1_________\r\n" + //
                                                "____________________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶1_________\r\n" + //
                                                "___________________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶__________\r\n" + //
                                                "__________________1¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶1__________\r\n" + //
                                                "__________________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶___________\r\n" + //
                                                "_________________1¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶____________\r\n" + //
                                                "_________________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶____________\r\n" + //
                                                "_________________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_____________\r\n" + //
                                                "________________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_____________\r\n" + //
                                                "_______________1¶¶¶¶¶¶¶___111¶¶¶¶¶¶¶1_____________\r\n" + //
                                                "_______________1¶¶¶¶¶¶_______¶¶¶¶¶¶_______________\r\n" + //
                                                "________________¶¶¶¶¶¶_______¶¶¶¶¶1_______________\r\n" + //
                                                "________________¶¶¶¶¶¶1______¶¶¶¶¶¶_______________\r\n" + //
                                                "________________¶¶¶¶¶¶¶_______¶¶¶¶¶¶______________\r\n" + //
                                                "________________1¶¶¶¶¶¶________¶¶¶¶¶¶_____________\r\n" + //
                                                "_________________¶¶¶¶¶¶________¶¶¶¶¶¶1____________\r\n" + //
                                                "_________________¶¶¶¶¶¶_________¶¶¶¶¶1____________\r\n" + //
                                                "_________________1¶¶¶¶1_________¶¶¶¶¶¶____________\r\n" + //
                                                "__________________¶¶¶¶1__________¶¶¶¶¶____________\r\n" + //
                                                "__________________¶¶¶¶___________1¶¶¶¶____________\r\n" + //
                                                "__________________1¶¶¶____________¶¶¶¶____________\r\n" + //
                                                "__________________1¶¶¶1___________¶¶¶¶____________\r\n" + //
                                                "__________________¶¶¶¶¶___________1¶¶¶____________\r\n" + //
                                                "________________1¶¶¶¶¶¶¶__________1¶¶¶¶___________\r\n" + //
                                                "______________1¶¶¶¶¶¶¶¶¶1_________¶¶¶¶¶¶__________\r\n" + //
                                                "___________1¶¶¶¶¶¶¶¶¶¶¶¶1________1¶¶¶¶¶¶1_________\r\n" + //
                                                "__________¶¶¶¶¶¶¶¶¶¶¶¶¶1________1¶¶¶¶¶¶¶1_________\r\n" + //
                                                "___________1111________________¶¶¶¶¶¶¶¶1__________\r\n" + //
                                                "_______________________________¶¶¶¶¶¶1____________\r\n" + //
                                                "__________________________________________________");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private static void cadastrarTime(Scanner scanner) {
        System.out.print("Nome do time: ");
        String nomeTime = scanner.nextLine();
        System.out.print("Nome do técnico: ");
        String nomeTecnico = scanner.nextLine();
        System.out.print("Email do técnico: ");
        String emailTecnico = scanner.nextLine();
        System.out.print("Anos de experiência do técnico: ");
        int anosExperiencia = scanner.nextInt();
        scanner.nextLine();
    
        Tecnico tecnico = new Tecnico(nomeTecnico, emailTecnico, anosExperiencia);
        Time time = new Time(nomeTime, tecnico);
        times.add(time);
        System.out.println("Time cadastrado com sucesso!");
    }
    

    private static void buscarTime(Scanner scanner) {
        System.out.print("Nome do time: ");
        String nomeTime = scanner.nextLine();
        Time timeEncontrado = buscarTimePorNome(nomeTime);
        if (timeEncontrado != null) {
            System.out.println("Time encontrado:");
            System.out.println(nomeTime);
        } else {
            System.out.println("Time não encontrado.");
        }
    }    

    private static void excluirTime(Scanner scanner) {
        System.out.print("Nome do time a ser excluído: ");
        String nomeTime = scanner.nextLine();
        Time timeParaExcluir = buscarTimePorNome(nomeTime);
        if (timeParaExcluir != null) {
            times.remove(timeParaExcluir);
            System.out.println("Time excluído com sucesso.");
        } else {
            System.out.println("Time não encontrado.");
        }
    }    

    private static void listarTimes() {
        if (times.isEmpty()) {
            System.out.println("Não há times cadastrados.");
        } else {
            System.out.println("Times cadastrados:");
            for (Time time : times) {
                System.out.println(time.getNome());
            }
        }
    }    

    private static void adicionarJogadorAoTime(Scanner scanner) {
        System.out.print("Nome do time: ");
        String nomeTime = scanner.nextLine();
        Time time = buscarTimePorNome(nomeTime);
        if (time == null) {
            System.out.println("Time não encontrado.");
            return;
        }

        System.out.print("Nome do jogador: ");
        String nomeJogador = scanner.nextLine();
        System.out.print("Email do jogador: ");
        String emailJogador = scanner.nextLine();
        System.out.print("Número da camisa: ");
        String numeroCamisa = scanner.nextLine();
        System.out.print("Altura (em metros): ");
        double altura = scanner.nextDouble();
        scanner.nextLine(); 
        System.out.print("Posição: ");
        String posicao = scanner.nextLine();

        Jogador jogador = new Jogador(nomeJogador, emailJogador, numeroCamisa, altura, posicao);
        time.adicionarJogador(jogador);
    }

    private static void buscarJogador(Scanner scanner) {
        System.out.print("Nome do jogador: ");
        String nomeJogador = scanner.nextLine();
        
        boolean jogadorEncontrado = false;
        for (Time time : times) {
            for (Jogador jogador : time.getJogadores()) {
                if (jogador.getNome().equalsIgnoreCase(nomeJogador)) {
                    System.out.println("Jogador encontrado:");
                    System.out.println(jogador);
                    jogadorEncontrado = true;
                    break;  
                }
            }
            if (jogadorEncontrado) {
                break; 
            }
        }
        
        if (!jogadorEncontrado) {
            System.out.println("Jogador não encontrado.");
        }
    }
  

    private static void excluirJogadorDoTime(Scanner scanner) {
        System.out.print("Nome do time: ");
        String nomeTime = scanner.nextLine();
        Time time = buscarTimePorNome(nomeTime);
        if (time != null) {
            System.out.print("Nome do jogador a ser excluído: ");
            String nomeJogador = scanner.nextLine();
            Jogador jogadorParaExcluir = null;
            for (Jogador jogador : time.getJogadores()) {
                if (jogador.getNome().equalsIgnoreCase(nomeJogador)) {
                    jogadorParaExcluir = jogador;
                    break;
                }
            }
            if (jogadorParaExcluir != null) {
                time.removerJogador(jogadorParaExcluir);
                System.out.println("Jogador excluído do time com sucesso.");
            } else {
                System.out.println("Jogador não encontrado no time.");
            }
        } else {
            System.out.println("Time não encontrado.");
        }
    }    

    private static void listarJogadores() {
        System.out.println("Lista de jogadores por time:");
        for (Time time : times) {
            System.out.println("Time: " + time.getNome());
            ArrayList<Jogador> jogadores = time.getJogadores();
            if (jogadores.isEmpty()) {
                System.out.println("   Nenhum jogador cadastrado");
            } else {
                for (Jogador jogador : jogadores) {
                    System.out.println("   " + jogador.getNome() + " - " + jogador.getNumeroCamisa());
                }
            }
        }
    }       

    private static Time buscarTimePorNome(String nome) {
        for (Time time : times) {
            if (time.getNome().equalsIgnoreCase(nome)) {
                return time;
            }
        }
        return null;
    }
}
