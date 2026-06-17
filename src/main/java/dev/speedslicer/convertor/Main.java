package dev.speedslicer.convertor;

import net.hollowcube.polar.AnvilPolar;
import net.hollowcube.polar.PolarWriter;
import net.minestom.server.MinecraftServer;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Logger;
public class Main {
    static Logger LOGGER = Logger.getLogger("PolarConvertorCLI");
    public static void main(String[] args) {
        if (args.length != 3) {
            LOGGER.info("Usage: java -jar PolarConvertorCLI.jar <input_anvil_file> <output_polar_file> <dimension>");
            return;
        }
        try {
            MinecraftServer.init();
            String inputFile = args[0];
            String outputFile = args[1];
            String dimension = args[2];
            var polarWorld = AnvilPolar.anvilToPolar(Path.of(inputFile + "/dimensions/minecraft/" + dimension));
            var polarWorldBytes= PolarWriter.write(polarWorld);
            Files.write(Path.of(outputFile), polarWorldBytes);
        }
        catch (Exception e) {
            e.printStackTrace();
            LOGGER.severe("An error occurred: " + e.getMessage());
        }
    }
}
