package spring.data.mongodb.dto;

import org.springframework.data.repository.PagingAndSortingRepository;

//spring data프레임워크 내부에서 사용할 저장소
//=> 인터페이스만 선언하면 내부에서 코드가 매핑되기 때문에
//	  지원되는 여러 가지 편리한 기능을 사용할 수 있다. - 설정파일등록
//	  자동으로 지원되는 기능을 사용할 수 있도록 하려면 상속받아야 한다.
//									------
//									PagingAndSortingRepository, CrudRepository
//							(기본CRUD와 paging처리, sort 기능을 지원)	 (기본CRUD기능)
//mongodb에 저장되어 있는 컬렉션의 데이터를 액세스 할 수 있는 기능을
//프레임워크 내부에서 지원하며 컬렉션 내부의 데이터를 자동으로 저장할
//repository역할을 담당

//																      매핑될 클래스, primary키 자료형
public interface ScoreRepository extends PagingAndSortingRepository<ScoreDTO, String>{

}
