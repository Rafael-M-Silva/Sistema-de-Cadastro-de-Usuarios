package SistemaCadastroUsuários;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cadastro")
public class CadastroUsuarioServlet extends HttpServlet {

    private static final long serialVersionUID = 3740707205595942177L;
	private Object inserirUsuario;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome = request.getParameter("nome");
        String email = request.getParameter("email");
        String senha = request.getParameter("senha");

        Usuario novoUsuario = new Usuario(); 
      	Usuario usuario1 = new Usuario(); 
		Usuario usuario = null;
        
		if (usuario(novoUsuario)) {
          
            response.sendRedirect("perfil.jsp");
        } else {
            
            response.sendRedirect("cadastro.jsp");
        }
    }

    
    private boolean usuario(Usuario novoUsuario) {
		// TODO Stub de método gerado automaticamente
		return false;
	}


	@SuppressWarnings("unused")
	private void exibirPerfil(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
        response.sendRedirect("perfil.jsp");
    }

 
    @SuppressWarnings("unused")
	private void efetuarLogout(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     
        response.sendRedirect("login.jsp");
    }


	public Object getInserirUsuario() {
		return inserirUsuario;
	}


	public void setInserirUsuario(Object inserirUsuario) {
		this.inserirUsuario = inserirUsuario;
	}
}


