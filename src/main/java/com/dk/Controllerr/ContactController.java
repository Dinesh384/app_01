package com.dk.Controllerr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dk.Entity.Contact;
import com.dk.Service.ContactService;
 
@Controller
public class ContactController {
	
	@Autowired
	private ContactService service;
	
	
	@GetMapping("/contact")
	public String loadContactForm(Model model)
	{
		Contact contactObj = new Contact();
 
		model.addAttribute("contact",contactObj); 

		return "contact-info";
	} 
	
	@PostMapping("/saveContact")
	public String saveContact(Contact contact, Model model)
	{
		String msg = null;
		if(contact.getContactId()==null)
		{
			msg = "Contact Saved Sucessfully";
		} else 
		{
			msg="Contact Updated Sucessfully";
		}
		
		boolean isSaved = service.saveContact(contact);
		if(isSaved)
		{
			model.addAttribute("SucessMsg", msg);
		} else 
			model.addAttribute("ErrMsg", "Contact Not Saved");
		 
		return "contact-info";
	}     
	 
	@GetMapping("/viewContacts")
	public String viewAllContacts(Model model)
	{ 
		List<Contact> allContacts = service.getAllContacts();
		
		model.addAttribute("contacts", allContacts);
		return "contacts";
	} 
	 
	@GetMapping("/editContact")
	public String editContacts(@RequestParam("cid")Integer cid,Model model)
	{
		Contact contactObj = service.getContactById(cid);
		model.addAttribute("contact", contactObj);
		return "contact-info";
	}  
	
	@GetMapping("/delete")
	public String deleteContact(@RequestParam("cid") Integer cid, Model model)
	{
		service.deleteContactById(cid); 
		return "redirect:/viewContacts";
	}
	
}
