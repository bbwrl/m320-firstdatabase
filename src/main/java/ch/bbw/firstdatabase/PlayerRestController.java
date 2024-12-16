package ch.bbw.firstdatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class PlayerRestController {

    private final AppService service;

    @Autowired
    public PlayerRestController(AppService service) {
        this.service = service;
    }

    @GetMapping("players")
    public List<Player> getPlayers() {
        return service.getPlayers();
    }

    @GetMapping("players/{id}")
    public Player getPlayer(@PathVariable long id) {
        return service.getPlayer(id);
    }

}


