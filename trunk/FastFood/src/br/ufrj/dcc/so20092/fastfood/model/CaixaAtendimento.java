package br.ufrj.dcc.so20092.fastfood.model;


public class CaixaAtendimento {

    private Integer id;
    private FilaAtendimento filaAtendimento;
    private Boolean disponivel;
    private Cliente cliente;
    
    public CaixaAtendimento(Integer id, FilaAtendimento filaAtendimento) {
        this.id = id;
        this.filaAtendimento = filaAtendimento;
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

    public Cliente getProximoCliente() {
        this.disponivel = false;
        return filaAtendimento.getNext();
    }

    public void atendeCliente() {
        /*
        if (verificarDisponibilidadePedido()) {
            waitRandomTime();
        }
        else {
            System.out.println("Pedido indisponível");
            this.disponivel = true;
            this.cliente = null;
            //TODO: garbage colector
        }
         */
    }


    /*
    public void getCliente(){

        FilaAtendimento fila = new FilaAtendimento();
        if(this.disponivel && !FilaAtendimento.filaVazia()){
            FilaAtendimento.getClienteFilaGlobal();

            System.out.println("PEGOU O CLIENTE");
        }
    }
    */
}
