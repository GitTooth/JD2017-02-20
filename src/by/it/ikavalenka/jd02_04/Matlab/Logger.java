package by.it.ikavalenka.jd02_04.Matlab;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Logger {

    private static Logger instance;

    public void writeToLog (String text){

        String src = System.getProperty("user.dir") + "/src/by/it/ikavalenka/jd02_04/Matlab/log.txt";
        File file = new File(src);
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("EEEE, d MMMM yyyy HH:mm:ss");
        synchronized (this) {
            try (PrintWriter print = new PrintWriter(new FileWriter(file, true))){
                print.println(text+": "+df.format(date));
            }
            catch (IOException e){
                System.out.println("File not found.");
            }
        }
    }

    public static Logger getInstance(){

        Logger localInstance = instance;
        if (localInstance==null){
            synchronized (Logger.class){
                localInstance = instance;
                if (localInstance==null){
                    instance=localInstance = new Logger();
                }
            }
        }
        return instance;
    }
}
