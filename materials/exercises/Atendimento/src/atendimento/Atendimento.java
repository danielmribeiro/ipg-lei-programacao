/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atendimento;

/**
 *
 * @author Asus
 */
public class Atendimento {
    public Atendimento(){
        senha = 0;
        atendimento = 1;
        senhatalho= 0;
        atendimentotalho = 1;
        senhapadaria= 0;
        atendimentopadaria = 1;
    }

    public Atendimento(
                int senha,
                int atendimento,
                int senhatalho,
                int atendimentotalho,
                int senhapadaria,
                int atendimentopadaria) {
        this.setSenha(senha);
        this.setAtendimento(atendimento);
        this.setSenhatalho(senhatalho);
        this.setAtendimentotalho(atendimentotalho);
        this.setSenhapadaria(senhapadaria);
        this.setAtendimentopadaria(atendimentopadaria);
    }
    
    private int senha;
    private int senhatalho;
    private int senhapadaria;

    @Override
    public String toString() {
        return "Atendimento{" + "senha=" + senha + ", atendimento=" + atendimento +"senhatalho=" + senhatalho + ", atendimentotalho=" + atendimentotalho + "senhapadaria=" + getSenhapadaria() + ", atendimentopadaria=" + getAtendimentopadaria() +'}';
    }
    private int atendimento;
    private int atendimentotalho;
    private int atendimentopadaria;

    public void senhaMais(){
        if (senha<99){
            senha++;
        }
    }
    
    public void next(){
        if ((atendimento<99)&&(atendimento<senha)){
            atendimento++;
        }
    }
    
    public void retroceder(){
        if ((atendimento<99)){
            atendimento--;
        }
    }

    /**
     * @return the senha
     */
    public int getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(int senha) {
        this.senha = senha;
    }

    /**
     * @return the atendimento
     */
    public int getAtendimento() {
        return atendimento;
    }

    /**
     * @param atendimento the atendimento to set
     */
    public void setAtendimento(int atendimento) {
        this.atendimento = atendimento;
    }

    /**
     * @return the senhatalho
     */
    public int getSenhatalho() {
        return senhatalho;
    }

    /**
     * @param senhatalho the senhatalho to set
     */
    public void setSenhatalho(int senhatalho) {
        this.senhatalho = senhatalho;
    }

    /**
     * @return the atendimentotalho
     */
    public int getAtendimentotalho() {
        return atendimentotalho;
    }

    /**
     * @param atendimentotalho the atendimentotalho to set
     */
    public void setAtendimentotalho(int atendimentotalho) {
        this.atendimentotalho = atendimentotalho;
    }

    /**
     * @return the senhapadaria
     */
    public int getSenhapadaria() {
        return senhapadaria;
    }

    /**
     * @param senhapadaria the senhapadaria to set
     */
    public void setSenhapadaria(int senhapadaria) {
        this.senhapadaria = senhapadaria;
    }

    /**
     * @return the atendimentopadaria
     */
    public int getAtendimentopadaria() {
        return atendimentopadaria;
    }

    /**
     * @param atendimentopadaria the atendimentopadaria to set
     */
    public void setAtendimentopadaria(int atendimentopadaria) {
        this.atendimentopadaria = atendimentopadaria;
    }
}

