import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class App {


    public static void main(String[] args) throws Exception {
        Scanner = new Scanner(system.in);
        List <piloto> = new ArrayList<>();
        List <Aeronave> = new ArrayList<>();  

        int opcao;
        do {
            exibirMenu();
            opcao = Scanner.nextInt();
            Scanner.nextLine();

        switch (opcao) {
            case 1:
            cadastrarPilotos (scanner, piloto);
                break;
            case 2:
            listarPilotos (Piloto);
                break;
            case 3:
            localizarPilotos (Scanner, Piloto);
                break;
            case 4:
            cadastrar Aeronave (Scanner, Aeronave);
                break;
            case 0:
            System.out.println("encerrando o programa: "); 
                break;
          
            default:  
            System.out.println("Opção Inválida!");
                break;
        }

        while (opcao !=0);
        
        Scanner.closer();
        }

        public static void exibirMenu() {
            System.out.println("_________Menu__________");
            System.out.println("1 - Cadastrar piloto:\n");
            System.out.println("2 - Listar pilotos:\n");
            System.out.println("3 - Localizar pilotos:\n");
            System.out.println("4 - Cadastrar Aeronave:\n");
            System.out.println("0 - Encerrar:\n");

        public static void cadastrarPilotos (Scanner scanner, List<piloto> pilotos) {
            System.out.println("Digite o nome do Piloto: ");
            String nome = Scanner.nextLine();
            System.out.println("Digite o CPF dp Piloto: ");
            String cpf = Scanner.nextLine();
            System.out.println("Digite o breve do Piloto: ");
            int Breve = Scanner.nextInt();

            try {
                piloto piloto = new piloto (nome, cpf, breve);
                pilotos.add (piloto);
                System.out.println("cadastrado com sucesso.");
            }
            catch(IllegalArgumentException e){
                System.out.println("erro ao cadastrar piloto:" + e.getMessage());
            }

            } 

            public static void listarPilotos (List<piloto> pilotos) {
                if (pilotos.isEmpty());
                System.out.println("Não há Pilotos cadastrados");
                return;
            }
            System.out.println("\n_____Pilotos Cadastrados____");
            for (piloto piloto: pilotos);
            System.out.println(piloto);
            }
            }

            public static void localizarPiloto (scanner scanner, List<piloto> pilotos);
            System.out.print("digite o cpf do piloto a ser ocalizado: ");
            int cpf = scanner.nextLine();

            for (pilotos piloto: pilotos){
                if (piloto.getCpf(). equals(cpf)){
                    System.out.println("Piloto encontrado" + piloto);
                    return;

                }

            }
            Sistem.out.println("Piloto não encontrado.");
            }

            public static void cadastrarAeronave (Scanner scanner, piloto<piloto> Pilolos, List<Aeronave> aeronave){
                if (piloto.isEmpty()){
                    System.out.println("É necessário cadastraro piloto antes de cadastrar a aeronave.");
                    return;
                }
            }
            System.out.println("Digite a serie da aeronave:");
            int serie = Scanner scanner.nestInt();
            Systen.out.println("Digite o modelo da aeronave:");
            String modelo = Scanner scanner.nextLine();

            Aeronave aeronave = new aeronave (serie, modelo);

            System.out.println("Pilotos Cadastrados:");
            for (int i = 0, i <pilotos.size(), i++) {
                System.out.println((i+1) +". " +piloto.get(i).getNome());

            }
            System.out.println("Digite o breve do piloto: ");
            int pilotoIndex = Scanner.nextInt() -1;
            Scanner.nextLine();

            if (pilotoIndex = 0 && pilotoIndex < pilotos.size()) {
                aeronave.setPiloto (piloto.get(pilotoIndex));
                aeronave.add(aeronave);
                System.out.println("Aeronave cadastrada com sucesso.");

            }
            else{
                System.out.println ("Númro do Piloto Inválido.");
            }
            
        }
    

