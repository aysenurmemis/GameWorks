package �dev4;

public class GameManager implements IGameService{

	@Override
	public void addGame(Game game,Player player) {
		System.out.println(player.getFisrtname() + " "+ game.getName() + " oyununu sat�n ald�.");
	}

	@Override
	public void updateGame(Game game, Player player) {
		System.out.println(player.getFisrtname() + " " + game.getName() + " oyununu g�ncelledi." );
	}

	@Override
	public void deleteGame(Game game, Player player) {
		System.out.println(player.getFisrtname() + " " + game.getName() + " oyununu sildi." );
		
	}
	
}
