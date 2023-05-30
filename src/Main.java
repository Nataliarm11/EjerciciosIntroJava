import java.util.Scanner;


//public class Main {
//    public static void main(String[] args) {
//
////        Ejercicio Uno
//
////        String nombre = "Natalia";
////        String apellidoUno = "Requena";
////        String apellidoDos ="Medina";
////        short edad=25;
////
////        System.out.println("Hola, mi nombre completo es " + nombre + " " + apellidoUno + " "+ apellidoDos + " y tengo " + edad + " años." );
//
//    }
//}

//public  class Main {
//    public static void main (String[] args){
//
////        Ejercicio Dos
//        Scanner  scanner = new Scanner(System.in);
//
//        int numeroUno;
//        int numeroDos;
//        int numeroTres;
//
//        System.out.println("Ingrese el primer numero");
//        numeroUno = scanner.nextInt();
//        System.out.println("Ingrese el segundo numero");
//        numeroDos = scanner.nextInt();
//        System.out.println("Ingrese el tercer numero");
//        numeroTres = scanner.nextInt();
//
//        if (numeroUno > numeroDos){
//            System.out.println("El número mayor es: " + numeroUno );
//        } else if (numeroDos > numeroTres) {
//            System.out.println("El número mayor es: " + numeroDos);
//        }else {
//            System.out.println("El número mayor es: " + numeroTres);
//        }
//    }
//}

//public  class Main {
//    public static void main (String[] args){
//
////        Ejercicio Tres
//        Scanner  scanner = new Scanner(System.in);
//
//        int numeroVerificarPar;
//
//        System.out.println("Ingrese un numero, para verificar si es Par");
//        numeroVerificarPar = scanner.nextInt();
//
//        if ( numeroVerificarPar % 2 == 0){
//            System.out.println("el numero: " + numeroVerificarPar + " es par");
//        } else {
//            System.out.println("el numero: " + numeroVerificarPar + " no es par");
//        }
//
//    }
//}

//public  class Main {
//    public static void main (String[] args){
//
////        Ejercicio Cuatro
//        Scanner  scanner = new Scanner(System.in);
//
//        String cadenaCaracteresUno;
//        String cadenaCaracteresDos;
//
//        System.out.println("Ingrese su primer cadena de caracteres");
//        cadenaCaracteresUno = scanner.nextLine();
//        System.out.println("Ingrese su segunda cadena de caracteres");
//        cadenaCaracteresDos = scanner.nextLine();
//
//        if (cadenaCaracteresUno.equals(cadenaCaracteresDos)){
//            System.out.println("las cadenas de caracteres son iguales");
//        }else{
//            System.out.println("las cadenas de caracteres no son iguales");
//        }
//
//    }
//}

//public  class Main {
//    public static void main (String[] args){
//
////        Ejercicio Cinco
//        Scanner  scanner = new Scanner(System.in);
//        int numero;
//        int contador=0;
//        int [] numeros = new int[100];
//
//        do{
//            System.out.println("Ingrese un numero y si quiere parar, ingrese 0.");
//            numero = scanner.nextInt();
//            numeros[contador]=numero;
//            contador++;
//        }while (numero != 0);
//        System.out.println("numeros ingresados: ");
//        for ( int i = 0; i < contador; i++)
//            System.out.println(numeros[i]);
//    }
//}

//public  class Main {
//    public static void main (String[] args){
//
////        Ejercicio Seis
//        mensajeBienvenida();
//    }
//    public static void mensajeBienvenida(){
//        System.out.println("Bienvenidos a la consola");
//    }
//}

//public  class Main {
//    public static void main (String[] args){
//
////        Ejercicio Siete
//
//        Scanner scanner = new Scanner(System.in);
//
//        int numeroIngresado;
//
//        System.out.println("Ingrese un numero para verificar si es par o impar");
//        numeroIngresado = scanner.nextInt();
//
//        String parImpar = verificarSiEsParImpar (numeroIngresado);
//        System.out.println(parImpar);
//    }
//
//    public static String verificarSiEsParImpar (int numeroIngresado){
//        if (numeroIngresado % 2 == 0) {
//            return "El numero ingresado " + numeroIngresado + " es un numero par";
//        }else {
//            return "El numero ingresado " + numeroIngresado + " es un numero impar";
//        }
//    }
//
//}

//public  class Main {
//    public static void main (String[] args){
//
////        Ejercicio Ocho
//
//        Scanner scanner = new Scanner(System.in);
//
//        int verificarNumeroPrimo;
//
//        System.out.println("Ingrese un numero para verificar si es primo");
//        verificarNumeroPrimo=scanner.nextInt();
//
//        boolean numeroPrimo = true;
//
//        for ( int i = 2; i < verificarNumeroPrimo; i++){
//            if ( verificarNumeroPrimo %  i == 0){
//                numeroPrimo = false;
//            }
//        }
//        if (numeroPrimo){
//            System.out.println("el numero es primo");
//        }else {
//            System.out.println("el numero no es primo");
//        }
//    }
//
//}

//public  class Main {
//    public static void main (String[] args){
////        Ejercicio nueve
//
//        Scanner scanner = new Scanner(System.in);
//        int [] numeros = new int[6];
//        System.out.println("Ingrese seis numeros y devolveremos la suma de los numeros impares que encontremos");
//
//        for (int i = 0; i < 6; i++ ){
//            numeros[i]= scanner.nextInt();
//        }
//
//        int sumaNumerosImpares=0;
//        for ( int i = 0; i < numeros.length; i++){
//            int numero = numeros[i];
//            System.out.println( "los numeros ingresados son:" + numero);
//
//            if (numero % 2 != 0){
//                sumaNumerosImpares += numero;
//            }
//        }
//        System.out.println("la suma de los numeros impares son " + sumaNumerosImpares);
//
//    }
//}

//public  class Main {
//    public static void main (String[] args){
////        Ejercicio diez
//
//        Scanner scanner = new Scanner(System.in);
//        int [] numeros = new int[6];
//        System.out.println("Ingrese seis numeros y devolveremos la suma de los numeros primos");
//
//        for (int i = 0; i < 6; i++ ){
//            numeros[i]= scanner.nextInt();
//        }
//
//        int sumaNumerosPrimos=0;
//        for ( int i = 0; i < numeros.length; i++){
//            int numero = numeros[i];
//
//            if (numero % 2 == 0){
//                System.out.println( numero + " es numero par ");
//            } else if (esNumeroPrimo(numero)) {
//                sumaNumerosPrimos += numero;
//            }
//        }
//        System.out.println("la suma de los numeros primos es " + sumaNumerosPrimos);
//
//    }
//    public static boolean esNumeroPrimo(int numero) {
//        if (numero <= 1) {
//            return false;
//        }
//
//        for (int i = 2; i * i <= numero; i++) {
//            if (numero % i == 0) {
//                return false;
//            }
//        }
//
//        return true;
//    }
//}

//public  class Main {
//    public static void main (String[] args){
////        Ejercicio once
//
//        menuCalculadora();
//
//    }
//
//    public static void menuCalculadora(){
//        System.out.println("Calculadora");
//        System.out.println("1. suma");
//        System.out.println("2. resta");
//        System.out.println("3. multiplicacion");
//        System.out.println("4. division");
//        System.out.println("0.salir");
//    }
//}

//public  class Main {
//    public static void main (String[] args){
////        Ejercicio doce
//
//        menuCalculadora();
//    }
//
//    public static void menuCalculadora(){
//        System.out.println("Calculadora");
//        System.out.println("1. suma");
//        System.out.println("2. resta");
//        System.out.println("3. multiplicacion");
//        System.out.println("4. division");
//        System.out.println("0.salir");
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Ingrese una opción del 1 al 4: ");
//        int opcion = scanner.nextInt();
//
//        if (opcion >= 1 && opcion <= 4) {
//            System.out.print("Ingrese el primer número: ");
//            int num1 = scanner.nextInt();
//            System.out.print("Ingrese el segundo número: ");
//            int num2 = scanner.nextInt();
//            int resultado = 0;
//
//            switch (opcion) {
//                case 1:
//                    resultado = num1 + num2;
//                    break;
//                case 2:
//                    resultado = num1 - num2;
//                    break;
//                case 3:
//                    resultado = num1 * num2;
//                    break;
//                case 4:
//                    if (num2 != 0) {
//                        resultado = num1 / num2;
//                    } else {
//                        System.out.println("no se puede dividir por 0");
//                        scanner.close();
//                        return;
//                    }
//                    break;
//            }
//
//            System.out.println("El resultado es: " + resultado);
//        } else if (opcion == 0) {
//            System.out.println("salir de la calculadora");
//        } else {
//            System.out.println("Ingrese una opcion valida");
//        }
//
//        scanner.close();
//    }
//}



public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int capacidadMaxima = 500;
        int valorEntradaNormal = 1500;
        int valorEntradaVip = 2000;
        int capacidad = 0;
        int dineroRecaudado = 0;
        int opcion;

        do {
            System.out.println("Menu - Ingreso a boliche");
            System.out.println("1. Ingreso de datos");
            System.out.println("2. Capacidad disponible");
            System.out.println("3. Dinero recaudado");
            System.out.println("4. Salir del sistema");

            System.out.println("Ingrese una opción (1 al 4)");
            opcion = scanner.nextInt();

            if (opcion == 1) {
                scanner.nextLine(); // Limpiar el buffer

                System.out.println("Ingrese su nombre");
                String nombre = scanner.nextLine();
                System.out.println("Ingrese su edad");
                int edad = scanner.nextInt();
                System.out.println("Ingrese su DNI");
                int dni = scanner.nextInt();
                System.out.println("¿Tiene pase VIP o NORMAL?");
                String tipoDePase = scanner.next();

                if (edad >= 21) {
                    if (tipoDePase.equalsIgnoreCase("VIP")) {
                        System.out.println("Bienvenido " + nombre + ". Por tener pase VIP, ingresa gratis.");
                        capacidad++;
                    } else {
                        System.out.println("¿Tiene pase de descuento? SI o NO");
                        String tieneDescuento = scanner.next();

                        if (tieneDescuento.equalsIgnoreCase("SI")) {
                            System.out.println("¿Desea comprar una entrada NORMAL o VIP?");
                            String tipoEntrada = scanner.next();

                            int costoEntrada;
                            if (tipoEntrada.equalsIgnoreCase("VIP")) {
                                costoEntrada = valorEntradaVip / 2;
                            } else {
                                costoEntrada = valorEntradaNormal / 2;
                            }

                            if (capacidad < capacidadMaxima) {
                                capacidad++;
                                dineroRecaudado += costoEntrada;
                                System.out.println("¡Bienvenido " + nombre + "! Su entrada ha sido cobrada con descuento.");
                            } else {
                                System.out.println("el boliche se encuentra lleno");
                            }
                        } else {
                            System.out.println("¿Desea comprar una entrada NORMAL o VIP?");
                            String tipoEntrada = scanner.next();

                            int costoEntrada;
                            if (tipoEntrada.equalsIgnoreCase("VIP")) {
                                costoEntrada = valorEntradaVip;
                            } else {
                                costoEntrada = valorEntradaNormal;
                            }

                            if (capacidad < capacidadMaxima) {
                                capacidad++;
                                dineroRecaudado += costoEntrada;
                                System.out.println("¡Bienvenido " + nombre + "su entrada se ha cobrado correctamente!");
                            } else {
                                System.out.println("El boliche se encuentra lleno");
                            }
                        }
                    }
                } else {
                    System.out.println("El ingreso es para mayores de 21 años");
                }
            } else if (opcion == 2) {
                int capacidadDisponible = capacidadMaxima - capacidad;
                System.out.println("la capacidad disponible es: " + capacidadDisponible + " personas");
            } else if (opcion == 3) {
                System.out.println("el dinero recaudado es : $" + dineroRecaudado);
            } else if (opcion == 4) {
                System.out.println("saliendo del menu");
            } else {
                System.out.println("Ingrese una opcion valida.");
            }

            System.out.println();
        } while (opcion != 4);

        scanner.close();
    }
}





