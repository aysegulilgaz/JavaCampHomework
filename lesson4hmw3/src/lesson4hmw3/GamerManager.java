package lesson4hmw3;

public class GamerManager implements GamerService {

	private GamerCheckService _gamerCheckService;
	
		
	public GamerManager(GamerCheckService gamerCheckService) {
		super();
		_gamerCheckService = gamerCheckService;
	}

	
	@Override
	public void add(Gamer gamer) throws Exception {
		if(_gamerCheckService.CheckIfRealPerson(gamer))
		{
			System.out.println("Oyuncu eklendi : " + gamer.getNickName());
		}
		else
		{
			throw new Exception("Not a valid person");
		}
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyuncu güncellendi : " + gamer.getNickName());
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu silindi : " + gamer.getNickName());
	}

	@Override
	public void saleGame(Gamer gamer, Game game) {
		System.out.println(game.getGameName() + " oyunu " + gamer.getNickName() + " tarafından satın alındı.");
	}

	
	
}
