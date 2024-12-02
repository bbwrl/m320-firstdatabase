package ch.bbw.firstdatabase;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppService {

	private PlayerRepository playerRepository;

	@Autowired
	public AppService(PlayerRepository playerRepository) {
		this.playerRepository = playerRepository;
	}
	public List<Player> getPlayers() {
		return (ArrayList) playerRepository.findAll();
	}
	public Player getPlayer(long id) {
		return playerRepository.findById(id).get(); // Optional
	}
	public Player createPlayer(Player player) {
		return playerRepository.save(player);
	}
	public void deletePlayer(long id) {
		playerRepository.deleteById(id);
	}
}
