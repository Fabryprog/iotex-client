package org.fabryprog.iotex.rest.api.dto;

import java.io.Serializable;

/**
 * 
 * @author Fabrizio Spataro - Fabryprog <fabryprog@gmail.com>
 *
 */
public class SendTransferRequest implements IoTeXRequest, Serializable {
    private static final long serialVersionUID = 2486831182500464460L;

    private Integer version;
    private Long nonce;
    private String sender;
    private String recipient;
    private String amount;
    private String senderPubKey;
    private String payload;
    private Long gasLimit;
    private String gasPrice;
    private boolean isCoinbase;
    private String signature;
    
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Long getNonce() {
        return nonce;
    }

    public void setNonce(Long nonce) {
        this.nonce = nonce;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getSenderPubKey() {
        return senderPubKey;
    }

    public void setSenderPubKey(String senderPubKey) {
        this.senderPubKey = senderPubKey;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public Long getGasLimit() {
        return gasLimit;
    }

    public void setGasLimit(Long gasLimit) {
        this.gasLimit = gasLimit;
    }

    public String getGasPrice() {
        return gasPrice;
    }

    public void setGasPrice(String gasPrice) {
        this.gasPrice = gasPrice;
    }

    public boolean isIsCoinbase() {
        return isCoinbase;
    }

    public void setIsCoinbase(boolean isCoinbase) {
        this.isCoinbase = isCoinbase;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

}