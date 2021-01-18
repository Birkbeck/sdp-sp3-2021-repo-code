package ch09.sec01;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

// See http://en.wikipedia.org/wiki/BMP_file_format

public class MemoryMappedFileDemo {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("chart.bmp");
        try (FileChannel channel = FileChannel.open(path,
                StandardOpenOption.READ, StandardOpenOption.WRITE)) {
            ByteBuffer buffer = channel.map(FileChannel.MapMode.READ_WRITE,
                    0, channel.size());
            buffer.order(ByteOrder.LITTLE_ENDIAN);
            int size = buffer.getInt(2);
            int headerSize = buffer.getInt(14);
            int width = buffer.getInt(18);
            int height = buffer.getInt(22);
            short planes = buffer.getShort(26);
            short depth = buffer.getShort(28);
            int compressionMode = buffer.getInt(30);;
            System.out.println("Size: " + size);
            System.out.println("Header size : " + headerSize);
            System.out.println("Width : " + width);
            System.out.println("Height : " + height);
            System.out.println("Planes : " + planes);
            System.out.println("Depth : " + depth);
            System.out.println("Compression mode : " + compressionMode);
            
        }
    }
}
