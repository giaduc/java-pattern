package pattern.builder;

public class BankAccount {

	private String name;
	private String accountNumber;
	private String email;
	private boolean newsletter;

	private BankAccount() {
	}

	private BankAccount(BankAccountBuilder builder) {
		this.name = builder.name;
		this.accountNumber = builder.accountNumber;
		this.email = builder.email;
		this.newsletter = builder.newsletter;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isNewsletter() {
		return newsletter;
	}

	public void setNewsletter(boolean newsletter) {
		this.newsletter = newsletter;
	}

	@Override
	public String toString() {
		return "BankAccount [name=" + name + ", accountNumber=" + accountNumber + ", email=" + email + ", newsletter="
				+ newsletter + "]";
	}

	public static class BankAccountBuilder {
		private String name;
		private String accountNumber;
		private String email;
		private boolean newsletter;

		public BankAccountBuilder(String name, String accountNumber) {
			this.name = name;
			this.accountNumber = accountNumber;
		}

		public BankAccountBuilder withEmail(String email) {
			this.email = email;
			return this;
		}

		public BankAccountBuilder withNewsLetter(boolean newsletter) {
			this.newsletter = newsletter;
			return this;
		}

		public BankAccount build() {
			return new BankAccount(this);
		}
	}

}
