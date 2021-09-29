package Fundamentus.Fundamentus;

import Fundamentus.page.AcaoPage;
import Fundamentus.Estrutura.Excel;

import static Fundamentus.Estrutura.Parametros.acao;;

public class ColetarFundamentus {

    public static String papel[] = new String[acao.length];
    public static String empresa[] = new String[acao.length];
    public static String setor[] = new String[acao.length];
    public static String cotacao[] = new String[acao.length];
    public static String dataCotacao[] = new String[acao.length];
    public static String mim[] = new String[acao.length];
    public static String max[] = new String[acao.length];
    public static String trintaDias[] = new String[acao.length];
    public static String nesseAno[] = new String[acao.length];
    public static String vinte[] = new String[acao.length];
    public static String dezenove[] = new String[acao.length];
    public static String pvp[] = new String[acao.length];
    public static String vpa[] = new String[acao.length];
    public static String liqCorrent[] = new String[acao.length];
    public static String margBruta[] = new String[acao.length];
    public static String margLiqui[] = new String[acao.length];
    public static String margEbit[] = new String[acao.length];
    public static String roe[] = new String[acao.length];
    public static String lucroLiqui[] = new String[acao.length];
    public static String dividendos[] = new String[acao.length];

  public static void main (String args[]){
      int i = 0;
      Excel gerar = new Excel();
      AcaoPage acaoP = new AcaoPage();
      try {
          for (i = 0; i < acao.length; i++) {
              acaoP.acessarURL(i);
              papel[i] = acaoP.papel();
              empresa[i] = acaoP.empresa();
              System.out.println("Coletando dados do Papel = " + papel[i] + " Empresa = " + empresa[i]);
              setor[i] = acaoP.setor();
              cotacao[i] = acaoP.cotacao();
              dataCotacao[i] = acaoP.dataCotacao();
              mim[i] = acaoP.mim();
              max[i] = acaoP.max();
              trintaDias[i] = acaoP.trintaDias();
              nesseAno[i] = acaoP.nesseAno();
              vinte[i] = acaoP.vinte();
              dezenove[i] = acaoP.dezenove();
              pvp[i] = acaoP.pvp();
              vpa[i] = acaoP.vpa();
              dividendos[i] = acaoP.divYield();
              liqCorrent[i] = acaoP.liqCorrent();
              margBruta[i] = acaoP.margBruta();
              margLiqui[i] = acaoP.margLiqui();
              margEbit[i] = acaoP.margEbit();
              roe[i] = acaoP.roe();
              lucroLiqui[i] = acaoP.lucroLiqui();
          }
          gerar.gerarExcel();

      } finally {
          acaoP.finalizarNavegacao();
      }
    }
}
