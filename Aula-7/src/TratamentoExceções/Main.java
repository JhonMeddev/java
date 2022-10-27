package TratamentoExceções;

public class Main {

	public static void main(String[] args) {
		
		int [] numeros = {1,2,3};
		
		
		try {
			numeros[0] = numeros[0]/0;
			System.out.println(numeros[5]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Fora do limite");
			return;
		}
		catch (Exception e) {
			System.out.println("Ocorreu um problema: " + e.getMessage());
		}
		finally {
			System.out.println("Finalizando programa...");
		}

	}

}
