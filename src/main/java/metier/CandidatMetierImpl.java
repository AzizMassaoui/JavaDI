package metier;
import dao.ICandidatDao;
public class CandidatMetierImpl implements ICandidatMetier {
ICandidatDao dao =null;
//méthode pour l’injection de dépendance
public void setDao(ICandidatDao dao)
{
this.dao = dao;
}
//Redéfinition de la méthode isSucces()
public boolean isSucces()
{
int score= dao.getScore();
//retourner «true» si le score est supérieur ou égal au score minimum, sinon retourner «false»
return (score>=SCORE_MIN);
	}
}