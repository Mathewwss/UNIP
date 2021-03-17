// Objetivo: Pegar informações para cadastro.
// Entrada: Nome, data, sexo, rg, .....
// Saída: Informações sobre o usuário.

import java.util.Scanner;

class Strings{

	public static void main(String args[]){
		String nome;
		String dataNascimento;
		String sexo;
		String rg;
		String orgaoExpedidor;
		String cpf;
		String siglaEstado;
		String cidade;
		String endereco;
		String cep;
		String telefone;
		String email;
		String profissao;
		String tipoSanguineo;
		String carteirinha;
		String convenio;
		String nacionalidade;
		String naturalidade;
		String estadoCivil;

		Scanner nomeIn = new Scanner(System.in);
		System.out.print("Nome: ");
		nome = nomeIn.nextLine();

		Scanner dataNascimentoIn = new Scanner(System.in);
		System.out.print("Data da nascimento (ex. 21/05/1984): ");
		dataNascimento = dataNascimentoIn.nextLine();

		Scanner sexoIn = new Scanner(System.in);
		System.out.print("Sexo: ");
		sexo = sexoIn.nextLine();

		Scanner rgIn = new Scanner(System.in);
		System.out.print("RG (ex. 0909090): ");
		rg = rgIn.nextLine();

		Scanner orgaoExpedidorIn = new Scanner(System.in);
		System.out.print("Órgão Expedidor RG: ");
		orgaoExpedidor = orgaoExpedidorIn.nextLine();

		Scanner cpfIn = new Scanner(System.in);
		System.out.print("CPF (ex. 01245612378): ");
		cpf = cpfIn.nextLine();

		Scanner siglaEstadoIn = new Scanner(System.in);
		System.out.print("Sigla do seu estado: ");
		siglaEstado = siglaEstadoIn.nextLine();

		Scanner cidadeIn = new Scanner(System.in);
		System.out.print("Cidade: ");
		cidade = cidadeIn.nextLine();

		Scanner enderecoIn = new Scanner(System.in);
		System.out.print("Endereço: ");
		endereco = enderecoIn.nextLine();

		Scanner cepIn = new Scanner(System.in);
		System.out.print("CEP (ex. 12321123): ");
		cep = cepIn.nextLine();

		Scanner telefoneIn = new Scanner(System.in);
		System.out.print("Telefone (ex. 61992928484): ");
		telefone = telefoneIn.nextLine();

		Scanner emailIn = new Scanner(System.in);
		System.out.print("E-mail: ");
		email = emailIn.nextLine();

		Scanner profissaoIn = new Scanner(System.in);
		System.out.print("Profissão: ");
		profissao = profissaoIn.nextLine();

		Scanner tipoSanguineoIn = new Scanner(System.in);
		System.out.print("Tipo Sanguíneo: ");
		tipoSanguineo = tipoSanguineoIn.nextLine();

		Scanner carteirinhaIn = new Scanner(System.in);
		System.out.print("Número da carteirinha: ");
		carteirinha = carteirinhaIn.nextLine();

		Scanner convenioIn = new Scanner(System.in);
		System.out.print("Número do Convênio: ");
		convenio = convenioIn.nextLine();

		Scanner ncdIn = new Scanner(System.in);
		System.out.print("Nacionalidade: ");
		nacionalidade = ncdIn.nextLine();

		Scanner naturalidadeIn = new Scanner(System.in);
		System.out.print("Naturalidade: ");
		naturalidade = naturalidadeIn.nextLine();

		Scanner estadoCivilIn = new Scanner(System.in);
		System.out.print("Estado Civil: ");
		estadoCivil = estadoCivilIn.nextLine();


		System.out.println("");
		System.out.println("");
		System.out.println("# --- Seus Dados --- #");
		System.out.println("");
		System.out.println("Nome: " + nome);
		System.out.println("Data de Nascimento: " + dataNascimento);
		System.out.println("Sexo: " + sexo);
		System.out.println("RG: " + rg);
		System.out.println("Órgão Expedidor: " + orgaoExpedidor);
		System.out.println("CPF: " + cpf);
		System.out.println("Sigla do Estado: " + siglaEstado);
		System.out.println("Cidade: " + cidade);
		System.out.println("Endereço: " + endereco);
		System.out.println("CEP: " + cep);
		System.out.println("Telefone: " + telefone);
		System.out.println("E-mail:" + email);
		System.out.println("Profissão: " + profissao);
		System.out.println("Tipo Sanguíneo: " + tipoSanguineo);
		System.out.println("Carteirinha: " + carteirinha);
		System.out.println("Convênio: " + convenio);
		System.out.println("Nacionalidade: " + nacionalidade);
		System.out.println("Naturalidade: " + naturalidade);
		System.out.println("Estado Civil: " + estadoCivil);
		System.out.println("");
		System.out.println("# ------------------ #");
	}
}
