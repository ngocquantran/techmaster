package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Validate {

    public static int inputNumber(){
        Scanner scanner=new Scanner(System.in);
        int number=0;
        boolean isContinue=true;
        while (isContinue){
            try {
                number=Integer.parseInt(scanner.nextLine());
                isContinue=false;
            }catch (NumberFormatException e){
                System.out.println("Vui lòng nhập số");
            }
        }
        return number;
    }

    public static LocalDate isDateFormat(){
        Scanner scanner=new Scanner(System.in);
        String inputDate="";
        SimpleDateFormat myFormat=new SimpleDateFormat("dd/MM/yyyy");
        Date date=new Date();
        myFormat.setLenient(false);
        boolean isContinue=true;
        while (isContinue){
            try{
                inputDate= scanner.nextLine();
                date=myFormat.parse(inputDate);
                isContinue=false;
            }catch (ParseException e){
                System.out.println("Ngày sinh không hợp lệ");
            }
        }
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

}
