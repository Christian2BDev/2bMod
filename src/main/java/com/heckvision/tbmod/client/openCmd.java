package com.heckvision.tbmod.client;



import com.heckvision.tbmod.util.ExampleUtil;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.tree.LiteralCommandNode;
import net.hypixel.api.HypixelAPI;
import net.hypixel.api.apache.ApacheHttpClient;
import net.hypixel.api.http.HypixelHttpClient;
import net.minecraft.client.MinecraftClient;
import net.minecraft.command.CommandRegistryAccess;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.Text;

import java.util.UUID;

import static net.minecraft.server.command.CommandManager.literal;

public class openCmd {
    public static void register(CommandDispatcher<ServerCommandSource> dispatcher, CommandRegistryAccess commandRegistryAccess, CommandManager.RegistrationEnvironment registrationEnvironment) {
        dispatcher.register(CommandManager.literal("2b").executes(openCmd::run));
    }

    private static int run(CommandContext<ServerCommandSource> context) throws CommandSyntaxException {
        MinecraftClient.getInstance().send(() -> MinecraftClient.getInstance().setScreen(new drawHUD(Text.empty())));
       getPlayerFromApi();
        return 1;
    }

    private static void getPlayerFromApi() {
//        HypixelHttpClient client = new ApacheHttpClient(UUID.fromString("ceefcded-3b10-48c3-964a-086984ee519d"));
//        HypixelAPI hypixelAPI = new HypixelAPI(client);
//        hypixelAPI.getSkyBlockProfiles("Timgb11")
//                .exceptionally(throwable -> {
//                    // Handle exceptions here
//                    throwable.printStackTrace();
//                    return null;
//                })
//                .thenAccept(System.out::println);

       ExampleUtil.API.getStatus(ExampleUtil.HYPIXEL).whenComplete(ExampleUtil.getTestConsumer());
      System.out.println(ExampleUtil.getLastResult);
       ExampleUtil.await();
    }


}
