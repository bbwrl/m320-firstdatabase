package ch.bbw.firstdatabase;

import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;

@Setter
@Getter
@Entity
public class Player {
	
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String name;
}
