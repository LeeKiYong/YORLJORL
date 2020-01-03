package Service.Manager;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Command.manager.ContractCommand;
import Model.DTO.ContractDTO;
import Repository.Manager.ContractRepository;

@Service
public class ContractInsertService {

	@Autowired
	ContractRepository contractRepository;
	
	public void insert(ContractCommand contractCommand) {
		ContractDTO dto = new ContractDTO();
		dto.setProviderNum(contractCommand.getProviderNum());
		dto.setIngredientName(contractCommand.getIngredientName());
		dto.setContractPrice(contractCommand.getContractPrice());
		dto.setIngredientRegion(contractCommand.getIngredientRegion());
		
		
		SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date = dt.parse(contractCommand.getContractDate());
			Timestamp contractDate = new Timestamp(date.getTime());
			dto.setContractDate(contractDate);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Date date1 = dt.parse(contractCommand.getContractExirationDate());
			Timestamp contractExpirationDate = new Timestamp(date1.getTime());
			dto.setContractExpirationDate(contractExpirationDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(dto.getProviderNum());
		System.out.println(dto.getContractDate());
		System.out.println(dto.getContractExpirationDate());
		System.out.println(dto.getIngredientName());
		System.out.println(dto.getContractPrice());
		System.out.println(dto.getIngredientRegion());
		
		contractRepository.insertContract(dto);
	}

}
