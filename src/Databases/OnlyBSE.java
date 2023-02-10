package Databases;
//Importing classes
import static Databases.CellHeights.RESULT;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//Main class
public class OnlyBSE {
    public static final String RESULT = "BSEINFORMATION.pdf";
    Connection con;
    PreparedStatement statement;
    Statement st;
    String cs;
    String user;
    String password;
    String query;
    ResultSet rs;
    String records;
    int count = 0;
//Constructor
    public OnlyBSE(){
        con = null;
        st = null;
        cs = "jdbc:mysql://localhost:3306/setwo";
        user = "samuel";
        password = "amuelss1!";
    }

    public void Main() throws FileNotFoundException, DocumentException, Exception{
        // step 1
        Document document = new Document(PageSize.A5.rotate());
        // step 2
        PdfWriter.getInstance(document, new FileOutputStream(RESULT));
        // step 3
        document.open();
        // step 4
        PdfPTable table = new PdfPTable(2);
        
         try{
            Class.forName("com.mysql.jdbc.Driver"); //register the driver
            con = DriverManager.getConnection(cs, user, password);
            st = con.createStatement();
            query = "select * from students";//exwcute 
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){    
                table.addCell(rs.getString("RegNo"));
                table.addCell(rs.getString("name"));
            }
            document.add(table);
         }
            catch(ClassNotFoundException ex){
                    ex.printStackTrace();
                    
            }
        ////////open the file//////////
        if(Desktop.isDesktopSupported()){
        try{
            File myfile = new File("BSEINFORMATION.pdf");
            Desktop.getDesktop().open(myfile);
        }catch(IOException ex){
            ex.printStackTrace();
        }
        
        // step 5
        document.close();
        }
    }
}
