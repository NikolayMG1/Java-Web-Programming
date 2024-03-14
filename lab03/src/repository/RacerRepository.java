package repository;

import entity.Racer;

import java.util.Map;
import java.util.Optional;

public class RacerRepository {
    // structure to store your Racers
    private Map<Integer, Racer> racerTable;
    private static Integer sequence = 1000;

    /**
     * Add racer to your DB
     * @param racer
     */
    public void addRacer(Racer racer) {
        if(racer.getId() != null){
            throw new IllegalArgumentException("Cannot create Racer with existing ID");
        }
        racer.setId(sequence++);
        racerTable.put(racer.getId(), racer);
    }

    /**
     * Modify racer to your DB
     * @param racer
     */
    public void updateRacer(Racer racer) {
        if(racer.getId() != null){
            throw new IllegalArgumentException("Cannot modify Racer with not existing ID");
        }
        racer.setId(sequence++);
        racerTable.put(racer.getId(), racer);
    }

    /**
     * Delete racer by id. If there is no element to be deleted then return false;
     * @param id
     * @return if there is element to delete -> true, if not -> false
     */
    public boolean deleteRacerById(Integer id) {
        return racerTable.remove(id) != null;
    }

    /**
     * Get racer by passed id. If there is no element return Optional empty
     * @param id
     * @return Optional of Racer
     */
    public Optional<Racer> getRacerById(Integer id) {
        return Optional.of(racerTable.get(id));
    }
}
