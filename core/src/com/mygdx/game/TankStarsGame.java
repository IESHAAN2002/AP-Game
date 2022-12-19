package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class TankStarsGame extends Game{
	public SpriteBatch batch;
	public OrthographicCamera camera;


	@Override
	public void create () {
		batch = new SpriteBatch();
		camera = new OrthographicCamera();
		this.setScreen(new startScreen(this));
	}
	@Override
	public void render () {
		super.render();

	}
}
