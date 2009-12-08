package br.ufrj.dcc.so20092.fastfood.control;

import br.ufrj.dcc.so20092.fastfood.model.Estoque;
import br.ufrj.dcc.so20092.fastfood.model.ItemEstoque;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;

public class GeraRelatorios {

    static HashSet<ItemEstoque> itens = Estoque.itensEstoque;

    public static boolean criaArquivoRelatorioDiario() {

        PrintWriter pw;
        Date dt = new Date();

        SimpleDateFormat formatador = new SimpleDateFormat("ddMMyyyy_HHmm");
        String strDT = formatador.format(dt);

        try {
            pw = new PrintWriter (new FileOutputStream("./relatorio_diario_"+ strDT +".txt", false), false);

            pw.print("Quantidade de ítens em estoque:");
            pw.write(13);
            pw.write(10);
            pw.write(13);
            pw.write(10);

            for (ItemEstoque item : itens) {
                pw.write(item.getIngrediente().getNome());
                pw.write(" possui ");
                pw.write(String.valueOf(item.getQuantidade()));
                pw.write(" ");
                pw.write(String.valueOf(item.getIngrediente().getUnidade()));
                pw.write(" em estoque.");

                pw.write(13);
                pw.write(10);
            }

            pw.close();

            return true;
        } catch (FileNotFoundException e) {
                e.printStackTrace();
                return false;
        }
    }
}
