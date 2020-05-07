package cliente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Programa {

	public static void main(String args[]) throws IOException {
		
        String aCard = "";

        if (args.length > 0)
            aCard = args[0];
        else {
            BufferedReader input = new BufferedReader(new InputStreamReader(
                    System.in));
            System.out.print("Número do cartão: ");
            aCard = input.readLine();
        }
        if (getCardID(aCard) > -1) {
            System.out.println("Este cartão é um " + getCardName(getCardID(aCard)) + ".");
            System.out.println("O cartão de número " + aCard + " é " + (validCC(aCard) ? "bom." : "ruim."));
        } else
            System.out.println("Esse cartão não é válido ou não é suportado!");
    }

	private static boolean validCC(String aCard) {
		// TODO Auto-generated method stub
		return false;
	}

	private static String getCardName(int cardID) {
		// TODO Auto-generated method stub
		return null;
	}

	private static int getCardID(String aCard) {
		// TODO Auto-generated method stub
		return 0;
	}

}
