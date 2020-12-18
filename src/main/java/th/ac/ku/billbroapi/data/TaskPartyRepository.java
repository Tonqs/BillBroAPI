package th.ac.ku.billbroapi.data;

import org.springframework.data.jpa.repository.JpaRepository;
import th.ac.ku.billbroapi.model.TaskParty;

import java.util.List;

public interface TaskPartyRepository extends JpaRepository<TaskParty, Integer> {
    List<TaskParty> findByTaskPartyID(int id);
}
