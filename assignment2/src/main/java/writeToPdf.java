
import com.itextpdf.text.pdf.*;
import com.itextpdf.text.*;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class writeToPdf{

    public void printPdf(){
    readExcel read = new readExcel();
    // Creating a PdfWriter

        try {
        // Creating a Document
        Document document = new Document();
        PdfWriter writer = PdfWriter.getInstance(document,new FileOutputStream("ChessResult.pdf"));

        document.open();
        Font font = FontFactory.getFont(FontFactory.COURIER, 20, BaseColor.BLACK);
        PdfPTable table = new PdfPTable(6);

            //header
            PdfContentByte cb = writer.getDirectContent();
            Phrase header = new Phrase("KEJOHANAN TERTUTUP KUANTAN 2018 LELAKI", font);
            ColumnText.showTextAligned(cb, Element.ALIGN_CENTER,
                    header,
                    (document.right() - document.left()) / 2 + document.leftMargin(),
                    document.top() + 10, 0);


            table.setWidthPercentage(100);// set table width
            table.setSpacingBefore(10f);//spacing before
            table.setSpacingAfter(10f);//spacing after


            int b=0;

            for(chessData chessData1: read.data()){

                PdfPCell cc1 = new PdfPCell(new Paragraph(String.valueOf(read.dataList.get(b).getNum())));
                table.addCell(cc1);

                PdfPCell cc2 = new PdfPCell(new Paragraph(String.valueOf(read.dataList.get(b).getName())));
                table.addCell(cc2);

                PdfPCell cc3 = new PdfPCell(new Paragraph(String.valueOf(read.dataList.get(b).getFide())));
                table.addCell(cc3);


                PdfPCell cc4 = new PdfPCell(new Paragraph(String.valueOf(read.dataList.get(b).getFed())));
                table.addCell(cc4);

                PdfPCell cc5 = new PdfPCell(new Paragraph(String.valueOf(read.dataList.get(b).getRtg())));
                table.addCell(cc5);

                PdfPCell cc6 = new PdfPCell(new Paragraph(String.valueOf(read.dataList.get(b).getClub())));
                table.addCell(cc6);
                b++;

            }


        document.add(table);

        document.close();
        writer.close();


    } catch (FileNotFoundException e1) {
        e1.printStackTrace();
    } catch (DocumentException e1) {
        e1.printStackTrace();
    }}
    }



