package matrix;

public abstract class Agente {
	public String nome;
    public boolean modo_agente;
    public String profissao;

    public Agente(String nome, boolean modo_agente, String profissao) {
        this.nome = nome;
        this.modo_agente = modo_agente;
        this.profissao = profissao;
    } 
    
    public abstract void apresentacao();
    
    public boolean modo_agente_on(){
        return modo_agente = true;
    }
}
