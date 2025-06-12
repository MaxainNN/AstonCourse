package org.aston.module_three;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class FileWriter {

    /**
     * Write data to file using FileOutputStream
     * @param fileName name of file in the root directory
     * @param dataToWrite data that will be written in the file on the new line
     * @throws FileOperationException if catch IO Exception
     */
    public void writeInFile(String fileName, String dataToWrite){
        try (FileOutputStream os = new FileOutputStream(fileName, true)){
            String stringToWriteInFile = dataToWrite + "\n";
            os.write(stringToWriteInFile.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e){
            throw new FileOperationException("Failed to write in file: " + fileName, e);
        }
    }

    /**
     * Write data to file using FileOutputStream and throwing exceptions
     * if getting UnsupportedEncodingException and IOException
     * @param fileName name of file in the root directory
     * @param dataToWrite data that will be written in the file
     * @throws FileOperationException if catch IO Exception or Unsupported Encoding Exception
     */
    public void writeInFileFragmented(String fileName, String dataToWrite) throws FileOperationException {
        String stringToWriteInFile = dataToWrite + "\n";
        byte[] buff;

        try {
            buff = stringToWriteInFile.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e){
            throw new FileOperationException("Unsupported encoding", e);
        }

        try {
            FileOutputStream out = new FileOutputStream(fileName, true);
            out.write(buff);
            System.out.println("File written successfully!");
        } catch (IOException e){
            throw new FileOperationException("Failed to write fragmented data to file: " + fileName, e);
        }
    }
}