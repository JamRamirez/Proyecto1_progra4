/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.usuario;

import logic.Usuario;

/**
 *
 * @author jamca
 */
public class ModelLogin {
    Usuario current_user ;

    public ModelLogin() {
        current_user= null;
    }

    public Usuario getCurrent_user() {
        return current_user;
    }

    public void setCurrent_user(Usuario c) {
        this.current_user = c;
    }
}

