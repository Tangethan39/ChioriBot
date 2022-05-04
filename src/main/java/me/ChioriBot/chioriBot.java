package me.ChioriBot;

import Actions.BotActions;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;

public class chioriBot {

    public static void main(String[] args) throws LoginException {

        JDA bot = JDABuilder.createDefault("OTcxMzE4OTkzMzM4MTA1ODg2.GM5P3e.XDfH1qhrai0l4bq89AEJNSvivUMuT3yyqczOEw")
                .setActivity(Activity.playing("Honitsu"))
                .addEventListeners(new BotActions())
                .build();


    }

}
