package cs.lab;

import java.util.List;
import java.util.logging.Logger;

public class  DNASequencer {

    static final Logger logger = Logger.getLogger(DNASequencer.class.getName());
    public DNASequencer() {
        logger.info("Starting sequencer...");
    }

    public void iThStringTooLong(String subseg) throws SubsequenceListSizeException {
        if(subseg.length() > 200){
            throw new SubsequenceListSizeException("The subseg string is too long");
        }
    }

    public  String calculate(List<String> parts) throws Exception{
        if(parts.size() > 160000){
            throw new SubsequenceLengthException("Too many subseqs");
        }
        iThStringTooLong(parts.get(0));
        StringBuilder finalString = new StringBuilder(parts.get(0));
        for (int i = 1; i < parts.size(); i++) {
            StringBuilder subsequence = new StringBuilder();
            iThStringTooLong(parts.get(i));
            for (int j = 0; j < parts.get(i).length(); j++) {
                subsequence.append(Character.toString(parts.get(i).charAt(j)));
                if (!finalString.toString().contains(subsequence)) {
                    finalString.append(Character.toString(parts.get(i).charAt(j)));
                }
            }
        }
        return finalString.toString();
    }
}
