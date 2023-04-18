package bigo.nguyenthai.algorithm.oop;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

/**
 * Date: 4/18/2023<br/>
 * Time: 10:25 AM<br/>
 */
public class TestFunction {
    public static void main(String[] args) throws FileNotFoundException {

        String fileName = "D:\\336932779_894658395161511_292762326660741420_n.jpg";
        String newFile = "D:\\b.jpg";
        long start = System.nanoTime();
//        writeInputStream(fileName, newFile);
        long elapsedTime = System.nanoTime() - start;

        long start1 = System.nanoTime();
        writeBufferFile(fileName, "D:\\c.jpg");
        long elapsedTime1 = System.nanoTime() - start1;
        System.out.println(elapsedTime + "----" + elapsedTime1);
        //writeBufferFile(fileName, newFile);

        
    }

    public static void writeInputStream(String fileName, String newFile){
        try {
            InputStream is = new FileInputStream(fileName);
            Path target = new File(newFile).toPath();
            try {
                Files.copy(is, target, StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void writeBufferFile(String fileName, String newFile){

        BufferedOutputStream bos = null;
        FileOutputStream fos = null;

        try {

            // create FileOutputStream from filename
            fos = new FileOutputStream(newFile);

            // create BufferedOutputStream for FileOutputStream
            bos = new BufferedOutputStream(fos);

            BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(fileName));
            int b;
            while ((b = inputStream.read(new byte[1024])) != -1) {
                bos.write(b);
            }
        }
        catch (FileNotFoundException fnfe) {
            System.out.println("File not found" + fnfe);
        }
        catch (IOException ioe) {
            System.out.println("Error while writing to file" + ioe);
        }
        finally {
            try {
                if (bos != null) {
                    bos.flush();
                    bos.close();
                }
            }
            catch (Exception e) {
                System.out.println("Error while closing streams" + e);
            }

        }

    }

}
