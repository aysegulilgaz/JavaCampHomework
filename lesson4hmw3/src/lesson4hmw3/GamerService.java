package lesson4hmw3;

public interface GamerService {
	
	void add(Gamer gamer) throws Exception;
	
	void update(Gamer gamer);
	
	void delete(Gamer gamer);
	
	void saleGame(Gamer gamer, Game game);
	
	
}
