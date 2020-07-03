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
public class tratamento {
    private String nometm;
    private String nometp;
    private String tratamento;
    private static String Valnometm;
    private static String Valnometp;
    private static String Valtratamento;
   

    /**
     * @return the nometm
     */
    public String getNometm() {
        return nometm;
    }

    /**
     * @param nometm the nometm to set
     */
    public void setNometm(String nometm) {
        this.nometm = nometm;
    }

    /**
     * @return the nometp
     */
    public String getNometp() {
        return nometp;
    }

    /**
     * @param nometp the nometp to set
     */
    public void setNometp(String nometp) {
        this.nometp = nometp;
    }

    /**
     * @return the tratamento
     */
    public String getTratamento() {
        return tratamento;
    }

    /**
     * @param tratamento the tratamento to set
     */
    public void setTratamento(String tratamento) {
        this.tratamento = tratamento;
    }
    
    public void login(String nometm, String nometp, String tratamento) {
        this.Valnometm = nometm;
        this.Valnometp = nometp;
        this.Valtratamento = tratamento;
       
    }

    public String getNomeTM() {
        return Valnometm;
        
    }
    public String getNomeTP() {
        return Valnometp;
    }
    public String getTrat() {
        return Valtratamento;
    }
   
    

}
