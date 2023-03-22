package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public interface WebhookDTO {
    @JsonProperty("amount")
    String getAmount();

    @JsonProperty("timestamp")
    Date getTimeStamp();
}
