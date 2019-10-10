import java.util.ArrayList;
import java.util.Arrays;
public class Control{

    public static boolean problema1(String palindromo){
        palindromo = palindromo.toLowerCase();
        palindromo = palindromo.replaceAll(" ", "");
        char[] palabra = palindromo.toCharArray();
        System.out.println(palindromo);
        for(int i=0; i<palabra.length; i++){
            if(palabra[i]!=palabra[palabra.length-1-i]){
       //         System.out.println(palabra[i]);
       //         System.out.println(palabra[palabra.length-1-i]);
                return false;
            }
        }
        
        return true;
    }
    public static boolean problema2(int[] ar, int n){
        for(int i=0;i<ar.length; i++){
            int a =ar[i];
            for(int j=0;j<ar.length; j++){
                int sum = a+ar[j];
                if(a+ar[j]==n){
                    return true;
                }
            }
        }
    return false;
    } 

    public static void problema3(int [] p3){
        int aux;
        int aux2;
        for(int i=0;i<p3.length; i++){
            int ord = p3[i];
            for(int j=0;j<p3.length; j++){
                if(ord>p3[j]){
                 aux=p3[i];   
                 aux2=p3[j];
                p3[i]=aux2;
                p3[j]=aux;
                System.out.println(ord);
                }
            }
     
        }
    }
    public static boolean problema4(int[] p4, int n){
        for(int i=0;i<p4.length; i++){
            int ar=p4[i];
            if(n==ar){
                return true;
            }
        }
        return false;
    }
    
    public static boolean problema5(int n){
        for(int i=3;i<n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    /*public static int[] problema6(int n){
        int[0]=2;   
        aux=1;
        for(int i=2;i<n;i++){
            for(int j=3;j<i;j++){
                if(i%j!=0){
                    int[aux]=j;
                    aux++;
                }
        }
        }
    }*/
    /*public static void main(String[] args) {
        String palinFalse = "batman";
        String palinTrue = "Anita lava la tina";
        System.out.println(problema1(palinFalse));
        System.out.println(problema1(palinTrue));
    
        int[] arNumeros = {1,4,3,64,5};
        int n = 70;
        System.out.println("problema2"+problema2(arNumeros, n));
    
        int [] arreglo ={3,9,3,2,6};
        System.out.println("problema3"+problema3(arreglo));
    }*/
    public static void main(String[] args) {
        String resultado = "";
        int[] desordenado = {9,8,7,6,5,4,3,2,1};
        int[] ordenado    = {1,2,3,4,5,6,7,8,9};
        int[] primos10 = {2,3,5,7};
        if(problema1("oso")==true && problema1("palabra")==false)resultado+="P1 bien\n";else resultado+="P1 mal\n";
        if(problema2(desordenado, 17)==true) resultado+="P2 bien\n";else resultado+="P2 mal\n";
        problema3(desordenado);
        if(Arrays.equals(desordenado,ordenado) == true)resultado+="P3 bien\n";else resultado+="P3 mal\n";
        if(problema4(desordenado,2)== true && problema4(desordenado,18)== false)resultado+="P4 bien\n";else resultado+="P4 mal\n";
        if(problema5(7)==true && problema5(6)==false)resultado+="P5 bien\n";else resultado+="P5 mal\n";
        //if(Arrays.equals(problema6(10), primos10) == true)resultado+="P6 bien\n";else resultado+="P6 mal\n";
        System.out.println(resultado);   
    }
}