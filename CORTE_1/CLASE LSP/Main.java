class OperacionForma(){
    public double area(Forma forma){
        return forma.calcularArea();
    }
}

public class Main {
    public static void main(String[] args) {
            OperacionForma operacionForma = new OperacionForma();
            Forma forma = new Rectangulo(5, 10); 
            double area = operacionForma.area(forma);
            System.out.println("Área:" + area);
        }
    }
    

