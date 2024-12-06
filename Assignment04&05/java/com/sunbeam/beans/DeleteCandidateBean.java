package com.sunbeam.beans;

import com.sunbeam.daos.CandidateDao;
import com.sunbeam.daos.CandidateDaoImpl;

public class DeleteCandidateBean {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String deleteCandidate() {
        try (CandidateDao candDao = new CandidateDaoImpl()) {
            int count = candDao.deleteById(id);
            return count > 0 ? "Candidate deleted successfully." : "Candidate not found.";
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
