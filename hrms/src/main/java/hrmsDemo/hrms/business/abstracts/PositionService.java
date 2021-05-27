package hrmsDemo.hrms.business.abstracts;

import java.util.List;

import hrmsDemo.hrms.core.utilities.results.DataResult;
import hrmsDemo.hrms.core.utilities.results.Result;
import hrmsDemo.hrms.entities.concretes.Position;

public interface PositionService {
	DataResult<List<Position>> getAll();
	Result add(Position position);
}
