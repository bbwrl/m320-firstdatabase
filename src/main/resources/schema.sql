DROP TABLE IF EXISTS player;
CREATE TABLE `player` (
`id` int(11) NOT NULL,
`name` varchar(255) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

ALTER TABLE `player` ADD PRIMARY KEY (`id`);
ALTER TABLE `player` MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;