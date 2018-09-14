public class cProcesso extends Thread{
  cPublica publica;
  int id;
  int qtdProcesso;
  cJantarFilosofo jantarFilosofo;
  public cProcesso (cPublica p, int i, int qp, cJantarFilosofo jf) {
    publica = p;
    id = i;
    qtdProcesso = qp;
    jantarFilosofo = jf;
  }
  public void run() {
    jantarFilosofo.pegaGarfos(id);
        
    publica.v[id] += id+1;
    publica.v[(id+1)%qtdProcesso] += (id+1);
    System.out.println ("Resultado do processo " + id + ": " + 
                  (publica.v[id]+publica.v[(id+1)%qtdProcesso]));
    publica.v[id] = 0;
    publica.v[(id+1)%qtdProcesso] = 0;
    
    jantarFilosofo.soltaGarfos(id);
  }
}
