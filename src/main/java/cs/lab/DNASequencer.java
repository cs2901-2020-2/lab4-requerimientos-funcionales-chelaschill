package cs.lab;

import java.util.List;
import java.util.logging.Logger;

public class  DNASequencer {

    static final Logger logger = Logger.getLogger(DNASequencer.class.getName());
    public DNASequencer() {
        logger.info("Starting sequencer...");
    }

    public String calculate(List<String> part){

        String output = "AGA";
        int index = 0;

        for(int i = 0; i < part.size(); i++){
            for(int j = 0; j < part.get(i).length(); j++){
                if(i == 0){
                    output += part.get(i);
                }
                if(!output.contains(String.valueOf(part.get(i).charAt(j)))){
                    output += part.get(i).substring(j,part.get(i).length());
                    continue;
                }
            }
        }

        return output;
    }
}
