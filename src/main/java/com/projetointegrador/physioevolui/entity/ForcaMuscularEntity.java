/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projetointegrador.physioevolui.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Jonatas
 */

@Entity
@Table(name = "forca_muscular")
public class ForcaMuscularEntity implements Serializable{
    
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "int_id_forca_muscular")
    private Integer int_id_forca_muscular;
    
    
    @Column(name = "int_deltoide_esq_forca_muscular")
    private Integer int_deltoide_esq_forca_muscular;
    
    @Column(name = "int_deltoide_dir_forca_muscular")
    private Integer int_deltoide_dir_forca_muscular;
    
    @Column(name = "int_trapezio_superior_esq_forca_muscular")
    private Integer int_trapezio_superior_esq_forca_muscular;
    
    @Column(name = "int_trapezio_superior_dir_forca_muscular")
    private Integer int_trapezio_superior_dir_forca_muscular;
    
    @Column(name = "int_trapezio_medio_esq_forca_muscular")
    private Integer int_trapezio_medio_esq_forca_muscular;
    
    @Column(name = "int_trapezio_medio_dir_forca_muscular")
    private Integer int_trapezio_medio_dir_forca_muscular;
    
    @Column(name = "int_trapezio_inferior_esq_forca_muscular")
    private Integer int_trapezio_inferior_esq_forca_muscular;
    
    @Column(name = "int_trapezio_inferiro_dir_forca_muscular")
    private Integer int_trapezio_inferiro_dir_forca_muscular;
    
    @Column(name = "int_levantador_escapula_esq_forca_muscular")
    private Integer int_levantador_escapula_esq_forca_muscular;
    
    @Column(name = "int_levantador_escapula_dir_forca_muscular")
    private Integer int_levantador_escapula_dir_forca_muscular;
    
    @Column(name = "int_supre_espinhoso_esq_forca_muscular")
    private Integer int_supre_espinhoso_esq_forca_muscular;
    
    @Column(name = "int_supre_espinhoso_dir_forca_muscular")
    private Integer int_supre_espinhoso_dir_forca_muscular;
    
    @Column(name = "int_infra_espinhoso_dir_forca_muscular")
    private Integer int_infra_espinhoso_dir_forca_muscular;
    
    @Column(name = "int_infra_espinhoso_esq_forca_muscular")
    private Integer int_infra_espinhoso_esq_forca_muscular;
            
    @Column(name = "int_subescapular_esq_forca_muscular")
    private Integer int_subescapular_esq_forca_muscular;
    
    @Column(name = "int_subescapular_dir_forca_muscular")
    private Integer int_subescapular_dir_forca_muscular;
    
    @Column(name = "int_redondo_menor_esq_forca_muscular")
    private Integer int_redondo_menor_esq_forca_muscular;
    
    @Column(name = "int_redondo_menor_dir_forca_muscular")
    private Integer int_redondo_menor_dir_forca_muscular;
    
    @Column(name = "int_redondo_maior_esq_forca_muscular")
    private Integer int_redondo_maior_esq_forca_muscular;
    
    @Column(name = "int_redondo_maior_dir_forca_muscular")
    private Integer int_redondo_maior_dir_forca_muscular;
    
    @Column(name = "int_bomboides_esq_forca_muscular")
    private Integer int_bomboides_esq_forca_muscular;
    
    @Column(name = "int_bomboides_dir_forca_muscular")
    private Integer int_bomboides_dir_forca_muscular;
    
    @Column(name = "int_peitoral_meno_esq_forca_muscular")
    private Integer int_peitoral_meno_esq_forca_muscular;
    
    @Column(name = "int_peitoral_meno_dir_forca_muscular")
    private Integer int_peitoral_meno_dir_forca_muscular;
    
    @Column(name = "int_serratil_anterior_esq_forca_muscular")
    private Integer int_serratil_anterior_esq_forca_muscular;
    
    @Column(name = "int_serratil_anterior_dir_forca_muscular")
    private Integer int_serratil_anterior_dir_forca_muscular;
    
    @Column(name = "int_grande_dorsal_esq_forca_muscular")
    private Integer int_grande_dorsal_esq_forca_muscular;
    
    @Column(name = "int_grande_dorsal_dir_forca_muscular")
    private Integer int_grande_dorsal_dir_forca_muscular;
    
    @Column(name = "int_cabeca_longa_biceps_esq_forca_muscular")
    private Integer int_cabeca_longa_biceps_esq_forca_muscular;
    
    @Column(name = "int_cabeca_longa_biceps_dir_forca_muscular")
    private Integer int_cabeca_longa_biceps_dir_forca_muscular;
    
    @Column(name = "str_observacoes_ombro_braco_forca_muscular")
    private String str_observacoes_ombro_braco_forca_muscular;    


    @Column(name = "int_biceps_braquial_esq_forca_muscular")
    private Integer int_biceps_braquial_esq_forca_muscular;
    
    @Column(name = "int_biceps_braquial_dir_forca_muscular")
    private Integer int_biceps_braquial_dir_forca_muscular;
    
    @Column(name = "int_triceps_braquial_esq_forca_muscular")
    private Integer int_triceps_braquial_esq_forca_muscular;
    
    @Column(name = "int_braquial_esq_forca_muscular")
    private Integer int_braquial_esq_forca_muscular;
    
    @Column(name = "int_braquial_dir_forca_muscular")
    private Integer int_braquial_dir_forca_muscular;
    
    @Column(name = "int_braquio_radial_esq_forca_muscular")
    private Integer int_braquio_radial_esq_forca_muscular;
    
    @Column(name = "int_braquio_radial_dir_forca_muscular")
    private Integer int_braquio_radial_dir_forca_muscular;
    
    @Column(name = "str_observacoes_cotovelo_antebraco_forca_muscularcol")
    private String str_observacoes_cotovelo_antebraco_forca_muscularcol;
    
    
    @Column(name = "int_flexor_radial_carpo_esq_forca_muscular")
    private Integer int_flexor_radial_carpo_esq_forca_muscular;
            
    @Column(name = "int_flexor_radial_carpo_dir_forca_muscular")
    private Integer int_flexor_radial_carpo_dir_forca_muscular;
    
    @Column(name = "int_flexor_ulnarl_carpo_esq_forca_muscular")
    private Integer int_flexor_ulnarl_carpo_esq_forca_muscular;
    
    @Column(name = "int_flexor_ulnar_carpo_dir_forca_muscular")
    private Integer int_flexor_ulnar_carpo_dir_forca_muscular;
    
    @Column(name = "int_palmar_longo_esq_forca_muscular")
    private Integer int_palmar_longo_esq_forca_muscular;
    
    @Column(name = "int_palmar_longo_dir_forca_muscular")
    private Integer int_palmar_longo_dir_forca_muscular;
    
    @Column(name = "int_extensor_radial_longo_carpo_esq_forca_muscular")
    private Integer int_extensor_radial_longo_carpo_esq_forca_muscular;
    
    @Column(name = "int_extensor_radial_longo_carpo_dir_forca_muscular")
    private Integer int_extensor_radial_longo_carpo_dir_forca_muscular;
    
    @Column(name = "int_extensor_radial_curto_carpo_esq_forca_muscular")
    private Integer int_extensor_radial_curto_carpo_esq_forca_muscular;
    
    @Column(name = "int_extensor_radial_curto_carpo_dir_forca_muscular")
    private Integer int_extensor_radial_curto_carpo_dir_forca_muscular;
    
    @Column(name = "int_extensor_ulnar_carpo_esq_forca_muscular")
    private Integer int_extensor_ulnar_carpo_esq_forca_muscular;
    
    @Column(name = "int_extensor_ulnar_carpo_dir_forca_muscular")
    private Integer int_extensor_ulnar_carpo_dir_forca_muscular;
    
    @Column(name = "int_extensor_comum_dedos_esq_forca_muscular")
    private Integer int_extensor_comum_dedos_esq_forca_muscular;
    
    @Column(name = "int_extensor_comum_dedos_dir_forca_muscular")
    private Integer int_extensor_comum_dedos_dir_forca_muscular;
    
    @Column(name = "int_fluxo_superficial_dedos_dir_forca_muscular")
    private Integer int_fluxo_superficial_dedos_dir_forca_muscular;
    
    @Column(name = "int_fluxo_superficial_dedos_esq_forca_muscular")
    private Integer int_fluxo_superficial_dedos_esq_forca_muscular;
    
    @Column(name = "int_fluxo_profundo_dedos_esq_forca_muscular")
    private Integer int_fluxo_profundo_dedos_esq_forca_muscular;
        
    @Column(name = "int_fluxo_profundo_dedos_dir_forca_muscular")
    private Integer int_fluxo_profundo_dedos_dir_forca_muscular; 
    

    @Column(name = "str_observacao_punho_mao_forca_muscular")
    private String str_observacao_punho_mao_forca_muscular; 
    
    
    @Column(name = "int_iliopsoas_esq_forca_muscular")
    private Integer int_iliopsoas_esq_forca_muscular;
    
    @Column(name = "int_iliopsoas_dir_forca_muscular")
    private Integer int_iliopsoas_dir_forca_muscular;
    
    @Column(name = "int_reto_femoral_esq_forca_muscular")
    private Integer int_reto_femoral_esq_forca_muscular;
    
    @Column(name = "int_reto_femoral_dir_forca_muscular")
    private Integer int_reto_femoral_dir_forca_muscular;
    
    @Column(name = "int_gluteo_maximo_esq_forca_muscular")
    private Integer int_gluteo_maximo_esq_forca_muscular;
    
    @Column(name = "int_gluteo_maximo_dir_forca_muscular")
    private Integer int_gluteo_maximo_dir_forca_muscular;
    
    @Column(name = "int_gluteo_medio_dir_forca_muscular")
    private Integer int_gluteo_medio_dir_forca_muscular;
    
    @Column(name = "int_gluteo_medio_esq_forca_muscular")
    private Integer int_gluteo_medio_esq_forca_muscular;
    
    @Column(name = "int_gluteo_minimo_esq_forca_muscular")
    private Integer int_gluteo_minimo_esq_forca_muscular;
    
    @Column(name = "int_gluteo_minimo_dir_forca_muscular")
    private Integer int_gluteo_minimo_dir_forca_muscular;
    
    @Column(name = "int_tensor_farcial_lata_esq_forca_muscular")
    private Integer int_tensor_farcial_lata_esq_forca_muscular;
    
    @Column(name = "int_tensor_farcial_lata_dir_forca_muscular")
    private Integer int_tensor_farcial_lata_dir_forca_muscular;
    
    @Column(name = "int_adutor_longo_esq_forca_muscular")
    private Integer int_adutor_longo_esq_forca_muscular;
    
    @Column(name = "int_adutor_longo_dir_forca_muscular")
    private Integer int_adutor_longo_dir_forca_muscular;
            
    @Column(name = "int_adutor_curto_esq_forca_muscular")
    private Integer int_adutor_curto_esq_forca_muscular;
    
    @Column(name = "int_adutor_curto_dir_forca_muscular")
    private Integer int_adutor_curto_dir_forca_muscular;
    
    @Column(name = "int_adutor_magno_dir_forca_muscular")
    private Integer int_adutor_magno_dir_forca_muscular;
    
    @Column(name = "int_adutor_magno_esq_forca_muscular")
    private Integer int_adutor_magno_esq_forca_muscular;
    
    @Column(name = "int_gracil_dir_forca_muscular")
    private Integer int_gracil_dir_forca_muscular;
    
    @Column(name = "int_gracil_esq_forca_muscular")
    private Integer int_gracil_esq_forca_muscular;
    
    @Column(name = "int_pactineol_dir_forca_muscular")
    private Integer int_pactineol_dir_forca_muscular;
    
    @Column(name = "int_pactineol_esq_forca_muscular")
    private Integer int_pactineol_esq_forca_muscular;
    
    @Column(name = "int_obturador_interno_dir_forca_muscular")
    private Integer int_obturador_interno_dir_forca_muscular;
    
    @Column(name = "int_obturador_interno_esq_forca_muscular")
    private Integer int_obturador_interno_esq_forca_muscular;
    
    @Column(name = "int_obturador_externo_dir_forca_muscular")
    private Integer int_obturador_externo_dir_forca_muscular;
    
    @Column(name = "int_obturador_externo_esq_forca_muscular")
    private Integer int_obturador_externo_esq_forca_muscular;
    
    @Column(name = "int_gemeo_inferior_dir_forca_muscular")
    private Integer int_gemeo_inferior_dir_forca_muscular;
    
    @Column(name = "int_gemeo_inferior_esq_forca_muscular")
    private Integer int_gemeo_inferior_esq_forca_muscular;
    
    @Column(name = "int_gemeo_superior_esq_forca_muscular")
    private Integer int_gemeo_superior_esq_forca_muscular;
    
    @Column(name = "int_gemeo_superior_dir_forca_muscular")
    private Integer int_gemeo_superior_dir_forca_muscular;            
    
    @Column(name = "int_periforme_esq_forca_muscular")
    private Integer int_periforme_esq_forca_muscular;
    
    @Column(name = "int_periforme_dir_forca_muscular")
    private Integer int_periforme_dir_forca_muscular;
    
    @Column(name = "int_quadrado_femoral_esq_forca_muscular")
    private Integer int_quadrado_femoral_esq_forca_muscular;
    
    @Column(name = "int_quadrado_femoral_dir_forca_muscular")
    private Integer int_quadrado_femoral_dir_forca_muscular;
    
    @Column(name = "int_biceps_femoral_esq_forca_muscular")
    private Integer int_biceps_femoral_esq_forca_muscular;
    
    @Column(name = "int_biceps_femoral_dir_forca_muscular")
    private Integer int_biceps_femoral_dir_forca_muscular;
    
    @Column(name = "int_semitendinoso_esq_forca_muscular")
    private Integer int_semitendinoso_esq_forca_muscular;
    
    @Column(name = "int_semitendinoso_dir_forca_muscular")
    private Integer int_semitendinoso_dir_forca_muscular;
    
    @Column(name = "int_semimembrandoso_esq_forca_muscular")
    private Integer int_semimembrandoso_esq_forca_muscular;
    
    @Column(name = "int_semimembrandoso_dir_forca_muscular")
    private Integer int_semimembrandoso_dir_forca_muscular;
    
    @Column(name = "int_sartorio_esq_forca_muscular")
    private Integer int_sartorio_esq_forca_muscular;
    
    @Column(name = "int_sartorio_dir_forca_muscular")
    private Integer int_sartorio_dir_forca_muscular;
    
    @Column(name = "str_observacoes_quadril_coxa_forca_muscular")
    private Integer str_observacoes_quadril_coxa_forca_muscular;
    
    @Column(name = "int_vasto_medial_esq_forca_muscular")
    private Integer int_vasto_medial_esq_forca_muscular;          
    
    
    @Column(name = "int_vasto_medial_dir_forca_muscular")
    private Integer int_vasto_medial_dir_forca_muscular;
    
    @Column(name = "int_vasto_lateral_dir_forca_muscular")
    private Integer int_vasto_lateral_dir_forca_muscular;
    
    @Column(name = "int_vasto_lateral_esq_forca_muscular")
    private Integer int_vasto_lateral_esq_forca_muscular;
    
    @Column(name = "int_vasto_intermediario_esq_forca_muscular")
    private Integer int_vasto_intermediario_esq_forca_muscular;
    
    @Column(name = "int_vasto_intermediario_dir_forca_muscular")
    private Integer int_vasto_intermediario_dir_forca_muscular;
    
    @Column(name = "int_semimembranoso_dir_forca_muscular")
    private Integer int_semimembranoso_dir_forca_muscular;
    
    @Column(name = "int_semimembranoso_esq_forca_muscular")
    private Integer int_semimembranoso_esq_forca_muscular; 
    
    @Column(name = "int_gastrocnemio_esq_forca_muscular")
    private Integer int_gastrocnemio_esq_forca_muscular;
    
    @Column(name = "int_gastrocnemio_dir_forca_muscular")
    private Integer int_gastrocnemio_dir_forca_muscular;
    
    @Column(name = "str_observacoes_joelho_perna_forca_muscular")
    private String str_observacoes_joelho_perna_forca_muscular;
    
    @Column(name = "int_soleo_dir_forca_muscular")
    private Integer int_soleo_dir_forca_muscular;
    
    @Column(name = "int_soleo_esq_forca_muscular")
    private Integer int_soleo_esq_forca_muscular;
    
    @Column(name = "int_tibia_anterior_dir_forca_muscular")
    private Integer int_tibia_anterior_dir_forca_muscular;
    
    @Column(name = "int_tibia_anterior_esq_forca_muscular")
    private Integer int_tibia_anterior_esq_forca_muscular;
    
    @Column(name = "int_tibia_posterior_dir_forca_muscular")
    private Integer int_tibia_posterior_dir_forca_muscular;
    
    @Column(name = "int_tibia_posterior_esq_forca_muscular")
    private Integer int_tibia_posterior_esq_forca_muscular;          
    
    
    @Column(name = "int_fibulares_dir_forca_muscular")
    private Integer int_fibulares_dir_forca_muscular;
    
    @Column(name = "int_fibulares_esq_forca_muscular")
    private Integer int_fibulares_esq_forca_muscular;
    
    @Column(name = "str_observacao_tornozelo_pe_forca_muscular")
    private Integer str_observacao_tornozelo_pe_forca_muscular;
    
    @Column(name = "int_multifidos_esq_forca_muscular")
    private Integer int_multifidos_esq_forca_muscular;
    
    @Column(name = "int_multifidos_dir_forca_muscular")
    private Integer int_multifidos_dir_forca_muscular;
    
    @Column(name = "int_intertransversarios_esq_forca_muscular")
    private Integer int_intertransversarios_esq_forca_muscular;
    
    @Column(name = "int_intertransversarios_dir_forca_muscular")
    private Integer int_intertransversarios_dir_forca_muscular;      
    
    @Column(name = "int_rotadores_profundos_esq_forca_muscular")
    private Integer int_rotadores_profundos_esq_forca_muscular;
    
    @Column(name = "int_rotadores_profundos_dir_forca_muscular")
    private Integer int_rotadores_profundos_dir_forca_muscular;
    
    @Column(name = "int_subcostais_esq_forca_muscular")
    private Integer int_subcostais_esq_forca_muscular;
    
    @Column(name = "int_subcostais_dir_forca_muscular")
    private Integer int_subcostais_dir_forca_muscular;          
      
    @Column(name = "int_esplenio_esq_forca_muscular")
    private Integer int_esplenio_esq_forca_muscular;
    
    @Column(name = "int_esplenio_dir_forca_muscular")
    private Integer int_esplenio_dir_forca_muscular;
    
    @Column(name = "int_longuissimo_esq_forca_muscular")
    private Integer int_longuissimo_esq_forca_muscular;
    
    @Column(name = "int_longuissimo_dir_forca_muscular")
    private Integer int_longuissimo_dir_forca_muscular;
    
    @Column(name = "int_iliocostal_esq_forca_muscular")
    private Integer int_iliocostal_esq_forca_muscular;
    
    @Column(name = "int_iliocostal_dir_forca_muscular")
    private Integer int_iliocostal_dir_forca_muscular;
    
    @Column(name = "str_observacoes_coluna_vertebral_forca_muscular")
    private String str_observacoes_coluna_vertebral_forca_muscular;     
    
    @Column(name = "int_masseter_dir_forca_muscular")
    private Integer int_masseter_dir_forca_muscular;
    
    @Column(name = "int_masseter_esq_forca_muscular")
    private Integer int_masseter_esq_forca_muscular;
    
    @Column(name = "int_temporal_dir_forca_muscular")
    private Integer int_temporal_dir_forca_muscular;
    
    @Column(name = "int_temporal_esqueda_forca_muscular")
    private Integer int_temporal_esqueda_forca_muscular;          
    
    
    @Column(name = "int_supra_hioideos_dir_forca_muscular")
    private Integer int_supra_hioideos_dir_forca_muscular;
    
    @Column(name = "int_temporal_esq_forca_muscular")
    private Integer int_temporal_esq_forca_muscular;
    
    @Column(name = "int_zigomatico_maior_dir_forca_muscular")
    private Integer int_zigomatico_maior_dir_forca_muscular;
    
    @Column(name = "int_zigomatico_maior_esq_forca_muscular")
    private Integer int_zigomatico_maior_esq_forca_muscular;
    
    @Column(name = "int_zigomatico_menor_esq_forca_muscular")
    private Integer int_zigomatico_menor_esq_forca_muscular;
    
    @Column(name = "int_zigomatico_menor_dir_forca_muscular")
    private Integer int_zigomatico_menor_dir_forca_muscular;
    
    @Column(name = "int_piterigoides_dir_forca_muscular")
    private Integer int_piterigoides_dir_forca_muscular;      
    
    @Column(name = "int_piterigoides_esq_forca_muscular")
    private Integer int_piterigoides_esq_forca_muscular;

    @Column(name = "str_observacao_atm_forca_muscular")
    private String str_observacao_atm_forca_muscular;  

    @JsonIgnore
    @OneToMany(mappedBy = "int_avaliacao_id", fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = AvaliacaoEntity.class)
    private Collection<AvaliacaoEntity> avaliacaoEntities;    

    public ForcaMuscularEntity() {
    }

    public ForcaMuscularEntity(Integer int_id_forca_muscular, Integer int_deltoide_esq_forca_muscular, Integer int_deltoide_dir_forca_muscular, Integer int_trapezio_superior_esq_forca_muscular, Integer int_trapezio_superior_dir_forca_muscular, Integer int_trapezio_medio_esq_forca_muscular, Integer int_trapezio_medio_dir_forca_muscular, Integer int_trapezio_inferior_esq_forca_muscular, Integer int_trapezio_inferiro_dir_forca_muscular, Integer int_levantador_escapula_esq_forca_muscular, Integer int_levantador_escapula_dir_forca_muscular, Integer int_supre_espinhoso_esq_forca_muscular, Integer int_supre_espinhoso_dir_forca_muscular, Integer int_infra_espinhoso_dir_forca_muscular, Integer int_infra_espinhoso_esq_forca_muscular, Integer int_subescapular_esq_forca_muscular, Integer int_subescapular_dir_forca_muscular, Integer int_redondo_menor_esq_forca_muscular, Integer int_redondo_menor_dir_forca_muscular, Integer int_redondo_maior_esq_forca_muscular, Integer int_redondo_maior_dir_forca_muscular, Integer int_bomboides_esq_forca_muscular, Integer int_bomboides_dir_forca_muscular, Integer int_peitoral_meno_esq_forca_muscular, Integer int_peitoral_meno_dir_forca_muscular, Integer int_serratil_anterior_esq_forca_muscular, Integer int_serratil_anterior_dir_forca_muscular, Integer int_grande_dorsal_esq_forca_muscular, Integer int_grande_dorsal_dir_forca_muscular, Integer int_cabeca_longa_biceps_esq_forca_muscular, Integer int_cabeca_longa_biceps_dir_forca_muscular, String str_observacoes_ombro_braco_forca_muscular, Integer int_biceps_braquial_esq_forca_muscular, Integer int_biceps_braquial_dir_forca_muscular, Integer int_triceps_braquial_esq_forca_muscular, Integer int_braquial_esq_forca_muscular, Integer int_braquial_dir_forca_muscular, Integer int_braquio_radial_esq_forca_muscular, Integer int_braquio_radial_dir_forca_muscular, String str_observacoes_cotovelo_antebraco_forca_muscularcol, Integer int_flexor_radial_carpo_esq_forca_muscular, Integer int_flexor_radial_carpo_dir_forca_muscular, Integer int_flexor_ulnarl_carpo_esq_forca_muscular, Integer int_flexor_ulnar_carpo_dir_forca_muscular, Integer int_palmar_longo_esq_forca_muscular, Integer int_palmar_longo_dir_forca_muscular, Integer int_extensor_radial_longo_carpo_esq_forca_muscular, Integer int_extensor_radial_longo_carpo_dir_forca_muscular, Integer int_extensor_radial_curto_carpo_esq_forca_muscular, Integer int_extensor_radial_curto_carpo_dir_forca_muscular, Integer int_extensor_ulnar_carpo_esq_forca_muscular, Integer int_extensor_ulnar_carpo_dir_forca_muscular, Integer int_extensor_comum_dedos_esq_forca_muscular, Integer int_extensor_comum_dedos_dir_forca_muscular, Integer int_fluxo_superficial_dedos_dir_forca_muscular, Integer int_fluxo_superficial_dedos_esq_forca_muscular, Integer int_fluxo_profundo_dedos_esq_forca_muscular, Integer int_fluxo_profundo_dedos_dir_forca_muscular, String str_observacao_punho_mao_forca_muscular, Integer int_iliopsoas_esq_forca_muscular, Integer int_iliopsoas_dir_forca_muscular, Integer int_reto_femoral_esq_forca_muscular, Integer int_reto_femoral_dir_forca_muscular, Integer int_gluteo_maximo_esq_forca_muscular, Integer int_gluteo_maximo_dir_forca_muscular, Integer int_gluteo_medio_dir_forca_muscular, Integer int_gluteo_medio_esq_forca_muscular, Integer int_gluteo_minimo_esq_forca_muscular, Integer int_gluteo_minimo_dir_forca_muscular, Integer int_tensor_farcial_lata_esq_forca_muscular, Integer int_tensor_farcial_lata_dir_forca_muscular, Integer int_adutor_longo_esq_forca_muscular, Integer int_adutor_longo_dir_forca_muscular, Integer int_adutor_curto_esq_forca_muscular, Integer int_adutor_curto_dir_forca_muscular, Integer int_adutor_magno_dir_forca_muscular, Integer int_adutor_magno_esq_forca_muscular, Integer int_gracil_dir_forca_muscular, Integer int_gracil_esq_forca_muscular, Integer int_pactineol_dir_forca_muscular, Integer int_pactineol_esq_forca_muscular, Integer int_obturador_interno_dir_forca_muscular, Integer int_obturador_interno_esq_forca_muscular, Integer int_obturador_externo_dir_forca_muscular, Integer int_obturador_externo_esq_forca_muscular, Integer int_gemeo_inferior_dir_forca_muscular, Integer int_gemeo_inferior_esq_forca_muscular, Integer int_gemeo_superior_esq_forca_muscular, Integer int_gemeo_superior_dir_forca_muscular, Integer int_periforme_esq_forca_muscular, Integer int_periforme_dir_forca_muscular, Integer int_quadrado_femoral_esq_forca_muscular, Integer int_quadrado_femoral_dir_forca_muscular, Integer int_biceps_femoral_esq_forca_muscular, Integer int_biceps_femoral_dir_forca_muscular, Integer int_semitendinoso_esq_forca_muscular, Integer int_semitendinoso_dir_forca_muscular, Integer int_semimembrandoso_esq_forca_muscular, Integer int_semimembrandoso_dir_forca_muscular, Integer int_sartorio_esq_forca_muscular, Integer int_sartorio_dir_forca_muscular, Integer str_observacoes_quadril_coxa_forca_muscular, Integer int_vasto_medial_esq_forca_muscular, Integer int_vasto_medial_dir_forca_muscular, Integer int_vasto_lateral_dir_forca_muscular, Integer int_vasto_lateral_esq_forca_muscular, Integer int_vasto_intermediario_esq_forca_muscular, Integer int_vasto_intermediario_dir_forca_muscular, Integer int_semimembranoso_dir_forca_muscular, Integer int_semimembranoso_esq_forca_muscular, Integer int_gastrocnemio_esq_forca_muscular, Integer int_gastrocnemio_dir_forca_muscular, String str_observacoes_joelho_perna_forca_muscular, Integer int_soleo_dir_forca_muscular, Integer int_soleo_esq_forca_muscular, Integer int_tibia_anterior_dir_forca_muscular, Integer int_tibia_anterior_esq_forca_muscular, Integer int_tibia_posterior_dir_forca_muscular, Integer int_tibia_posterior_esq_forca_muscular, Integer int_fibulares_dir_forca_muscular, Integer int_fibulares_esq_forca_muscular, Integer str_observacao_tornozelo_pe_forca_muscular, Integer int_multifidos_esq_forca_muscular, Integer int_multifidos_dir_forca_muscular, Integer int_intertransversarios_esq_forca_muscular, Integer int_intertransversarios_dir_forca_muscular, Integer int_rotadores_profundos_esq_forca_muscular, Integer int_rotadores_profundos_dir_forca_muscular, Integer int_subcostais_esq_forca_muscular, Integer int_subcostais_dir_forca_muscular, Integer int_esplenio_esq_forca_muscular, Integer int_esplenio_dir_forca_muscular, Integer int_longuissimo_esq_forca_muscular, Integer int_longuissimo_dir_forca_muscular, Integer int_iliocostal_esq_forca_muscular, Integer int_iliocostal_dir_forca_muscular, String str_observacoes_coluna_vertebral_forca_muscular, Integer int_masseter_dir_forca_muscular, Integer int_masseter_esq_forca_muscular, Integer int_temporal_dir_forca_muscular, Integer int_temporal_esqueda_forca_muscular, Integer int_supra_hioideos_dir_forca_muscular, Integer int_temporal_esq_forca_muscular, Integer int_zigomatico_maior_dir_forca_muscular, Integer int_zigomatico_maior_esq_forca_muscular, Integer int_zigomatico_menor_esq_forca_muscular, Integer int_zigomatico_menor_dir_forca_muscular, Integer int_piterigoides_dir_forca_muscular, Integer int_piterigoides_esq_forca_muscular, String str_observacao_atm_forca_muscular) {
        this.int_id_forca_muscular = int_id_forca_muscular;
        this.int_deltoide_esq_forca_muscular = int_deltoide_esq_forca_muscular;
        this.int_deltoide_dir_forca_muscular = int_deltoide_dir_forca_muscular;
        this.int_trapezio_superior_esq_forca_muscular = int_trapezio_superior_esq_forca_muscular;
        this.int_trapezio_superior_dir_forca_muscular = int_trapezio_superior_dir_forca_muscular;
        this.int_trapezio_medio_esq_forca_muscular = int_trapezio_medio_esq_forca_muscular;
        this.int_trapezio_medio_dir_forca_muscular = int_trapezio_medio_dir_forca_muscular;
        this.int_trapezio_inferior_esq_forca_muscular = int_trapezio_inferior_esq_forca_muscular;
        this.int_trapezio_inferiro_dir_forca_muscular = int_trapezio_inferiro_dir_forca_muscular;
        this.int_levantador_escapula_esq_forca_muscular = int_levantador_escapula_esq_forca_muscular;
        this.int_levantador_escapula_dir_forca_muscular = int_levantador_escapula_dir_forca_muscular;
        this.int_supre_espinhoso_esq_forca_muscular = int_supre_espinhoso_esq_forca_muscular;
        this.int_supre_espinhoso_dir_forca_muscular = int_supre_espinhoso_dir_forca_muscular;
        this.int_infra_espinhoso_dir_forca_muscular = int_infra_espinhoso_dir_forca_muscular;
        this.int_infra_espinhoso_esq_forca_muscular = int_infra_espinhoso_esq_forca_muscular;
        this.int_subescapular_esq_forca_muscular = int_subescapular_esq_forca_muscular;
        this.int_subescapular_dir_forca_muscular = int_subescapular_dir_forca_muscular;
        this.int_redondo_menor_esq_forca_muscular = int_redondo_menor_esq_forca_muscular;
        this.int_redondo_menor_dir_forca_muscular = int_redondo_menor_dir_forca_muscular;
        this.int_redondo_maior_esq_forca_muscular = int_redondo_maior_esq_forca_muscular;
        this.int_redondo_maior_dir_forca_muscular = int_redondo_maior_dir_forca_muscular;
        this.int_bomboides_esq_forca_muscular = int_bomboides_esq_forca_muscular;
        this.int_bomboides_dir_forca_muscular = int_bomboides_dir_forca_muscular;
        this.int_peitoral_meno_esq_forca_muscular = int_peitoral_meno_esq_forca_muscular;
        this.int_peitoral_meno_dir_forca_muscular = int_peitoral_meno_dir_forca_muscular;
        this.int_serratil_anterior_esq_forca_muscular = int_serratil_anterior_esq_forca_muscular;
        this.int_serratil_anterior_dir_forca_muscular = int_serratil_anterior_dir_forca_muscular;
        this.int_grande_dorsal_esq_forca_muscular = int_grande_dorsal_esq_forca_muscular;
        this.int_grande_dorsal_dir_forca_muscular = int_grande_dorsal_dir_forca_muscular;
        this.int_cabeca_longa_biceps_esq_forca_muscular = int_cabeca_longa_biceps_esq_forca_muscular;
        this.int_cabeca_longa_biceps_dir_forca_muscular = int_cabeca_longa_biceps_dir_forca_muscular;
        this.str_observacoes_ombro_braco_forca_muscular = str_observacoes_ombro_braco_forca_muscular;
        this.int_biceps_braquial_esq_forca_muscular = int_biceps_braquial_esq_forca_muscular;
        this.int_biceps_braquial_dir_forca_muscular = int_biceps_braquial_dir_forca_muscular;
        this.int_triceps_braquial_esq_forca_muscular = int_triceps_braquial_esq_forca_muscular;
        this.int_braquial_esq_forca_muscular = int_braquial_esq_forca_muscular;
        this.int_braquial_dir_forca_muscular = int_braquial_dir_forca_muscular;
        this.int_braquio_radial_esq_forca_muscular = int_braquio_radial_esq_forca_muscular;
        this.int_braquio_radial_dir_forca_muscular = int_braquio_radial_dir_forca_muscular;
        this.str_observacoes_cotovelo_antebraco_forca_muscularcol = str_observacoes_cotovelo_antebraco_forca_muscularcol;
        this.int_flexor_radial_carpo_esq_forca_muscular = int_flexor_radial_carpo_esq_forca_muscular;
        this.int_flexor_radial_carpo_dir_forca_muscular = int_flexor_radial_carpo_dir_forca_muscular;
        this.int_flexor_ulnarl_carpo_esq_forca_muscular = int_flexor_ulnarl_carpo_esq_forca_muscular;
        this.int_flexor_ulnar_carpo_dir_forca_muscular = int_flexor_ulnar_carpo_dir_forca_muscular;
        this.int_palmar_longo_esq_forca_muscular = int_palmar_longo_esq_forca_muscular;
        this.int_palmar_longo_dir_forca_muscular = int_palmar_longo_dir_forca_muscular;
        this.int_extensor_radial_longo_carpo_esq_forca_muscular = int_extensor_radial_longo_carpo_esq_forca_muscular;
        this.int_extensor_radial_longo_carpo_dir_forca_muscular = int_extensor_radial_longo_carpo_dir_forca_muscular;
        this.int_extensor_radial_curto_carpo_esq_forca_muscular = int_extensor_radial_curto_carpo_esq_forca_muscular;
        this.int_extensor_radial_curto_carpo_dir_forca_muscular = int_extensor_radial_curto_carpo_dir_forca_muscular;
        this.int_extensor_ulnar_carpo_esq_forca_muscular = int_extensor_ulnar_carpo_esq_forca_muscular;
        this.int_extensor_ulnar_carpo_dir_forca_muscular = int_extensor_ulnar_carpo_dir_forca_muscular;
        this.int_extensor_comum_dedos_esq_forca_muscular = int_extensor_comum_dedos_esq_forca_muscular;
        this.int_extensor_comum_dedos_dir_forca_muscular = int_extensor_comum_dedos_dir_forca_muscular;
        this.int_fluxo_superficial_dedos_dir_forca_muscular = int_fluxo_superficial_dedos_dir_forca_muscular;
        this.int_fluxo_superficial_dedos_esq_forca_muscular = int_fluxo_superficial_dedos_esq_forca_muscular;
        this.int_fluxo_profundo_dedos_esq_forca_muscular = int_fluxo_profundo_dedos_esq_forca_muscular;
        this.int_fluxo_profundo_dedos_dir_forca_muscular = int_fluxo_profundo_dedos_dir_forca_muscular;
        this.str_observacao_punho_mao_forca_muscular = str_observacao_punho_mao_forca_muscular;
        this.int_iliopsoas_esq_forca_muscular = int_iliopsoas_esq_forca_muscular;
        this.int_iliopsoas_dir_forca_muscular = int_iliopsoas_dir_forca_muscular;
        this.int_reto_femoral_esq_forca_muscular = int_reto_femoral_esq_forca_muscular;
        this.int_reto_femoral_dir_forca_muscular = int_reto_femoral_dir_forca_muscular;
        this.int_gluteo_maximo_esq_forca_muscular = int_gluteo_maximo_esq_forca_muscular;
        this.int_gluteo_maximo_dir_forca_muscular = int_gluteo_maximo_dir_forca_muscular;
        this.int_gluteo_medio_dir_forca_muscular = int_gluteo_medio_dir_forca_muscular;
        this.int_gluteo_medio_esq_forca_muscular = int_gluteo_medio_esq_forca_muscular;
        this.int_gluteo_minimo_esq_forca_muscular = int_gluteo_minimo_esq_forca_muscular;
        this.int_gluteo_minimo_dir_forca_muscular = int_gluteo_minimo_dir_forca_muscular;
        this.int_tensor_farcial_lata_esq_forca_muscular = int_tensor_farcial_lata_esq_forca_muscular;
        this.int_tensor_farcial_lata_dir_forca_muscular = int_tensor_farcial_lata_dir_forca_muscular;
        this.int_adutor_longo_esq_forca_muscular = int_adutor_longo_esq_forca_muscular;
        this.int_adutor_longo_dir_forca_muscular = int_adutor_longo_dir_forca_muscular;
        this.int_adutor_curto_esq_forca_muscular = int_adutor_curto_esq_forca_muscular;
        this.int_adutor_curto_dir_forca_muscular = int_adutor_curto_dir_forca_muscular;
        this.int_adutor_magno_dir_forca_muscular = int_adutor_magno_dir_forca_muscular;
        this.int_adutor_magno_esq_forca_muscular = int_adutor_magno_esq_forca_muscular;
        this.int_gracil_dir_forca_muscular = int_gracil_dir_forca_muscular;
        this.int_gracil_esq_forca_muscular = int_gracil_esq_forca_muscular;
        this.int_pactineol_dir_forca_muscular = int_pactineol_dir_forca_muscular;
        this.int_pactineol_esq_forca_muscular = int_pactineol_esq_forca_muscular;
        this.int_obturador_interno_dir_forca_muscular = int_obturador_interno_dir_forca_muscular;
        this.int_obturador_interno_esq_forca_muscular = int_obturador_interno_esq_forca_muscular;
        this.int_obturador_externo_dir_forca_muscular = int_obturador_externo_dir_forca_muscular;
        this.int_obturador_externo_esq_forca_muscular = int_obturador_externo_esq_forca_muscular;
        this.int_gemeo_inferior_dir_forca_muscular = int_gemeo_inferior_dir_forca_muscular;
        this.int_gemeo_inferior_esq_forca_muscular = int_gemeo_inferior_esq_forca_muscular;
        this.int_gemeo_superior_esq_forca_muscular = int_gemeo_superior_esq_forca_muscular;
        this.int_gemeo_superior_dir_forca_muscular = int_gemeo_superior_dir_forca_muscular;
        this.int_periforme_esq_forca_muscular = int_periforme_esq_forca_muscular;
        this.int_periforme_dir_forca_muscular = int_periforme_dir_forca_muscular;
        this.int_quadrado_femoral_esq_forca_muscular = int_quadrado_femoral_esq_forca_muscular;
        this.int_quadrado_femoral_dir_forca_muscular = int_quadrado_femoral_dir_forca_muscular;
        this.int_biceps_femoral_esq_forca_muscular = int_biceps_femoral_esq_forca_muscular;
        this.int_biceps_femoral_dir_forca_muscular = int_biceps_femoral_dir_forca_muscular;
        this.int_semitendinoso_esq_forca_muscular = int_semitendinoso_esq_forca_muscular;
        this.int_semitendinoso_dir_forca_muscular = int_semitendinoso_dir_forca_muscular;
        this.int_semimembrandoso_esq_forca_muscular = int_semimembrandoso_esq_forca_muscular;
        this.int_semimembrandoso_dir_forca_muscular = int_semimembrandoso_dir_forca_muscular;
        this.int_sartorio_esq_forca_muscular = int_sartorio_esq_forca_muscular;
        this.int_sartorio_dir_forca_muscular = int_sartorio_dir_forca_muscular;
        this.str_observacoes_quadril_coxa_forca_muscular = str_observacoes_quadril_coxa_forca_muscular;
        this.int_vasto_medial_esq_forca_muscular = int_vasto_medial_esq_forca_muscular;
        this.int_vasto_medial_dir_forca_muscular = int_vasto_medial_dir_forca_muscular;
        this.int_vasto_lateral_dir_forca_muscular = int_vasto_lateral_dir_forca_muscular;
        this.int_vasto_lateral_esq_forca_muscular = int_vasto_lateral_esq_forca_muscular;
        this.int_vasto_intermediario_esq_forca_muscular = int_vasto_intermediario_esq_forca_muscular;
        this.int_vasto_intermediario_dir_forca_muscular = int_vasto_intermediario_dir_forca_muscular;
        this.int_semimembranoso_dir_forca_muscular = int_semimembranoso_dir_forca_muscular;
        this.int_semimembranoso_esq_forca_muscular = int_semimembranoso_esq_forca_muscular;
        this.int_gastrocnemio_esq_forca_muscular = int_gastrocnemio_esq_forca_muscular;
        this.int_gastrocnemio_dir_forca_muscular = int_gastrocnemio_dir_forca_muscular;
        this.str_observacoes_joelho_perna_forca_muscular = str_observacoes_joelho_perna_forca_muscular;
        this.int_soleo_dir_forca_muscular = int_soleo_dir_forca_muscular;
        this.int_soleo_esq_forca_muscular = int_soleo_esq_forca_muscular;
        this.int_tibia_anterior_dir_forca_muscular = int_tibia_anterior_dir_forca_muscular;
        this.int_tibia_anterior_esq_forca_muscular = int_tibia_anterior_esq_forca_muscular;
        this.int_tibia_posterior_dir_forca_muscular = int_tibia_posterior_dir_forca_muscular;
        this.int_tibia_posterior_esq_forca_muscular = int_tibia_posterior_esq_forca_muscular;
        this.int_fibulares_dir_forca_muscular = int_fibulares_dir_forca_muscular;
        this.int_fibulares_esq_forca_muscular = int_fibulares_esq_forca_muscular;
        this.str_observacao_tornozelo_pe_forca_muscular = str_observacao_tornozelo_pe_forca_muscular;
        this.int_multifidos_esq_forca_muscular = int_multifidos_esq_forca_muscular;
        this.int_multifidos_dir_forca_muscular = int_multifidos_dir_forca_muscular;
        this.int_intertransversarios_esq_forca_muscular = int_intertransversarios_esq_forca_muscular;
        this.int_intertransversarios_dir_forca_muscular = int_intertransversarios_dir_forca_muscular;
        this.int_rotadores_profundos_esq_forca_muscular = int_rotadores_profundos_esq_forca_muscular;
        this.int_rotadores_profundos_dir_forca_muscular = int_rotadores_profundos_dir_forca_muscular;
        this.int_subcostais_esq_forca_muscular = int_subcostais_esq_forca_muscular;
        this.int_subcostais_dir_forca_muscular = int_subcostais_dir_forca_muscular;
        this.int_esplenio_esq_forca_muscular = int_esplenio_esq_forca_muscular;
        this.int_esplenio_dir_forca_muscular = int_esplenio_dir_forca_muscular;
        this.int_longuissimo_esq_forca_muscular = int_longuissimo_esq_forca_muscular;
        this.int_longuissimo_dir_forca_muscular = int_longuissimo_dir_forca_muscular;
        this.int_iliocostal_esq_forca_muscular = int_iliocostal_esq_forca_muscular;
        this.int_iliocostal_dir_forca_muscular = int_iliocostal_dir_forca_muscular;
        this.str_observacoes_coluna_vertebral_forca_muscular = str_observacoes_coluna_vertebral_forca_muscular;
        this.int_masseter_dir_forca_muscular = int_masseter_dir_forca_muscular;
        this.int_masseter_esq_forca_muscular = int_masseter_esq_forca_muscular;
        this.int_temporal_dir_forca_muscular = int_temporal_dir_forca_muscular;
        this.int_temporal_esqueda_forca_muscular = int_temporal_esqueda_forca_muscular;
        this.int_supra_hioideos_dir_forca_muscular = int_supra_hioideos_dir_forca_muscular;
        this.int_temporal_esq_forca_muscular = int_temporal_esq_forca_muscular;
        this.int_zigomatico_maior_dir_forca_muscular = int_zigomatico_maior_dir_forca_muscular;
        this.int_zigomatico_maior_esq_forca_muscular = int_zigomatico_maior_esq_forca_muscular;
        this.int_zigomatico_menor_esq_forca_muscular = int_zigomatico_menor_esq_forca_muscular;
        this.int_zigomatico_menor_dir_forca_muscular = int_zigomatico_menor_dir_forca_muscular;
        this.int_piterigoides_dir_forca_muscular = int_piterigoides_dir_forca_muscular;
        this.int_piterigoides_esq_forca_muscular = int_piterigoides_esq_forca_muscular;
        this.str_observacao_atm_forca_muscular = str_observacao_atm_forca_muscular;
    }

    public Integer getInt_id_forca_muscular() {
        return int_id_forca_muscular;
    }

    public void setInt_id_forca_muscular(Integer int_id_forca_muscular) {
        this.int_id_forca_muscular = int_id_forca_muscular;
    }

    public Integer getInt_deltoide_esq_forca_muscular() {
        return int_deltoide_esq_forca_muscular;
    }

    public void setInt_deltoide_esq_forca_muscular(Integer int_deltoide_esq_forca_muscular) {
        this.int_deltoide_esq_forca_muscular = int_deltoide_esq_forca_muscular;
    }

    public Integer getInt_deltoide_dir_forca_muscular() {
        return int_deltoide_dir_forca_muscular;
    }

    public void setInt_deltoide_dir_forca_muscular(Integer int_deltoide_dir_forca_muscular) {
        this.int_deltoide_dir_forca_muscular = int_deltoide_dir_forca_muscular;
    }

    public Integer getInt_trapezio_superior_esq_forca_muscular() {
        return int_trapezio_superior_esq_forca_muscular;
    }

    public void setInt_trapezio_superior_esq_forca_muscular(Integer int_trapezio_superior_esq_forca_muscular) {
        this.int_trapezio_superior_esq_forca_muscular = int_trapezio_superior_esq_forca_muscular;
    }

    public Integer getInt_trapezio_superior_dir_forca_muscular() {
        return int_trapezio_superior_dir_forca_muscular;
    }

    public void setInt_trapezio_superior_dir_forca_muscular(Integer int_trapezio_superior_dir_forca_muscular) {
        this.int_trapezio_superior_dir_forca_muscular = int_trapezio_superior_dir_forca_muscular;
    }

    public Integer getInt_trapezio_medio_esq_forca_muscular() {
        return int_trapezio_medio_esq_forca_muscular;
    }

    public void setInt_trapezio_medio_esq_forca_muscular(Integer int_trapezio_medio_esq_forca_muscular) {
        this.int_trapezio_medio_esq_forca_muscular = int_trapezio_medio_esq_forca_muscular;
    }

    public Integer getInt_trapezio_medio_dir_forca_muscular() {
        return int_trapezio_medio_dir_forca_muscular;
    }

    public void setInt_trapezio_medio_dir_forca_muscular(Integer int_trapezio_medio_dir_forca_muscular) {
        this.int_trapezio_medio_dir_forca_muscular = int_trapezio_medio_dir_forca_muscular;
    }

    public Integer getInt_trapezio_inferior_esq_forca_muscular() {
        return int_trapezio_inferior_esq_forca_muscular;
    }

    public void setInt_trapezio_inferior_esq_forca_muscular(Integer int_trapezio_inferior_esq_forca_muscular) {
        this.int_trapezio_inferior_esq_forca_muscular = int_trapezio_inferior_esq_forca_muscular;
    }

    public Integer getInt_trapezio_inferiro_dir_forca_muscular() {
        return int_trapezio_inferiro_dir_forca_muscular;
    }

    public void setInt_trapezio_inferiro_dir_forca_muscular(Integer int_trapezio_inferiro_dir_forca_muscular) {
        this.int_trapezio_inferiro_dir_forca_muscular = int_trapezio_inferiro_dir_forca_muscular;
    }

    public Integer getInt_levantador_escapula_esq_forca_muscular() {
        return int_levantador_escapula_esq_forca_muscular;
    }

    public void setInt_levantador_escapula_esq_forca_muscular(Integer int_levantador_escapula_esq_forca_muscular) {
        this.int_levantador_escapula_esq_forca_muscular = int_levantador_escapula_esq_forca_muscular;
    }

    public Integer getInt_levantador_escapula_dir_forca_muscular() {
        return int_levantador_escapula_dir_forca_muscular;
    }

    public void setInt_levantador_escapula_dir_forca_muscular(Integer int_levantador_escapula_dir_forca_muscular) {
        this.int_levantador_escapula_dir_forca_muscular = int_levantador_escapula_dir_forca_muscular;
    }

    public Integer getInt_supre_espinhoso_esq_forca_muscular() {
        return int_supre_espinhoso_esq_forca_muscular;
    }

    public void setInt_supre_espinhoso_esq_forca_muscular(Integer int_supre_espinhoso_esq_forca_muscular) {
        this.int_supre_espinhoso_esq_forca_muscular = int_supre_espinhoso_esq_forca_muscular;
    }

    public Integer getInt_supre_espinhoso_dir_forca_muscular() {
        return int_supre_espinhoso_dir_forca_muscular;
    }

    public void setInt_supre_espinhoso_dir_forca_muscular(Integer int_supre_espinhoso_dir_forca_muscular) {
        this.int_supre_espinhoso_dir_forca_muscular = int_supre_espinhoso_dir_forca_muscular;
    }

    public Integer getInt_infra_espinhoso_dir_forca_muscular() {
        return int_infra_espinhoso_dir_forca_muscular;
    }

    public void setInt_infra_espinhoso_dir_forca_muscular(Integer int_infra_espinhoso_dir_forca_muscular) {
        this.int_infra_espinhoso_dir_forca_muscular = int_infra_espinhoso_dir_forca_muscular;
    }

    public Integer getInt_infra_espinhoso_esq_forca_muscular() {
        return int_infra_espinhoso_esq_forca_muscular;
    }

    public void setInt_infra_espinhoso_esq_forca_muscular(Integer int_infra_espinhoso_esq_forca_muscular) {
        this.int_infra_espinhoso_esq_forca_muscular = int_infra_espinhoso_esq_forca_muscular;
    }

    public Integer getInt_subescapular_esq_forca_muscular() {
        return int_subescapular_esq_forca_muscular;
    }

    public void setInt_subescapular_esq_forca_muscular(Integer int_subescapular_esq_forca_muscular) {
        this.int_subescapular_esq_forca_muscular = int_subescapular_esq_forca_muscular;
    }

    public Integer getInt_subescapular_dir_forca_muscular() {
        return int_subescapular_dir_forca_muscular;
    }

    public void setInt_subescapular_dir_forca_muscular(Integer int_subescapular_dir_forca_muscular) {
        this.int_subescapular_dir_forca_muscular = int_subescapular_dir_forca_muscular;
    }

    public Integer getInt_redondo_menor_esq_forca_muscular() {
        return int_redondo_menor_esq_forca_muscular;
    }

    public void setInt_redondo_menor_esq_forca_muscular(Integer int_redondo_menor_esq_forca_muscular) {
        this.int_redondo_menor_esq_forca_muscular = int_redondo_menor_esq_forca_muscular;
    }

    public Integer getInt_redondo_menor_dir_forca_muscular() {
        return int_redondo_menor_dir_forca_muscular;
    }

    public void setInt_redondo_menor_dir_forca_muscular(Integer int_redondo_menor_dir_forca_muscular) {
        this.int_redondo_menor_dir_forca_muscular = int_redondo_menor_dir_forca_muscular;
    }

    public Integer getInt_redondo_maior_esq_forca_muscular() {
        return int_redondo_maior_esq_forca_muscular;
    }

    public void setInt_redondo_maior_esq_forca_muscular(Integer int_redondo_maior_esq_forca_muscular) {
        this.int_redondo_maior_esq_forca_muscular = int_redondo_maior_esq_forca_muscular;
    }

    public Integer getInt_redondo_maior_dir_forca_muscular() {
        return int_redondo_maior_dir_forca_muscular;
    }

    public void setInt_redondo_maior_dir_forca_muscular(Integer int_redondo_maior_dir_forca_muscular) {
        this.int_redondo_maior_dir_forca_muscular = int_redondo_maior_dir_forca_muscular;
    }

    public Integer getInt_bomboides_esq_forca_muscular() {
        return int_bomboides_esq_forca_muscular;
    }

    public void setInt_bomboides_esq_forca_muscular(Integer int_bomboides_esq_forca_muscular) {
        this.int_bomboides_esq_forca_muscular = int_bomboides_esq_forca_muscular;
    }

    public Integer getInt_bomboides_dir_forca_muscular() {
        return int_bomboides_dir_forca_muscular;
    }

    public void setInt_bomboides_dir_forca_muscular(Integer int_bomboides_dir_forca_muscular) {
        this.int_bomboides_dir_forca_muscular = int_bomboides_dir_forca_muscular;
    }

    public Integer getInt_peitoral_meno_esq_forca_muscular() {
        return int_peitoral_meno_esq_forca_muscular;
    }

    public void setInt_peitoral_meno_esq_forca_muscular(Integer int_peitoral_meno_esq_forca_muscular) {
        this.int_peitoral_meno_esq_forca_muscular = int_peitoral_meno_esq_forca_muscular;
    }

    public Integer getInt_peitoral_meno_dir_forca_muscular() {
        return int_peitoral_meno_dir_forca_muscular;
    }

    public void setInt_peitoral_meno_dir_forca_muscular(Integer int_peitoral_meno_dir_forca_muscular) {
        this.int_peitoral_meno_dir_forca_muscular = int_peitoral_meno_dir_forca_muscular;
    }

    public Integer getInt_serratil_anterior_esq_forca_muscular() {
        return int_serratil_anterior_esq_forca_muscular;
    }

    public void setInt_serratil_anterior_esq_forca_muscular(Integer int_serratil_anterior_esq_forca_muscular) {
        this.int_serratil_anterior_esq_forca_muscular = int_serratil_anterior_esq_forca_muscular;
    }

    public Integer getInt_serratil_anterior_dir_forca_muscular() {
        return int_serratil_anterior_dir_forca_muscular;
    }

    public void setInt_serratil_anterior_dir_forca_muscular(Integer int_serratil_anterior_dir_forca_muscular) {
        this.int_serratil_anterior_dir_forca_muscular = int_serratil_anterior_dir_forca_muscular;
    }

    public Integer getInt_grande_dorsal_esq_forca_muscular() {
        return int_grande_dorsal_esq_forca_muscular;
    }

    public void setInt_grande_dorsal_esq_forca_muscular(Integer int_grande_dorsal_esq_forca_muscular) {
        this.int_grande_dorsal_esq_forca_muscular = int_grande_dorsal_esq_forca_muscular;
    }

    public Integer getInt_grande_dorsal_dir_forca_muscular() {
        return int_grande_dorsal_dir_forca_muscular;
    }

    public void setInt_grande_dorsal_dir_forca_muscular(Integer int_grande_dorsal_dir_forca_muscular) {
        this.int_grande_dorsal_dir_forca_muscular = int_grande_dorsal_dir_forca_muscular;
    }

    public Integer getInt_cabeca_longa_biceps_esq_forca_muscular() {
        return int_cabeca_longa_biceps_esq_forca_muscular;
    }

    public void setInt_cabeca_longa_biceps_esq_forca_muscular(Integer int_cabeca_longa_biceps_esq_forca_muscular) {
        this.int_cabeca_longa_biceps_esq_forca_muscular = int_cabeca_longa_biceps_esq_forca_muscular;
    }

    public Integer getInt_cabeca_longa_biceps_dir_forca_muscular() {
        return int_cabeca_longa_biceps_dir_forca_muscular;
    }

    public void setInt_cabeca_longa_biceps_dir_forca_muscular(Integer int_cabeca_longa_biceps_dir_forca_muscular) {
        this.int_cabeca_longa_biceps_dir_forca_muscular = int_cabeca_longa_biceps_dir_forca_muscular;
    }

    public String getStr_observacoes_ombro_braco_forca_muscular() {
        return str_observacoes_ombro_braco_forca_muscular;
    }

    public void setStr_observacoes_ombro_braco_forca_muscular(String str_observacoes_ombro_braco_forca_muscular) {
        this.str_observacoes_ombro_braco_forca_muscular = str_observacoes_ombro_braco_forca_muscular;
    }

    public Integer getInt_biceps_braquial_esq_forca_muscular() {
        return int_biceps_braquial_esq_forca_muscular;
    }

    public void setInt_biceps_braquial_esq_forca_muscular(Integer int_biceps_braquial_esq_forca_muscular) {
        this.int_biceps_braquial_esq_forca_muscular = int_biceps_braquial_esq_forca_muscular;
    }

    public Integer getInt_biceps_braquial_dir_forca_muscular() {
        return int_biceps_braquial_dir_forca_muscular;
    }

    public void setInt_biceps_braquial_dir_forca_muscular(Integer int_biceps_braquial_dir_forca_muscular) {
        this.int_biceps_braquial_dir_forca_muscular = int_biceps_braquial_dir_forca_muscular;
    }

    public Integer getInt_triceps_braquial_esq_forca_muscular() {
        return int_triceps_braquial_esq_forca_muscular;
    }

    public void setInt_triceps_braquial_esq_forca_muscular(Integer int_triceps_braquial_esq_forca_muscular) {
        this.int_triceps_braquial_esq_forca_muscular = int_triceps_braquial_esq_forca_muscular;
    }

    public Integer getInt_braquial_esq_forca_muscular() {
        return int_braquial_esq_forca_muscular;
    }

    public void setInt_braquial_esq_forca_muscular(Integer int_braquial_esq_forca_muscular) {
        this.int_braquial_esq_forca_muscular = int_braquial_esq_forca_muscular;
    }

    public Integer getInt_braquial_dir_forca_muscular() {
        return int_braquial_dir_forca_muscular;
    }

    public void setInt_braquial_dir_forca_muscular(Integer int_braquial_dir_forca_muscular) {
        this.int_braquial_dir_forca_muscular = int_braquial_dir_forca_muscular;
    }

    public Integer getInt_braquio_radial_esq_forca_muscular() {
        return int_braquio_radial_esq_forca_muscular;
    }

    public void setInt_braquio_radial_esq_forca_muscular(Integer int_braquio_radial_esq_forca_muscular) {
        this.int_braquio_radial_esq_forca_muscular = int_braquio_radial_esq_forca_muscular;
    }

    public Integer getInt_braquio_radial_dir_forca_muscular() {
        return int_braquio_radial_dir_forca_muscular;
    }

    public void setInt_braquio_radial_dir_forca_muscular(Integer int_braquio_radial_dir_forca_muscular) {
        this.int_braquio_radial_dir_forca_muscular = int_braquio_radial_dir_forca_muscular;
    }

    public String getStr_observacoes_cotovelo_antebraco_forca_muscularcol() {
        return str_observacoes_cotovelo_antebraco_forca_muscularcol;
    }

    public void setStr_observacoes_cotovelo_antebraco_forca_muscularcol(String str_observacoes_cotovelo_antebraco_forca_muscularcol) {
        this.str_observacoes_cotovelo_antebraco_forca_muscularcol = str_observacoes_cotovelo_antebraco_forca_muscularcol;
    }

    public Integer getInt_flexor_radial_carpo_esq_forca_muscular() {
        return int_flexor_radial_carpo_esq_forca_muscular;
    }

    public void setInt_flexor_radial_carpo_esq_forca_muscular(Integer int_flexor_radial_carpo_esq_forca_muscular) {
        this.int_flexor_radial_carpo_esq_forca_muscular = int_flexor_radial_carpo_esq_forca_muscular;
    }

    public Integer getInt_flexor_radial_carpo_dir_forca_muscular() {
        return int_flexor_radial_carpo_dir_forca_muscular;
    }

    public void setInt_flexor_radial_carpo_dir_forca_muscular(Integer int_flexor_radial_carpo_dir_forca_muscular) {
        this.int_flexor_radial_carpo_dir_forca_muscular = int_flexor_radial_carpo_dir_forca_muscular;
    }

    public Integer getInt_flexor_ulnarl_carpo_esq_forca_muscular() {
        return int_flexor_ulnarl_carpo_esq_forca_muscular;
    }

    public void setInt_flexor_ulnarl_carpo_esq_forca_muscular(Integer int_flexor_ulnarl_carpo_esq_forca_muscular) {
        this.int_flexor_ulnarl_carpo_esq_forca_muscular = int_flexor_ulnarl_carpo_esq_forca_muscular;
    }

    public Integer getInt_flexor_ulnar_carpo_dir_forca_muscular() {
        return int_flexor_ulnar_carpo_dir_forca_muscular;
    }

    public void setInt_flexor_ulnar_carpo_dir_forca_muscular(Integer int_flexor_ulnar_carpo_dir_forca_muscular) {
        this.int_flexor_ulnar_carpo_dir_forca_muscular = int_flexor_ulnar_carpo_dir_forca_muscular;
    }

    public Integer getInt_palmar_longo_esq_forca_muscular() {
        return int_palmar_longo_esq_forca_muscular;
    }

    public void setInt_palmar_longo_esq_forca_muscular(Integer int_palmar_longo_esq_forca_muscular) {
        this.int_palmar_longo_esq_forca_muscular = int_palmar_longo_esq_forca_muscular;
    }

    public Integer getInt_palmar_longo_dir_forca_muscular() {
        return int_palmar_longo_dir_forca_muscular;
    }

    public void setInt_palmar_longo_dir_forca_muscular(Integer int_palmar_longo_dir_forca_muscular) {
        this.int_palmar_longo_dir_forca_muscular = int_palmar_longo_dir_forca_muscular;
    }

    public Integer getInt_extensor_radial_longo_carpo_esq_forca_muscular() {
        return int_extensor_radial_longo_carpo_esq_forca_muscular;
    }

    public void setInt_extensor_radial_longo_carpo_esq_forca_muscular(Integer int_extensor_radial_longo_carpo_esq_forca_muscular) {
        this.int_extensor_radial_longo_carpo_esq_forca_muscular = int_extensor_radial_longo_carpo_esq_forca_muscular;
    }

    public Integer getInt_extensor_radial_longo_carpo_dir_forca_muscular() {
        return int_extensor_radial_longo_carpo_dir_forca_muscular;
    }

    public void setInt_extensor_radial_longo_carpo_dir_forca_muscular(Integer int_extensor_radial_longo_carpo_dir_forca_muscular) {
        this.int_extensor_radial_longo_carpo_dir_forca_muscular = int_extensor_radial_longo_carpo_dir_forca_muscular;
    }

    public Integer getInt_extensor_radial_curto_carpo_esq_forca_muscular() {
        return int_extensor_radial_curto_carpo_esq_forca_muscular;
    }

    public void setInt_extensor_radial_curto_carpo_esq_forca_muscular(Integer int_extensor_radial_curto_carpo_esq_forca_muscular) {
        this.int_extensor_radial_curto_carpo_esq_forca_muscular = int_extensor_radial_curto_carpo_esq_forca_muscular;
    }

    public Integer getInt_extensor_radial_curto_carpo_dir_forca_muscular() {
        return int_extensor_radial_curto_carpo_dir_forca_muscular;
    }

    public void setInt_extensor_radial_curto_carpo_dir_forca_muscular(Integer int_extensor_radial_curto_carpo_dir_forca_muscular) {
        this.int_extensor_radial_curto_carpo_dir_forca_muscular = int_extensor_radial_curto_carpo_dir_forca_muscular;
    }

    public Integer getInt_extensor_ulnar_carpo_esq_forca_muscular() {
        return int_extensor_ulnar_carpo_esq_forca_muscular;
    }

    public void setInt_extensor_ulnar_carpo_esq_forca_muscular(Integer int_extensor_ulnar_carpo_esq_forca_muscular) {
        this.int_extensor_ulnar_carpo_esq_forca_muscular = int_extensor_ulnar_carpo_esq_forca_muscular;
    }

    public Integer getInt_extensor_ulnar_carpo_dir_forca_muscular() {
        return int_extensor_ulnar_carpo_dir_forca_muscular;
    }

    public void setInt_extensor_ulnar_carpo_dir_forca_muscular(Integer int_extensor_ulnar_carpo_dir_forca_muscular) {
        this.int_extensor_ulnar_carpo_dir_forca_muscular = int_extensor_ulnar_carpo_dir_forca_muscular;
    }

    public Integer getInt_extensor_comum_dedos_esq_forca_muscular() {
        return int_extensor_comum_dedos_esq_forca_muscular;
    }

    public void setInt_extensor_comum_dedos_esq_forca_muscular(Integer int_extensor_comum_dedos_esq_forca_muscular) {
        this.int_extensor_comum_dedos_esq_forca_muscular = int_extensor_comum_dedos_esq_forca_muscular;
    }

    public Integer getInt_extensor_comum_dedos_dir_forca_muscular() {
        return int_extensor_comum_dedos_dir_forca_muscular;
    }

    public void setInt_extensor_comum_dedos_dir_forca_muscular(Integer int_extensor_comum_dedos_dir_forca_muscular) {
        this.int_extensor_comum_dedos_dir_forca_muscular = int_extensor_comum_dedos_dir_forca_muscular;
    }

    public Integer getInt_fluxo_superficial_dedos_dir_forca_muscular() {
        return int_fluxo_superficial_dedos_dir_forca_muscular;
    }

    public void setInt_fluxo_superficial_dedos_dir_forca_muscular(Integer int_fluxo_superficial_dedos_dir_forca_muscular) {
        this.int_fluxo_superficial_dedos_dir_forca_muscular = int_fluxo_superficial_dedos_dir_forca_muscular;
    }

    public Integer getInt_fluxo_superficial_dedos_esq_forca_muscular() {
        return int_fluxo_superficial_dedos_esq_forca_muscular;
    }

    public void setInt_fluxo_superficial_dedos_esq_forca_muscular(Integer int_fluxo_superficial_dedos_esq_forca_muscular) {
        this.int_fluxo_superficial_dedos_esq_forca_muscular = int_fluxo_superficial_dedos_esq_forca_muscular;
    }

    public Integer getInt_fluxo_profundo_dedos_esq_forca_muscular() {
        return int_fluxo_profundo_dedos_esq_forca_muscular;
    }

    public void setInt_fluxo_profundo_dedos_esq_forca_muscular(Integer int_fluxo_profundo_dedos_esq_forca_muscular) {
        this.int_fluxo_profundo_dedos_esq_forca_muscular = int_fluxo_profundo_dedos_esq_forca_muscular;
    }

    public Integer getInt_fluxo_profundo_dedos_dir_forca_muscular() {
        return int_fluxo_profundo_dedos_dir_forca_muscular;
    }

    public void setInt_fluxo_profundo_dedos_dir_forca_muscular(Integer int_fluxo_profundo_dedos_dir_forca_muscular) {
        this.int_fluxo_profundo_dedos_dir_forca_muscular = int_fluxo_profundo_dedos_dir_forca_muscular;
    }

    public String getStr_observacao_punho_mao_forca_muscular() {
        return str_observacao_punho_mao_forca_muscular;
    }

    public void setStr_observacao_punho_mao_forca_muscular(String str_observacao_punho_mao_forca_muscular) {
        this.str_observacao_punho_mao_forca_muscular = str_observacao_punho_mao_forca_muscular;
    }

    public Integer getInt_iliopsoas_esq_forca_muscular() {
        return int_iliopsoas_esq_forca_muscular;
    }

    public void setInt_iliopsoas_esq_forca_muscular(Integer int_iliopsoas_esq_forca_muscular) {
        this.int_iliopsoas_esq_forca_muscular = int_iliopsoas_esq_forca_muscular;
    }

    public Integer getInt_iliopsoas_dir_forca_muscular() {
        return int_iliopsoas_dir_forca_muscular;
    }

    public void setInt_iliopsoas_dir_forca_muscular(Integer int_iliopsoas_dir_forca_muscular) {
        this.int_iliopsoas_dir_forca_muscular = int_iliopsoas_dir_forca_muscular;
    }

    public Integer getInt_reto_femoral_esq_forca_muscular() {
        return int_reto_femoral_esq_forca_muscular;
    }

    public void setInt_reto_femoral_esq_forca_muscular(Integer int_reto_femoral_esq_forca_muscular) {
        this.int_reto_femoral_esq_forca_muscular = int_reto_femoral_esq_forca_muscular;
    }

    public Integer getInt_reto_femoral_dir_forca_muscular() {
        return int_reto_femoral_dir_forca_muscular;
    }

    public void setInt_reto_femoral_dir_forca_muscular(Integer int_reto_femoral_dir_forca_muscular) {
        this.int_reto_femoral_dir_forca_muscular = int_reto_femoral_dir_forca_muscular;
    }

    public Integer getInt_gluteo_maximo_esq_forca_muscular() {
        return int_gluteo_maximo_esq_forca_muscular;
    }

    public void setInt_gluteo_maximo_esq_forca_muscular(Integer int_gluteo_maximo_esq_forca_muscular) {
        this.int_gluteo_maximo_esq_forca_muscular = int_gluteo_maximo_esq_forca_muscular;
    }

    public Integer getInt_gluteo_maximo_dir_forca_muscular() {
        return int_gluteo_maximo_dir_forca_muscular;
    }

    public void setInt_gluteo_maximo_dir_forca_muscular(Integer int_gluteo_maximo_dir_forca_muscular) {
        this.int_gluteo_maximo_dir_forca_muscular = int_gluteo_maximo_dir_forca_muscular;
    }

    public Integer getInt_gluteo_medio_dir_forca_muscular() {
        return int_gluteo_medio_dir_forca_muscular;
    }

    public void setInt_gluteo_medio_dir_forca_muscular(Integer int_gluteo_medio_dir_forca_muscular) {
        this.int_gluteo_medio_dir_forca_muscular = int_gluteo_medio_dir_forca_muscular;
    }

    public Integer getInt_gluteo_medio_esq_forca_muscular() {
        return int_gluteo_medio_esq_forca_muscular;
    }

    public void setInt_gluteo_medio_esq_forca_muscular(Integer int_gluteo_medio_esq_forca_muscular) {
        this.int_gluteo_medio_esq_forca_muscular = int_gluteo_medio_esq_forca_muscular;
    }

    public Integer getInt_gluteo_minimo_esq_forca_muscular() {
        return int_gluteo_minimo_esq_forca_muscular;
    }

    public void setInt_gluteo_minimo_esq_forca_muscular(Integer int_gluteo_minimo_esq_forca_muscular) {
        this.int_gluteo_minimo_esq_forca_muscular = int_gluteo_minimo_esq_forca_muscular;
    }

    public Integer getInt_gluteo_minimo_dir_forca_muscular() {
        return int_gluteo_minimo_dir_forca_muscular;
    }

    public void setInt_gluteo_minimo_dir_forca_muscular(Integer int_gluteo_minimo_dir_forca_muscular) {
        this.int_gluteo_minimo_dir_forca_muscular = int_gluteo_minimo_dir_forca_muscular;
    }

    public Integer getInt_tensor_farcial_lata_esq_forca_muscular() {
        return int_tensor_farcial_lata_esq_forca_muscular;
    }

    public void setInt_tensor_farcial_lata_esq_forca_muscular(Integer int_tensor_farcial_lata_esq_forca_muscular) {
        this.int_tensor_farcial_lata_esq_forca_muscular = int_tensor_farcial_lata_esq_forca_muscular;
    }

    public Integer getInt_tensor_farcial_lata_dir_forca_muscular() {
        return int_tensor_farcial_lata_dir_forca_muscular;
    }

    public void setInt_tensor_farcial_lata_dir_forca_muscular(Integer int_tensor_farcial_lata_dir_forca_muscular) {
        this.int_tensor_farcial_lata_dir_forca_muscular = int_tensor_farcial_lata_dir_forca_muscular;
    }

    public Integer getInt_adutor_longo_esq_forca_muscular() {
        return int_adutor_longo_esq_forca_muscular;
    }

    public void setInt_adutor_longo_esq_forca_muscular(Integer int_adutor_longo_esq_forca_muscular) {
        this.int_adutor_longo_esq_forca_muscular = int_adutor_longo_esq_forca_muscular;
    }

    public Integer getInt_adutor_longo_dir_forca_muscular() {
        return int_adutor_longo_dir_forca_muscular;
    }

    public void setInt_adutor_longo_dir_forca_muscular(Integer int_adutor_longo_dir_forca_muscular) {
        this.int_adutor_longo_dir_forca_muscular = int_adutor_longo_dir_forca_muscular;
    }

    public Integer getInt_adutor_curto_esq_forca_muscular() {
        return int_adutor_curto_esq_forca_muscular;
    }

    public void setInt_adutor_curto_esq_forca_muscular(Integer int_adutor_curto_esq_forca_muscular) {
        this.int_adutor_curto_esq_forca_muscular = int_adutor_curto_esq_forca_muscular;
    }

    public Integer getInt_adutor_curto_dir_forca_muscular() {
        return int_adutor_curto_dir_forca_muscular;
    }

    public void setInt_adutor_curto_dir_forca_muscular(Integer int_adutor_curto_dir_forca_muscular) {
        this.int_adutor_curto_dir_forca_muscular = int_adutor_curto_dir_forca_muscular;
    }

    public Integer getInt_adutor_magno_dir_forca_muscular() {
        return int_adutor_magno_dir_forca_muscular;
    }

    public void setInt_adutor_magno_dir_forca_muscular(Integer int_adutor_magno_dir_forca_muscular) {
        this.int_adutor_magno_dir_forca_muscular = int_adutor_magno_dir_forca_muscular;
    }

    public Integer getInt_adutor_magno_esq_forca_muscular() {
        return int_adutor_magno_esq_forca_muscular;
    }

    public void setInt_adutor_magno_esq_forca_muscular(Integer int_adutor_magno_esq_forca_muscular) {
        this.int_adutor_magno_esq_forca_muscular = int_adutor_magno_esq_forca_muscular;
    }

    public Integer getInt_gracil_dir_forca_muscular() {
        return int_gracil_dir_forca_muscular;
    }

    public void setInt_gracil_dir_forca_muscular(Integer int_gracil_dir_forca_muscular) {
        this.int_gracil_dir_forca_muscular = int_gracil_dir_forca_muscular;
    }

    public Integer getInt_gracil_esq_forca_muscular() {
        return int_gracil_esq_forca_muscular;
    }

    public void setInt_gracil_esq_forca_muscular(Integer int_gracil_esq_forca_muscular) {
        this.int_gracil_esq_forca_muscular = int_gracil_esq_forca_muscular;
    }

    public Integer getInt_pactineol_dir_forca_muscular() {
        return int_pactineol_dir_forca_muscular;
    }

    public void setInt_pactineol_dir_forca_muscular(Integer int_pactineol_dir_forca_muscular) {
        this.int_pactineol_dir_forca_muscular = int_pactineol_dir_forca_muscular;
    }

    public Integer getInt_pactineol_esq_forca_muscular() {
        return int_pactineol_esq_forca_muscular;
    }

    public void setInt_pactineol_esq_forca_muscular(Integer int_pactineol_esq_forca_muscular) {
        this.int_pactineol_esq_forca_muscular = int_pactineol_esq_forca_muscular;
    }

    public Integer getInt_obturador_interno_dir_forca_muscular() {
        return int_obturador_interno_dir_forca_muscular;
    }

    public void setInt_obturador_interno_dir_forca_muscular(Integer int_obturador_interno_dir_forca_muscular) {
        this.int_obturador_interno_dir_forca_muscular = int_obturador_interno_dir_forca_muscular;
    }

    public Integer getInt_obturador_interno_esq_forca_muscular() {
        return int_obturador_interno_esq_forca_muscular;
    }

    public void setInt_obturador_interno_esq_forca_muscular(Integer int_obturador_interno_esq_forca_muscular) {
        this.int_obturador_interno_esq_forca_muscular = int_obturador_interno_esq_forca_muscular;
    }

    public Integer getInt_obturador_externo_dir_forca_muscular() {
        return int_obturador_externo_dir_forca_muscular;
    }

    public void setInt_obturador_externo_dir_forca_muscular(Integer int_obturador_externo_dir_forca_muscular) {
        this.int_obturador_externo_dir_forca_muscular = int_obturador_externo_dir_forca_muscular;
    }

    public Integer getInt_obturador_externo_esq_forca_muscular() {
        return int_obturador_externo_esq_forca_muscular;
    }

    public void setInt_obturador_externo_esq_forca_muscular(Integer int_obturador_externo_esq_forca_muscular) {
        this.int_obturador_externo_esq_forca_muscular = int_obturador_externo_esq_forca_muscular;
    }

    public Integer getInt_gemeo_inferior_dir_forca_muscular() {
        return int_gemeo_inferior_dir_forca_muscular;
    }

    public void setInt_gemeo_inferior_dir_forca_muscular(Integer int_gemeo_inferior_dir_forca_muscular) {
        this.int_gemeo_inferior_dir_forca_muscular = int_gemeo_inferior_dir_forca_muscular;
    }

    public Integer getInt_gemeo_inferior_esq_forca_muscular() {
        return int_gemeo_inferior_esq_forca_muscular;
    }

    public void setInt_gemeo_inferior_esq_forca_muscular(Integer int_gemeo_inferior_esq_forca_muscular) {
        this.int_gemeo_inferior_esq_forca_muscular = int_gemeo_inferior_esq_forca_muscular;
    }

    public Integer getInt_gemeo_superior_esq_forca_muscular() {
        return int_gemeo_superior_esq_forca_muscular;
    }

    public void setInt_gemeo_superior_esq_forca_muscular(Integer int_gemeo_superior_esq_forca_muscular) {
        this.int_gemeo_superior_esq_forca_muscular = int_gemeo_superior_esq_forca_muscular;
    }

    public Integer getInt_gemeo_superior_dir_forca_muscular() {
        return int_gemeo_superior_dir_forca_muscular;
    }

    public void setInt_gemeo_superior_dir_forca_muscular(Integer int_gemeo_superior_dir_forca_muscular) {
        this.int_gemeo_superior_dir_forca_muscular = int_gemeo_superior_dir_forca_muscular;
    }

    public Integer getInt_periforme_esq_forca_muscular() {
        return int_periforme_esq_forca_muscular;
    }

    public void setInt_periforme_esq_forca_muscular(Integer int_periforme_esq_forca_muscular) {
        this.int_periforme_esq_forca_muscular = int_periforme_esq_forca_muscular;
    }

    public Integer getInt_periforme_dir_forca_muscular() {
        return int_periforme_dir_forca_muscular;
    }

    public void setInt_periforme_dir_forca_muscular(Integer int_periforme_dir_forca_muscular) {
        this.int_periforme_dir_forca_muscular = int_periforme_dir_forca_muscular;
    }

    public Integer getInt_quadrado_femoral_esq_forca_muscular() {
        return int_quadrado_femoral_esq_forca_muscular;
    }

    public void setInt_quadrado_femoral_esq_forca_muscular(Integer int_quadrado_femoral_esq_forca_muscular) {
        this.int_quadrado_femoral_esq_forca_muscular = int_quadrado_femoral_esq_forca_muscular;
    }

    public Integer getInt_quadrado_femoral_dir_forca_muscular() {
        return int_quadrado_femoral_dir_forca_muscular;
    }

    public void setInt_quadrado_femoral_dir_forca_muscular(Integer int_quadrado_femoral_dir_forca_muscular) {
        this.int_quadrado_femoral_dir_forca_muscular = int_quadrado_femoral_dir_forca_muscular;
    }

    public Integer getInt_biceps_femoral_esq_forca_muscular() {
        return int_biceps_femoral_esq_forca_muscular;
    }

    public void setInt_biceps_femoral_esq_forca_muscular(Integer int_biceps_femoral_esq_forca_muscular) {
        this.int_biceps_femoral_esq_forca_muscular = int_biceps_femoral_esq_forca_muscular;
    }

    public Integer getInt_biceps_femoral_dir_forca_muscular() {
        return int_biceps_femoral_dir_forca_muscular;
    }

    public void setInt_biceps_femoral_dir_forca_muscular(Integer int_biceps_femoral_dir_forca_muscular) {
        this.int_biceps_femoral_dir_forca_muscular = int_biceps_femoral_dir_forca_muscular;
    }

    public Integer getInt_semitendinoso_esq_forca_muscular() {
        return int_semitendinoso_esq_forca_muscular;
    }

    public void setInt_semitendinoso_esq_forca_muscular(Integer int_semitendinoso_esq_forca_muscular) {
        this.int_semitendinoso_esq_forca_muscular = int_semitendinoso_esq_forca_muscular;
    }

    public Integer getInt_semitendinoso_dir_forca_muscular() {
        return int_semitendinoso_dir_forca_muscular;
    }

    public void setInt_semitendinoso_dir_forca_muscular(Integer int_semitendinoso_dir_forca_muscular) {
        this.int_semitendinoso_dir_forca_muscular = int_semitendinoso_dir_forca_muscular;
    }

    public Integer getInt_semimembrandoso_esq_forca_muscular() {
        return int_semimembrandoso_esq_forca_muscular;
    }

    public void setInt_semimembrandoso_esq_forca_muscular(Integer int_semimembrandoso_esq_forca_muscular) {
        this.int_semimembrandoso_esq_forca_muscular = int_semimembrandoso_esq_forca_muscular;
    }

    public Integer getInt_semimembrandoso_dir_forca_muscular() {
        return int_semimembrandoso_dir_forca_muscular;
    }

    public void setInt_semimembrandoso_dir_forca_muscular(Integer int_semimembrandoso_dir_forca_muscular) {
        this.int_semimembrandoso_dir_forca_muscular = int_semimembrandoso_dir_forca_muscular;
    }

    public Integer getInt_sartorio_esq_forca_muscular() {
        return int_sartorio_esq_forca_muscular;
    }

    public void setInt_sartorio_esq_forca_muscular(Integer int_sartorio_esq_forca_muscular) {
        this.int_sartorio_esq_forca_muscular = int_sartorio_esq_forca_muscular;
    }

    public Integer getInt_sartorio_dir_forca_muscular() {
        return int_sartorio_dir_forca_muscular;
    }

    public void setInt_sartorio_dir_forca_muscular(Integer int_sartorio_dir_forca_muscular) {
        this.int_sartorio_dir_forca_muscular = int_sartorio_dir_forca_muscular;
    }

    public Integer getStr_observacoes_quadril_coxa_forca_muscular() {
        return str_observacoes_quadril_coxa_forca_muscular;
    }

    public void setStr_observacoes_quadril_coxa_forca_muscular(Integer str_observacoes_quadril_coxa_forca_muscular) {
        this.str_observacoes_quadril_coxa_forca_muscular = str_observacoes_quadril_coxa_forca_muscular;
    }

    public Integer getInt_vasto_medial_esq_forca_muscular() {
        return int_vasto_medial_esq_forca_muscular;
    }

    public void setInt_vasto_medial_esq_forca_muscular(Integer int_vasto_medial_esq_forca_muscular) {
        this.int_vasto_medial_esq_forca_muscular = int_vasto_medial_esq_forca_muscular;
    }

    public Integer getInt_vasto_medial_dir_forca_muscular() {
        return int_vasto_medial_dir_forca_muscular;
    }

    public void setInt_vasto_medial_dir_forca_muscular(Integer int_vasto_medial_dir_forca_muscular) {
        this.int_vasto_medial_dir_forca_muscular = int_vasto_medial_dir_forca_muscular;
    }

    public Integer getInt_vasto_lateral_dir_forca_muscular() {
        return int_vasto_lateral_dir_forca_muscular;
    }

    public void setInt_vasto_lateral_dir_forca_muscular(Integer int_vasto_lateral_dir_forca_muscular) {
        this.int_vasto_lateral_dir_forca_muscular = int_vasto_lateral_dir_forca_muscular;
    }

    public Integer getInt_vasto_lateral_esq_forca_muscular() {
        return int_vasto_lateral_esq_forca_muscular;
    }

    public void setInt_vasto_lateral_esq_forca_muscular(Integer int_vasto_lateral_esq_forca_muscular) {
        this.int_vasto_lateral_esq_forca_muscular = int_vasto_lateral_esq_forca_muscular;
    }

    public Integer getInt_vasto_intermediario_esq_forca_muscular() {
        return int_vasto_intermediario_esq_forca_muscular;
    }

    public void setInt_vasto_intermediario_esq_forca_muscular(Integer int_vasto_intermediario_esq_forca_muscular) {
        this.int_vasto_intermediario_esq_forca_muscular = int_vasto_intermediario_esq_forca_muscular;
    }

    public Integer getInt_vasto_intermediario_dir_forca_muscular() {
        return int_vasto_intermediario_dir_forca_muscular;
    }

    public void setInt_vasto_intermediario_dir_forca_muscular(Integer int_vasto_intermediario_dir_forca_muscular) {
        this.int_vasto_intermediario_dir_forca_muscular = int_vasto_intermediario_dir_forca_muscular;
    }

    public Integer getInt_semimembranoso_dir_forca_muscular() {
        return int_semimembranoso_dir_forca_muscular;
    }

    public void setInt_semimembranoso_dir_forca_muscular(Integer int_semimembranoso_dir_forca_muscular) {
        this.int_semimembranoso_dir_forca_muscular = int_semimembranoso_dir_forca_muscular;
    }

    public Integer getInt_semimembranoso_esq_forca_muscular() {
        return int_semimembranoso_esq_forca_muscular;
    }

    public void setInt_semimembranoso_esq_forca_muscular(Integer int_semimembranoso_esq_forca_muscular) {
        this.int_semimembranoso_esq_forca_muscular = int_semimembranoso_esq_forca_muscular;
    }

    public Integer getInt_gastrocnemio_esq_forca_muscular() {
        return int_gastrocnemio_esq_forca_muscular;
    }

    public void setInt_gastrocnemio_esq_forca_muscular(Integer int_gastrocnemio_esq_forca_muscular) {
        this.int_gastrocnemio_esq_forca_muscular = int_gastrocnemio_esq_forca_muscular;
    }

    public Integer getInt_gastrocnemio_dir_forca_muscular() {
        return int_gastrocnemio_dir_forca_muscular;
    }

    public void setInt_gastrocnemio_dir_forca_muscular(Integer int_gastrocnemio_dir_forca_muscular) {
        this.int_gastrocnemio_dir_forca_muscular = int_gastrocnemio_dir_forca_muscular;
    }

    public String getStr_observacoes_joelho_perna_forca_muscular() {
        return str_observacoes_joelho_perna_forca_muscular;
    }

    public void setStr_observacoes_joelho_perna_forca_muscular(String str_observacoes_joelho_perna_forca_muscular) {
        this.str_observacoes_joelho_perna_forca_muscular = str_observacoes_joelho_perna_forca_muscular;
    }

    public Integer getInt_soleo_dir_forca_muscular() {
        return int_soleo_dir_forca_muscular;
    }

    public void setInt_soleo_dir_forca_muscular(Integer int_soleo_dir_forca_muscular) {
        this.int_soleo_dir_forca_muscular = int_soleo_dir_forca_muscular;
    }

    public Integer getInt_soleo_esq_forca_muscular() {
        return int_soleo_esq_forca_muscular;
    }

    public void setInt_soleo_esq_forca_muscular(Integer int_soleo_esq_forca_muscular) {
        this.int_soleo_esq_forca_muscular = int_soleo_esq_forca_muscular;
    }

    public Integer getInt_tibia_anterior_dir_forca_muscular() {
        return int_tibia_anterior_dir_forca_muscular;
    }

    public void setInt_tibia_anterior_dir_forca_muscular(Integer int_tibia_anterior_dir_forca_muscular) {
        this.int_tibia_anterior_dir_forca_muscular = int_tibia_anterior_dir_forca_muscular;
    }

    public Integer getInt_tibia_anterior_esq_forca_muscular() {
        return int_tibia_anterior_esq_forca_muscular;
    }

    public void setInt_tibia_anterior_esq_forca_muscular(Integer int_tibia_anterior_esq_forca_muscular) {
        this.int_tibia_anterior_esq_forca_muscular = int_tibia_anterior_esq_forca_muscular;
    }

    public Integer getInt_tibia_posterior_dir_forca_muscular() {
        return int_tibia_posterior_dir_forca_muscular;
    }

    public void setInt_tibia_posterior_dir_forca_muscular(Integer int_tibia_posterior_dir_forca_muscular) {
        this.int_tibia_posterior_dir_forca_muscular = int_tibia_posterior_dir_forca_muscular;
    }

    public Integer getInt_tibia_posterior_esq_forca_muscular() {
        return int_tibia_posterior_esq_forca_muscular;
    }

    public void setInt_tibia_posterior_esq_forca_muscular(Integer int_tibia_posterior_esq_forca_muscular) {
        this.int_tibia_posterior_esq_forca_muscular = int_tibia_posterior_esq_forca_muscular;
    }

    public Integer getInt_fibulares_dir_forca_muscular() {
        return int_fibulares_dir_forca_muscular;
    }

    public void setInt_fibulares_dir_forca_muscular(Integer int_fibulares_dir_forca_muscular) {
        this.int_fibulares_dir_forca_muscular = int_fibulares_dir_forca_muscular;
    }

    public Integer getInt_fibulares_esq_forca_muscular() {
        return int_fibulares_esq_forca_muscular;
    }

    public void setInt_fibulares_esq_forca_muscular(Integer int_fibulares_esq_forca_muscular) {
        this.int_fibulares_esq_forca_muscular = int_fibulares_esq_forca_muscular;
    }

    public Integer getStr_observacao_tornozelo_pe_forca_muscular() {
        return str_observacao_tornozelo_pe_forca_muscular;
    }

    public void setStr_observacao_tornozelo_pe_forca_muscular(Integer str_observacao_tornozelo_pe_forca_muscular) {
        this.str_observacao_tornozelo_pe_forca_muscular = str_observacao_tornozelo_pe_forca_muscular;
    }

    public Integer getInt_multifidos_esq_forca_muscular() {
        return int_multifidos_esq_forca_muscular;
    }

    public void setInt_multifidos_esq_forca_muscular(Integer int_multifidos_esq_forca_muscular) {
        this.int_multifidos_esq_forca_muscular = int_multifidos_esq_forca_muscular;
    }

    public Integer getInt_multifidos_dir_forca_muscular() {
        return int_multifidos_dir_forca_muscular;
    }

    public void setInt_multifidos_dir_forca_muscular(Integer int_multifidos_dir_forca_muscular) {
        this.int_multifidos_dir_forca_muscular = int_multifidos_dir_forca_muscular;
    }

    public Integer getInt_intertransversarios_esq_forca_muscular() {
        return int_intertransversarios_esq_forca_muscular;
    }

    public void setInt_intertransversarios_esq_forca_muscular(Integer int_intertransversarios_esq_forca_muscular) {
        this.int_intertransversarios_esq_forca_muscular = int_intertransversarios_esq_forca_muscular;
    }

    public Integer getInt_intertransversarios_dir_forca_muscular() {
        return int_intertransversarios_dir_forca_muscular;
    }

    public void setInt_intertransversarios_dir_forca_muscular(Integer int_intertransversarios_dir_forca_muscular) {
        this.int_intertransversarios_dir_forca_muscular = int_intertransversarios_dir_forca_muscular;
    }

    public Integer getInt_rotadores_profundos_esq_forca_muscular() {
        return int_rotadores_profundos_esq_forca_muscular;
    }

    public void setInt_rotadores_profundos_esq_forca_muscular(Integer int_rotadores_profundos_esq_forca_muscular) {
        this.int_rotadores_profundos_esq_forca_muscular = int_rotadores_profundos_esq_forca_muscular;
    }

    public Integer getInt_rotadores_profundos_dir_forca_muscular() {
        return int_rotadores_profundos_dir_forca_muscular;
    }

    public void setInt_rotadores_profundos_dir_forca_muscular(Integer int_rotadores_profundos_dir_forca_muscular) {
        this.int_rotadores_profundos_dir_forca_muscular = int_rotadores_profundos_dir_forca_muscular;
    }

    public Integer getInt_subcostais_esq_forca_muscular() {
        return int_subcostais_esq_forca_muscular;
    }

    public void setInt_subcostais_esq_forca_muscular(Integer int_subcostais_esq_forca_muscular) {
        this.int_subcostais_esq_forca_muscular = int_subcostais_esq_forca_muscular;
    }

    public Integer getInt_subcostais_dir_forca_muscular() {
        return int_subcostais_dir_forca_muscular;
    }

    public void setInt_subcostais_dir_forca_muscular(Integer int_subcostais_dir_forca_muscular) {
        this.int_subcostais_dir_forca_muscular = int_subcostais_dir_forca_muscular;
    }

    public Integer getInt_esplenio_esq_forca_muscular() {
        return int_esplenio_esq_forca_muscular;
    }

    public void setInt_esplenio_esq_forca_muscular(Integer int_esplenio_esq_forca_muscular) {
        this.int_esplenio_esq_forca_muscular = int_esplenio_esq_forca_muscular;
    }

    public Integer getInt_esplenio_dir_forca_muscular() {
        return int_esplenio_dir_forca_muscular;
    }

    public void setInt_esplenio_dir_forca_muscular(Integer int_esplenio_dir_forca_muscular) {
        this.int_esplenio_dir_forca_muscular = int_esplenio_dir_forca_muscular;
    }

    public Integer getInt_longuissimo_esq_forca_muscular() {
        return int_longuissimo_esq_forca_muscular;
    }

    public void setInt_longuissimo_esq_forca_muscular(Integer int_longuissimo_esq_forca_muscular) {
        this.int_longuissimo_esq_forca_muscular = int_longuissimo_esq_forca_muscular;
    }

    public Integer getInt_longuissimo_dir_forca_muscular() {
        return int_longuissimo_dir_forca_muscular;
    }

    public void setInt_longuissimo_dir_forca_muscular(Integer int_longuissimo_dir_forca_muscular) {
        this.int_longuissimo_dir_forca_muscular = int_longuissimo_dir_forca_muscular;
    }

    public Integer getInt_iliocostal_esq_forca_muscular() {
        return int_iliocostal_esq_forca_muscular;
    }

    public void setInt_iliocostal_esq_forca_muscular(Integer int_iliocostal_esq_forca_muscular) {
        this.int_iliocostal_esq_forca_muscular = int_iliocostal_esq_forca_muscular;
    }

    public Integer getInt_iliocostal_dir_forca_muscular() {
        return int_iliocostal_dir_forca_muscular;
    }

    public void setInt_iliocostal_dir_forca_muscular(Integer int_iliocostal_dir_forca_muscular) {
        this.int_iliocostal_dir_forca_muscular = int_iliocostal_dir_forca_muscular;
    }

    public String getStr_observacoes_coluna_vertebral_forca_muscular() {
        return str_observacoes_coluna_vertebral_forca_muscular;
    }

    public void setStr_observacoes_coluna_vertebral_forca_muscular(String str_observacoes_coluna_vertebral_forca_muscular) {
        this.str_observacoes_coluna_vertebral_forca_muscular = str_observacoes_coluna_vertebral_forca_muscular;
    }

    public Integer getInt_masseter_dir_forca_muscular() {
        return int_masseter_dir_forca_muscular;
    }

    public void setInt_masseter_dir_forca_muscular(Integer int_masseter_dir_forca_muscular) {
        this.int_masseter_dir_forca_muscular = int_masseter_dir_forca_muscular;
    }

    public Integer getInt_masseter_esq_forca_muscular() {
        return int_masseter_esq_forca_muscular;
    }

    public void setInt_masseter_esq_forca_muscular(Integer int_masseter_esq_forca_muscular) {
        this.int_masseter_esq_forca_muscular = int_masseter_esq_forca_muscular;
    }

    public Integer getInt_temporal_dir_forca_muscular() {
        return int_temporal_dir_forca_muscular;
    }

    public void setInt_temporal_dir_forca_muscular(Integer int_temporal_dir_forca_muscular) {
        this.int_temporal_dir_forca_muscular = int_temporal_dir_forca_muscular;
    }

    public Integer getInt_temporal_esqueda_forca_muscular() {
        return int_temporal_esqueda_forca_muscular;
    }

    public void setInt_temporal_esqueda_forca_muscular(Integer int_temporal_esqueda_forca_muscular) {
        this.int_temporal_esqueda_forca_muscular = int_temporal_esqueda_forca_muscular;
    }

    public Integer getInt_supra_hioideos_dir_forca_muscular() {
        return int_supra_hioideos_dir_forca_muscular;
    }

    public void setInt_supra_hioideos_dir_forca_muscular(Integer int_supra_hioideos_dir_forca_muscular) {
        this.int_supra_hioideos_dir_forca_muscular = int_supra_hioideos_dir_forca_muscular;
    }

    public Integer getInt_temporal_esq_forca_muscular() {
        return int_temporal_esq_forca_muscular;
    }

    public void setInt_temporal_esq_forca_muscular(Integer int_temporal_esq_forca_muscular) {
        this.int_temporal_esq_forca_muscular = int_temporal_esq_forca_muscular;
    }

    public Integer getInt_zigomatico_maior_dir_forca_muscular() {
        return int_zigomatico_maior_dir_forca_muscular;
    }

    public void setInt_zigomatico_maior_dir_forca_muscular(Integer int_zigomatico_maior_dir_forca_muscular) {
        this.int_zigomatico_maior_dir_forca_muscular = int_zigomatico_maior_dir_forca_muscular;
    }

    public Integer getInt_zigomatico_maior_esq_forca_muscular() {
        return int_zigomatico_maior_esq_forca_muscular;
    }

    public void setInt_zigomatico_maior_esq_forca_muscular(Integer int_zigomatico_maior_esq_forca_muscular) {
        this.int_zigomatico_maior_esq_forca_muscular = int_zigomatico_maior_esq_forca_muscular;
    }

    public Integer getInt_zigomatico_menor_esq_forca_muscular() {
        return int_zigomatico_menor_esq_forca_muscular;
    }

    public void setInt_zigomatico_menor_esq_forca_muscular(Integer int_zigomatico_menor_esq_forca_muscular) {
        this.int_zigomatico_menor_esq_forca_muscular = int_zigomatico_menor_esq_forca_muscular;
    }

    public Integer getInt_zigomatico_menor_dir_forca_muscular() {
        return int_zigomatico_menor_dir_forca_muscular;
    }

    public void setInt_zigomatico_menor_dir_forca_muscular(Integer int_zigomatico_menor_dir_forca_muscular) {
        this.int_zigomatico_menor_dir_forca_muscular = int_zigomatico_menor_dir_forca_muscular;
    }

    public Integer getInt_piterigoides_dir_forca_muscular() {
        return int_piterigoides_dir_forca_muscular;
    }

    public void setInt_piterigoides_dir_forca_muscular(Integer int_piterigoides_dir_forca_muscular) {
        this.int_piterigoides_dir_forca_muscular = int_piterigoides_dir_forca_muscular;
    }

    public Integer getInt_piterigoides_esq_forca_muscular() {
        return int_piterigoides_esq_forca_muscular;
    }

    public void setInt_piterigoides_esq_forca_muscular(Integer int_piterigoides_esq_forca_muscular) {
        this.int_piterigoides_esq_forca_muscular = int_piterigoides_esq_forca_muscular;
    }

    public String getStr_observacao_atm_forca_muscular() {
        return str_observacao_atm_forca_muscular;
    }

    public void setStr_observacao_atm_forca_muscular(String str_observacao_atm_forca_muscular) {
        this.str_observacao_atm_forca_muscular = str_observacao_atm_forca_muscular;
    }

    public Collection<AvaliacaoEntity> getAvaliacaoEntities() {
        return avaliacaoEntities;
    }

    public void setAvaliacaoEntities(Collection<AvaliacaoEntity> avaliacaoEntities) {
        this.avaliacaoEntities = avaliacaoEntities;
    }
    
    
    
    
   
}
