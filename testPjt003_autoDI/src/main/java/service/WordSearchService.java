package service;

import javax.inject.Inject;
import javax.inject.Named;

import dao.WordDao;
import main.WordSet;

public class WordSearchService {
	
	//@Resource
	//@Autowired(required = false)
	//@Qualifier("usedDao")
	@Inject
	@Named(value="wordDao1")
	private WordDao wordDao;
	
	public WordSearchService() {
	}
	
	public WordSearchService(WordDao wordDao) {
		this.wordDao = wordDao;
	}
	
	public WordSet searchWord(String wordKey) {
		if(verify(wordKey)) {
			return wordDao.select(wordKey);
		} else {
			System.out.println("WordKey information is available.");
		}
		
		return null;
	}
	
	public boolean verify(String wordKey){
		WordSet wordSet = wordDao.select(wordKey);
		return wordSet != null ? true : false;
	}
	
	public void setWordDao(WordDao wordDao) {
		this.wordDao = wordDao;
	}
	
}