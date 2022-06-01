package entidades.servicos;

import java.util.Calendar;
import java.util.Date;

import entidades.Contrato;
import entidades.Parcelas;

public class ServicoContrato {

	private ServicoPagamentoOnline servicoPagamentoOnline;

	public ServicoContrato(ServicoPagamentoOnline servicoPagamentoOnline) {
		this.servicoPagamentoOnline = servicoPagamentoOnline;
	}
	
	public void processoContrato(Contrato contrato, int meses) {
		double parcelaBasica = contrato.getValorTotal() / meses;
		for(int i=1; i<=meses; i++) {
			double taxaAtualizada = parcelaBasica + servicoPagamentoOnline.juros(parcelaBasica, i);
			double taxaTotal = taxaAtualizada + servicoPagamentoOnline.taxaPagamento(taxaAtualizada);
			Date dataVencimento = addMeses(contrato.getData(),i);
			contrato.getParcelas().add(new Parcelas(dataVencimento, taxaTotal));
		}
	}
	
	private Date addMeses(Date data, int N) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(data);
		calendar.add(Calendar.MONTH, N);
		return calendar.getTime();
	}
}
