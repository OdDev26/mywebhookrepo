package org.example;

import org.example.WebHook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Repository
public interface WebHookRepo extends JpaRepository<WebHook, Long> {
    @Query(value = "select id from webhook",nativeQuery = true)
    List<BigInteger> getIds();
    @Query(value = "select we.timestamp, we.amount  from `webhook`.webhook we join `persist_africa`.pa_sec_users pas on we.timestamp = pas.date_created;",nativeQuery = true)
    List<WebhookDTO> getDates();
    @Query(value = "SELECT vwp.WALLET_ID as walletId, vwp.PRODUCT_NAMES as productNames, vwp.PROD_UAT as prodUAT,vwp.DATE_CREATED as dateCreated, vwi.WALLET_NAME as walletName, vmi.MERCHANT_NAME as merchantName FROM VBAAS_WALLET_PREVIEW vwp INNER JOIN VBAAS_WALLET_IDENTIFIERS vwi ON vwp.WALLET_ID = vwi.ID INNER JOIN VBAAS_MERCHANT_IDENTIFIERS vmi ON vmi.ID= vwi.MERCHANT_ID;",nativeQuery = true)
    List<WalletPreviewDTO> getData();
    @Modifying
    @Transactional
    @Query(value = "insert into webhook.webhook (account_number, amount, originator_account_name, originator_account_number\n" +
            ",originator_bank,originator_narration,reference,session_id ,`timestamp`) VALUES(?1, ?2, ?3, ?4, ?5, ?6, ?7, ?8, ?9)",nativeQuery = true)
    void saveWebhook(String accountNo, String amount, String originatorAccountName, String originatorAccountNo,
                     String originatorBank, String originatorNarration, String reference, String sessionId, Date date);
}
