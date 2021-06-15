create table topic
(
    topicId     int auto_increment
        primary key,
    description varchar(255) null,
    name        varchar(255) null
);

create table test
(
    testId      int auto_increment
        primary key,
    description varchar(255) null,
    name        varchar(255) null,
    topicId     int          null,
    constraint FKnd8rq4s8pcdu1qnlvf9fmibx3
        foreign key (topicId) references topic (topicId)
);

create table question
(
    questionId              int auto_increment
        primary key,
    description             varchar(255) null,
    literature_literatureId int          null,
    testId                  int          null,
    constraint FKbuswwvin5fjs6retd1jmq38ks
        foreign key (testId) references test (testId),
    constraint FKrr9of1ce7rt61cdrwk6x06lfg
        foreign key (literature_literatureId) references literature (literatureId)
);

create table answer
(
    answerId    int auto_increment
        primary key,
    correct     bit          not null,
    description varchar(255) null,
    questionId  int          null,
    constraint FK6v8oe7vcp5ppydqwqcsemhcmj
        foreign key (questionId) references question (questionId)
);

create table role
(
    roleId int auto_increment
        primary key,
    role   varchar(255) null
);

create table user
(
    userId      int auto_increment
        primary key,
    firstName   varchar(255) NOT NULL UNIQUE,
    lastName    varchar(255) NOT NULL UNIQUE,
    login       varchar(255) NOT NULL UNIQUE,
    password    varchar(255) null,
    role_roleId int          null,
    constraint FKdy0jmbt7xo1kv2jtcdmaldi2k
        foreign key (role_roleId) references role (roleId)
);

create table statistic
(
    statisticId         int auto_increment
        primary key,
    correct             bit  null,
    date                date null,
    question_questionId int  null,
    user_userId         int  null,
    constraint FK9ibc6v084uheqg7c7egxdm1ld
        foreign key (user_userId) references user (userId),
    constraint FKod8n7316cnym120eeske46qaf
        foreign key (question_questionId) references question (questionId)
);

create table literature
(
    literatureId int auto_increment
        primary key,
    description  varchar(255) null,
    link_linkId  int          null,
    constraint FK7a4rxg1w8ha5ghi2q1onn7pdv
        foreign key (link_linkId) references link (linkId)
);

create table link
(
    linkId int auto_increment
        primary key,
    link   varchar(255) null
);













