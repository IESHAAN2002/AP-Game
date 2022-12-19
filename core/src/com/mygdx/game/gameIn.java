package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.ScreenUtils;

public class gameIn implements Screen {
    TankStarsGame game;
    Texture backg;
    Texture backgg;
    Texture backline;
    Texture borderline;
    Texture mountain;
    Texture player1health;
    Texture player2health;
    Texture firelabel;
    Texture leftarrowmovemnt1;
    Texture rightarrowmovemnt1;
    Texture leftarrowmovemnt2;
    Texture rightarrowmovemnt2;
    Texture vslabel;
    Texture frosttank;
    Texture mark1tankface;
    Texture homebutton;
    Texture aimmer;
    Texture aimmer2;
    Texture fireattack;
    public gameIn(TankStarsGame game) {
        this.game = game;
    }
    @Override
    public void show() {
        backg = new Texture("backg.jpg");
        backgg = new Texture("backgg.png");
        backline = new Texture("backline.jpg");
        borderline = new Texture("borderline.png");
        mountain = new Texture("mout.png");
        player1health = new Texture("player1health.png");
        player2health = new Texture("player2health.png");
        firelabel = new Texture("firelabel.png");
        leftarrowmovemnt1 = new Texture("leftarrowmovement.png");
        rightarrowmovemnt1 = new Texture("rightarrowmovement.png");
        leftarrowmovemnt2 = new Texture("leftarrowmovement.png");
        rightarrowmovemnt2 = new Texture("rightarrowmovement.png");
        vslabel = new Texture("vslabel.png");
        frosttank = new Texture("frosttank.png");
        mark1tankface = new Texture("mark1tankface.png");
        homebutton = new Texture("homebutton.png");
        aimmer = new Texture("aimmer.png");
        aimmer2 = new Texture("aimmer.png");
        fireattack = new Texture("fireattack.png");

    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(1, 0, 0, 1);
        game.batch.begin();
        //game.batch.draw(backg, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        game.batch.draw(backgg, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        game.batch.draw(mountain, 0, 0, Gdx.graphics.getWidth(), 500);

//        game.batch.draw(backline, 0, 0, Gdx.graphics.getWidth(), 200);
//        game.batch.draw(borderline, -400, 150, Gdx.graphics.getWidth()+800, 100);

        game.batch.draw(player1health, 200, 775, 400, 90);
        game.batch.draw(player2health, 900, 775, 400, 100);
        game.batch.draw(firelabel, 600, 90, 150, 125);
        if (Gdx.input.getX() > 580 && Gdx.input.getX() < 720 && Gdx.input.getY() > 660 && Gdx.input.getY() < 780) {
            game.batch.draw(firelabel, 590, 80, 175, 150);
//            if (Gdx.input.isTouched()) {
//                game.setScreen(new gameIn(game));
//            }
        }
        game.batch.draw(fireattack, 750, 90, 150, 125);

        game.batch.draw(leftarrowmovemnt1, 150, 170, 100, 100);
        if (Gdx.input.getX() > 150 && Gdx.input.getX() < 250 && Gdx.input.getY() > 620 && Gdx.input.getY() < 720) {
            game.batch.draw(leftarrowmovemnt1, 140, 160, 125, 125);
        }
        game.batch.draw(rightarrowmovemnt1, 250, 170, 100, 100);
        if (Gdx.input.getX() > 250 && Gdx.input.getX() < 350 && Gdx.input.getY() > 620 && Gdx.input.getY() < 720) {
            game.batch.draw(rightarrowmovemnt1, 240, 160, 125, 125);
        }
        game.batch.draw(aimmer, 150, -5, 200, 200);


        game.batch.draw(leftarrowmovemnt2, 1150, 170, 100, 100);
        if (Gdx.input.getX() > 1150 && Gdx.input.getX() < 1250 && Gdx.input.getY() > 630 && Gdx.input.getY() < 730) {
            game.batch.draw(leftarrowmovemnt2, 1140, 160, 120, 120);
        }
        game.batch.draw(rightarrowmovemnt2, 1250, 170, 100, 100);
        if (Gdx.input.getX() > 1250 && Gdx.input.getX() < 1350 && Gdx.input.getY() > 630 && Gdx.input.getY() < 730) {
            game.batch.draw(rightarrowmovemnt2, 1240, 160, 120, 120);
        }
        game.batch.draw(aimmer2, 1150, -5, 200, 200);
        game.batch.draw(vslabel, 700, 750, 120, 120);
        //tilt the image to 45 degrees
        game.batch.draw(frosttank, 160, 270, 150, 200);
        game.batch.draw(mark1tankface, 1150, 302, 120, 80);
        game.batch.draw(homebutton, -20, 780, 130, 80);
        if (Gdx.input.getX() > 0 && Gdx.input.getX() < 130 && Gdx.input.getY() > 20 && Gdx.input.getY() < 100) {
            game.batch.draw(homebutton, -30, 770, 150, 100);
            if (Gdx.input.isTouched()) {
                game.setScreen(new choosetank(game));
            }
        }

        game.batch.end();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}

