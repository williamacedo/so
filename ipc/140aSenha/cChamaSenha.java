class cChamaSenha extends Thread {
  cPublica publica;
  cSemaforo semaforo;
  
  public cChamaSenha (cPublica p, cSemaforo s) {
    publica = p;
    semaforo = s;
  }

  public void run () {
    while (true) {

      
      /////atender cliente
      while (publica.senhaChamada==publica.senhaRetirada);
      semaforo.down();
      publica.senhaChamada++;
      System.out.println ("****Chamada senha " +
              publica.senhaChamada + "****");
      semaforo.up();
      /////////////////////
    }
  }
}