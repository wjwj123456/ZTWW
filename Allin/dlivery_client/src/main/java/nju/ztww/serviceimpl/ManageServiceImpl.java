package nju.ztww.serviceimpl;

import java.util.ArrayList;

import nju.ztww.bl.manage.ManageBL;
import nju.ztww.service.ManageService;
import nju.ztww.vo.GenerateVO;
import nju.ztww.vo.SuperviseeVO;

public class ManageServiceImpl implements ManageService {
    private ManageBL manageBL = new ManageBL();
	public ArrayList<SuperviseeVO> getSuperviseeList(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public SuperviseeVO getSupervisee(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void addSupervisee(String id) {
		// TODO Auto-generated method stub
		
	}

	public void deleteSupervisee(String id) {
		// TODO Auto-generated method stub
		
	}

	public void modifySupervisee(String id) {
		// TODO Auto-generated method stub
		
	}

	public ArrayList<GenerateVO> getCheckOrder(int index) {
		// TODO Auto-generated method stub
		return manageBL.getCheckOrder(index);
	}

}