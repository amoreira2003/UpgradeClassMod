package dev.alxsmooth;

import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(UpdateClass.MODID)
public class UpdateClass {

    public static final String MODID = "updateclass";

    public static Logger logger = LogUtils.getLogger();

    public UpdateClass(FMLJavaModLoadingContext context) {
        logger.debug("Hello World");
    }
}
