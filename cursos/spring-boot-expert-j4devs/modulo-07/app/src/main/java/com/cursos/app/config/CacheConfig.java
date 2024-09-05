package com.cursos.app.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableCaching
public class CacheConfig {

    /**
     * Se hace la configuracion del cache para que el servidor administre un map y pueda ir guradando los valores
     * con la finalidad de que se optimise la aplicacion
     * para eliminar el cache se debe crear un recurso de delete
     * @return informacion del cache
     */
    @Bean
    public CacheManager getCacheManager() {
        // podemos definir dentro de la funcion "ConcurrentMapCacheManager" como pareametros como queremos guardar los datos.
        return new ConcurrentMapCacheManager("users", "roles");
    }

}
