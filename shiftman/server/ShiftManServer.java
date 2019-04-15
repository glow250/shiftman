package shiftman.server;

import java.util.List;

public class ShiftManServer implements ShiftMan {

	@Override
	public String newRoster(String shopName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String setWorkingHours(String dayOfWeek, String startTime, String endTime) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String addShift(String dayOfWeek, String startTime, String endTime, String minimumWorkers) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String registerStaff(String givenname, String familyName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String assignStaff(String dayOfWeek, String startTime, String endTime, String givenName, String familyName,
			boolean isManager) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getRegisteredStaff() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getUnassignedStaff() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> shiftsWithoutManagers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> understaffedShifts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> overstaffedShifts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getRosterForDay(String dayOfWeek) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getRosterForWorker(String workerName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getShiftsManagedBy(String managerName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String reportRosterIssues() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String displayRoster() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
