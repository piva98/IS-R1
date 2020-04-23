package mjpa.iiserie;

/**
 * 
 */
public class VehiculoFactory {
     private final String nombreVehiculo;
     private static VehiculoFactory instancia;
   
    private VehiculoFactory(String nombreVehiculo) {
    this.nombreVehiculo=nombreVehiculo;
    System.out.println("Mi nombre es: " + this.nombreVehiculo);
    }

    public static VehiculoFactory getInstanciaVehiculo (String nombreVehiculo){
        if (instancia==null){
            instancia = new VehiculoFactory(nombreVehiculo);
        }
        else{
            System.out.println("No se puede crear el objeto "+ nombreVehiculo + " porque ya existe un objeto de la clase VehiculoFactory");
        }
            return instancia;
    }
    
  
    public void getInstancia() {
        // TODO implement here
    }
    
    
}
    
  
    
   



   

