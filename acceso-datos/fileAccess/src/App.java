import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class App
{
    public static void main(String[] args) throws IOException
    {
        File f = new File("resources/f.txt");

        if (!f.exists())
        {
            f.createNewFile();
        }

        //FileWriter cuando necesites escribir datos de texto básicos sin formato y no necesites métodos de formateo adicionales.
        FileWriter fw = new FileWriter(f);
        fw.write("First Line");
        fw.append("Second Line");
        fw.close();

        //PrintWriter cuando necesites escribir texto con formato, especialmente si vas a incluir múltiples tipos de datos o quieres usar métodos como println() y printf().
        PrintWriter pw = new PrintWriter(f);
        pw.println(1);
        pw.print(2);
        pw.close();

        //BufferedWriter para mejorar el rendimiento de FileWriter cuando estés escribiendo grandes cantidades de datos.
        BufferedWriter bw = new BufferedWriter(new FileWriter(f));
        bw.write("Hello, World");
        bw.close();

        // BufferedReader br = new BufferedReader(new FileReader(f)){
        // br.
        // }

        //OutputStreamWriter si necesitas especificar una codificación de caracteres específica o si trabajas con flujos de bytes que necesiten convertirse en caracteres.
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(f), "UTF-8");
        osw.write("Hello, World!");
        osw.close();

        //DataOutputStream si necesitas escribir datos binarios o tipos de datos primitivos, como números y booleanos, en un archivo de salida.
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("example.dat"));
        dos.write(42);
        dos.close();
    }
}