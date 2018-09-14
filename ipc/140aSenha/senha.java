public class senha {
  /////////////
  public final static int QTD_USUARIO = 10; 
  /////////////

  public static void main(String[] args) {
    cPublica publica = new cPublica();
    cSemaforo semaforo = new cSemaforo(1);
     
    cRetiraSenha retiraSenha = new cRetiraSenha (publica, semaforo);
    cChamaSenha chamaSenha = new cChamaSenha (publica, semaforo);
    
    cUsuario[] usuario =   new cUsuario[QTD_USUARIO];
    cAtendente[] atendente =   new cAtendente[QTD_USUARIO];
    for (int i=0; i<QTD_USUARIO; i++) {
      usuario[i] = new cUsuario (publica, i);
      atendente[i] = new cAtendente (publica, i);
    }

    retiraSenha.start();
    chamaSenha.start();
    for (int i=0; i<QTD_USUARIO ; i++) {
      usuario[i].start(); 
      atendente[i].start(); 
    }
  }
}
