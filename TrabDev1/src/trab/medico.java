/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trab;

/**
 *
 * @author brcar
 */
public class medico {
 
     private String nomem;
     private String especialidade;
     private Double nascimento;
     private static String ValNome;
     private static String ValEspecialidade;
     private static Double ValNascimento;
     //private String TesteS;
     int i; 
    
     //String vetor1[] = new String [2];
     //double vetor2 [] = new double [1];

    /**
     * @return the nomem
     */
    public String getNomem() {
        return nomem;
    }

    /**
     * @param nomem the nomem to set
     */
    public void setNomem(String nomem) {
        this.nomem = nomem;
    }

    /**
     * @return the especialidade
     */
    public String getEspecialidade() {
        return especialidade;
    }

    /**
     * @param especialidade the especialidade to set
     */
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    /**
     * @return the nascimento
     */
    public Double getNascimento() {
        return nascimento;
    }

    /**
     * @param nascimento the nascimento to set
     */
    public void setNascimento(Double nascimento) {
        this.nascimento = nascimento;
    }
     
    
  public void login(String nomem, String especialidade, Double nascimento) {
        this.ValNome = nomem;
        this.ValEspecialidade = especialidade;
        this.ValNascimento = 2020 - nascimento;
       
    }

    public String getNome() {
        return ValNome;
        
    }
    public String getEspec() {
        return ValEspecialidade;
    }
    public Double getNasci() {
        return ValNascimento;
    }

    

    

}

