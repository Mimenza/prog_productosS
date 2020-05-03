package api;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import modelo.bean.Producto;
import modelo.bean.Usuario;
import modelo.dao.ModeloProducto;
import modelo.dao.ModeloUsuario;

/**
 * Servlet implementation class ApiCreateProducto
 */
@WebServlet("/ApiCreateProducto")
public class ApiCreateProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ApiCreateProducto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//datuak jaso
				request.setCharacterEncoding("UTF-8");//ENIEAK ETA ONDO IRAKURTZEKO
				String jsonProducto = request.getParameter("producto");
				
				System.out.println(jsonProducto);
				JSONObject jsonObject = new JSONObject(jsonProducto);
				
				//komiki objetua sortu
				Producto producto = new Producto();
				usuario.setNombreApellido(jsonObject.getString("nombreApellido"));
				producto.set
				
				ModeloProducto mProducto = new ModeloProducto();
				
				mProducto.insert(producto);
				
				
					try {
						mProducto.getConexion().close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
					response.setHeader("Acess-Control-Allow-Origin", "");//json deia denean ez da behar
					
				
			
	}

}
