# IoTeX Java Client

**Note: This project is a POC**

## Usage

```
IoTeXClient client = new IoTeXClient("http://localhost:14004", "http://localhost:4004/api/wallet");

client.sendTransfer(PRIVATE_KEY, CHAIN_ID, RECIPIENT, CHAIN_ID);
```

## Test JUnit

```
mvn clean test
```

## Roadmap

(bold is completed task)

### Explorer

* getBlockchainHeight
* getAddressBalance
* getAddressDetails
* getLastTransfersByRange
* getTransferByID
* getTransfersByAddress
* getUnconfirmedTransfersByAddress
* getTransfersByBlockID
* getLastVotesByRange
* getVoteByID
* getVotesByAddress
* getUnconfirmedVotesByAddress
* getVotesByBlockID
* getLastExecutionsByRange
* getExecutionByID
* getExecutionsByAddress
* getUnconfirmedExecutionsByAddress
* getExecutionsByBlockID
* getCreateDeposit
* getCreateDepositsByAddress
* getSettleDeposit
* getSettleDepositsByAddress
* getLastBlocksByRange
* getBlockByID
* getCoinStatistic
* getConsensusMetrics
* getCandidateMetrics
* getCandidateMetricsByHeight
* **sendTransfer**
* sendVote
* sendSmartContract
* putSubChainBlock
* sendAction
* getPeers
* getReceiptByExecutionID
* readExecutionState
* getBlockOrActionByHash
* createDeposit
* getDeposits
* settleDeposit
* suggestGasPrice
* estimateGasForTransfer
* estimateGasForVote
* estimateGasForSmartContract

### Account 

* **unlockWallet**
