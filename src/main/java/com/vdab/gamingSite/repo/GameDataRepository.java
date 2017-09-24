package com.vdab.gamingSite.repo;

        import com.vdab.gamingSite.domain.GameData;
        import org.springframework.data.jpa.repository.JpaRepository;

public interface GameDataRepository extends JpaRepository<GameData, Integer> {
}
