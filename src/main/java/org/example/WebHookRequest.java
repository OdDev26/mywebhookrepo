package org.example;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class WebHookRequest {
    private String  reference;
    private String  amount;
    private String  account_number;
   private String originator_account_number;
    private String originator_account_name;
    private String originator_bank;
    private String originator_narration;
    private String session_id;
    private String timestamp;
}
