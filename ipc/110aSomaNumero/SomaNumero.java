public class SomaNumero {
  //////////////////////////
  public final static int QTD_PROCESSO = 14;
  /////////////////////////
  
  public static void main(String[] args) {
    cPublica publica = new cPublica(QTD_PROCESSO);

    cProcesso[] processo = new cProcesso[QTD_PROCESSO];
    
    for (int i=0; i<QTD_PROCESSO; i++)
      processo[i] = new cProcesso(publica, i, QTD_PROCESSO);

    for (int i=0; i<QTD_PROCESSO; i++)
      processo[i].start();
     
  }
}
