package servis;

import dto.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface KorisnickiServis {

    Page<KorisnikDto> findAll(Pageable pageable);

//    DiscountDto findDiscount(Long id);

    KorisnikDto add(RegistracijaKorisnikaDto registracijaKorisnikaDto);

    TokenOdgovorDto login(TokenZahtevDto tokenZahtevDto);
}
