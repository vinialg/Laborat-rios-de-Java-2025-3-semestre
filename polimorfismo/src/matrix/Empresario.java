package matrix;

public class Empresario extends Agente {
    public String empresa;

    public Empresario(String empresa, String nome, boolean modo_agente, String profissao) {
        super(nome, modo_agente, profissao);
        this.empresa = empresa;
    }
    
    public void apresentacao(){
        System.out.println("Nome= " + nome + " Profissao " + profissao + " Empresa = " + this.empresa + " ModoAgente= " + modo_agente);
    }
}
