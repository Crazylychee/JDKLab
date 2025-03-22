CREATE TABLE `emergency_event` (
                                   `event_id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '事件唯一ID',
                                   `region_id` INT NOT NULL COMMENT '关联行政区划代码',
                                   `event_type` INT UNSIGNED NOT NULL COMMENT '事件类型',
                                   `emergency_level` TINYINT UNSIGNED NOT NULL COMMENT '应急等级',
                                   `event_description` TEXT NOT NULL COMMENT '事件详细描述',
                                   `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '记录创建时间',
                                   PRIMARY KEY (`event_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='应急事件记录表';
//插入语句如下
INSERT INTO `emergency_event` (`region_id`, `event_type`, `emergency_level`, `event_description`) VALUES (110101, 1, 1, '火灾');
