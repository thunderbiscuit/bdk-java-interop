package org.sandbox;

import org.bitcoindevkit.*;

public class Main {
    public static void main(String[] args) throws BdkException {

        System.out.println("Hello world!");
        blockTime();
    }

    public static void blockTime() {
//        BlockTime blockTime = new org.bitcoindevkit.BlockTime(
//            10,
//            10000000
//        );

//        BlockTime2 blockTime = new BlockTime2(
//            10,
//            10000000
//        );

        BlockTime3 blockTime3 = new BlockTime3(
            10,
            10000000
        );
    }
}
