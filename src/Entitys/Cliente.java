package Entitys;

public class Cliente {
	
	private String nome;
	
	private String cpf;
	
	private String rg;
	
	private String telefone;
	
	private String email;
	
	private String endereco;
	
	public Cliente () {}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		if(validarCpf(cpf)){ 
		this.cpf = cpf;
		}
		else {
		System.out.println("O cpf é inválido, insira novamente.");
		}
	}
	
	public boolean validarCpf (String cpf) {
		if(cpf.length()==14) {
			return true;
		}
		else {
			return false;
		}
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	

	
}
