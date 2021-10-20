// **********************************************
// Base class for all Web Forms
// Instant WEB Application: www.progamma.com
// **********************************************

import com.progamma.is.*;
import com.progamma.*;

import java.io.*;
import java.util.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;


// **********************************************
// Command Handler
// **********************************************
public class MyWebForm extends WebForm implements Serializable
{
	public void UnloadForm(IDVariant Cancel, boolean flRis)
	{
	  IDVariant c=new IDVariant();
	  flRis |= (OpenAs == Glb.OPEN_MDI) || (OpenAs == Glb.OPEN_POPUP);
	  //
	  super.UnloadForm(Cancel, flRis);
	  IntFormUnload(c, new IDVariant(flRis));
    SubIntFormUnload(c, new IDVariant(flRis));
	  if (c.intValue() == 0 && flRis)
	  {
	    if (!AutoSaveType.equals("NONE"))
	    {
	      if ((Document()!=null && Document().IsModified()) || MyGlb.IsFormUpdated(Frames))
	      {
	        String saveType = AutoSaveType;
          //
	        if (AutoSaveType.equals("DENY") || AutoSaveType.equals("ASK"))
	        {
	          if (AutoSaveType.equals("DENY"))
            {
  	        	MainFrm.set_AlertMessage(new IDVariant(MainFrm.RTCObj.GetConst("7F57A01D-DEB4-452E-A9A2-22096BD405D6", "La videata contiene dati non salvati. Prima di chiudere, salvare i dati o annullare le modifiche.")));
  	          Cancel.set(new IDVariant(-1));
  	          return;
  	        }
  	        else
            {
              IDVariant ret = MainFrm.MessageConfirmEx(IDL.FormatMessage(new IDVariant(MainFrm.RTCObj.GetConst("46C4490C-6369-4da4-ACE1-2AFDF7D9A877", "Salvare le modifiche alla videata <b>|1</b>?")), Caption()), new IDVariant(MainFrm.RTCObj.GetConst("461FCE2D-DA69-4822-A2BF-0F4EC5B2C122", "Salva;Non salvare;Annulla")));
              //
              if (ret.Type == IDVariant.NULL)
              {
                Cancel.set(new IDVariant(-1));
                return;
              }
              else
              {
                switch (ret.intValue())
                { 
                  case 1 :
                    // Prima risposta: devo salvare le modifiche
                    saveType = "SAVE";
                  break;

                  case 3:
                    // Terza risposta: devo annullare la chiusura (Cancel a True)
                    Cancel.set(new IDVariant(-1));
                    return;
                }
              }
            }
	        }
	        if (saveType.equals("SAVE"))
	        {
	        	if (Document()!=null && Document().IsModified())
	        	{
	        		try
	        		{
	        			Document().SaveToDB();
	        		}
	        		catch(Exception e)
	        		{
	        			// Non dico nulla...
	        		}
	        	}
	        	//
	          MyGlb.UpdateForm(Frames);
	          //
	          if ((Document()!=null && Document().IsModified()) || MyGlb.IsFormUpdated(Frames))
	          {
		        	MainFrm.set_AlertMessage(new IDVariant(MainFrm.RTCObj.GetConst("7F57A01D-DEB4-452E-A9A2-22096BD405D6", "La videata contiene dati non salvati. Prima di chiudere, salvare i dati o annullare le modifiche.")));
		          Cancel.set(new IDVariant(-1));
		          return;
	          }
	        }
	      }
	    }
	  }
	  if (c.intValue() != 0)
	    Cancel.set(new IDVariant(-1));
	  else
	  	ReleaseLock();
	}
}
