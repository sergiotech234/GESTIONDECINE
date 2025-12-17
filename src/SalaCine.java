public class SalaCine {
    private boolean [] asientos;

    public SalaCine(){
        asientos = new boolean [50];
    }
    public void reservarAsientos(int num)throws AsientoNoDisponibleException{
        if(num < 0 || num > 50){
            throw new AsientoNoDisponibleException("Asiento invalido");
        }

        if (asientos[num -1]){
            throw new AsientoNoDisponibleException("El asiento odupado");
        }
        asientos[num -1] = true;
    }
    public void mostrarAsientos(){
        for(int i = 0; i < asientos.length; i++){
            System.out.println("Asiento "+(i+1)+": "+(asientos[i] ? "Ocupado" : "Libre"));
        }
    }
}
