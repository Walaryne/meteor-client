/*
 * This file is part of the Meteor Client distribution (https://github.com/MeteorDevelopment/meteor-client/).
 * Copyright (c) 2020 Meteor Development.
 */

package minegame159.meteorclient.events;

import net.minecraft.client.util.math.MatrixStack;

public class RenderEvent {
    public float tickDelta;
    public double offsetX, offsetY, offsetZ;
    public MatrixStack matrixStack;
}
