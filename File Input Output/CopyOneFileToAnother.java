import java.io.*;

public class FileCopyExample {
    public static void main(String[] args) {
        // Source and destination file paths
        String sourceFile = "source.txt";
        String destinationFile = "destination.txt";

        // Try-with-resources to ensure proper resource management
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFile)) {

            // Buffer for data transfer
            byte[] buffer = new byte[1024];
            int bytesRead;

            // Read from the source and write to the destination
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
