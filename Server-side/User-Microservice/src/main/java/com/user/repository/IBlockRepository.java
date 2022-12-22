package com.user.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.entity.Block;

@Repository
public interface IBlockRepository extends JpaRepository<Block,Integer>{
	public Block findByUserIdAndBookId(int userId,int bookId);
}
