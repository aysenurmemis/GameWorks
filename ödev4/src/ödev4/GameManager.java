package ödev4;

public class GameManager implements IGameService{

	@Override
	public void addGame(Game game,Player player) {
		System.out.println(player.getFisrtname() + " "+ game.getName() + " oyununu satýn aldý.");
	}

	@Override
	public void updateGame(Game game, Player player) {
		System.out.println(player.getFisrtname() + " " + game.getName() + " oyununu güncelledi." );
	}

	@Override
	public void deleteGame(Game game, Player player) {
		System.out.println(player.getFisrtname() + " " + game.getName() + " oyununu sildi." );
		
	}
	
}
