package com.shopix.serviceImpl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopix.beans.Commande;
import com.shopix.beans.CommandeItem;
import com.shopix.dao.CommandeDao;
import com.shopix.dao.CommandeItemDao;
import com.shopix.service.CommandeItemService;
@Service
public class CommandeItemServiceImpl implements CommandeItemService{
    @Autowired
	private CommandeItemDao commandeItemDao;
    @Autowired
    private CommandeDao commandeDao;
    
	
	@Override
	public int save(Commande commande, Collection<CommandeItem> commandeItems) {
//		commandeDao.save(commande);
//	    System.out.println("saving the commande");
//		for (CommandeItem commandeItem : commandeItems) {
//			System.out.println("*********************************************************");
//			System.out.println(commandeItem.getNbrPiece());
//			commandeItem.setCommande(commande);
//			commandeItem.setTotal(commandeItem.getPrixPiece()*commandeItem.getNbrPiece());
//			commandeItemDao.save(commandeItem);
//		}
		return 1;
	}

}
