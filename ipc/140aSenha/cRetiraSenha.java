public class cRetiraSenha extends Thread {
  cPublica publica;
  cSemaforo semaforo;


  public cRetiraSenha (cPublica p, cSemaforo s) {
    publica = p;
    semaforo = s;
  }

  public void run () {
      
      ////////////atender cliente
      semaforo.down();
      publica.senhaRetirada++;
      System.out.println ("Senha " +
              publica.senhaRetirada +
              " retirada");
      semaforo.up();
      /////////////////////////

  }
}
