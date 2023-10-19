package org.htmlToPdfDemo;

import com.openhtmltopdf.pdfboxout.PdfRendererBuilder;
import org.jsoup.Jsoup;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.xhtmlrenderer.layout.SharedContext;
import org.xhtmlrenderer.pdf.ITextRenderer;
import org.xhtmlrenderer.pdf.ITextTextRenderer;

import javax.imageio.stream.FileImageOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.FileSystems;

/**
 * Hello world!
 */
public class App {
    //    public static void main( String[] args ) throws IOException {
//        File htmlFile = new File("src/main/java/org/htmlToPdfDemo/receipt.html");
//        Document doc = Jsoup.parse(htmlFile, "UTF-8");
//        doc.outputSettings().syntax(Document.OutputSettings.Syntax.xml);
//        try (
//            OutputStream os = new FileOutputStream("/Users/jorgemario.herrera/Downloads/salida.pdf")) {
//            ITextRenderer renderer = new ITextRenderer();
//            SharedContext context = renderer.getSharedContext();
//            context.setPrint(true);
//            context.setInteractive(false);
//            String baseUrl = FileSystems.getDefault().getPath("/Users/jorgemario.herrera/Downloads").toUri().toURL().toString();
//            renderer.setDocumentFromString(doc.html(), baseUrl);
//            renderer.layout();
//            renderer.createPDF(os);
//            System.out.println("done");
//        }
//    }
    public static void main(String[] args) throws IOException {
        File htmlFile = new File("src/main/java/org/htmlToPdfDemo/receipt.html");
        Document doc = Jsoup.parse(htmlFile, "UTF-8");
        doc.outputSettings().syntax(Document.OutputSettings.Syntax.xml);
        try (OutputStream os = new FileOutputStream("/Users/jorgemario.herrera/Downloads/salida2.pdf")) {
            String baseUri = FileSystems.getDefault()
                    .getPath("src/main/resources/")
                    .toUri()
                    .toString();
            PdfRendererBuilder builder = new PdfRendererBuilder();
            builder.withUri("/Users/jorgemario.herrera/Downloads/salida.pdf");
            builder.toStream(os);
            builder.withW3cDocument(new W3CDom().fromJsoup(doc), baseUri);
            builder.run();
            System.out.println("done..");
        }
    }
}
