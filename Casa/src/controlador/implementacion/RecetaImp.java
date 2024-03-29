/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador.implementacion;

import controlador.IngredienteInt;
import controlador.RecetaInt;
import dao.IngredienteDao;
import dao.RecetaDao;
import dao.RecetasIngredientesDao;
import dao.implementacion.IngredienteDaoImp;
import dao.implementacion.RecetaDaoImp;
import dao.implementacion.RecetasIngredientesDaoImp;
import dominio.Ingrediente;
import dominio.Receta;
import dominio.RecetaIngrediente;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author Carolina
 */
public class RecetaImp implements RecetaInt
{

    public void guardar(Receta receta)
    {
      Collection ingredientes = receta.getIngrediente();//creo una coleccion del tipo ingrediente y y le asigno la coleccion de ingredientes que esta en receta
      RecetasIngredientesDao sqlTea = new RecetasIngredientesDaoImp();// instancio un objeto de RecetaIngredienteDao para poder guardar datos en la tea RecetaIngrdiente
      //primero se guarda la receta
      RecetaDao sqlReceta = new RecetaDaoImp();
      sqlReceta.guardar(receta);
      receta.setCodigo(sqlReceta.getCodigo());
      Iterator it = ingredientes.iterator();
      IngredienteDao sqlIngrediente = new IngredienteDaoImp();
      while (it.hasNext())//mientras haya ingredientes
      {
          Ingrediente ingrediente = (Ingrediente)it.next();
          sqlIngrediente.guardar(ingrediente);
          ingrediente.setCodigo(sqlIngrediente.getCodigo());
          sqlTea.guardar(receta.getCodigo(), ingrediente.getCodigo());
      }
    }
    public void modificar(Receta receta)
    {
        Collection ingredientes = receta.getIngrediente();
        RecetasIngredientesDao sql = new RecetasIngredientesDaoImp();
        //quito todos los ingredientes
        sql.borrarIngredientes(receta.getCodigo());
        Iterator it = ingredientes.iterator();
        while(it.hasNext())
        {
            Ingrediente i = (Ingrediente)it.next();
            sql.guardar(receta.getCodigo(), i.getCodigo());
            i = null;
        }
        //Ahora modifico la receta
        RecetaDao sqlReceta = new RecetaDaoImp();
        sqlReceta.modificar(receta);
    }

    public void borrar(Receta receta)
    {
        Collection ingredientes = receta.getIngrediente();
        RecetasIngredientesDao sql = new RecetasIngredientesDaoImp();
        //quito todos los ingredientes de la tea
        sql.borrarIngredientes(receta.getCodigo());
        //ahora elimino los ingredientes creados para esta receta
        IngredienteInt sqlIngredientes = new IngredienteImp();
        Iterator it = ingredientes.iterator();
        while(it.hasNext())
        {
            Ingrediente i = (Ingrediente)it.next();
            sqlIngredientes.borrar(i);
            i = null;
        }
        //Por ultimo, elimino la receta
        RecetaDao sqlReceta = new RecetaDaoImp();
        sqlReceta.borrar(receta);
    }

    public int getCodigoReceta(int CodReceta) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Collection getAll()
    {
        RecetaDao sqlRecetas = new RecetaDaoImp();
//        RecetasIngredientesDao sql = new RecetasIngredientesDaoImp();
        IngredienteInt sqlIngredientes = new IngredienteImp();

//        Collection tea = sql.getAll();
        Collection recetasTemp = sqlRecetas.getAll();
        Collection recetas = new ArrayList();

        Iterator it = recetasTemp.iterator();

        while(it.hasNext())
        {
            Receta receta = (Receta)it.next();
            receta.setIngrediente(sqlIngredientes.getIngredientesReceta(receta.getCodigo()));
//            Iterator i = tea.iterator();
//            Collection ingredientes = new ArrayList();
//            while(i.hasNext())
//            {
//                RecetaIngrediente r = (RecetaIngrediente)i.next();
//                if(r.getCodigoReceta() == receta.getCodigo())
//                {
//                    Ingrediente in = sqlIngredientes.get(r.getCodigoIngrediente());
//                    ingredientes.add(in);
//                    in = null;
//                }
//                r = null;
//            }
//            receta.setIngrediente(ingredientes);
            recetas.add(receta);
            //quito los objetos temporales
//            i = null;
//            ingredientes = null;
            receta = null;
        }
        return recetas;
    }

    public Receta get(int id)
    {
        Receta receta = new Receta();
        RecetaDao sqlRecetas = new RecetaDaoImp();
        receta = sqlRecetas.get(id);
        //obtengo los codigos de los ingredientes que intervienen en la receta
//        RecetasIngredientesDao sqlTea = new RecetasIngredientesDaoImp();
//        Collection tea = sqlTea.getIngredientesReceta(receta.getCodigo());

        IngredienteInt sqlIngredientes = new IngredienteImp();
        receta.setIngrediente(sqlIngredientes.getIngredientesReceta(id));
//        Iterator i = tea.iterator();
//        Collection ingredientes = new ArrayList();
//        while(i.hasNext())
//        {
//            RecetaIngrediente r = (RecetaIngrediente)i.next();
//            Ingrediente in = sqlIngredientes.get(r.getCodigoIngrediente());
//            ingredientes.add(in);
//            in = null;
//            r = null;
//        }
//        receta.setIngrediente(ingredientes);
        return receta;
    }

    public Collection getRecetasPerfil(int idPerfil)
    {
        RecetaDao sqlRecetas = new RecetaDaoImp();
        IngredienteInt sqlIngredientes = new IngredienteImp();
        Collection recetasTemp = sqlRecetas.getRecetasPerfil(idPerfil);
        Collection recetas = new ArrayList();
        Iterator it = recetasTemp.iterator();
        while(it.hasNext())
        {
            Receta receta = (Receta)it.next();
            receta.setIngrediente(sqlIngredientes.getIngredientesReceta(receta.getCodigo()));
            recetas.add(receta);
            receta = null;
        }
        return recetas;
    }

}
