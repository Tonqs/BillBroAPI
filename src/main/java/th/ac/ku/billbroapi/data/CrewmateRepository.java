package th.ac.ku.billbroapi.data;

import org.springframework.data.jpa.repository.JpaRepository;
import th.ac.ku.billbroapi.model.Crewmate;
import th.ac.ku.billbroapi.model.TaskParty;

import java.util.List;

public interface CrewmateRepository extends JpaRepository<Crewmate ,Integer > {
    List<Crewmate> findByCrewmateID(int id);
}
