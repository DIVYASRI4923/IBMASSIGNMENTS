package day3ass;

public class Customer {
	
		private String customerName;
		private Adress residentialAddress;

		public Customer() {

		}

		public Customer(String customerName, Adress residentialAddress) {
			this.customerName = customerName;
			this.residentialAddress = residentialAddress;
		}

		public String getCustomerName() {
			return customerName;
		}

		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}

		public Adress getResidentialAddress() {
			return residentialAddress;
		}

		public void setResidentialAddress(Adress residentialAddress) {
			this.residentialAddress = residentialAddress;
		}
		
		public String getCustomerDetails() {
			return "Customer : "+customerName+"\n Residential Address : "+residentialAddress;
		}

	}

