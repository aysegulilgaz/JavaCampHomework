package lesson4hmw3;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Gamer xyz = new Gamer(1, "ayşegül", "ılgaz", "ilgaz", "12345678901", "2000", "123qwe");		
		GamerManager gamerManager = new GamerManager(new MernisServisAdapter());
		gamerManager.add(xyz);
		
		
		Game nfs = new Game(1, "NFS", 50.25);
		Game sims = new Game(2, "SIMS", 100);
		Game[] games = {nfs, sims};
		GameManager gameManager = new GameManager();
		gameManager.addMultiple(games);
	
		
		
		Campaign newYear = new Campaign(1, "New Year", 0.5);
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(newYear);
		
		
		SalesManager salesManager = new SalesManager(gamerManager);
		salesManager.sale(sims, xyz, newYear);
		
		System.out.println("------------------");
		gameManager.delete(nfs);
		gamerManager.update(xyz);
		campaignManager.update(newYear);
	
	}
	
}
