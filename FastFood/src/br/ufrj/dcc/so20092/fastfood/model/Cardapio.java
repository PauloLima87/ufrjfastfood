/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufrj.dcc.so20092.fastfood.model;

import java.util.ArrayList;
import java.util.HashSet;

public class Cardapio {

    private ArrayList<Sanduiche> sanduiches = new ArrayList<Sanduiche>();
    private ArrayList<Bebida> bebidas = new ArrayList<Bebida>();
    /*Sanduiches:
- Frango com abacaxi
Um pão de leite, 150 gramas de peito de frango grelhado, 50g de abacaxi.
(R$ 7,50)
- Minas especial
Duas metades de pão árabe, 100g de queijo minas, 5g de orégano e 35g de tomate
(R$ 6,90)
*/

    public Cardapio() {
        Ingrediente pao = new Ingrediente("pão árabe", 0.5);
        Ingrediente paoForma = new Ingrediente("pão de forma", 0.5);
        Ingrediente tomate = new Ingrediente("tomate seco", 0.3);
        Ingrediente creamCheese = new Ingrediente("cream cheese", 2.0);
        Ingrediente presuntoParma = new Ingrediente("presunto parma", 1.0);
        Ingrediente rucula = new Ingrediente("rúcula", 0.3);
        Ingrediente queijoMinas = new Ingrediente("queijo minas", 0.4);
        Ingrediente azeite = new Ingrediente("azeite", 1.0);
        Ingrediente koka = new Ingrediente("lata de koka-cola", 2.0);
        Ingrediente ispraite = new Ingrediente("lata de ispraite", 2.0);
        Ingrediente phanta = new Ingrediente("lata de phanta", 2.0);
        Ingrediente peitoPeru = new Ingrediente("peito de peru", 1.0);
        Ingrediente alface = new Ingrediente("alface", 0.3);
        Ingrediente requeijao = new Ingrediente("requeijão", 1.0);
        Ingrediente peitoFrango = new Ingrediente("peito de frango", 1.0);
        Ingrediente cenoura = new Ingrediente("cenoura", 0.4);
        Ingrediente beterraba = new Ingrediente("beterraba", 0.8);

        HashSet<ItemProduto> itens = new HashSet<ItemProduto>();
        ItemProduto ip = new ItemProduto(pao, 2);
        itens.add(ip);
        ip = new ItemProduto(tomate, 50);
        itens.add(ip);
        ip = new ItemProduto(presuntoParma, 75);
        itens.add(ip);
        ip = new ItemProduto(rucula, 20);
        itens.add(ip);
        ip = new ItemProduto(queijoMinas, 50);
        itens.add(ip);
        ip = new ItemProduto(azeite, 1);
        itens.add(ip);
        Sanduiche s1 = new Sanduiche("Tomate seco no pão árabe", itens);
        sanduiches.add(s1);

        itens.clear();
        ip = new ItemProduto(paoForma, 2);
        itens.add(ip);
        ip = new ItemProduto(creamCheese, 15);
        itens.add(ip);
        ip = new ItemProduto(peitoPeru, 75);
        itens.add(ip);
        ip = new ItemProduto(alface, 50);
        itens.add(ip);
        ip = new ItemProduto(tomate, 50);
        itens.add(ip);
        Sanduiche s2 = new Sanduiche("Peito de peru", itens);
        sanduiches.add(s2);

        itens.clear();
        ip = new ItemProduto(paoForma, 2);
        itens.add(ip);
        ip = new ItemProduto(requeijao, 15);
        itens.add(ip);
        ip = new ItemProduto(peitoFrango, 100);
        itens.add(ip);
        ip = new ItemProduto(cenoura, 50);
        itens.add(ip);
        ip = new ItemProduto(beterraba, 50);
        itens.add(ip);
        Sanduiche s3 = new Sanduiche("Cenoura com Beterraba", itens);
        sanduiches.add(s3);

        itens.clear();
        ip = new ItemProduto(koka, 1);
        itens.add(ip);
        
        Bebida b1 = new Bebida("Koka-Cola", itens);
        bebidas.add(b1);

        itens.clear();
        ip = new ItemProduto(ispraite, 1);
        itens.add(ip);

        Bebida b2 = new Bebida("Ispraite", itens);
        bebidas.add(b2);

        itens.clear();
        ip = new ItemProduto(phanta, 1);
        itens.add(ip);

        Bebida b3 = new Bebida("Phanta", itens);
        bebidas.add(b3);
    }

    /**
     * @return the sanduiches
     */
    public ArrayList<Sanduiche> getSanduiches() {
        return sanduiches;
    }

    /**
     * @param sanduiches the sanduiches to set
     */
    public void setSanduiches(ArrayList<Sanduiche> sanduiches) {
        this.sanduiches = sanduiches;
    }

    /**
     * @return the bebidas
     */
    public ArrayList<Bebida> getBebidas() {
        return bebidas;
    }

    /**
     * @param bebidas the bebidas to set
     */
    public void setBebidas(ArrayList<Bebida> bebidas) {
        this.bebidas = bebidas;
    }
}
