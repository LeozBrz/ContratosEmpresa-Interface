package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Parcelas {
	private Date dataVencimento;
	private double quantidade;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Parcelas() {
		
	}

	public Parcelas(Date dataVencimento, double quantidade) {
		super();
		this.dataVencimento = dataVencimento;
		this.quantidade = quantidade;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return sdf.format(dataVencimento) + " - " + String.format("%.2f", quantidade);
	}
	
	
}
