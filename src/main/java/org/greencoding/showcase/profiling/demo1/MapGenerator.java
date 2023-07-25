package org.greencoding.showcase.profiling.demo1;

import java.io.PrintStream;
import java.util.Base64;
import java.util.concurrent.ThreadLocalRandom;

public class MapGenerator {
    public static void main(String[] args) throws Exception {
        try (PrintStream out = new PrintStream("in.txt")) {
            for (int i = 0; i < 10000000; i++) {
                int length = ThreadLocalRandom.current().nextInt(1, 9);
                byte[] b = new byte[length];
                ThreadLocalRandom.current().nextBytes(b);
                String key = Base64.getEncoder().encodeToString(b);
                long value = ThreadLocalRandom.current().nextLong(1000000);
                out.println(key + ": " + value);
            }
        }
    }

}
