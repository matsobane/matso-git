package za.co.moromasystems.segoko;

import org.apache.log4j.Logger;

import com.norconex.collector.http.crawler.HttpCrawler;
import com.norconex.collector.http.crawler.IHttpCrawlerEventListener;
import com.norconex.collector.http.doc.HttpDocument;
import com.norconex.collector.http.doc.IHttpDocumentProcessor;
import com.norconex.collector.http.fetch.IHttpDocumentFetcher;
import com.norconex.collector.http.fetch.IHttpHeadersFetcher;
import com.norconex.collector.http.filter.IHttpDocumentFilter;
import com.norconex.collector.http.filter.IHttpHeadersFilter;
import com.norconex.collector.http.filter.IURLFilter;
import com.norconex.collector.http.robot.RobotsMeta;
import com.norconex.collector.http.robot.RobotsTxt;
import com.norconex.commons.lang.map.Properties;

public class SekgokoHttpCrawlerEventListener implements
		IHttpCrawlerEventListener {
	static Logger logger = Logger.getLogger(SekgokoHttpCrawlerEventListener.class);
	@Override
	public void crawlerFinished(HttpCrawler arg0) {
		logger.info("crawlerFinished not implemented");
	}

	@Override
	public void crawlerStarted(HttpCrawler arg0) {
		logger.info("crawlerStarted not implemented");

	}

	@Override
	public void documentCrawled(HttpCrawler arg0, HttpDocument arg1) {
		logger.info("documentCrawled not implemented");

	}

	@Override
	public void documentFetched(HttpCrawler arg0, HttpDocument arg1,
			IHttpDocumentFetcher arg2) {
		logger.info("crawlerFinished not implemented");

	}

	@Override
	public void documentHeadersFetched(HttpCrawler arg0, String arg1,
			IHttpHeadersFetcher arg2, Properties arg3) {
		logger.info("documentHeadersFetched not implemented");

	}

	@Override
	public void documentHeadersRejected(HttpCrawler arg0, String arg1,
			IHttpHeadersFilter arg2, Properties arg3) {
		logger.info("crawlerFinished not implemented");

	}

	@Override
	public void documentImportRejected(HttpCrawler arg0, HttpDocument arg1) {
		logger.info("documentImportRejected not implemented");

	}

	@Override
	public void documentImported(HttpCrawler arg0, HttpDocument arg1) {
		logger.info("crawlerFinished not implemented");

	}

	@Override
	public void documentPostProcessed(HttpCrawler arg0, HttpDocument arg1,
			IHttpDocumentProcessor arg2) {
		logger.info("documentPostProcessed not implemented");

	}

	@Override
	public void documentPreProcessed(HttpCrawler arg0, HttpDocument arg1,
			IHttpDocumentProcessor arg2) {
		logger.info("crawlerFinished not implemented");

	}

	@Override
	public void documentRejected(HttpCrawler arg0, HttpDocument arg1,
			IHttpDocumentFilter arg2) {
		logger.info("crawlerFinished not implemented");

	}

	@Override
	public void documentRobotsMetaRejected(HttpCrawler arg0, String arg1,
			RobotsMeta arg2) {
		logger.info("documentRobotsMetaRejected not implemented");

	}

	@Override
	public void documentRobotsTxtRejected(HttpCrawler arg0, String arg1,
			IURLFilter arg2, RobotsTxt arg3) {
		logger.info("documentRobotsTxtRejected not implemented");

	}

	@Override
	public void documentURLRejected(HttpCrawler arg0, String arg1,
			IURLFilter arg2) {
		logger.info("documentURLRejected not implemented");

	}

	@Override
	public void documentURLsExtracted(HttpCrawler arg0, HttpDocument arg1) {
		logger.info("documentURLsExtracted not implemented");

	}

}
