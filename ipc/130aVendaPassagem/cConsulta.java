public class cConsulta extends Thread {
  cPublica publica;
  int id;

  public cConsulta (cPublica p, int i) {
    publica = p;
    id = i;
  }

  public void run() {
    System.out.println ("consulta " + id + 
                   ": Total vendidas = " + 
                   publica.poltrona);
  }
}
