
public class Puesto {
   private int numero; 
   private boolean estado;
   
   public Puesto(){
   }

    public Puesto(int numero, boolean estado) {
        this.numero = numero;
        this.estado = estado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
   
   
}
