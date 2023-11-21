package schedule;

import java.util.Date;
import java.util.List;

public class Handler {
	
	private ScheduleDAO dao = new ScheduleDAO();

	public List<ScheduleDTO> selecctAll() {
		return dao.selectAll();
	}

	public String getVerion() {
		return dao.printVersion();
	}

	public Date getSysdate() {
		return dao.selectDate();
	}
	
	

}
