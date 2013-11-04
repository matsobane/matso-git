package za.co.moromasystems;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import com.norconex.collector.http.HttpCollector;
import com.norconex.collector.http.HttpCollectorConfig;
import com.norconex.collector.http.HttpCollectorConfigLoader;

/**
 * Hello world!
 *
 */
public class SegokoMain 
{
	static Logger logger = Logger.getLogger(SegokoMain.class);
    public static void main( String[] args ) throws XPathExpressionException, ParserConfigurationException, SAXException, IOException
    {
    	//Set up a simple configuration that logs on the console
    	BasicConfigurator.configure();
        logger.info("Enter Segoko");
        initHttpCollector();
        logger.info("Exit Segoko");
    }

    /**
     * 
     */
	private static void initHttpCollector() {
		/* XML configuration: */
		File myXMLFile = new File("min-collector-config.xml");
		File myVariableFile = null;
		
        HttpCollectorConfig config = HttpCollectorConfigLoader.loadCollectorConfig(myXMLFile, myVariableFile);

        HttpCollector collector = new HttpCollector(config);
        collector.crawl(true);
	}
}
