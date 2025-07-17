import java.util.Scanner;

public class Credito {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        double in=0;
        double mon=0;
        String tc;
        System.out.println("--------------------------------");
        System.out.println("      Simulador de Credito      ");
        System.out.println("--------------------------------");
        System.out.println(" ¿Que tipo de credito necesita ?");
        System.out.println( " |1: Hipotecario | \n |2: Hipotecario - Interes publivo| \n |3: Consumo| \n |4: Educacion Superior|");
        int x = tec.nextInt();
        switch (x) {
            case 1:
                tc = "HIPOTECARIO";
                System.out.println("   Ha seleccionado:  ");
                System.out.println("     HIPOTECARIO ");
                in=0.09;
                break;
            case 2:
                tc = "HIPOTECARIO - INTERES PUBLICO";
                System.out.println("   Ha seleccionado:  ");
                System.out.println(" HIPOTECARIO - INTERES PUBLICO ");
                in=0.05;
                break;
            case 3:
                tc = "CONSUMO";
                System.out.println("   Ha seleccionado:  ");
                System.out.println("      CONSUMO ");
                in=0.14;
                break;
            case 4:
                tc = "EDUCACION SUPERIOR";
                System.out.println("   Ha seleccionado:  ");
                System.out.println(" EDUCACION SUPERIOR ");
                in=0.11;
                break;
            default:
                System.out.println("OPCION INVALIDA");
                return;
        }
        System.out.println("¿Cuánto dinero necesitas que te prestemos?");
        System.out.println(" Min. $500.00 ");
        mon = tec.nextDouble();
        if (mon < 500) {
            System.out.println("El monto mínimo permitido es $500.00");
            return;
        }        
        System.out.println("\n¿En cuanto tiempo quieres pagarlo?");
        System.out.println(" Ingrese la cantidad en numero de meses");
        int nmes= tec.nextInt();
        System.out.println("\n¿Como quieres pagar tus intereses ?");
        System.out.println( "1. MÉTODO FRANCÉS: Las cuotas se mantienen fijas en el tiempo ");
        System.out.println( "2. MÉTODO ALEMÁN: Las cuotas son variables que decrecen en el tiempo ");
        int pi = tec.nextInt();
        double tim= in/12;
        double tea= Math.pow(1+tim,12)-1;
        double TEA= tea*100;
        double tin= in*100;
        double sal=mon;
        double totin = 0;
        double totcap = 0;
        double totseg = 0;
        double tseg = 0.0015;
        System.out.println(" ");
        switch (pi) {
            case 1:
                double cb = mon * (tim * Math.pow(1 + tim, nmes)) /
                                      (Math.pow(1 + tim, nmes) - 1);
                System.out.println("\n MÉTODO FRANCÉS");
                System.out.println("Tipo de credito: " +tc);
                System.out.println("Plazo: " +nmes);
                System.out.println("Tasa de interes nominal " +tin +"%");
                System.out.println("Tasa de interes efectiva anual:" +String.format("%.2f",TEA) +"%");
                System.out.println("\nMes |  Cuota  | Capital | Interés | Seguro | Saldo Restante");
                System.out.println("-------------------------------------------------------------");
                for (int mes = 1; mes <= nmes; mes++) {
                    double inter = sal*tim;
                    double cap= cb-inter;
                    double seg = sal * tseg;
                    sal = sal - cap;
                    totin = totin + inter;
                    totcap = totcap + cap;
                    totseg = totseg + seg ;
                    System.out.printf("%3d | %6.2f | %7.2f | %7.2f | %6.2f | %13.2f\n",
                    mes, (cb + seg), cap, inter, seg, Math.max(sal, 0));
                }
                double totpag=totcap+totin+totseg;
                System.out.println("\nResumen del crédito:");
                System.out.printf("Total capital pagado: %.2f\n", totcap);
                System.out.printf("Total intereses pagados: %.2f\n", totin);
                System.out.printf("Total seguros pagados: %.2f\n", totseg);
                System.out.printf("Total a pagar: %.2f\n", totpag);
                break;
            case 2: 
                double capitalMensual = mon / nmes;
                double saldoAleman = mon;
                double totinte = 0;
                double totsegs = 0;
                double totalPagado = 0;
                double taseg = 0.0015; 
            
                System.out.println("Tipo de crédito: " + tc);
                System.out.println("Plazo: " + nmes + " meses");
                System.out.println("Tasa de interés nominal: " + tin + "%");
                System.out.println("Tasa de interés efectiva anual: " + String.format("%.2f", TEA) + "%");
                System.out.println("\nMes |  Cuota  | Capital | Interés | Seguro | Saldo restante");
                System.out.println("--------------------------------------------------------------");
            
                for (int mes = 1; mes <= nmes; mes++) {
                    double interes = saldoAleman * tim;
                    double seguro = saldoAleman * taseg;
                    double cuota = capitalMensual + interes + seguro;
                    saldoAleman -= capitalMensual;
            
                    totinte += interes;
                    totsegs += seguro;
                    totalPagado += cuota;
            
                    System.out.printf("%3d | %7.2f | %7.2f | %8.2f | %6.2f | %14.2f\n",
                            mes, cuota, capitalMensual, interes, seguro, Math.max(saldoAleman, 0));
                }
            
                System.out.println("\nResumen del crédito:");
                System.out.printf("Total capital pagado: %.2f\n", mon);
                System.out.printf("Total intereses pagados: %.2f\n", totinte);
                System.out.printf("Total seguros pagados: %.2f\n", totsegs);
                System.out.printf("Total a pagar: %.2f\n", totalPagado);
            break;
            default:
                System.out.println("Método de pago no válido.");
                break;
        }
        
    }

}
