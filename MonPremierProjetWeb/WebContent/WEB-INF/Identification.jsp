<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Inscription</title>
        <link type="text/css" rel="stylesheet" href="form.css" />
    </head>
    <body>
  
    
        <form method= post action="Identification">
            <fieldset>
                <legend>Identification</legend>
                <p>Vous pouvez vous inscrire via ce formulaire.</p>
                
                
				<label for="nom">Nom d'utilisateur</label>
                <input type="text" id="nom" name="nom" value="" size="20" maxlength="20" />
                <br />
                
                <label for= "prenom">Prenom</label>
                <input type= "text" id="prenom">
				<br>
                <label for="email">Adresse email <span class="requis">*</span></label>
                <input type="text" id="email" name="email" value="" size="20" maxlength="60" />
                <br />

				<label for="login"> login</label>
                <input type="text">
                <br />
                <label for="motdepasse">Mot de passe <span class="requis">*</span></label>
                <input type="password" id="motdepasse" name="motdepasse" value="" size="20" maxlength="20" />
                <br />
                <input type="submit" value="Identification" />
                <br />
            </fieldset>
        </form>
        
     
    </body>
</html>