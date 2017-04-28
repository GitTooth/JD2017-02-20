package by.it.ikavalenka.jd02_04.Matlab;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class OperationReportBuilder extends ReportBuilder implements Runnable {

    //private File file;
    private Date startDate;
    private static boolean finish;

    public OperationReportBuilder (Date startDate){
        this.startDate = startDate;
    }

    public static void setFinish(boolean finish) {
        OperationReportBuilder.finish = finish;
    }

    public static boolean isFinish() {
        return finish;
    }

    @Override
    public File getFile() {
        return file;
    }

    @Override
    public void run() {
        startReport();
        setStartTime();
        addOperation();
        setEndTime();
    }

    @Override
    public void startReport() {
        String src = System.getProperty("user.dir")+"/src/by/it/ikavalenka/jd02_04/Matlab/report.txt";
        file = new File(src);
        try(PrintWriter print = new PrintWriter(new FileWriter(file,true))) {
            print.println("Mathlab Operations' Report");
        } catch (IOException e) {
            System.out.println("Adding report name has failed.");
        }

    }

    @Override
    public void setStartTime() {
        try(PrintWriter print = new PrintWriter(new FileWriter(file,true))) {
            print.println("Begin of the demo: "+this.startDate);
        } catch (IOException e) {
            System.out.println("Adding start time has failed.");
        }
    }

    @Override
    public void addOperation() {
        int operationNum =1;
        synchronized (QueueOperationsForReport.getQueueOperationsForReport()){
            while (!finish) {
                try {
                    QueueOperationsForReport.getQueueOperationsForReport().wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                try (PrintWriter print = new PrintWriter(new FileWriter(file, true))) {
                    String op = QueueOperationsForReport.getOperation();
                    if (op!=null){
                        print.println("Operation " + operationNum + ": " + op);
                        operationNum++;
                    }
                } catch (IOException e) {
                    System.out.println("Adding operation has failed.");
                }

            }

        }

    }

    @Override
    public void setEndTime() {
        Date endTime = new Date();
        try(PrintWriter print = new PrintWriter(new FileWriter(file,true))) {
            print.println("End of  demo: "+endTime);
        } catch (IOException e) {
            System.out.println("Adding end time has failed.");
        }
    }
}
