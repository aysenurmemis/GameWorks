package ödev4;

public class CampaignManager implements ICampaignService{

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println(campaign.getName() + " kampanyasý baþlamýþtýr.");	
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println(campaign.getName() + " kampanyasý silinmiþtir.");
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println(campaign.getName() + " kampanyasý güncellenmiþtir.");
	}

}
