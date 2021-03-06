package service;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import dao.WordDao;
import main.WordSet;

public class WordRegisterService {
	
	//@Resource
	//@Autowired
	//@Qualifier("usedDao")
	@Inject
	@Named(value="wordDao1")
	private WordDao wordDao;
	
	public WordRegisterService() {
	}
	
	public WordRegisterService(WordDao wordDao) {
		this.wordDao = wordDao;
	}
	
	public void register(WordSet wordSet) {
		String wordKey = wordSet.getWordKey();
		if(verify(wordKey)) {
			wordDao.insert(wordSet);
		} else {
			System.out.println("The word has already registered.");
		}
	}
	
	public boolean verify(String wordKey){
		WordSet wordSet = wordDao.select(wordKey);
		return wordSet == null ? true : false;
	}
	
	
	public void setWordDao(WordDao wordDao) {
		this.wordDao = wordDao;
	}
	
}