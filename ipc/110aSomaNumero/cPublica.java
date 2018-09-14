public class cPublica {
  /////////
  public final static int TAM_MAX_VETOR = 50;
  ////////
  int[] v = new int[TAM_MAX_VETOR];
  int tamVetor;
  public cPublica (int tv){
    tamVetor = tv;
    for (int i=0; i<tamVetor; i++)
      v[i] = 0; 
    }
}
