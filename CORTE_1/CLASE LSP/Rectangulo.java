class Rectangulo extends Forma {
    private double base;
    private double altura;

    // Constructor y getters 

    @Override
    public double calcularArea(){
        return base * altura;
    }
}
