package com.sinatra;

import org.junit.Test;

public class SinatraTests extends SongsSinatraParent
{
    @Test
    public void LikeSong()
    {
        navegarSitio("https://evening-bastion-49392.herokuapp.com/");
        validarHomePage();
        navegarSongsPage("https://evening-bastion-49392.herokuapp.com/songs");
        navegarPrimerCancion();
        validarLikeAgregado();
        cerrarBrowser();
    }

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
