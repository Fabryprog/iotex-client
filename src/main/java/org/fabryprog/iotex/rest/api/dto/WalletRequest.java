package org.fabryprog.iotex.rest.api.dto;

import java.io.Serializable;

/**
 * 
 * @author Fabrizio Spataro - Fabryprog <fabryprog@gmail.com>
 *
 */
public class WalletRequest implements IoTeXRequest, Serializable {
    private static final long serialVersionUID = -7397112200984528661L;

    private String priKey;
    private Integer chainId;

    public String getPriKey() {
        return priKey;
    }

    public void setPriKey(String privKey) {
        this.priKey = privKey;
    }

    public Integer getChainId() {
        return chainId;
    }

    public void setChainId(Integer chainId) {
        this.chainId = chainId;
    }

//    @Override
//    public String toRequest() {
//        return null;
//    }

}
