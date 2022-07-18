package com.shopme.admin.catergories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import com.shopme.common.entity.Catergory;

@Repository
public interface CatergoryRepository extends PagingAndSortingRepository<Catergory, Integer>	
{
	@Query("Select c FROM Catergory c WHERE c.parent.id is NULL")
	public List<Catergory> findRootCatergories();
	
	
}

