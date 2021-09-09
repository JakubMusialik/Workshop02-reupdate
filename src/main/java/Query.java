public class Query {

    String QUERY = "CREATE DATABASE workshop2 CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;\n" +
            "\n" +
            "USE workshop2;\n" +
            "\n" +
            "CREATE TABLE `users`\n" +
            "(\n" +
            "    `id`       int(11) NOT NULL,\n" +
            "    `username` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,\n" +
            "    `email`    varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,\n" +
            "    `password` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL\n" +
            ") ENGINE = InnoDB\n" +
            "  DEFAULT CHARSET = utf8mb4\n" +
            "  COLLATE = utf8mb4_unicode_ci;\n" +
            "\n" +
            "ALTER TABLE `users`\n" +
            "    ADD PRIMARY KEY (`id`),\n" +
            "    ADD UNIQUE KEY `email` (`email`);\n" +
            "\n" +
            "ALTER TABLE `users`\n" +
            "    MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;";
}
