public class cVenda extends Thread {
  cPublica publica;
  int id;

  public cVenda (cPublica p, int i) {
    publica = p;
    id = i;
  }

  public void run() {
    publica.poltrona++;
    System.out.println (" vendedor " + id +
                      " vendeu Poltrona " + 
                      publica.poltrona);
  }
}