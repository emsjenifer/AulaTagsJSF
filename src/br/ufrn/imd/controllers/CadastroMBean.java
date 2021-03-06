package br.ufrn.imd.controllers; 
  
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped; 
 
import br.ufrn.imd.dominio.Pessoa;
 
/**
	* MBean para realiza��o do cadastro da pessoa. 
	*
*/
@ManagedBean 
@SessionScoped 
public class CadastroMBean {
 
	//atributo pessoa
	Pessoa pessoa;
	
	/** 
		* Construtor 
	*/ 
	public CadastroMBean() { 
		pessoa = new Pessoa(); 
	} 
	  
	public Pessoa getPessoa() { 
		return pessoa; 
	} 
	  
	public void setPessoa(Pessoa pessoa) { 
		this.pessoa = pessoa; 
	} 
	  
	/** 
		* M�todo para realiza��o do cadastro. 
		* @return 
	*/ 

	public String cadastrar() { 
		return "/sucesso.jsf"; 
	} 

}