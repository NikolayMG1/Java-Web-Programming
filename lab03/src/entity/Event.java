package entity;

import javax.sound.midi.Track;
import java.time.LocalDate;
import java.util.List;

public class Event {
    private Integer id;
    private String name;
    private Track track;
    private List<Team> teams;
    private LocalDate dateOfEvent;

}
