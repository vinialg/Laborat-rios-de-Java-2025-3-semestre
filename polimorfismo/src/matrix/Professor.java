package matrix;

public class Professor extends Agente {
	public String escola;

    public Professor(String escola, String nome, boolean modo_agente, String profissao){
        super(nome, modo_agente, profissao);
        this.escola = escola;
    }
    
    public void apresentacao(){
        System.out.println("Nome= " + nome + " Profissao= " + profissao + " Escola = " + this.escola + " ModoAgente= " + modo_agente);
    }
}
