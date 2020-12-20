package th.ac.ku.billbroapi.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import th.ac.ku.billbroapi.model.Crewmate;

import java.util.List;

@Repository
public interface CrewmateRepository extends
        JpaRepository<Crewmate ,Integer > {
    List<Crewmate> findByCmId(int cm_id);
}
