public class vendaPassagem {
  ///////////////////////////
  public final static int QTD_VENDA = 20;
  public final static int QTD_CONSULTA = 2;
  //////////////////////////

  public static void main (String[] args){
    cPublica publica = new cPublica();

    cVenda[] venda = new cVenda [QTD_VENDA];
    cConsulta[] consulta = new cConsulta [QTD_CONSULTA];

    for (int i=0; i<QTD_VENDA; i++) {
      venda[i] = new cVenda(publica, i);
    }

    for (int i=0; i<QTD_CONSULTA; i++) {
      consulta  [i] = new cConsulta  (publica, i);
    }

    for (int i=0; i<QTD_VENDA; i++) {
      venda[i].start();
    }

    for (int i=0; i<QTD_CONSULTA; i++) {
      consulta[i].start();
    }
  }
}
