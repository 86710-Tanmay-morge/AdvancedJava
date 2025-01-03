package com.sunbeam.daos;

import java.util.List;

import com.sunbeam.entities.Candidate;
import com.sunbeam.entities.User;

public interface CandidateDao extends AutoCloseable {
	List<Candidate> findAll() throws Exception;
	Candidate findById(int id) throws Exception;
	int save(Candidate c) throws Exception;
	int update(Candidate user) throws Exception;
	int deleteById(int id) throws Exception;
	int incrVote(int candId) throws Exception;
}