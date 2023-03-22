package org.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Service
@Slf4j
public class WebHookImpl implements WebHookService {
    @Autowired
    private WebHookRepo webHookRepo;

    @Override
    public void saveWebHook(WebHookRequest request, String token) {
        System.out.println("TOken: "+token);
        if(Objects.equals(token, "Bearer 1234")) {
//            WebHook webHook = new WebHook();
//            webHook.setAmount(request.getAmount());
//            webHook.setAccount_number(request.getAccount_number());
//            webHook.setOriginator_account_name(request.getOriginator_account_name());
//            webHook.setOriginator_account_number(request.getOriginator_account_number());
//            webHook.setOriginator_bank(request.getOriginator_bank());
//            webHook.setSession_id(request.getSession_id());
//            webHook.setTimestamp(LocalDateTime.now());
//            webHook.setReference(request.getReference());
//            webHook.setOriginator_narration(request.getOriginator_narration());
//            webHookRepo.save(webHook);
            webHookRepo.saveWebhook(request.getAccount_number(),request.getAmount(),request.getOriginator_account_name(),
                    request.getOriginator_account_number(), request.getOriginator_bank(),request.getOriginator_narration(),
                    request.getReference(), request.getSession_id(),new Date());
        }
        else {
            log.error("Invalid token");
        }

    }

    @Override
    public List<BigInteger> getIds() {
        return webHookRepo.getIds();
    }

    @Override
    public List<WalletPreviewDTO> getData() {
          return webHookRepo.getData();

    }

}
