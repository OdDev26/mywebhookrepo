package org.example;


import java.math.BigInteger;
import java.util.List;

public interface WebHookService {
    void saveWebHook(WebHookRequest request, String token);
    List<BigInteger> getIds();

    List<WalletPreviewDTO> getData();
}
