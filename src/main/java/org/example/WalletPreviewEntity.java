package org.example;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@Table(name = "VBAAS_WALLET_PREVIEW")
public class WalletPreviewEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "WALLET_ID")
    private Long walletId;
    @Column(name = "USER_ID")
    private String userId;
    @Column(name = "BILLING_ACCOUNT")
    private String billingAccount;
    @Column(name = "PRODUCT_IDS")
    private String productIds;
    @Column(name = "PRODUCT_NAMES")
    private String productNames;
    @Column(name = "PROD_UAT")
    private String prodUAT;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "DATE_CREATED")
    private Date dateCreated;
    @Column(name = "DATE_MODIFIED")
    private Date dateModified;
}
