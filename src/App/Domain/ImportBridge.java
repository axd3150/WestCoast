package App.Domain;
import App.Infa.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ImportBridge{

    public static void main(String args[])throws FileNotFoundException {
        String FileLoc;
        File importee = new File ("C://Import/import.csv");;
        Boolean existing;
        Scanner scanner;
        int FieldNum;
        ImportBridgeStructure Cur = new ImportBridgeStructure();


        existing = importee.exists();
        if (existing){
            scanner = new Scanner(importee);
            scanner.useDelimiter(",");

        }else{

        }
    }
}
