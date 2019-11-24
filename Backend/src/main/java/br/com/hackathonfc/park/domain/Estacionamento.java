package br.com.hackathonfc.park.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Estacionamento implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String donoEstacionamento;
	private String email;
	private String senha;
	private String cnpj;
	private String estadoCidade;
	private String endereco;
	private String complemento;
	private String nomeEstacionamento;
	private String telefone;
	private Integer qtdMoto;
	private Integer qtdCarro;
	private String funcao;	
	
	
	
	public Estacionamento() {
		
	}

	public Estacionamento(Integer id, String donoEstacionamento, String email, String senha, String cnpj,
			String estadoCidade, String endereco, String complemento, String nomeEstacionamento, String telefone,
			Integer qtdMoto, Integer qtdCarro, String funcao) {
		super();
		this.id = id;
		this.donoEstacionamento = donoEstacionamento;
		this.email = email;
		this.senha = senha;
		this.cnpj = cnpj;
		this.estadoCidade = estadoCidade;
		this.endereco = endereco;
		this.complemento = complemento;
		this.nomeEstacionamento = nomeEstacionamento;
		this.telefone = telefone;
		this.qtdMoto = qtdMoto;
		this.qtdCarro = qtdCarro;
		this.funcao = funcao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDonoEstacionamento() {
		return donoEstacionamento;
	}

	public void setDonoEstacionamento(String donoEstacionamento) {
		this.donoEstacionamento = donoEstacionamento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEstadoCidade() {
		return estadoCidade;
	}

	public void setEstadoCidade(String estadoCidade) {
		this.estadoCidade = estadoCidade;
	}

	public String getendereco() {
		return endereco;
	}

	public void setendereco(String endereco) {
		this.endereco = endereco;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getNomeEstacionamento() {
		return nomeEstacionamento;
	}

	public void setNomeEstacionamento(String nomeEstacionamento) {
		this.nomeEstacionamento = nomeEstacionamento;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Integer getQtdMoto() {
		return qtdMoto;
	}

	public void setQtdMoto(Integer qtdMoto) {
		this.qtdMoto = qtdMoto;
	}

	public Integer getQtdCarro() {
		return qtdCarro;
	}

	public void setQtdCarro(Integer qtdCarro) {
		this.qtdCarro = qtdCarro;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estacionamento other = (Estacionamento) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
