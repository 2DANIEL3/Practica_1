package practica_1;


public class Cuenta {
    private String NomCliente;
    private String NumCuenta;
    private double Interes;
    private double Saldo;

    
    public Cuenta (){
        
    }
    
    //Constructor con sus parámetros
    public Cuenta (String NomCliente, String NumCuenta, double Interes, double Saldo ){
       this.NomCliente = NomCliente;
       this.NumCuenta = NumCuenta;
       this.Interes = Interes;
       this.Saldo = Saldo;
    }
    
    //Copia de cuenta
    public Cuenta(final Cuenta ObjCuenta){
        this.NomCliente = ObjCuenta.NomCliente;
        this.NumCuenta = ObjCuenta.NumCuenta;
        this.Interes = ObjCuenta.Interes;
        this.Saldo = ObjCuenta.Saldo;        
    }
    
    
    //Getters y setters
    
    public double getInteres() {
        return Interes;
    }

    public void setInteres(double Interes) {
        this.Interes = Interes;
    }
   
    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public String getNomCliente() {
        return NomCliente;
    }

    public void setNomCliente(String NomCliente) {
        this.NomCliente = NomCliente;
    }

    public String getNumCuenta() {
        return NumCuenta;
    }


    public void setNumCuenta(String NumCuenta) {
        this.NumCuenta = NumCuenta;
    }

    
    //Verificacion de Deposito
 public boolean Deposito(double Cantidad){
    boolean DepositoV = true;
     if (Cantidad < 0){
         DepositoV = false;
     }else{
       this.Saldo = this.Saldo + Cantidad;  
     }
     return DepositoV;
 }   
 
 
 //Verificacion de Retiro
  public boolean Retiro(double Cantidad){
    boolean RetiroV = true;
     if (Cantidad < 0){
         RetiroV = false;
     }else{
       this.Saldo = this.Saldo - Cantidad;  
     }
     return RetiroV;
 } 
    
    
 //Verificacion de Transferencia
  public Boolean Transferencia (Cuenta Cuenta1, double n){
      boolean TF = true;
      if(n<0){
          TF = false;
      }else if (Saldo >= n){
          Retiro(n);
          Cuenta1.Deposito(n);
       }else{
          TF = false;
           System.out.print("Saldo insuficiente.");
       }
      return TF;
    }
}
