package cl.corona.bbookenvprd.repository;

import cl.corona.bbookenvprd.model.bbookSdiprddsi;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface bbookSdiprddsiRepository  extends CrudRepository<bbookSdiprddsi, Long> {

    List<bbookSdiprddsi> findByDownloadDate1IsNullAndBatchNum(Long batchNum);

    @Modifying(clearAutomatically = true)
    @Query(value = "update app_sam.bbook_sdiprddsi s set s.download_date_1 = sysdate where batch_num = :batchNum", nativeQuery = true)
    public void updSdiprddsi(@Param("batchNum") long batchNum);

}
