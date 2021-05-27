package hrmsDemo.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrmsDemo.hrms.business.abstracts.PositionService;
import hrmsDemo.hrms.core.utilities.results.DataResult;
import hrmsDemo.hrms.core.utilities.results.Result;
import hrmsDemo.hrms.core.utilities.results.SuccessDataResult;
import hrmsDemo.hrms.core.utilities.results.SuccessResult;
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
	public DataResult<List<Position>> getAll() {
		
		return new SuccessDataResult<List<Position>>(this.positionDao.findAll(),"Pozisyonlar listelendi.");
				
	}

	@Override
	public Result add(Position position) {
		this.positionDao.save(position);
		return new SuccessResult("Ürün eklendi.");
	}

}
