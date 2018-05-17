package com.example.user.tests1.Levels;


import android.content.Context;

/**
 * Created by User on 29.03.2018.
 */

public class Level {
    public Level(Context ctx) {
        Level_Data_Base levelsDataBase = new Level_Data_Base(ctx);
**
        Level_Data_Base.addRowData("Какую музыку ты предпочитаешь?",
                "классику", "рок\\рэп", "Оля Бузова Ван лав", "што то другое", 0);

        levelsDataBase.addRowData(" делаНин( запинаетесь)ли вы во время разговора?", "emoji_u2665", "emoji_u1f622",
                "я не запинаюсь(не делаю)", "ыыы.... ", "ы и по-зачовськи", 0);

    }
}