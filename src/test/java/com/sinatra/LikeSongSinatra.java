package com.sinatra;

import org.junit.Test;

public class LikeSongSinatra extends LikeSinatraParent
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
}