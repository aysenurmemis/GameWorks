package �dev4;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Player player1 = new Player(1,"Ay�enur","Memi�",new Date(1999),"TC K�ML�K");
		Player player2 = new Player(2,"Ahmet","Memi�",new Date(2000),"TC K�ML�K");
		
		Game game1 = new Game(1,"PUBG",304);
		Game game2 = new Game(2,"CS:GO",416);
		
		Campaign campaign1 = new Campaign(1,"�lk Kay�t �ndirim",15);
		Campaign campaign2 = new Campaign(2,"Sezon Ba�lang�� �ndirim",10);
		
		Game[] games = {game1,game2};
		for (Game game : games) {
			System.out.println("Mevcut oyun : " + game.getName()+ "  ve fiyat� : "+ game.getPrice());
		}
		System.out.println("--------------------------");
		SaleManager saleManager = new SaleManager();
		saleManager.sale(game1, campaign1);
		saleManager.sale(game2, campaign1);
		saleManager.sale(game1, campaign2);
		saleManager.sale(game2, campaign2);
		
		System.out.println("--------------------------");
		
		PlayerManager playerManager = new PlayerManager(new MernisManager());
		playerManager.addPlayer(player1);
		playerManager.addPlayer(player2);
		playerManager.delete(player2);
		playerManager.update(player1);
		
		System.out.println("--------------------------");

		GameManager gameManager= new GameManager();
		gameManager.addGame(game1, player1);
		gameManager.addGame(game2, player2);
		gameManager.updateGame(game1, player2);
		
	}

	

}
