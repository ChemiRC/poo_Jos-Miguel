package edu.chemi_ramirez.reto7;

public class CLI {
}
// Clase CLI
import java.util.HashMap;

public class CLI {
    private HashMap<String, String> options;

    public CLI(String[] args) {
        options = new HashMap<>();
        parseArgs(args);
    }

    private void parseArgs(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            if (arg.startsWith("-")) {
                String key = arg.substring(1);
                if (i + 1 < args.length && !args[i + 1].startsWith("-")) {
                    options.put(key, args[i + 1]);
                    i++; // skip the next argument as it's the value for the current option
                } else {
                    options.put(key, null);
                }
            }
        }
    }

    public String getOption(String key) {
        return options.get(key);
    }
}
