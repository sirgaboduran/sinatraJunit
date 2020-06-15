package com.sinatra;

import org.junit.Test;

public class LoginSongsBySinatra extends SongsSinatraParent
{
    @Test
    public void LoginSongs()
    {
        navegar("https://evening-bastion-49392.herokuapp.com/");
        validarHomePage();
        realizarLoginCorrecto("frank", "sinatra");
        validarSongsPage("https://evening-bastion-49392.herokuapp.com/songs");
        validarMensajeBienvenida("You are now logged in as frank");
        cerrarBrowser();
    }
}
