package org.sandbox;

import org.bitcoindevkit.*;

public class Main {
    public static void main(String[] args) throws BdkException {

        System.out.println("Hello world!");
        blockTime();
    }

    public static void blockTime() {
        BlockTime blockTime = new BlockTime(
            10,
            10000000
        );
    }
}
