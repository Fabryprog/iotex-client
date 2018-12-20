package org.fabryprog.iotex.rest.api;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.fabryprog.iotex.rest.api.dto.SendTransferRequest;
import org.fabryprog.iotex.rest.api.dto.WalletRequest;
import org.fabryprog.iotex.rest.api.dto.WalletResponse;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

/**
 * 
 * @author Fabrizio Spataro - Fabryprog <fabryprog@gmail.com>
 *
 */
public class IoTeXClient {
    
    private final String uri;
    private final String walletUri;
    
    public IoTeXClient(String uri, String walletUri) {
        this.uri = uri;
        this.walletUri = walletUri;
    }
    
    public void sendTransfer(String privateKey, Integer chainId, String recipient, Integer amount) throws UnirestException, IOException {
        this.sendTransfer(privateKey, chainId, recipient, amount, 0, 1000000L);
    }
    
    public void sendTransfer(String privateKey, Integer chainId, String recipient, Integer amount, Integer gasPrice, Long gasLimit) throws UnirestException, IOException {
        WalletRequest walletReq = new WalletRequest();
        walletReq.setPriKey(privateKey);
        walletReq.setChainId(chainId);
        
        HttpResponse<JsonNode> resp = Unirest.post(this.walletUri + "/" + RequestType.UNLOCK_WALLET.getMethod()).header("Content-Type",  "application/json").body(RequestUtils.json(walletReq)).asJson();

        System.out.println("1. " + IOUtils.toString(resp.getRawBody()));
        WalletResponse walletResp = new WalletResponse().parse(resp.getBody());

        SendTransferRequest req = new SendTransferRequest();
        req.setVersion(1);
        req.setIsCoinbase(false);
        req.setSignature("");
        req.setPayload("");
        
        req.setSender(walletResp.getRawAddress());
        req.setSenderPubKey(walletResp.getPublicKey());
        req.setRecipient(recipient);
        req.setAmount(String.valueOf(amount));
        req.setGasPrice(String.valueOf(gasPrice));
        req.setGasLimit(gasLimit);
        
        req.setNonce(1L); //default?
        
        resp = Unirest.post(this.uri).header("Content-Type",  "application/json").body(RequestUtils.jsonrpc(RequestType.SEND_TRANSFER, req)).asJson();
        System.out.println("2. " + IOUtils.toString(resp.getRawBody()));
    }
}
