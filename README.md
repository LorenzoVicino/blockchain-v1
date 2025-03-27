# 🏰 blockchain-v1

First attempt at building a blockchain mechanism in Java

🚀 This project implements a basic blockchain system using Java, demonstrating how blocks are linked, mined, and verified for integrity.

## 📚 Features

* 🏰 **Block Creation** – Each block contains a hash, previous hash, timestamp, and data.
* ⛏ **Proof of Work (Mining)** – Blocks require computational work to be added to the chain.
* 🔗 **Chain Validation** – Ensures integrity by checking hashes and previous block references.
* 📝 **JSON Serialization** – Uses Gson to pretty-print the blockchain.

## 🛠 Installation

1.  **Clone the Repository**

    ```bash
    git clone [https://github.com/yourusername/blockchain-v1.git](https://github.com/yourusername/blockchain-v1.git)
    cd blockchain-v1
    ```

2.  **Import into IntelliJ (or any Java IDE)**

    * Open IntelliJ IDEA
    * Select `File > Open`
    * Choose the project folder

## 🚀 How It Works

1.  **Genesis Block**: The first block is manually created.
2.  **Mining Process**: Blocks are added through a Proof-of-Work mechanism.
3.  **Verification**: The blockchain is validated to ensure consistency.

Example output after running the program:

```json
{
    "hash": "00000f1a...",
    "previousHash": "0",
    "data": "Genesis Block",
    "timestamp": "1711778929"
}
```

Markdown

## 💂‍♂️ Project Structure

/src
├── Main.java         # Runs the blockchain simulation
└── blockchain
├── Block.java    # Defines block structure & hashing
└── Blockchain.java # Manages block mining & validation


## ⚡ Future Improvements

* 🔹 Implement transactions and wallets
* 🔹 Improve mining efficiency
* 🔹 Add network communication between nodes

## 📝 License

This project is open-source under the MIT License. Feel free to modify and expand!

## ✨ Made with 💻 & ☕ by Lorenzo Vicino
