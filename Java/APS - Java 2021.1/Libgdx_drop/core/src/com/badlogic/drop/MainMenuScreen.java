package com.badlogic.drop;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.ScreenUtils;

public class MainMenuScreen implements Screen {

  final Drop game;
	OrthographicCamera camera;
	Texture menubground;

	public MainMenuScreen(final Drop gam) {
		game = gam;

		menubground = new Texture(Gdx.files.internal("menubground.png"));
		
		camera = new OrthographicCamera();
		camera.setToOrtho(false, 800, 480);
	}

	@Override
	public void render(float delta) {
		ScreenUtils.clear(0, 0, 0.2f, 1);

		camera.update();
		game.batch.setProjectionMatrix(camera.combined);

		game.batch.begin();
		game.font.draw(game.batch, "Bem vindo à Queda Suja, um game terapeutico infinito!!! ", 100, 150);
		game.font.draw(game.batch, "A cidade está muito poluida! Tome conta disso! Use as setas para coletar os lixos. Clique para começar!", 100, 100);
		game.batch.draw(menubground, 0, 0);
		game.batch.end();

		if (Gdx.input.isTouched()) {
			game.setScreen(new GameScreen(game));
			dispose();
		}
	}

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void show() {
	}

	@Override
	public void hide() {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}

	@Override
	public void dispose() {
	}
}