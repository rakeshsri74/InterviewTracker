package com.iiht.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.iiht.model.Interview;

@Repository("interviewDao")
@Transactional(propagation= Propagation.REQUIRED)
public class InterviewDaoImpl implements InterviewDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void addNewInterview(Interview interview) {
		Session session = sessionFactory.getCurrentSession();
		session.save(interview);

	}

	public void editInterview(Interview interview) {
		Session session = sessionFactory.getCurrentSession();
		session.update(interview);
	}

	public List<Interview> showAllInterviews() {
		Session session = sessionFactory.getCurrentSession();
		List<Interview> interviewList = session.createQuery("from Interview").list();
		return interviewList;
	}

	public void deleteInterview(long interviewId) {
		Session session = sessionFactory.getCurrentSession();
		Interview interview = session.load(Interview.class,new Long(interviewId));
		if(null != interview)
		{
			session.delete(interview);
		}
	}

	public Interview searchInterviewByName(String interviewName) {
		Session session = sessionFactory.getCurrentSession();
		Interview interview = (Interview)session.createQuery("from Interview where interviewName="+interviewName);
		return interview;
	}

	public Interview searchByInterviewerName(String interviewerName) {
		Session session = sessionFactory.getCurrentSession();
		Interview interview = (Interview)session.createQuery("from Interview where interviewerName="+interviewerName);
		return interview;
		
	}

	public int displayCountOfInterview() {
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(Interview.class);
        criteria.setProjection(Projections.rowCount());
        Integer rowCount = 0; 
        List interview = criteria.list();
        if (interview!=null) {
            rowCount = (Integer) interview.get(0);
         }
		return rowCount;
	}

}
