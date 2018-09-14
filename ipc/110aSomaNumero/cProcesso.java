public class cProcesso extends Thread{
  cPublica publica;
  int id;
  int qtdProcesso;
  public cProcesso (cPublica p, int i, int qp) {
    publica = p;
    id = i;
    qtdProcesso = qp;
  }
  public void run() {
    publica.v[id] += id+1;
    publica.v[(id+1)%qtdProcesso] += (id+1);
    System.out.println ("Resultado do processo " + id + ": " + 
                  (publica.v[id]+publica.v[(id+1)%qtdProcesso]));
    publica.v[id] = 0;
    publica.v[(id+1)%qtdProcesso] = 0;
  }
}
