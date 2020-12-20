package th.ac.ku.billbroapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HistoryPay {
    @Id
    @GeneratedValue(strategy  = GenerationType.IDENTITY)
    private int hpId;

    private double hp_dept;
    private double hp_payed;

    public HistoryPay() {
    }

    public HistoryPay(int hp_id, double hp_dept, double hp_payed) {
        this.hpId = hp_id;
        this.hp_dept = hp_dept;
        this.hp_payed = hp_payed;
    }

    public void setHp_dept(double hp_dept) {
        this.hp_dept = hp_dept;
    }

    public void setHp_payed(double hp_payed) {
        this.hp_payed = hp_payed;
    }

    public int getHpId() {
        return hpId;
    }

    public double getHp_dept() {
        return hp_dept;
    }

    public double getHp_payed() {
        return hp_payed;
    }

    @Override
    public String toString() {
        return "HistoryPay{" +
                "hpId=" + hpId +
                ", hp_dept=" + hp_dept +
                ", hp_payed=" + hp_payed +
                '}';
    }
}
