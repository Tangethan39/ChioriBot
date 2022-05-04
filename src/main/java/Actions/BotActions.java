package Actions;

import net.dv8tion.jda.api.events.interaction.command.MessageContextInteractionEvent;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.events.message.react.MessageReactionAddEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class BotActions extends ListenerAdapter {

    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        if(event.getMessage().getContentDisplay().equalsIgnoreCase("b.l")){
            event.getChannel().sendMessage("https://cdn.discordapp.com/attachments/564658267125710849/971334984189231104/chioriwowsmol.png").queue();

        }
    }
}
