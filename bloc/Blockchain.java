package bloc;

import java.util.ArrayList;

public class Blockchain {
    public static ArrayList<Block> blockchain = new ArrayList<>();
    public static int difficulty = 4; // Adjust difficulty for mining

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Add the genesis block
        blockchain.add(new Block("Genesis Block", "0"));
        System.out.println("Genesis Block created.");

        while (true) {
            System.out.print("Enter data to store in blockchain (type 'exit'): ");
            String data = scanner.nextLine();

            if (data.equalsIgnoreCase("exit")) {
                break;
            }

            addBlock(data);
            System.out.println("New block added to the blockchain.");
            System.out.println("Blockchain is valid: " + isChainValid());
            System.out.println("Current Blockchain:");
            printBlockchain(); // Print the entire blockchain
            System.out.println();
        }

        scanner.close();
    }

    public static void addBlock(String data) {
        Block previousBlock = blockchain.get(blockchain.size() - 1);
        Block newBlock = new Block(data, previousBlock.hash);
        //newBlock.mineBlock(difficulty); // Optional: Mine the block with PoW
        blockchain.add(newBlock);
    }

    public static Boolean isChainValid() {
        Block currentBlock;
        Block previousBlock;

        for (int i = 1; i < blockchain.size(); i++) {
            currentBlock = blockchain.get(i);
            previousBlock = blockchain.get(i - 1);

            if (!currentBlock.hash.equals(currentBlock.calculateHash())) {
                System.out.println("Current Hashes not equal");
                return false;
            }

            if (!previousBlock.hash.equals(currentBlock.previousHash)) {
                System.out.println("Previous Hashes not equal");
                return false;
            }
        }
        return true;
    }

    public static void printBlockchain() {
        for (Block block : blockchain) {
            System.out.println(block.toString());
        }
    }
}
