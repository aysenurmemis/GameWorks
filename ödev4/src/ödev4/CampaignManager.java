package �dev4;

public class CampaignManager implements ICampaignService{

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println(campaign.getName() + " kampanyas� ba�lam��t�r.");	
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println(campaign.getName() + " kampanyas� silinmi�tir.");
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println(campaign.getName() + " kampanyas� g�ncellenmi�tir.");
	}

}
