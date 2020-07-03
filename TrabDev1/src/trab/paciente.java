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
public class paciente {

     private String nomep;
     private String doenca;
     private double nascimento;
     private static String valNomep;
     private static String valDoenca;
     private static Double valNascimento;
     
    
    /**
     * @return the nomep
     */
    public String getNome() {
        return nomep;
    }

    /**
     * @param nomep the nomep to set
     */
    public void setNomep(String nomep) {
        this.nomep = nomep;
    }

    /**
     * @return the doenca
     */
    public String getDoenca() {
        return doenca;
    }

    /**
     * @param doenca the doenca to set
     */
    public void setDoenca(String doenca) {
        this.doenca = doenca;
    }

    /**
     * @return the nascimento
     */
    public double getNascimento() {
        return nascimento;
    }

    /**
     * @param nascimento the nascimento to set
     */
    public void setNascimento(double nascimento) {
        this.nascimento = 2020 - nascimento;
    }

    public void login(String nomep, String doenca, Double nascimento) {
        this.valNomep= nomep;
        this.valDoenca = doenca;
        this.valNascimento = 2020 - nascimento;
       
    }

    public String getNomep() {
        return valNomep;
        
    }
    public String getDoenc() {
        return valDoenca;
    }
    public Double getNasci() {
        return valNascimento;
    } 

    

}
