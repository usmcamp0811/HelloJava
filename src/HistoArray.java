/**
 * Created by mcamp on 7/6/17.
 */
import com.github.lwhite1.tablesaw.api.*;
import java.io.InputStream;
import java.net.URL;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import sun.rmi.server.InactiveGroupException;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class HistoArray {
    public static void main(String[] args) {
        Scanner data = null;
        Integer[] count = {0,0,0,0,0,0,0,0,0,0};
        Integer idx;

        try {
                data = new Scanner(new File("test.dat"));

        }
        catch (IOException e) {
            System.out.println("Sorry but I was unable to open your data file");
            e.printStackTrace();
            System.exit(0);
        }

        while(data.hasNextInt()) {
            idx = data.nextInt();
            count[idx] = count[idx] + 1;
        }

        idx = 0;
        for (Integer i : count) {
            System.out.println(idx + " occured " + i + " times.");
            idx++;
        }
    }
}
