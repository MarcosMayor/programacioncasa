import java.util.Scanner;

public class Vectores1 {

	public static void main(String[] args) {
		int[] categoria= {0,0,0,0,0};
        Scanner sc=new Scanner(System.in);
        Integer num=0;
        String dato="";
        final String FIN="Fin";
        do{
            do{
                try {
                    System.out.print("Inserte la categoria (1 A, 2 B, 3 C, 4 D, 5 E) o \"Fin\" para acabar: ");
                    dato=sc.nextLine();
                    if(!dato.equals(FIN)) {
                    	num=Integer.parseInt(dato);
                    }
                } catch (NumberFormatException e) {
                    System.err.println("Dato incorrecto");
                    num=0;
                }
            }while(num<0 && num>5);

            switch(num){
                case 1:
                    categoria[0]++;
                    break;
                case 2:
                    categoria[1]++;
                    break;
                case 3:
                    categoria[2]++;
                    break;
                case 4:
                    categoria[3]++;
                    break;
                case 5:
                    categoria[4]++;
                    break;    
            }
        }while(!dato.equals(FIN));

        name(categoria);
        
        int mayor=0, menor=categoria[0], total=0;
        for(int i=0;i<categoria.length;i++){//Solo aprecia el primer mayor y menor
        	if(categoria[i]>mayor) {
        		mayor=categoria[i];
        	} else if(categoria[i]<menor) {
        		menor=categoria[i];
        	}
        	total+=categoria[i];
        }
        System.out.println("La que mas tiene cuenta con "+mayor+" casas y la que menos con "+menor);        
        System.out.print("El total de visitas es de "+total);
        
        sc.close();
	}

	private static void name(int[] categoria) {
		for(int i=0;i<categoria.length;i++){
        	switch(i){
        	case 0:
                System.out.print("Hay "+categoria[i]+" casas de categoria A, " );
                break;
            case 1:
            	System.out.print("hay "+categoria[i]+" casas de categoria B, " );
                break;
            case 2:
            	System.out.print("hay "+categoria[i]+" casas de categoria C, " );
                break;
            case 3:
            	System.out.print("hay "+categoria[i]+" casas de categoria D y " );
                break;
            case 4:
            	System.out.println("hay "+categoria[i]+" casas de categoria E, " );
                break;    
        	}
        }
	}

}
