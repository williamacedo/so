public class cSemaforo {
  int sem;
  public cSemaforo (int s) {
    sem = s;
  }
  public synchronized void down() {
    while (sem==0) {
      try{wait();} catch (InterruptedException e) {}
    }
    sem--;
  }
  public synchronized void up() {
    if (sem==0)
      notifyAll();
    sem++;
  }
}
