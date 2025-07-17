package com.finconsgroup.parco_macchine.config;

import com.finconsgroup.parco_macchine.DTO.*;
import com.finconsgroup.parco_macchine.entity.*;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configurat {

    @Bean
    public ModelMapper modelMapper(){
        ModelMapper modelMapper = new ModelMapper();

        modelMapper.getConfiguration()
                .setFieldAccessLevel(org.modelmapper.config.Configuration.AccessLevel.PRIVATE)
                .setMatchingStrategy(MatchingStrategies.STRICT)
                .setFieldMatchingEnabled(true);

        userMap(modelMapper);
        macchinaMap(modelMapper);
        interventoMap(modelMapper);
        componenteMap(modelMapper);
        grantMap(modelMapper);
        tipologiaMap(modelMapper);
        logMacchinaMap(modelMapper);
        storicoInterventiMap(modelMapper);
        specificaInterventoMap(modelMapper);

        return modelMapper;
    }

    private void userMap(ModelMapper modelMapper) {
        modelMapper.addMappings(new PropertyMap<User, UserDto>() {
            @Override
            protected void configure() {
                map(source.getGrant().getId(), destination.getGrant());
                map(source.getInterventi(), destination.getInterventiDto());
            }
        });

        modelMapper.addMappings(new PropertyMap<User, UserDtoWithoutList>() {
            @Override
            protected void configure() {
                map(source.getGrant().getId(), destination.getGrant());
            }
        });
    }

    private void macchinaMap(ModelMapper modelMapper){
        modelMapper.addMappings(new PropertyMap<Macchina, MacchinaDto>() {
            @Override
            protected void configure() {
                map(source.getTipologia().getId(), destination.getTipologiaDto());
                map(source.getComponenti(), destination.getComponentiDtos());
                map(source.getLogMacchine(),destination.getLogMacchineDto());
                map(source.getInterventi(), destination.getInterventi());
            }
        });

        modelMapper.addMappings(new PropertyMap<Macchina, MacchinaDtoWIthoutLists>() {
            @Override
            protected void configure() {
                map(source.getTipologia().getId(), destination.getTipologiaDto());
            }
        });
    }

    private void interventoMap(ModelMapper modelMapper){
        modelMapper.addMappings(new PropertyMap<Intervento, InterventoDto>() {
            @Override
            protected void configure() {
                map(source.getMacchina().getId(), destination.getMacchina());
                map(source.getUser().getId(), destination.getUser());
                map(source.getSpecificaInterventi(), destination.getSpecificaInterventiDtos());
                map(source.getStoricoInterventi(), destination.getStoricoInterventi());
            }
        });

        modelMapper.addMappings(new PropertyMap<Intervento, InterventoDtoWithoutLists>() {
            @Override
            protected void configure() {
                map(source.getMacchina().getId(), destination.getMacchina());
                map(source.getUser().getId(), destination.getUser());
            }
        });
    }

    private void componenteMap(ModelMapper modelMapper){
        modelMapper.addMappings(new PropertyMap<Componente, ComponenteDto>() {
            @Override
            protected void configure() {
                map(source.getMacchina().getId(), destination.getMacchina());
            }
        });
    }

    private void grantMap(ModelMapper modelMapper){
        modelMapper.addMappings(new PropertyMap<Grant, GrantDto>() {
            @Override
            protected void configure() {
                map(source.getUsers(), destination.getUsers());
            }
        });
    }

    private void tipologiaMap(ModelMapper modelMapper){
        modelMapper.addMappings(new PropertyMap<Tipologia, TipologiaDto>() {
            @Override
            protected void configure() {
                map(source.getMacchine(), destination.getMacchineDtos());
            }
        });
    }

    private void logMacchinaMap(ModelMapper modelMapper){
        modelMapper.addMappings(new PropertyMap<LogMacchina, LogMacchinadto>() {
            @Override
            protected void configure() {
                map(source.getMacchina().getId(), destination.getMacchina());
            }
        });
    }

    private void storicoInterventiMap(ModelMapper modelMapper){
        modelMapper.addMappings(new PropertyMap<StoricoInterventi, StoricoInterventoDto>() {
            @Override
            protected void configure() {
                map(source.getIntervento().getId(), destination.getIntervento());
            }
        });
    }

    private void specificaInterventoMap(ModelMapper modelMapper){
        modelMapper.addMappings(new PropertyMap<SpecificaIntervento, SpecificaInterventoDto>() {
            @Override
            protected void configure() {
                map(source.getIntervento().getId(), destination.getIntervento());
            }
        });
    }
}
