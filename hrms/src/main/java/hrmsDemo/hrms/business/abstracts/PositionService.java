package hrmsDemo.hrms.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import hrmsDemo.hrms.core.utilities.results.DataResult;
import hrmsDemo.hrms.entities.concretes.Position;

public interface PositionService {
	DataResult<List<Position>> getAll();
}
