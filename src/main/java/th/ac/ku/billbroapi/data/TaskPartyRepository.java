package th.ac.ku.billbroapi.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import th.ac.ku.billbroapi.model.TaskParty;

import java.util.List;

@Repository
public interface TaskPartyRepository extends JpaRepository<TaskParty, Integer> {
    List<TaskParty> findBycId(int c_id);
}
