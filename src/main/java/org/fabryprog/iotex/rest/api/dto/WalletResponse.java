package org.fabryprog.iotex.rest.api.dto;

import java.io.Serializable;

import com.mashape.unirest.http.JsonNode;

/**
 * 
 * @author Fabrizio Spataro - Fabryprog <fabryprog@gmail.com>
 *
 */
public class WalletResponse implements IoTeXResponse, Serializable {
    private static final long serialVersionUID = -7397112200984528661L;

    private String publicKey;
    private String privateKey;
    private String rawAddress;

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public String getRawAddress() {
        return rawAddress;
    }

    public void setRawAddress(String rawAddress) {
        this.rawAddress = rawAddress;
    }
    
    public WalletResponse parse(JsonNode node) {
        if(node.getObject().get("wallet") != null) {
            this.publicKey = node.getObject().getJSONObject("wallet").getString("publicKey");
            this.privateKey = node.getObject().getJSONObject("wallet").getString("privateKey");
            this.rawAddress = node.getObject().getJSONObject("wallet").getString("rawAddress");
        } 
        
        return this;
    }

}
