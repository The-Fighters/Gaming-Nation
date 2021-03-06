package tag.ejb.sessionBean.produit;

import java.util.List;

import javax.ejb.Local;

import tag.ejb.domain.*;

@Local
public interface IProduitLocal {

	public String AddProduit(Produit p);
	public List<Produit> getAllProduit();
	public List<Produit> chercherProduit(String m);
	public Produit getProduit(Long id);
	public void updateProduit(Produit p);
	public void supprimerProduit(Long idProduit,String idUser);
	public User FindUser(String id);
	
}
