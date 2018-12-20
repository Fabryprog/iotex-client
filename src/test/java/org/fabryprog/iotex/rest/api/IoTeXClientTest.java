package org.fabryprog.iotex.rest.api;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;

import com.mashape.unirest.http.exceptions.UnirestException;

/**
 * 
 * @author Fabrizio Spataro - Fabryprog <fabryprog@gmail.com>
 *
 */
public class IoTeXClientTest {
    private static final String URI = "http://fabryprog-iotex.eye.rs:14004";
    private static final String WALLET_URI = "https://iotexscan.io/api/wallet";

    private static final String RECIPIENT = "io1qyqsqqqqcz8twkf0v55y04jr8cwmfk7q3lgjycyzjq0tx4";
    private static final String PRIVATE_KEY = "4b5756e2971b4b506094ea64d70ab994d1e0c08254c9f8135d86dc4301e2a3c5b1805d00";
    private static final Integer CHAIN_ID = 1;

    @Test
    public void shouldDone() throws UnirestException, IOException {
        IoTeXClient client = new IoTeXClient(URI, WALLET_URI);

        client.sendTransfer(PRIVATE_KEY, CHAIN_ID, RECIPIENT, 1);

        assertTrue(true);
    }
}
