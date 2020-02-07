package youngjae.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import youngjae.study.domain.UploadFile;

public interface UploadFileRepository extends JpaRepository<UploadFile, Long>{
}
