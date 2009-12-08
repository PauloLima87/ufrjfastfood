/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufrj.dcc.so20092.fastfood.model;

import java.util.ArrayList;
import java.util.HashSet;

public class Cardapio {

    public static ArrayList<Sanduiche> sanduiches = new ArrayList<Sanduiche>();
    public static ArrayList<Bebida> bebidas = new ArrayList<Bebida>();

    public static Ingrediente pao = new Ingrediente("pão árabe", 0.5, "fatias");
    public static Ingrediente paoForma = new Ingrediente("pão de forma", 0.5, "fatias");
    public static Ingrediente tomate = new Ingrediente("tomate seco", 0.3, "gramas");
    public static Ingrediente creamCheese = new Ingrediente("cream cheese", 2.0, "gramas");
    public static Ingrediente presuntoParma = new Ingrediente("presunto parma", 1.0, "gramas");
    public static Ingrediente rucula = new Ingrediente("rúcula", 0.3, "gramas");
    public static Ingrediente queijoMinas = new Ingrediente("queijo minas", 0.4, "gramas");
    public static Ingrediente azeite = new Ingrediente("azeite", 1.0, "gramas");
    public static Ingrediente koka = new Ingrediente("lata de koka-cola", 2.0, "latas");
    public static Ingrediente ispraite = new Ingrediente("lata de ispraite", 2.0, "latas");
    public static Ingrediente phanta = new Ingrediente("lata de phanta", 2.0, "latas");
    public static Ingrediente peitoPeru = new Ingrediente("peito de peru", 1.0, "gramas");
    public static Ingrediente alface = new Ingrediente("alface", 0.3, "gramas");
    public static Ingrediente requeijao = new Ingrediente("requeijão", 1.0, "gramas");
    public static Ingrediente peitoFrango = new Ingrediente("peito de frango", 1.0, "gramas");
    public static Ingrediente cenoura = new Ingrediente("cenoura", 0.4, "gramas");
    public static Ingrediente beterraba = new Ingrediente("beterraba", 0.8, "gramas");

    public Cardapio() {

        HashSet<ItemProduto> itens = new HashSet<ItemProduto>();
        ItemProduto ip = new ItemProduto(pao, 2);
        itens.add(ip);
        ItemProduto ip2 = new ItemProduto(tomate, 50);
        itens.add(ip2);
        ItemProduto ip3 = new ItemProduto(presuntoParma, 75);
        itens.add(ip3);
        ItemProduto ip4 = new ItemProduto(rucula, 20);
        itens.add(ip4);
        ItemProduto ip5 = new ItemProduto(queijoMinas, 50);
        itens.add(ip5);
        ItemProduto ip6 = new ItemProduto(azeite, 1);
        itens.add(ip6);
        Sanduiche s1 = new Sanduiche("Tomate seco no pão árabe", itens);
        sanduiches.add(s1);

        itens = new HashSet<ItemProduto>();
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

        itens = new HashSet<ItemProduto>();
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

        itens = new HashSet<ItemProduto>();
        ip = new ItemProduto(koka, 1);
        itens.add(ip);
        
        Bebida b1 = new Bebida("Koka-Cola", itens);
        bebidas.add(b1);

        itens = new HashSet<ItemProduto>();
        ip = new ItemProduto(ispraite, 1);
        itens.add(ip);

        Bebida b2 = new Bebida("Ispraite", itens);
        bebidas.add(b2);

        itens = new HashSet<ItemProduto>();
        ip = new ItemProduto(phanta, 1);
        itens.add(ip);

        Bebida b3 = new Bebida("Phanta", itens);
        bebidas.add(b3);
    }

    public ArrayList<Sanduiche> getSanduiches() {
        return sanduiches;
    }
    public void setSanduiches(ArrayList<Sanduiche> sanduiches) {
        this.sanduiches = sanduiches;
    }
    public ArrayList<Bebida> getBebidas() {
        return bebidas;
    }
    public void setBebidas(ArrayList<Bebida> bebidas) {
        this.bebidas = bebidas;
    }
}
