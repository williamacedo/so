public class cVenda extends Thread {
  cPublica publica;
  int id;
  cLeitorEscritor leitorEscritor;

  public cVenda (cPublica p, int i, cLeitorEscritor le) {
    publica = p;
    id = i;
    leitorEscritor = le;
  }

  public void run() {
    leitorEscritor.livro.down();
      
    publica.poltrona++;
    System.out.println (" vendedor " + id +
                      " vendeu Poltrona " + 
                      publica.poltrona);
    
    leitorEscritor.livro.up();
  }
}