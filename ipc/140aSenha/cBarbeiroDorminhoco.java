public class cBarbeiroDorminhoco {
  cSemaforo semaforo, semCliente, semBarbeiro;
  int esperando;

  public cBarbeiroDorminhoco () {
    semaforo = new cSemaforo(1);
    semCliente = new cSemaforo(0);
    semBarbeiro = new cSemaforo (0);
    esperando = 0;
  }
}
