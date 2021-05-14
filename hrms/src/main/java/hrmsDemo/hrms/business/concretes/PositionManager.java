package hrmsDemo.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrmsDemo.hrms.business.abstracts.PositionService;
import hrmsDemo.hrms.dataAccess.abstracts.PositionDao;
import hrmsDemo.hrms.entities.concretes.Position;

@Service
public class PositionManager implements PositionService{

	private PositionDao positionDao;
	
	@Autowired
	public PositionManager(PositionDao positionDao) {
		super();
		this.positionDao = positionDao;
	}
	
	@Override
	public List<Position> getAll() {
		
		return this.positionDao.findAll();
	}

}
