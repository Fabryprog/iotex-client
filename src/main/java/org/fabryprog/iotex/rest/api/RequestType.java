package org.fabryprog.iotex.rest.api;

/**
 * 
 * @author Fabrizio Spataro - Fabryprog <fabryprog@gmail.com>
 *
 */
public enum RequestType {
    SEND_TRANSFER("Explorer.sendTransfer"),
    UNLOCK_WALLET("unlockWallet");
    
    private String method;

    RequestType(String method) {
        this.method = method;
    }

    public String getMethod() {
        return method;
    }
}
