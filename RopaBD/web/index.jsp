<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page session="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>La Cachina Store - Login</title>
    <style>
        @import url('https://media.revistagq.com/photos/5ca5e33cf464880647f467b4/16:9/w_2580,c_limit/tiendas_moda_hombre_madrid_240364908.jpg');
        
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: 'Poppins', sans-serif;
        }
        
        body {
            background: linear-gradient(rgba(0, 0, 0, 0.5), rgba(0, 0, 0, 0.5)), 
                        url('https://media.revistagq.com/photos/5ca5e33cf464880647f467b4/16:9/w_2580,c_limit/tiendas_moda_hombre_madrid_240364908.jpg');
            background-size: cover;
            background-position: center;
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
            color: #fff;
        }
        
        .auth-container {
            background: rgba(255, 255, 255, 0.1);
            backdrop-filter: blur(15px);
            padding: 2.5rem;
            border-radius: 20px;
            width: 90%;
            max-width: 400px;
            box-shadow: 0 10px 25px rgba(0, 0, 0, 0.2);
            border: 1px solid rgba(255, 255, 255, 0.2);
            animation: fadeIn 0.6s ease-out;
        }
        
        @keyframes fadeIn {
            from { opacity: 0; transform: translateY(20px); }
            to { opacity: 1; transform: translateY(0); }
        }
        
        .logo {
            text-align: center;
            margin-bottom: 1.5rem;
        }
        
        .logo h1 {
            font-size: 2rem;
            font-weight: 600;
            background: linear-gradient(to right, #ff6b6b, #ff8e53);
            -webkit-background-clip: text;
            -webkit-text-fill-color: transparent;
        }
        
        .form-group {
            margin-bottom: 1.5rem;
        }
        
        .form-group input {
            width: 100%;
            padding: 12px 20px;
            border: none;
            border-radius: 50px;
            background: rgba(255, 255, 255, 0.9);
            font-size: 1rem;
            transition: all 0.3s;
        }
        
        .form-group input:focus {
            outline: none;
            box-shadow: 0 0 0 3px rgba(255, 107, 107, 0.3);
        }
        
        .btn {
            width: 100%;
            padding: 12px;
            border: none;
            border-radius: 50px;
            background: linear-gradient(to right, #ff6b6b, #ff8e53);
            color: white;
            font-weight: 600;
            cursor: pointer;
            transition: all 0.3s;
            font-size: 1rem;
        }
        
        .btn:hover {
            transform: translateY(-3px);
            box-shadow: 0 5px 15px rgba(255, 107, 107, 0.4);
        }
        
        .auth-footer {
            text-align: center;
            margin-top: 1.5rem;
            color: rgba(255, 255, 255, 0.7);
        }
        
        .auth-footer a {
            color: #ff6b6b;
            text-decoration: none;
            font-weight: 500;
        }
        
        .error-message {
            color: #ffcc00;
            text-align: center;
            margin-bottom: 1rem;
            font-weight: 500;
        }
    </style>
</head>
<body>
    <div class="auth-container">
        <div class="logo">
            <h1>EL PEPE STORE</h1>
        </div>
        
        <% if (request.getAttribute("error") != null) { %>
            <div class="error-message"><%= request.getAttribute("error") %></div>
        <% } %>
        
        <form action="LoginControl" method="post">
            <div class="form-group">
                <input type="text" name="usuario" placeholder="Usuario" required>
            </div>
            <div class="form-group">
                <input type="password" name="contrasena" placeholder="Contraseña" required>
            </div>
            <button type="submit" class="btn">INICIAR SESIÓN</button>
        </form>
        
        <div class="auth-footer">
            ¿No tienes cuenta? <a href="crearCuenta.jsp">Regístrate aquí</a>
        </div>
    </div>
</body>
</html>