CREATE TABLE bebe (
  id bigserial NOT NULL PRIMARY KEY,
  nome CHARACTER VARYING(255) NOT NULL,
  data_de_nascimento TIMESTAMP WITHOUT TIME ZONE
);

CREATE TABLE pico_de_crescimento(
  id bigserial NOT NULL PRIMARY KEY,
  semanas_inicial int NOT NULL,
  semanas_final int NOT NULL,
  descricao CHARACTER VARYING(2048) NOT NULL
);

INSERT INTO pico_de_crescimento (semanas_inicial, semanas_final, descricao)
    VALUES(1,5, 'Ocorrem mudanças significavas na visão, os bebês começam a enxergar os pais e os objetos com mais nitidez e foco.');

INSERT INTO pico_de_crescimento (semanas_inicial, semanas_final, descricao)
    VALUES(7, 9, 'O bebê começa a perceber que as suas mãos e os seus pés fazem parte do seu corpo e começam a tentar controlar esses membros. Começam a desenvolver os movimentos finos. Nessa fase já é possível começar a perceber as preferências do bebê, como cores e objetos.');

INSERT INTO pico_de_crescimento (semanas_inicial, semanas_final, descricao)
    VALUES(10, 12, 'O bebê começa a perceber mais o ambiente, a enxergar distâncias mais longas e se virar ao ouvir o som de uma voz conhecida.');

INSERT INTO pico_de_crescimento (semanas_inicial, semanas_final, descricao)
    VALUES(19, 21, 'Esse é um dos saltos mais longos (dura de 4 a 6 semanas) e perceptíveis, pois o bebê começa a fazer várias coisas ao mesmo tempo, como rolar, se virar de barriga para baixo, se arrastar, juntar suas mãos. O bebê descobre que pode gritar. O bebê pode ficar muito irritado ou  nervoso, acordar várias vezes na noite ou ter todos os “sintomas” citados a cima. Depois desse salto o bebê pode começar a firmar a cabeça sem ajuda dos pais.');

INSERT INTO pico_de_crescimento (semanas_inicial, semanas_final, descricao)
    VALUES(24, 28, 'Durante esse salto o bebê geralmente começa a sentar sem apoio. Também, começa a perceber que a mamãe não faz parte dele, que eles são dois seres individuais. Alguns bebês iniciam a ansiedade da separação nesse momento. Aqui em casa esse salto foi tranquilo, Francisco começou a sentar, mas sentimos poucas alterações e nenhuma noite sem sono. O que mudou bastante foi que depois desse período ele ficou mais “colado” comigo, passou a rejeitar o colo das outras pessoas e chorar na presença de estranhos.');

INSERT INTO pico_de_crescimento (semanas_inicial, semanas_final, descricao)
    VALUES(30, 31, 'O bebê começa a tentar engatinhar (ou alguns já engatinham), a se movimentar mais. Começam a emitir deferentes sons e sílabas. Alguns bebês começam a imitar os movimentos dos pais, como gestos de não com a cabeça, bater palmas ou dar tchau e oi. Algumas crianças estranham ou se sentem ansiosas com a presença de pessoas diferentes.');

INSERT INTO pico_de_crescimento (semanas_inicial, semanas_final, descricao)
    VALUES(36, 39, 'O bebê começa a entender que as coisas podem ser classificadas, como por exemplo, o que é alimento e o que é para brincar (Aqui em casa Francisco quando vê “as suas comidas” ele faz movimentos com a boca, pois sabe que aquilo é para comer e quando vê os brinquedos começa a pular querendo brincar). Os bebês começam a expressar mais as suas vontades, ficam “temperamentais”, choram se não ganham as coisas. Choram para ganhar colo, começam a gritar, não querem mais trocar a fralda. Sentem mais vontade trocar de atividade constantemente. Alguns bebês começam a engatinhar, a levantar, firmar as pernas, etc.');

INSERT INTO pico_de_crescimento (semanas_inicial, semanas_final, descricao)
    VALUES(44, 48, 'O bebê começa a perceber que existe uma ordem para as coisas e atitudes, por exemplo: que se colocam sapatos nos pés e os brinquedos nas caixas e começam a ter mais consciência de suas atitudes. Geralmente depois desse salto os bebês começam a apontar os objetos demonstrando as suas vontades. Podem começar a querer fazer as mesmas coisas que os pais fazem, como colocar as chaves na porta ou no carro. Falar mais palavras como “mamá” e “papá” para a mãe ou pai corretamente. Levanta-se por alguns segundos e movimenta-se mais. Começam a entender o “não” e instruções simples. Alguns bebês já começam a caminhar.');

INSERT INTO pico_de_crescimento (semanas_inicial, semanas_final, descricao)
    VALUES(53, 56, 'Geralmente é nessa fase que os bebês começam a andar e isso é um salto muito significativo no crescimento. Também, começam a falar mais palavras e a fazer atividades diferentes como “desenhar”. Começam a entender a funcionalidade dos brinquedos antes tão difíceis.');

INSERT INTO pico_de_crescimento (semanas_inicial, semanas_final, descricao)
    VALUES(62, 66, 'O bebê começa a combinar palavras e gestos para expressar o que deseja, inicia jogos, como apontar partes do corpo quando perguntado e responde a algumas instruções, como dar tchau ou mandar um beijo. Imita as pessoas e explora tudo que estiver à sua frente. Começa a usar colheres e garfo. Empurra e puxa brinquedos enquanto anda, joga bola.');

INSERT INTO pico_de_crescimento (semanas_inicial, semanas_final, descricao)
    VALUES(74, 76, 'O bebê começa a usar 6 ou mais palavras regularmente. Dança e separa brinquedos por cor, formato e tamanho. Já consegue desenhar melhor os objetos e olha livros sozinhos. Joga bola da forma tradicional ou brinca com bonecas.');
