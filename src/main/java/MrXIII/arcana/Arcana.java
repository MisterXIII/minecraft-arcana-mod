package MrXIII.arcana;


import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 *  Entry point for Arcana. A mod that adds Tarot magic.
 *
 *  @since 0.1
 *
 *  @author MisterXIII
 */

@Mod(modid = Arcana.MODID, name = Arcana.NAME, version = "0.1")
public class Arcana
{
    /**
     * Mod ID
     */
    public static final String MODID = "arcana";

    /**
     * Mod Name
     */
    public static final String NAME = "Arcana";

    /**
     * Mod Version
     */
    public static final String VERSION = "0.1";

    @EventHandler
    public void init(FMLPreInitializationEvent event)
    {

    }
}