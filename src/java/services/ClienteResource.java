package services;

import com.google.gson.Gson;
import dao.ClienteDao;
import java.util.ArrayList;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import models.ClienteBean;

/**
 *
 *
 *
 */
@Path("cliente")
public class ClienteResource {

    @Context
    private UriInfo context;

    public ClienteResource() {
    }
    
    ArrayList<ClienteBean> listado = new ArrayList<>();

    @GET
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    public String getHtml() {
        ClienteDao clidao = new ClienteDao();
        ArrayList<ClienteBean> cli = clidao.mostrarCliente();
        String gSon = new Gson().toJson(cli);
        return gSon;
       
    }

    /**
     * PUT method for updating or creating an instance of ClienteResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(javax.ws.rs.core.MediaType.TEXT_HTML)
    public void putHtml(String content) {
    }
}
