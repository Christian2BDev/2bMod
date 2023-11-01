package com.heckvision.tbmod.util;

import net.hypixel.api.HypixelAPI;
import net.hypixel.api.apache.ApacheHttpClient;
import net.hypixel.api.reply.AbstractReply;
import net.minecraft.client.MinecraftClient;

import java.util.UUID;
import java.util.function.BiConsumer;
public class ExampleUtil {


    public static final HypixelAPI API;

    static {
        String key = System.getProperty("apiKey", "ceefcded-3b10-48c3-964a-086984ee519d"); // arbitrary key, replace with your own to test or use the property
        API = new HypixelAPI(new ApacheHttpClient(UUID.fromString(key)));

    }

    public static final UUID HYPIXEL = UUID.fromString("c932b869-d479-4471-a36d-4ec6c1ef1fa2");
    public static final String GUILD_ID = "53bd67d7ed503e868873eceb";

   public static String getLastResult;

    /**
     * Keep the program alive till we explicitly exit.
     */
    public static void await() {
        while (!Thread.interrupted()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static <T extends AbstractReply> BiConsumer<T, Throwable> getTestConsumer() {
        return (result, throwable) -> {
            if (throwable != null) {
                throwable.printStackTrace();
                System.exit(0);
                return;
            }

            getLastResult = String.valueOf(result);

            System.exit(0);
        };
    }



}
