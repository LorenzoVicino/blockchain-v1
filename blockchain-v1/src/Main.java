import chain.Blockchain;

public class Main {
    public static void main(String[] args) {
        Blockchain blockchain = new Blockchain(5);

        blockchain.addBlock("Hi, I'm the first block!");
        blockchain.addBlock("Yo, I'm the second block!");
        blockchain.addBlock("Hey, I'm the third block!");

        System.out.println("\nBlockchain is valid: " + blockchain.isChainValid());

        blockchain.printBlockchain();
    }
}