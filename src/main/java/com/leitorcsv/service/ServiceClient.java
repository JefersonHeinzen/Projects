package com.leitorcsv.service;

import com.leitorcsv.entity.TableClient;
import com.leitorcsv.repositories.RepositoriesClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

@Service
@Slf4j
@RequiredArgsConstructor
public class ServiceClient {

    private  final RepositoriesClient repository;

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
                    .nomeEmpresa(colum[0])
                    .cnpj(colum[1])
                    .motivoFechamento(colum[2])
                    .tipo(colum[3])
                    .valorMoeda(colum[4])
                    .fiadorProposta(colum[5])
                    .fonteRecente(colum[6])
                    .etapaNegocio(colum[7])
                    .valor(colum[8])
                    .quantidadeParcela(colum[9])
                    .build();

            repository.saveAndFlush(client);

        }

        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
