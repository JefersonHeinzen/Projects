package com.DbLeas.service;

import com.DbLeas.entity.Report;
import com.DbLeas.repositories.RepositoriesReport;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class ReportService {

    private final RepositoriesReport repositoriesReport;
     public void saveReport(Report report) {
         repositoriesReport.saveAndFlush(report);
     }


}




/*



public void save() throws FileNotFoundException {
        File file = ResourceUtils.getFile("classpath:Templete/Doc.Csv");

        try (Scanner scanner = new Scanner(file)) {
            int line = 0;
            var stream = scanner.useDelimiter(",");
            String lerlinhas = new String();

            while (stream.hasNext()) {

                if (line < 1){
                    line ++;
                lerlinhas = scanner.nextLine();
                var text = stream.nextLine().replace( "\"", "" );
                    log.info( text );

            }
            lerlinhas = stream.nextLine().replace("\"", "");
            String[] colum = lerlinhas.split(",");

            var client = TableClient.builder()
                    .build();

            repository.saveAndFlush(client);

        }

        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

 */