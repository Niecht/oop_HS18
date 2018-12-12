package oop11;

import oop08.Temperatur;
import oop08.TemperaturVerlauf;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.nio.charset.Charset;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TempReader {
    private static Logger LOG = LogManager.getLogger(TempReader.class);

    private boolean checkFile(File path){
        if ( path.exists() && !path.isDirectory()) {
            LOG.debug("File exists");
            return true;
        }
        return false;
        }

        public void readTextFile(final File path, final DataPoint dp){
            try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path), Charset.forName("UTF-8")))){
                String line;
                while (((line = br.readLine()) != null)){
                    dp.addDataPoint(Temperatur.createFromCelsius(Float.valueOf(line.split(";")[2])), LocalDateTime.parse(line.split(";")[1], DateTimeFormatter.ofPattern("\"yyyy/MM/dd HH:mm:ss\"")));
                }
            } catch (IOException ioe){
                LOG.error(ioe.getMessage(), ioe);
            }
        }

        private void readTextFileDate(final File path){
            try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path), Charset.forName("UTF-8")))){
                String line;
                while (((line = br.readLine()) != null)){
                    LocalDateTime timestamp = LocalDateTime.parse(line.split(";")[1], DateTimeFormatter.ofPattern("\"yyyy/MM/dd HH:mm:ss\""));
                }
            } catch (IOException ioe){
                LOG.error(ioe.getMessage(), ioe);
            }
        }
}

