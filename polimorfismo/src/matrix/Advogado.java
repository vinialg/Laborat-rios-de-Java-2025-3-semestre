package matrix;

public class Advogado extends Agente {
    public String oab;

    public Advogado(String oab, String nome, boolean modo_agente, String profissao) {
        super(nome, modo_agente, profissao);
        this.oab = oab;
    }
    
    public void apresentacao(){
        System.out.println("Nome= " + nome + " Profissao= " + profissao + " OAB = " + this.oab + " ModoAgente= " + modo_agente);
    }
}
