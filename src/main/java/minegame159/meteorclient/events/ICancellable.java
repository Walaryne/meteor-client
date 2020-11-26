/*
 * This file is part of the Meteor Client distribution (https://github.com/MeteorDevelopment/meteor-client/).
 * Copyright (c) 2020 Meteor Development.
 */

package minegame159.meteorclient.events;

public interface ICancellable extends me.zero.alpine.event.type.ICancellable {
    void setCancelled(boolean cancelled);
}
