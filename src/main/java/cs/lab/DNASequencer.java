package cs.lab;

import java.util.List;
import java.util.logging.Logger;

public class  DNASequencer {

    static final Logger logger = Logger.getLogger(DNASequencer.class.getName());
    public DNASequencer() {
        logger.info("Starting sequencer...");
    }

    public String calculate(List<String> part){

        String output = "";

        for(int i = 0; i < part.size(); i++){
            for(int j = 0; j < part.get(i).length(); j++){
                if(output.contains(part.get(i))) {
                }
                else{
                    output += part.get(i).charAt(j);
                }
            }
        }

        return output;
    }
}
