package ch09.sec02;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.stream.Stream;

public class ZipDemo {
    public static void main(String[] args) throws IOException, URISyntaxException {
        Path javaHome = Paths.get(System.getProperty("java.home"));
        Path zipFile = javaHome.getParent().resolve("src.zip");
        if (!Files.exists(zipFile)) {
            System.err.println(zipFile + " does not exist.");
            return;
        }

        String sourceName = "java/lang/String.java";
        Path tempDir = Files.createTempDirectory("corejava");
        Path targetPath = tempDir.resolve(sourceName);
        Files.createDirectories(targetPath.getParent());
        try (FileSystem zipfs = FileSystems.newFileSystem(zipFile, null)) {
            Files.copy(zipfs.getPath(sourceName), targetPath);
            Files.lines(targetPath).limit(40).forEach(System.out::println);
            System.out.println("\nFiles that don't end in .java:");
            try (Stream<Path> entries = Files.walk(zipfs.getPath("/"))) {
                entries.filter(p -> Files.isRegularFile(p) && !p.toString().endsWith(".java"))
                    .forEach(System.out::println);
            }            
        }

        Path zipPath = tempDir.resolve("myfile.zip");
        URI uri = new URI("jar", zipPath.toUri().toString(), null);
        // Constructs the URI jar:file://myfile.zip
        try (FileSystem zipfs = FileSystems.newFileSystem(uri,
                Collections.singletonMap("create", "true"))) {
            // To add files, copy them into the ZIP file system
            Path filePath = targetPath;            
            Files.copy(filePath, zipfs.getPath("/").resolve("String.java"));
        }
        System.out.println("Made zip file at " + zipPath);
    }
}
