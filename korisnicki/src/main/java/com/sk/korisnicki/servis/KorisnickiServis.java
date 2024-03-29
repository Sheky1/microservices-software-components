package com.sk.korisnicki.servis;

import com.sk.korisnicki.dto.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public interface KorisnickiServis {

    Page<KorisnikDto> findAll(Pageable pageable);
    KorisnikDto findKorisnik(Long id);

    KorisnikDto add(RegistracijaKorisnikaDto registracijaKorisnikaDto);
    KorisnikDto update(Long id, UpdateKorisnikaDto registracijaKorisnikaDto);

    TokenOdgovorDto login(TokenZahtevDto tokenZahtevDto);
    
    void rezervacijaKarte(Long id, int milje);
	void otkazivanjeKarte(Long idLeta, int duzinaLeta);
	KorisnikDto verifikacija(Long id);
}
