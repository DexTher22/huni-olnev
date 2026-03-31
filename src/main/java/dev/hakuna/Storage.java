package dev.hakuna;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Storage {
    public static ArrayList<NameDict> readContent() {
        try {
            return tryReadContent();
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }

    private static ArrayList<NameDict> tryReadContent() throws FileNotFoundException {
        
        ArrayList<NameDict> nameDictList = new ArrayList<>();
        String fileName = Prop.GetFileName();
        File file = new File(fileName);
        try(Scanner sc = new Scanner(file, "utf-8")){
            sc.nextLine();
            while(sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] lineArray = line.split(":");
                NameDict nameDict = new NameDict();
                nameDict.setHuName(lineArray[0]);
                nameDict.setItName(lineArray[1]);
                nameDictList.add(nameDict);
            }
                
        }
        return nameDictList;
    }
}
