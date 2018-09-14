public class vendaPassagem {
  ///////////////////////////
  public final static int QTD_VENDA = 20;
  public final static int QTD_CONSULTA = 20;
  //////////////////////////

  public static void main (String[] args){
    cPublica publica = new cPublica();

    cVenda[] venda = new cVenda [QTD_VENDA];
    cConsulta[] consulta = new cConsulta [QTD_CONSULTA];
    cLeitorEscritor leitorEscritor = new cLeitorEscritor ();

    for (int i=0; i<QTD_VENDA; i++) {
      venda[i] = new cVenda(publica, i, leitorEscritor);
    }

    for (int i=0; i<QTD_CONSULTA; i++) {
      consulta  [i] = new cConsulta  (publica, i, leitorEscritor);
    }

    for (int i=0; i<QTD_VENDA; i++) {
      venda[i].start();
    }

    for (int i=0; i<QTD_CONSULTA; i++) {
      consulta[i].start();
    }
  }
}
