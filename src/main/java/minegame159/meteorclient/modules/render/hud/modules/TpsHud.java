package minegame159.meteorclient.modules.render.hud.modules;

import minegame159.meteorclient.modules.render.hud.HUD;
import minegame159.meteorclient.utils.TickRate;

public class TpsHud extends DoubleTextHudModule {
    public TpsHud(HUD hud) {
        super(hud, "tps", "Displays server's tps.", "Tps: ");
    }

    @Override
    protected String getRight() {
        return String.format("%.1f", TickRate.INSTANCE.getTickRate());
    }
}
