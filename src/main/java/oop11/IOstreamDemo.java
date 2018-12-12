package oop11;

import org.apache.logging.log4j.*;
import java.io.*;
import java.nio.*;

public class IOstreamDemo {

    public static void main(String[] args) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("c:\\Java\\file.txt"))) {
            dos.writeInt(123);
        } catch (IOException ioe) {
            System.out.println("Data not readable");
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream("c:\\Java\\file.txt"))) {
            System.out.println(dis.readInt());
        } catch (IOException ioe) {
            System.out.println("Data still not readable");
        }

        try (DataOutputStream dos1 = new DataOutputStream(new FileOutputStream("c:\\Java\\file.txt"))) {
            dos1.writeUTF("This is a test.");
        } catch (IOException ioe) {
            System.out.println("can not write");
        }

        try (DataInputStream dis1 = new DataInputStream(new FileInputStream("c:\\Java\\file.txt"))) {
            System.out.println(dis1.readUTF());
        } catch (IOException ioe) {
            System.out.println(" Data is fucked");
        }

    }

}

