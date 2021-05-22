package lesson4hmw3;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServisAdapter implements GamerCheckService{

	@Override
	public boolean CheckIfRealPerson(Gamer gamer) {
		
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		
		boolean result = false;
		
		try 
		{
			//result = kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()), gamer.getFirstName().toUpperCase(), gamer.getLastName().toUpperCase(), Integer.parseInt(gamer.getDateOfBirth()));
			result = true;
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return result;
	}

}
