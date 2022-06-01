package entidades.servicos;

public class Paypal implements ServicoPagamentoOnline{

	private static final double TAXA_JUROS = 0.02;
	private static final double JUROS_MENSAL = 0.01;

	@Override
	public double juros(double quantidade, int meses) {
		return quantidade * meses * JUROS_MENSAL;
	}

	@Override
	public double taxaPagamento(double quantidade) {
		return quantidade * TAXA_JUROS;
	}
}
