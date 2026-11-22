package com.vizor.noborder;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents;
import net.minecraft.client.MinecraftClient;
import org.lwjgl.glfw.GLFW;

public class NoBorderMod implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        // Без миксина в конструкторе Window: ждём, пока окно точно создано.
        ClientLifecycleEvents.CLIENT_STARTED.register(this::removeBorder);
    }

    private void removeBorder(MinecraftClient client) {
        if (client == null || client.getWindow() == null) return;
        long handle = client.getWindow().getHandle();
        if (handle == 0L) return;
        GLFW.glfwSetWindowAttrib(handle, GLFW.GLFW_DECORATED, GLFW.GLFW_FALSE);
    }
}
