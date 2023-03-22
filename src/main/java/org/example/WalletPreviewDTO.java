package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public interface WalletPreviewDTO {
    @JsonProperty("merchantName")
    String getMerchantName();
    @JsonProperty("walletName")
    String getWalletName();
    @JsonProperty("walletId")
    String getWalletId();
    @JsonProperty("productNames")
    String getProductNames();
    @JsonProperty("prodUAT")
    String getProdUAT();
    @JsonProperty("dateCreated")
    Date getDateCreated();
}
