package �dev4;


public class PlayerManager implements IPlayerService {

	 MernisManager mernisManager;
			
	 public PlayerManager(MernisManager mernisManager) {
		this.mernisManager = mernisManager;
	 }


	@Override
	public void addPlayer(Player player) {
		
				if(mernisManager.mernisManager(player)) {
					this.addPlayer(player);
					System.out.println(player.getFisrtname() + " "+player.getLastName()+ 
							" sistemimize kaydoldu.");
				}
				else {
					System.out.println(player.getFisrtname() + " "+player.getLastName()+ 
							" sistemimize kaydolamad�.");

			}
			
	}

	@Override
	public void update(Player player) {

		System.out.println(player.getFisrtname()+" "+player.getLastName()+ " bilgileriniz sistemimizde g�ncellendi.");	
	}

	@Override
	public void delete(Player player) {
		System.out.println(player.getFisrtname()+" "+player.getLastName()+ " sistemimizde silindi.");	
		
	}

}
