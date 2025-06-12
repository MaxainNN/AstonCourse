package org.aston.module_three;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReader {

    /**
     * Read data from file using FileInputStream
     * @param fileName name of file in the root directory
     * @return data in String view if it existed
     * @throws FileOperationException if catch IO Exception
     */
    public String readFile(String fileName) throws FileOperationException {
        try (FileInputStream is = new FileInputStream(fileName)){
            int i;
            StringBuilder dataBuilder = new StringBuilder();
            while ((i = is.read()) != -1){
                dataBuilder.append((char) i);
            }
            return dataBuilder.toString();
        } catch (IOException e){
            throw new FileOperationException("Failed to write fragmented data to file: " + fileName, e);
        }
    }
}