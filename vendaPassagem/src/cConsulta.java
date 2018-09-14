public class cConsulta extends Thread {
  cPublica publica;
  int id;
  cLeitorEscritor leitorEscritor;
  
  public cConsulta (cPublica p, int i, cLeitorEscritor le) {
    publica = p;
    id = i;
    leitorEscritor = le;
  }

  public void run() {
    leitorEscritor.semaforo.down();
    leitorEscritor.rc++;
    if(leitorEscritor.rc == 1)
       leitorEscritor.livro.down();
    leitorEscritor.semaforo.up();
    System.out.println ("consulta " + id + 
                   ": Total vendidas = " + 
                   publica.poltrona);
    
    leitorEscritor.semaforo.down();
    leitorEscritor.rc--;
    if(leitorEscritor.rc == 0)
       leitorEscritor.livro.up();
    leitorEscritor.semaforo.up();
  }
}
