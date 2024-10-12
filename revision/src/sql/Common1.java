package sql;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Common1 {

	public static void main(String[] args) {
		
		
		DBrespone dbResponse = new DBrespone();

		List<PrimaryData> primaryResponse = dbResponse.getPrimaryDb();

		List<SecondaryData> secondaryResponse = dbResponse.getSecondaryDb();

		Map<String, PrimaryData> primaryMap = new HashMap<String, PrimaryData>();

		if (!primaryResponse.isEmpty()) {

			for (PrimaryData primaryData : primaryResponse) {

				if (primaryData.getMobilenumber() != null) {

					primaryMap.put(primaryData.getMobilenumber(), primaryData);
					
					
					
				}
			}
		}

		if (!secondaryResponse.isEmpty()) {

			for (SecondaryData secondaryData : secondaryResponse) {

				if (secondaryData.getMobilenumber() != null) {

					 PrimaryData primaryData = primaryMap.get(secondaryData.getMobilenumber());
					System.out.println(primaryMap.get(secondaryData.getMobilenumber()));
				
  					System.out.println(primaryData.getMobilenumber());
					System.out.println(primaryData.getName());
					System.out.println(secondaryData.getAddress());
				}
			}
		}

	}


		
		
		
	}


