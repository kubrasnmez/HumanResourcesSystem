package hrmsDemo.hrms.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import hrmsDemo.hrms.entities.concretes.Position;

public interface PositionService {
	List<Position> getAll();
}
