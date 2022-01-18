package project.masterpiece.pieceworks.project.model.service;

import java.util.ArrayList;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.masterpiece.pieceworks.project.model.dao.ProjectDAO;
import project.masterpiece.pieceworks.project.model.vo.PageInfo;
import project.masterpiece.pieceworks.project.model.vo.Project;

@Service("pService")
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	private ProjectDAO pDAO;
	
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public int insertProject(Project p) {
		return pDAO.insertProject(sqlSession, p);
	}

	@Override
	public int getListCount() {
		return pDAO.getListCount(sqlSession);
	}

	@Override
	public ArrayList<Project> selectList(PageInfo pi) {
		return pDAO.selectList(sqlSession, pi);
	}

	@Override
	public ArrayList<Project> getPList(String email) {
		return pDAO.getPList(sqlSession, email);
	}

	@Override
	public int insertPrJoin(Project p) {
		return pDAO.insertPrJoin(sqlSession, p);
	}
}
