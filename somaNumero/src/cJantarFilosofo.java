public class cJantarFilosofo {
  /////////////////////////////////////////////////
  static final int QTD_MAX_FILOSOFO = 50;
  /////////////////////////////////////////////////
  static final int PENSANDO = 0;
  static final int COM_FOME = 1;
  static final int COMENDO = 2;
  int [] estadoFilosofo = new int[QTD_MAX_FILOSOFO];
  cSemaforo mutex;
  cSemaforo[] sem = new cSemaforo [QTD_MAX_FILOSOFO];

  int qtdFilosofo;

  public cJantarFilosofo (int qf) {
    mutex = new cSemaforo (1);
    qtdFilosofo = qf;
    for (int i=0; i<qtdFilosofo; i++) {
      estadoFilosofo[i] = PENSANDO;
      sem[i] = new cSemaforo (0); 
    }
  }

  public void teste (int i) {
    final int ESQUERDA = (i + qtdFilosofo -1)%qtdFilosofo;
    final int DIREITA =  (i+1)%qtdFilosofo; 
    if (estadoFilosofo[i] == COM_FOME && estadoFilosofo[ESQUERDA] != COMENDO &&
                                         estadoFilosofo[DIREITA] != COMENDO) {
      estadoFilosofo[i] = COMENDO;
      sem[i].up();
    }
  } 

  public void pegaGarfos (int i) {
    mutex.down();
    estadoFilosofo [i] = COM_FOME;
    teste (i);
    mutex.up();
    sem[i].down();
  }

  public void soltaGarfos (int i) {
    final int ESQUERDA = (i + qtdFilosofo -1)%qtdFilosofo;
    final int DIREITA =  (i+1)%qtdFilosofo; 
    mutex.down();
    estadoFilosofo[i] = PENSANDO;
    teste (ESQUERDA);
    teste (DIREITA);
    mutex.up();
  }  
}

