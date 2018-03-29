

/*package Logic.logic;

import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfImportedPage;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.List;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;


public class Documents_Merge {
    

public static void main(String args[]){
    try {
        //Prepare input pdf file list as list of input stream.
        ArrayList<InputStream> inputPdfList = new ArrayList<InputStream>();
        inputPdfList.add(new FileInputStream("..\\pdf\\pdf_1.pdf"));
        inputPdfList.add(new FileInputStream("..\\pdf\\pdf_2.pdf"));
        inputPdfList.add(new FileInputStream("..\\pdf\\pdf_3.pdf"));
        inputPdfList.add(new FileInputStream("..\\pdf\\pdf_4.pdf"));


        //Prepare output stream for merged pdf file.
        OutputStream outputStream = 
                new FileOutputStream("..\\pdf\\MergeFile_1234.pdf");

        //call method to merge pdf files.
        mergePdfFiles(inputPdfList, outputStream);     
    } catch (Exception e) {
        e.printStackTrace();
    }
    }

    private static void mergePdfFiles(ArrayList<InputStream> inputPdfList, OutputStream outputStream) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
*/