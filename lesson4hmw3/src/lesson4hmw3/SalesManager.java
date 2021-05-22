package lesson4hmw3;

public class SalesManager implements SalesService{

	private GamerService _gamerService;
	
	
	public SalesManager(GamerService _gamerService) {
		super();
		this._gamerService = _gamerService;
	}


	@Override
	public void sale(Game game, Gamer gamer, Campaign campaign) {
		
		double gamePrice;
		
		gamePrice = game.getPrice()-(game.getPrice()*campaign.getDiscountPercent()); 
		
		game.setPrice(gamePrice);
				
		System.out.println("Oyunun kampanyadaki fiyatı : " + gamePrice + "₺");
		_gamerService.saleGame(gamer, game);
	}

}
