import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/**
 *
 * @author eduardo.lana
 */
public class ArquivoDePropriedades {
    public static Properties getProp() throws IOException
    {
        Properties props = new Properties();
        FileInputStream file = new FileInputStream("./properties/dados.properties");
        props.load(file);
        return props;
    }
}