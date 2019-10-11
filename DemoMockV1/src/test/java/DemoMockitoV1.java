
import BO.MedecinBO;
import DAO.ImedecinDAO;
import Service.MedecinService;
import java.sql.SQLException;
import org.junit.jupiter.api.Assertions;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author lorris
 */
public class DemoMockitoV1 {
    
     public void testMockito() throws SQLException 
    {
        ImedecinDAO dao = mock(ImedecinDAO.class);
        
        MedecinService service = new MedecinService(dao);
        
        MedecinBO bo = new MedecinBO(); 
        bo.setPrenom("test");
        
        when(dao.getElementById(1)).thenReturn(bo);
        
        MedecinBO boTest = service.getElementById(1);
        

        Assertions.assertEquals(bo.getPrenom(),boTest.getPrenom());
                
        
        
    }  
    
    
}
