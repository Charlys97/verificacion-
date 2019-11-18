
public class Sotrauraba {
    
    public static void main(String[] args) {
       Puesto [][] puestos = new Puesto[5][4];
       int fila, columna;
       Puesto aux;
       String estado = "";
       
        for (fila  = 0; fila < puestos.length; fila++) 
        {
            for (columna = 0; columna < 4; columna++) 
            {
             puestos[fila][columna] = new Puesto();
             puestos[fila][columna].setNumero(4*fila+columna+1);
             puestos[fila][columna].setEstado(true);
            }
        }
      
       
         for (fila  = 0; fila < puestos.length; fila++) 
         {
             aux = puestos[fila][2];
             puestos[fila][2]= puestos[fila][3];
             puestos[fila][3] = aux;
         }  
        
        
         for (fila  = 0; fila < puestos.length; fila++) 
         {
            for (columna = 0; columna < 4; columna++) 
            {
                if(puestos[fila][columna].isEstado())
                {
                    estado = "";
                }
                
                System.out.print(puestos[fila][columna].getNumero()+ " " + estado +"\t");
               }
             System.out.println("");
         }
         
         
         System.out.println("");
         System.out.println("--------------------------------");
          System.out.println("");
          
        puestos[2][1].setEstado(false);
        puestos[4][3].setEstado(false);
        puestos[4][3].setEstado(false);
        
        for (fila = 0; fila < 10; fila++)
        {
            for (columna = 0; columna < 4; columna++)
            {
                if(puestos[fila][columna].isEstado())
            {
                estado = " ";
            }
                else
                {
                    estado = "*";
                }
                System.out.print(puestos[fila][columna].getNumero() + " " + estado + "\t");
            }
            System.out.println("");
            }
    }
}

