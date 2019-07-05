package com.revature.sullivan.services;

import java.util.List;

import com.revature.sullivan.pojo.Request;

public interface RequestService {
	
	public void createRequest(Request r);
	
	public List<Request> viewFormBySupervisorID(Integer ID);
	
	public List<Request> viewFormByDeptHead(Integer ID);
	
	public List<Request> viewFormByBenCo(Integer ID);
	
	public Request getRequestById(Integer requestID);
	
	public void DSApproveForm(Integer formID);
	
	public void DSDenyForm(Integer formID);
	
	public void DHApproveForm(Integer formID);
	
	public void DHDenyForm(Integer formID);
	
	public void BenCoApproveForm(Integer formID);
	
	public void BenCoDenyForm(Integer formID);



}
