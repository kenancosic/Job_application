package com.springproject.job_application.repository;

public interface Info {
    //napravi crud operaciju(novi interface) nek se zovu go domene sa dodatnim Repository name ako ti je model "Test" onda
    // interface se zove "TestRepository" i extendat ce nesto :P (pogledaj sam sta ce extendat taj interface)
    // i onda ces napravit service (ime ko model sa Service) TestService i INJECTAS repository
    // i tu ces radit logiku i crud operacije (Create, Read, Update, Delete)
    // i onda Kontroler ide TestController (pr. imena) i tu INJECTAS SERVICE i pravis neki kontroller da li je
    // Rest(@RestController) ili MVC controller (@Controller)
}
