package com.practice.daoImpl;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.practice.dao.FirstDAO;
import com.practice.vo.DataPracticeVO;

import hibernate.util.HibernateUtil;

public class FirstDAOImpl implements FirstDAO {

	public void insert(ArrayList<DataPracticeVO> dataPracticeVOList) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tx = session.beginTransaction();

		try {
			for (DataPracticeVO vo : dataPracticeVOList) {
				session.saveOrUpdate(vo);
			}
			tx.commit();

		} catch (RuntimeException ex) {
			if (tx != null)
				tx.rollback();
			ex.printStackTrace();
		} finally {
			HibernateUtil.getSessionFactory().close();
		}
	}

	// public void testInsert(TestTableVO testTableVO) {
	// Session session = HibernateUtil.getSessionFactory().getCurrentSession();
	// Transaction tx = session.beginTransaction();
	// try {
	// session.save(testTableVO);
	// tx.commit();
	// } catch (RuntimeException ex) {
	// if (tx != null)
	// tx.rollback();
	// ex.printStackTrace();
	// } finally {
	// HibernateUtil.getSessionFactory().close();
	// }
	// }
}

// private static final String INSERT_STMT = "INSERT INTO FAKETABLE(id)
// values(?)";
// SQLQuery sqlQuery = session.createSQLQuery(INSERT_STMT);
// sqlQuery.setString(0, "123");
// sqlQuery.setString(1, "123");
// sqlQuery.setString(2, "123");
// sqlQuery.setCharacter(3, 'A');
// sqlQuery.setDate(4, new Date());
// sqlQuery.setString(5, "123");
// sqlQuery.setDate(6, new Date());
// sqlQuery.setString(7, "123");
// sqlQuery.setDate(8, new Date());
// sqlQuery.executeUpdate();
// session.getTransaction().commit();
