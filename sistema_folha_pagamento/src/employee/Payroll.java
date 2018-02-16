package employee;

import java.util.ArrayList;

public class Payroll {
	
	private ArrayList<String> paymentAgenda = new ArrayList<String>();
	
	Payroll(){
		this.paymentAgenda.add("semanal 1 sexta");
		this.paymentAgenda.add("mensal $");
		this.paymentAgenda.add("semanal 2 sexta");
	}

	public ArrayList<String> getPaymentAgenda() {
		return paymentAgenda;
	}

	public void setPaymentAgenda(ArrayList<String> paymentAgenda) {
		this.paymentAgenda = paymentAgenda;
	}
	
	public void createNewPaymentAgenda(String paygenda) {
		this.paymentAgenda.add(paygenda);
	}

	@Override
	public String toString() {
		return "Payrolls:\n" + paymentAgenda + "\n";
	}
}
