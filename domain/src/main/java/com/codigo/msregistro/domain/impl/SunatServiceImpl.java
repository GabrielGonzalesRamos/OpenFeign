package com.codigo.msregistro.domain.impl;

import com.codigo.msregistro.domain.aggregates.response.ResponseSunat;
import com.codigo.msregistro.domain.ports.in.SunatServiceIn;
import com.codigo.msregistro.domain.ports.out.RestReniecOut;
import com.codigo.msregistro.domain.ports.out.RestSunatOut;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SunatServiceImpl implements SunatServiceIn {
    private final RestSunatOut sunat;


    @Override
    public ResponseSunat getInfoIn(String numero) {
        System.out.println(numero);
        return sunat.getInfoSunat(numero);
    }
}
