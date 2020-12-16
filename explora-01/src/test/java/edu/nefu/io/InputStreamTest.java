package edu.nefu.io;

import org.junit.Test;

import java.io.*;
import java.security.PublicKey;

public class InputStreamTest {
    byte[] bytes = new byte[]{'a', 'b', 'c', 'd'};

    @Test
    public void test_read() throws IOException {
        System.out.println(bytes);
        InputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        byte[] bytes1 = byteArrayInputStream.readNBytes(4);
        System.out.println(bytes1);
    }

    @Test
    public void test_pipStream() throws IOException {
        PipedInputStream pipedInputStream = new PipedInputStream(10);
        int read = pipedInputStream.read(bytes);
        System.out.println(read);
    }

    @Test
    public void test_fileStream() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File("H:\\work\\school-study\\大三上\\design-pattern\\itstack-demo-design-master\\design-pattern-demo\\README.md"));
        int n;
        byte[] bytes = new byte[8];
        System.out.println("第一次" + bytes.toString());
        while ((n = fileInputStream.read(bytes)) != -1) {
            System.out.println(n);
            System.out.println(bytes.toString());
        }
    }

    @Test
    public void test_fileStream2() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("H:\\work\\school-study\\大三上\\design-pattern\\itstack-demo-design-master\\design-pattern-demo\\README.md");
        int n;
        byte[] bytes = new byte[8];
        System.out.println("第一次" + bytes.toString());
        while ((n = fileInputStream.read(bytes)) != -1) {
            System.out.println(n);
            System.out.println(bytes.toString());
        }
    }

    @Test
    public void test_fileStream3() throws IOException {
        FileReader fileReader = new FileReader("H:\\work\\school-study\\大三上\\design-pattern\\itstack-demo-design-master\\design-pattern-demo\\test.txt");
        int n;
        char[] chars = new char[8];
        System.out.println(chars.toString());
        while ((n = fileReader.read(chars)) != -1) {
            System.out.println(chars.toString());
            System.out.println(n);
        }
    }

    @Test
    public void test_fileApi1() {
        new File();
    }


}
