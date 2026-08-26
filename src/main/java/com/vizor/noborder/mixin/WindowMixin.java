package com.vizor.noborder.mixin;

import net.minecraft.client.util.Window;
import org.lwjgl.glfw.GLFW;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Window.class)
public class WindowMixin {

    @Inject(method = "<init>", at = @At("RETURN"))
    private void noborder$undecorate(CallbackInfo ci) {
        GLFW.glfwSetWindowAttrib(((Window) (Object) this).getHandle(), GLFW.GLFW_DECORATED, GLFW.GLFW_FALSE);
    }
}
