package com.highfour.size_matters_server;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;

/**
 * size-matters-server - com.highfour.size_matters_server
 * Created by Kilian Koeltzsch on 2014-08-09.
 */

public class MainMenuScreen implements Screen {
    final SMServer server;

    OrthographicCamera camera;

    public MainMenuScreen(final SMServer server) {
        this.server = server;
        camera = new OrthographicCamera();
        camera.setToOrtho(false, 1920, 1080); // ich hab irgendwie vergessen wo die Spielauflösung festgelegt wird... Mit der Kamera ja anscheinend nicht.
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        camera.update();
        server.batch.begin();
        server.font.setColor(Color.BLACK);
        server.font.setScale(4f);
        server.font.draw(server.batch, "Size Matters", 310, 330);
        server.batch.end();

        if (Gdx.input.isKeyPressed(Input.Keys.ANY_KEY)) {
//            server.setScreen(); // hier auf das nächste Menü wechseln, wir müssen uns darüber eh mal im Detail unterhalten
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
