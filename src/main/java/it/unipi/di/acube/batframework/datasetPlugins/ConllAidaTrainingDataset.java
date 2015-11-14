package it.unipi.di.acube.batframework.datasetPlugins;

import it.unipi.di.acube.batframework.data.*;
import it.unipi.di.acube.batframework.utils.*;

import java.io.IOException;
import java.util.*;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.xml.sax.SAXException;

public class ConllAidaTrainingDataset extends ConllAidaDataset{
	private static final int FIRST_DOC_ID = 1;
	private static final int LAST_DOC_ID = 946;

	public ConllAidaTrainingDataset(String file, WikipediaApiInterface api) throws IOException, AnnotationException, XPathExpressionException, ParserConfigurationException, SAXException {
		super(file, api);
	}

	@Override
	public int getSize() {
		return LAST_DOC_ID-FIRST_DOC_ID+1;
	}

	@Override
	public int getTagsCount() {
		int count = 0;
		for (HashSet<Annotation> s : getA2WGoldStandardList())
			count += s.size();
		return count;
	}

	@Override
	public List<HashSet<Tag>> getC2WGoldStandardList() {
		return ProblemReduction.A2WToC2WList(getA2WGoldStandardList());
	}

	@Override
	public List<HashSet<Annotation>> getA2WGoldStandardList() {
		return super.getA2WGoldStandardList().subList(FIRST_DOC_ID-1, LAST_DOC_ID);
	}

	@Override
	public List<HashSet<Annotation>> getD2WGoldStandardList() {
		return getA2WGoldStandardList();
	}

	@Override
	public List<String> getTextInstanceList() {
		return super.getTextInstanceList().subList(FIRST_DOC_ID-1, LAST_DOC_ID);
	}
	
	@Override
	public List<HashSet<Mention>> getMentionsInstanceList() {
		return ProblemReduction.A2WToD2WMentionsInstance(getA2WGoldStandardList());
	}

	@Override
	public String getName() {
		return "AIDA/CO-NLL-TestB";
	}

}
