package entidades.servicos;

public interface ServicoPagamentoOnline {

	public double taxaPagamento(double quantidade) ;
	
	public double juros(double quantidade, int meses);
	
	
}
