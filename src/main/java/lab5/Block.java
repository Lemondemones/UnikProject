package lab5;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class Block {
    private String blockNumber;
    private int blockLength;

    public Block() {
    }

    public Block(String blockNumber, int blockLength) {
        this.blockNumber = blockNumber;
        this.blockLength = blockLength;
    }

    public String getBlockNumber() {
        return blockNumber;
    }

    public void setBlockNumber(String blockNumber) {
        this.blockNumber = blockNumber;
    }

    public int getBlockLength() {
        return blockLength;
    }

    public void setBlockLength(int blockLength) {
        this.blockLength = blockLength;
    }

}
