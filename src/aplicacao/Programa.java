package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.Contrato;
import entidades.Parcelas;
import entidades.servicos.Paypal;
import entidades.servicos.ServicoContrato;


public class Programa {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		System.out.println("INSIRA OS DADOS DO CONTRATO ");
		System.out.print("NUMERO: ");
		int num = sc.nextInt();
		System.out.print("DATA (dd/MM/aaaa): ");
		Date data = sdf.parse(sc.next());
		System.out.print("VALOR DO CONTRATO: ");
		double valor = sc.nextDouble();
		Contrato contrato = new Contrato(num,data,valor);
		
		System.out.print("DIGITE O NUMERO DE PARCELAS: ");
		int parcelas = sc.nextInt();
		ServicoContrato sercontrato= new ServicoContrato(new Paypal());
		sercontrato.processoContrato(contrato, parcelas);
		
		System.out.println("PARCELAS: ");
		for(Parcelas pc : contrato.getParcelas()) {
			System.out.println(pc);
		}

		
	}

}
