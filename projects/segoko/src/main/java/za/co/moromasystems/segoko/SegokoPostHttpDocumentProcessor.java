package za.co.moromasystems.segoko;

import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.log4j.Logger;

import com.norconex.collector.http.doc.HttpDocument;
import com.norconex.collector.http.doc.IHttpDocumentProcessor;

public class SegokoPostHttpDocumentProcessor implements IHttpDocumentProcessor {

	private static final long serialVersionUID = -1713395064496060999L;
	static Logger logger = Logger.getLogger(SegokoPostHttpDocumentProcessor.class);
	@Override
	public void processDocument(DefaultHttpClient httpClient, HttpDocument doc) {
		// TODO Auto-generated method stub
		logger.info("processDocument not implemented");
	}

}
