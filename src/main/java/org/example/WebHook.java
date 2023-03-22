package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "webhook")
@Data
@NoArgsConstructor
public class WebHook {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true)
    private String  reference;
    private String  amount;
    private String  account_number;
    private String originator_account_number;
    private String originator_account_name;
    private String originator_bank;
    private String originator_narration;
    @Column(unique = true)
    private String session_id;
    private Date timestamp;

    public WebHook(String reference, String amount, String account_number, String originator_account_number, String originator_account_name, String originator_bank, String originator_narration, String session_id, Date timestamp) {
        this.reference = reference;
        this.amount = amount;
        this.account_number = account_number;
        this.originator_account_number = originator_account_number;
        this.originator_account_name = originator_account_name;
        this.originator_bank = originator_bank;
        this.originator_narration = originator_narration;
        this.session_id = session_id;
        this.timestamp = timestamp;
    }

}
