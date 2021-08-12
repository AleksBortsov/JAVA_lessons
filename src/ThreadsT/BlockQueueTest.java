package ThreadsT;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockQueueTest {
//    private static final int FILE_QUEUE_SIZE = 10;
//    private static final int SEARCH_THREADS = 100;
//    private static final Path DUMMY = Path.of(" ");
//    private static BlockingQueue<Path> queue =
//            new ArrayBlockingQueue<>(FILE_QUEUE_SIZE);
//
//    public static void main(String[] args) {
//        try (Scanner in = new Scanner(System.in)) {
//            System.out.println("Enter base directory: " + "e.g./opt/jdl-9src): ");
//            String directory = in.nextLine();
//            System.out.println("Enter keyword: " + " " +
//                    "(e.g. volatile): ");
//            String keyword = in.nextLine();
//
//            Runnable enumerator = () -> {
//                try {
//                    enumerate(Path.of(directory));
//                    queue.put(DUMMY);
//                } catch (IOException e) {
//                    e.printStackTrace();
//                } catch (InterruptedException e) {
//                }
//            };
//
//            new Thread(enumerator).start();
//            for (int i = 1; i <= SEARCH_THREADS; i++) {
//
//                Runnable searcher = () -> {
//                    try {
//                        boolean done = false;
//                        while (!done) {
//                            Path file = queue.take();
//                            if (file == DUMMY) {
//                                queue.put(file);
//                                done = true;
//                            } else search(file, keyword);
//                        }
//                    } catch (IOException | InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                };
//                new Thread(searcher).start();
//            }
//        }
//    }
//
//    public static void enumerate(Path directiry) throws IOException, InterruptedException {
//        try {
//            for (Path child :
//                    children.collect(Collections.toList())) {
//                if (Files.isDirectory(child))
//                    enumerate(child);
//                else queue.put(child);
//            }
//        } catch (IOException | InterruptedException e) {
//        }
//    }
//
//    public static void search(Path file, String keyword) throws IOException {
//        try (Scanner in = new Scanner(file, StandardCharsets.UTF_8)) {
//            int lineNumber = 0;
//            while (in.hasNextLine()) {
//                lineNumber++;
//                String line = in.nextLine();
//                if (line.contains(keyword))
//                    System.out.println("%s:%d:%s%n", file, lineNumber, line);
//            }
//        }
//    }
}