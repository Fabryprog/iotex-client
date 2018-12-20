# IoTeX Java Client

**Note: This project is a POC**

## Usage

```
IoTeXClient client = new IoTeXClient("http://localhost:14004", "http://localhost:4004/api/wallet");

client.sendTransfer(PRIVATE_KEY, CHAIN_ID, RECIPIENT, 1);
```

## Test JUnit

```
mvn clean test
```

## Roadmap

### Account

Done:
* unlockWallet

TODO
* ...

### Explorer

Done:
* sendTransfer

TODO
* ...
