import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        String file_path;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Key in the file path like this : /home/Java_Projects/test2/file2.csv");
        file_path = scanner.nextLine();
        File csvFile = new File(file_path);
        String[] split_file_name = file_path.split(".csv");
        String tsv_file_path = (split_file_name[0]) + ".txt";
        Scanner myReader = new Scanner(csvFile);
        File newFileTsv = new File(tsv_file_path);
        if(newFileTsv.createNewFile()){
            System.out.println("Created new file, in the same directory specified above.");
        }
        else{
            newFileTsv.delete();
            newFileTsv.createNewFile();
            System.out.println("Deleted existing file and created new one in the same directory specified above.");
        }
        FileWriter tsvFile = new FileWriter(tsv_file_path);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            for(int i=0; i<data.length(); i++){
                if(data.charAt(i) == ','){
                    tsvFile.write("\t");
                }
                else{
                    tsvFile.write(data.charAt(i));
                }
                }
            tsvFile.write("\n");
        }
        tsvFile.close();
    }}
