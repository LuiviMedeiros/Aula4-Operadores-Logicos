package digital.one;

public class Main {
    public static void main (String[] args){

        int i1 = 10;
        int i2 = 20;

        float f1 = 4.5f;
        float f2 = 3.5f;

        double d1 = 59.6d;
        char c1 = 'x';
        char c2 = 'y';

        String s1 = "Fulano";
        String s2 = "Fulano";
        String s3 = "Cicrano";


        long l1 = 1597L;
        long l2 = 8987L;
        byte by1 = 1;
        short sh1 = 25;


        //Similariedade
        System.out.println("i1 é igual a i2 = " + (i1 == i2));
        System.out.println("i1 é diferente de i2 = " + (i1 != i2));

        //Tamanho
        System.out.println("f1 é maior que f2 = " + (f1 > f2));
        System.out.println("by1 é maior ou igual a sh1 = " + (by1 >= sh1));
        System.out.println("l1 é menor que l2 = " + (l1 < l2));
        System.out.println("l1 é menor ou igual a d1 = " + (l1 < d1));

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        System.out.println("b1 && b2 = " + (b1 && b2));
        System.out.println("b3 && b4 = " + (b3 && b4));

        System.out.println("b1 || b2 = " + (b1 || b2));
        System.out.println("b3 || b4 = " + (b3 || b4));

        System.out.println("b1 ^ b2 = " + (b1 ^ b2));
        System.out.println("b3 ^ b4 = " + (b3 ^ b4));

        System.out.println(!b1);
        System.out.println(!b2);

        System.out.println("((i1 + i2) < (f1 + f2)) && true " + (((i1 + i2) < (f1 + f2)) && true));
        System.out.println("((i1 > i2) || (f1 < f2)) || " + ((i1 > i2) || (f1 < f2)));

        double salarioMensal = 11893.58d;
        double mediaSalario = 10500d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        System.out.println((salarioMensal < mediaSalario)&&(quantidadeDependentes >= mediaDependentes));

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        System.out.println((salarioBaixo)&&(muitosDependentes));

        boolean recebeAuxilio = (salarioBaixo)&&(muitosDependentes);
        System.out.println("recebe auxilio " + recebeAuxilio);



    }
}
