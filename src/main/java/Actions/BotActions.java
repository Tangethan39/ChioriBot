package Actions;

import net.dv8tion.jda.api.events.interaction.command.MessageContextInteractionEvent;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.events.message.react.MessageReactionAddEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class BotActions extends ListenerAdapter {

    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        ArrayList<String> keyTerms = new ArrayList<>();
        keyTerms.add("b.l");
        keyTerms.add("test");
        keyTerms.add("b.wa");
        keyTerms.add("b.sra");
        keyTerms.add(":Chioriwow:");
        for(String term : keyTerms) {
            if (event.getMessage().getContentDisplay().equalsIgnoreCase(term)) {
                //event.getChannel().sendMessage("<:Chioriwow:971463419817517096>").queue();
                event.getMessage().addReaction(":Chioriwow:971463419817517096").queue();
                //event.getChannel().sendMessage("<a:KoroneDance:968025958240100412>").queue();
            }
        }

        if(event.getMessage().getContentDisplay().equalsIgnoreCase(":KoroneDance:")){
            event.getMessage().addReaction("a:KoroneDance:968025958240100412").queue();
          //  event.getMessage().addReaction(":Chioriwow:971463419817517096").queue();
        }
    }
}
