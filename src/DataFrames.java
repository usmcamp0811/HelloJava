/**
 * Created by mcamp on 7/7/17.
 */
import com.github.lwhite1.tablesaw.api.CategoryColumn;
import com.github.lwhite1.tablesaw.api.ColumnType;
import com.github.lwhite1.tablesaw.api.*;
import com.github.lwhite1.tablesaw.api.plot.*;

import static com.github.lwhite1.tablesaw.api.ColumnType.*;
import static com.github.lwhite1.tablesaw.api.QueryHelper.column;

public class DataFrames {

    public static void main(String[] args) throws Exception{

        Table bike_data = Table.createFromCsv("data/hour.csv");
        System.out.println("CSV loaded succssfully:\n" + bike_data.shape());

        System.out.println("\n\n\npd.head() equivalent:");
//        NOTE: if you want to display the df you need the print() command else it remains an object
        out(bike_data.first(5).print());

        System.out.println("List of Column names:");
        out(bike_data.columnNames());

        Scatter.show("Bike Data Temp Plot",
                bike_data.nCol("instant"),
                bike_data.nCol("temp"));

        Histogram.show("Bike Data Temp Histogram", bike_data.nCol("temp"));

        Table[] splits = bike_data.sampleSplit(.5);
        Table bike_data_train = splits[0];
        Table bike_data_test = splits[1];
        Line.show("Bike Data Registered Bar Plot",
                bike_data_train.nCol("instant"),
                bike_data.nCol("cnt"));







    }
    private static void out(Object obj) {System.out.println(String.valueOf(obj));}

    private static void out() {System.out.println("");}
}
