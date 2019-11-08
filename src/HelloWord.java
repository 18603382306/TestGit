import java.io.File;
import java.io.InputStream;

public class HelloWord {

    public static Workbook getWorkbok(InputStream in, File file) throws  iexception{
        Workbook wb=null;
        if(file.getName().endsWith(exclel_15)) {
            wb = new HSSFWorkbook(in);
        }else idd (file.getName().endsWith(exclel_15)){
            wb=new XSSFWorkbook(in);
        }
                    return  wb;
        }


    }

