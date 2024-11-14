//Código duplicado
double radio1 = 5;
double area 1 = Math.PI * radio1 * radio1

double radio2 = 3;
double area 2 = Math.PI * radio2 * radio2

//Código con el principio DRY
double calcularAreaCirculo(double radio) {
    return Math.PI * radio * radio;
}

double area1 = calcularAreaCirculo(5);
double area2 = calcularAreaCirculo(3);


