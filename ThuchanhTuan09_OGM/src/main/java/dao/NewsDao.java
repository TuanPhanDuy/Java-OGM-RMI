package dao;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import entity.News;

public interface NewsDao extends Remote{
//	+  getNewsByTagsOrCategoriesName(value: String): List<News>
	public List<News> getNewsByTagsOrCategoriesName(String value) throws RemoteException;
	public News getNews(Long id) throws RemoteException;
//	+ listNewsByUserEmail(email: String) : List<News>
	public List<News> listNewsByUserEmail(String email) throws RemoteException;
}
