package com.sunbeam.beans;

import java.util.List;

import com.sunbeam.daos.CandidateDao;
import com.sunbeam.daos.CandidateDaoImpl;
import com.sunbeam.entities.Candidate;

public class CandidateListBean {
private List<Candidate> candlist;

public List<Candidate> getCandlist() {
	return candlist;
}

public void setCandlist(List<Candidate> candlist) {
	this.candlist = candlist;
}
public void fetchCandidates() {
	try (CandidateDao candao= new CandidateDaoImpl()){
		this.candlist=candao.findAll();
	} catch (Exception e) {
		e.printStackTrace();
		throw new RuntimeException(e);
		
	}
}
}
