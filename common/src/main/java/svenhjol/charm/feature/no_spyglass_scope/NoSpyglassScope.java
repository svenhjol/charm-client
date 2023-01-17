package svenhjol.charm.feature.no_spyglass_scope;

import svenhjol.charm.Charm;
import svenhjol.charm_core.annotation.ClientFeature;
import svenhjol.charm_core.base.CharmFeature;

@ClientFeature(
    mod = Charm.MOD_ID,
    switchable = true,
    description = "Removes the dark outer overlay when zooming in with the spyglass, giving you the full view."
)
public class NoSpyglassScope extends CharmFeature {
    public static boolean shouldRemoveHud() {
        return Charm.LOADER.isEnabled(NoSpyglassScope.class);
    }
}