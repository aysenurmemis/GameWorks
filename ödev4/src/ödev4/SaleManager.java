package ödev4;

public class SaleManager {
	
	public void sale(Game game, Campaign campaign) {
		double afterPrice = game.getPrice()-(game.getPrice()*campaign.getSale()/100);
		System.out.println(game.getName()+ " oyununda "+campaign.getName() + "li fiyatý: " +afterPrice);
		}

}
