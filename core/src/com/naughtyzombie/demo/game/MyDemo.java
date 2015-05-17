package com.naughtyzombie.demo.game;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;


public class MyDemo extends ApplicationAdapter {
	private static final String TAG = MyDemo.class.getName();

	private WorldController worldController;
	private WorldRenderer worldRenderer;

	@Override
	public void create() {
		Gdx.app.setLogLevel(Application.LOG_DEBUG);
		worldController = new WorldController();
		worldRenderer = new WorldRenderer(worldController);
	}

	@Override
	public void render() {
		worldController.update(Gdx.graphics.getDeltaTime());
		Gdx.gl.glClearColor(0x64/255.0f,0x95/255.0f,0xed/255.0f,0xff/255.0f);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		worldRenderer.render();
	}

	@Override
	public void resize(int width, int height) {
		worldRenderer.resize(width,height);
	}

	@Override
	public void pause() {
		super.pause();
	}

	@Override
	public void resume() {
		super.resume();
	}

	@Override
	public void dispose() {
		worldRenderer.dispose();
	}
}
