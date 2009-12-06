package br.ufrj.dcc.so20092.fastfood.model;


public class CaixaPagamento {

    private Integer id;
    private Boolean disponivel;

    public CaixaPagamento(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }
/*
    public void getCliente(){

        FilaAtendimento fila = new FilaAtendimento();
        if(this.disponivel && !fila.filaVazia()){
            System.out.println("PEGOU O CLIENTE");
        }
    }
*/
}
