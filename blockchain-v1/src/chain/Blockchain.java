package chain;

import block.Block;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

public class Blockchain {
    private final List<Block> chain;
    private final int difficulty;

    public Blockchain(int difficulty) {
        this.chain = new ArrayList<>();
        this.difficulty = difficulty;
        addGenesisBlock();
    }

    private void addGenesisBlock() {
        Block genesis = new Block("Genesis Block", "0");
        genesis.mineBlock(difficulty);
        chain.add(genesis);
    }

    public void addBlock(String data) {
        Block newBlock = new Block(data, chain.getLast().hash);
        newBlock.mineBlock(difficulty);
        chain.add(newBlock);
    }

    public boolean isChainValid() {
        String hashTarget = new String(new char[difficulty]).replace('\0', '0');

        for (int i = 1; i < chain.size(); i++) {
            Block currentBlock = chain.get(i);
            Block previousBlock = chain.get(i - 1);

            if (!currentBlock.hash.equals(currentBlock.calculateHash())) {
                System.out.println("Current Hashes not equal");
                return false;
            }
            if (!previousBlock.hash.equals(currentBlock.previousHash)) {
                System.out.println("Previous Hashes not equal");
                return false;
            }
            if (!currentBlock.hash.substring(0, difficulty).equals(hashTarget)) {
                System.out.println("This block hasn't been mined");
                return false;
            }
        }
        return true;
    }

    public void printBlockchain() {
        String blockchainJson = new GsonBuilder().setPrettyPrinting().create().toJson(chain);
        System.out.println("\nBlockchain:");
        System.out.println(blockchainJson);
    }
}
