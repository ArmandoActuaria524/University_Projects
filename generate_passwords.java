import java.util.*;


public class Actividad1{

//Programa que genera contraseñas aleatoriamente

   public static void main(String[] args) {
      
         //Las contraseñas se generarán de manera aleatoria
      Random aleatorios= new Random();

         //Establecemos variables de tipo String para generar los caracteres de contraseña
      String   mayusculas="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
   
      String min="abcdefghijklmnopqrstuvwxyz";
      String especiales="*#$&+?%";
      String numeros="0123456789";
   
      int contador=0;


      //Este while nos va a generar las diez contraseñas

      while(contador<10){
      //Dentro de este bucle establecieron dos variables de tipo String 
      String password=""; //Servira para meter los string de Mayusculas, minusculas, especiales y numeros
      String password2="";//Servira para generar de manera aleatoria las contraseñas
      
            //Las siguientes variables de tipo entera nos van a generar las mayusculas, minusculas y numeros
         int   random_cantidadMay=aleatorios.nextInt(2)+1; //Nos dara el numero de mayusculas en nuestras contraseñas
         int random_letraMay=aleatorios.nextInt(26); //Será para establecer una mayuscula en las contraseñas
         int random_letraMay2=aleatorios.nextInt(26);//Será para establecer 2 mayusculas en las contraseñas
         

         int random_cantidadespecial=aleatorios.nextInt(1)+1;//Nos generará un especial en las contraseñas
         int random_especiales=aleatorios.nextInt(7);//Escogera entre los 7 caracteres especiales que hay



         int random_cantidadNum=aleatorios.nextInt(2)+1;//Nos dara la cantidad de numeros en las contraseñas
         int random_numeros=aleatorios.nextInt(10);//Nos dara un numero
         int random_numeros2=aleatorios.nextInt(10);//Nos dará dos numeros

            //El primer if será para establecer contraseñas debiles (Una mayuscula y un número)
         if((random_cantidadMay==1)&&(random_cantidadNum==1)){
            
            System.out.println("La contraseña es debil:");

              password+=mayusculas.charAt(random_letraMay);
              password+=numeros.charAt(random_numeros);
         
              //Este if servira para generar contraseñas (dificultad media) con dos mayusculas y un numero

         }  if((random_cantidadMay==2)&&(random_cantidadNum==1)){
            System.out.println("La contraseña es de media:");
             password+=mayusculas.charAt(random_letraMay);
              password+=mayusculas.charAt(random_letraMay2);

              password+=numeros.charAt(random_numeros);
         
         }
          //Este if servira para generar contraseñas (dificultad media) con dos numeros y una mayusculas

         else  if((random_cantidadNum==2)&&(random_cantidadMay==1)){
               System.out.println("La contraseña es de media:");

            password+=numeros.charAt(random_numeros);
            password+=numeros.charAt(random_numeros2);
            password+=mayusculas.charAt(random_numeros);

         //Este if servira para generar contraseñas (dificultad alta) con dos mayusculas y dos numeros

         }  if((random_cantidadMay==2)&&(random_cantidadNum==2)){
         
         System.out.println("La contraseña es de alta");
         password+=mayusculas.charAt(random_letraMay);
         password+=numeros.charAt(random_numeros);

         password+=mayusculas.charAt(random_letraMay2);
         password+=numeros.charAt(random_numeros2);

         
               //Este if agrega el caracter especial a nuestras contraseñas
          }  if(random_cantidadespecial==1){

            password+=especiales.charAt(random_especiales);
               

               }else if(random_cantidadespecial==2){
             password+=especiales.charAt(random_especiales);}
      

               //El siguiente ciclo anidado en otro nos generará las minusculas en los espacios que faltan
               while(password.length()<8){

               
                  int random_letramin=aleatorios.nextInt(26);
                  
                     password+=min.charAt(random_letramin);
                  

               }


               /*El siguiente bucle anidado junto con un substring  nos ayudará a generar
               de manera aleatoria los caracteres de la contraseña
               Y aquí usamos los Strings que establecimos al principio del ciclo*/
      int i , j;
         for (i=password.length();i>=2 ;i-- ) {

            j = (int)(Math.random()* i+1) ;
           password2 = password2 + password.substring(j-1,j);
            password=  password.substring(0,j-1)+password.substring(j,i);
         

         }
         //Despues creamos una nueva variable de tipo string para sumar las otras dos
         String resultado=password+password2;


      

         
         //Y por ultimo imprimimos nuestras contraseñas :)
         System.out.println(resultado);
         
      

      contador++;


      

      }

      

   

 }
}


/*int [] v1={23,55,77,45,86,12};
   

      for (int i = 0; i < v1.length; i++) {
        for (int j = 0; j < v1.length-i-1; j++) {
            if(v1[j] < v1[j+1]){
                int a = v1[j+1];
                v1[j+1] = v1[j];
                v1[j] = a;
            }
        }
    }*/

       // System.out.println(Arrays.toString(v1));
