package com.srini.lakesidehotel.repository;

import com.srini.lakesidehotel.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
