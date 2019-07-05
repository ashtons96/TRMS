package com.revature.sullivan.services;

import java.sql.SQLException;
import java.util.List;

import com.revature.sullivan.DAO.RequestDAOImpl;
import com.revature.sullivan.pojo.Request;

public class RequestImpl implements RequestService {
	private static RequestDAOImpl rdi = new RequestDAOImpl();

	public void createRequest(Request r)
	{
		System.out.println(r.getFirstName());
		rdi.createRequest(r);
	}

	public List<Request> viewFormBySupervisorID(Integer ID) {
		return rdi.viewFormBySupervisorID(ID);
	}
	
	public List<Request> viewFormByBenCo(Integer ID) {
		return rdi.viewFormByBenCo(ID);
	}

	
	public List<Request> viewFormByDeptHead(Integer ID) {
		return rdi.viewFormByDeptHead(ID);
	}

	public Request getFormByID(Integer requestID) {
		return rdi.getFormByID(requestID);
	}

	
	public void DSApproveForm(Integer formID) {
		rdi.DSApproveForm(formID);
	}

	
	public void DSDenyForm(Integer formID) {
		rdi.DSDenyForm(formID);
	}

	
	public void DHApproveForm(Integer formID) {
		rdi.DHApproveForm(formID);
	}

	
	public void DHDenyForm(Integer formID) {
		rdi.DHDenyForm(formID);
	}


	public void BenCoApproveForm(Integer formID) {
		rdi.BenCoApproveForm(formID);
	}

	
	public void BenCoDenyForm(Integer formID) {
		rdi.BenCoDenyForm(formID);
	}

	@Override
	public Request getRequestById(Integer requestID) {
		// TODO Auto-generated method stub
		return null;
	}

	


}
