package CuentaBancaria_setandget;

public class CuentaBancaria_main_setandget {

	public static void main(String[] args) {
		CuentaBancaria cb = new CuentaBancaria();
		cb.setSaldo(cb.getsaldo());
		cb.settitular(cb.gettitular());
		System.out.println("el saldo de la tarjeta es " + cb.getsaldo());
		System.out.println("el titular de la tarjeta es " + cb.gettitular());

	}

}
