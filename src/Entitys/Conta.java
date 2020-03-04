package Entitys;

public class Conta {
	
	private int numero;
	
	private Agencia agencia;
	
	private Cliente titular;
	
	private String tipo;
	
	private Double saldo;
	
	public Conta(int numero, String tipo ) {
		this.titular = new Cliente();
		this.agencia = new Agencia();
		setTipo(tipo);
		setNumero(numero);
	}

	public double getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public Cliente getCliente() {
		return titular;
	}

	public void setCliente(Cliente titular) {
		this.titular = titular;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	
	
	
}
