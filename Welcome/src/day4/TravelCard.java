package day4;

public class TravelCard extends Prepaidcard {
        private double rewardPoint;
		private int count;

		public double getRewardPoint() {
			return rewardPoint;
		}

		public int getCount() {
			return count;
		}

		private double calculateRewardPoint(double amount) {
			double count = amount / 100;
			rewardPoint = count * 5;
			return rewardPoint;
		}

		boolean swipeCard(double amount) 
		{
			PrepaidCard p= new PrepaidCard();
			count++;
			double INR = amount * 60;
			double charges = (INR * 5) / 100;
			INR = INR + charges;
			double balance = p.getAvailableBalance();
			if ( balance> INR && count<= p.getSwipeLimit() ) {
				balance = balance - INR;
				System.out.println("Withdraw amount " + INR + " and Charges " + charges);
				calculateRewardPoint(INR);
				p.setAvailableBalance(balance);
				return true;
			}
			return false;
		}

	 

}
