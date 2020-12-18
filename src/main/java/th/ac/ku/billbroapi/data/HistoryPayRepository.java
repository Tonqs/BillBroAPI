package th.ac.ku.billbroapi.data;

import org.springframework.data.jpa.repository.JpaRepository;
import th.ac.ku.billbroapi.model.HistoryPay;
import th.ac.ku.billbroapi.model.TaskParty;

import java.util.List;

public interface HistoryPayRepository extends JpaRepository<HistoryPay , Integer> {
    List<HistoryPay> findByHistoryPayID(int id);
}
