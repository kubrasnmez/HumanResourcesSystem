package hrmsDemo.hrms.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;

import hrmsDemo.hrms.entities.concretes.Position;


public interface PositionDao extends JpaRepository<Position,Integer>{
	


}
