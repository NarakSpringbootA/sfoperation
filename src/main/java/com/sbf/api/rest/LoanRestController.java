package com.sbf.api.rest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sbf.api.model.Loan;
import com.sbf.api.service.LoanService;

@RestController
public class LoanRestController {

	@Autowired
	private LoanService loanService;
	
	@GetMapping("/loan/list")
	public Map<String,Object> getAllLoans(){
		List<Loan> loans = loanService.getAllLoan();
		Map<String,Object> map = new HashMap<>();
		map.put("message", "get all loan successfully");
		map.put("status", true);
		map.put("data", loans);
		return map ;
	}
}
