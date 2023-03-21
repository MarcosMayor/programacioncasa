import java.util.Scanner;

public class ordenanum 
{

	public static void main(String[] args) 
	{
		Scanner tc= new Scanner(System.in);
		int nnum,aux,max,i;
		
		do {
			System.out.print("Ingresa la cantidad de numeros a introducir: ");
			nnum = tc.nextInt();
		} while (nnum<=0);
			
		max=0;
		i=1;
		
		while(i<=nnum)
		{
			System.out.print("Introduce el numero (" + i +") : ");
			aux = tc.nextInt();
			
			if(max < aux)
			{
				max = aux;
			}
			i++;
		}
		
		System.out.println("El numero mayor es: "+max);
		tc.close();
	}

}
