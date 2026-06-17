# Polar CLI Convertor

A really janky convertor for converting Minecraft Anvil worlds to .polar format.

## Requirements
1. World in the new Minecraft World saving format (tested with 26.1.2)
2. Java 26 

## Setup
Download the jar from releases. That's pretty much it.

## Usage
```
java -jar PolarConvertorCLI.jar <input_anvil_file> <output_polar_file> <dimension>
```

```<input_anvil_file> - the world folder of what you want to convert```


```<output_polar_file> - where you want to save it, and what as (ex. E:/Output/dungeon.polar)```

```
<dimension> - which dimension you want to export.
```
```
Options for dimensions:
overworld - Exports the overworld
the_end - Exports the end
the_nether - Exports the nether
```
## Bugs
Signs! They don't export as expected. 
Report more issues in the issues tab. 
