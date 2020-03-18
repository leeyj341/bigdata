package spring.data.mongodb.dao;

import java.util.List;

import spring.data.mongodb.dto.ScoreDTO;

public interface ScoreMongoDAO {
	public List<ScoreDTO> findCriteria(String key,String value);
	public ScoreDTO findById(String key,String value);
	public void insertDocument(ScoreDTO doc);
	public void insertAllDocument(List<ScoreDTO> docs);
	public void update(ScoreDTO document);
	public List<ScoreDTO> findAll();
	public List<ScoreDTO> findAll(int pageNo);
}
