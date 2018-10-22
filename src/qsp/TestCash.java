package qsp;

public class TestCash {

	public static void main(String[] args) {
		Cashier c=new Cashier();
		Money mn=new Money();
        c.giveToken(mn, "Roti");
		System.out.println(mn.value);

	}

}
