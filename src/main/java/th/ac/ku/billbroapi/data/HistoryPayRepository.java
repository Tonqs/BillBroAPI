package th.ac.ku.billbroapi.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import th.ac.ku.billbroapi.model.HistoryPay;

import java.util.List;

@Repository
public interface HistoryPayRepository extends
        JpaRepository<HistoryPay , Integer> {
    List<HistoryPay> findByCmId(int cm_id);
}
