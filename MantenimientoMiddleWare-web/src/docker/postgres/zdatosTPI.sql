--
-- PostgreSQL database dump
--

-- Dumped from database version 9.6.3
-- Dumped by pg_dump version 9.6.9

-- Started on 2018-06-12 18:41:46 CST

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 2380 (class 0 OID 16434)
-- Dependencies: 196
-- Data for Name: marca; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.marca (id_marca, nombre, descripcion, activo) VALUES (1, 'HP', NULL, true);
INSERT INTO public.marca (id_marca, nombre, descripcion, activo) VALUES (2, 'Toshiba', NULL, true);
INSERT INTO public.marca (id_marca, nombre, descripcion, activo) VALUES (3, 'Dell', NULL, true);
INSERT INTO public.marca (id_marca, nombre, descripcion, activo) VALUES (4, 'Acer', NULL, false);
INSERT INTO public.marca (id_marca, nombre, descripcion, activo) VALUES (5, 'Asus', NULL, true);
INSERT INTO public.marca (id_marca, nombre, descripcion, activo) VALUES (6, 'Xing', NULL, true);
INSERT INTO public.marca (id_marca, nombre, descripcion, activo) VALUES (7, 'M4', NULL, true);
INSERT INTO public.marca (id_marca, nombre, descripcion, activo) VALUES (8, 'Guss', NULL, true);
INSERT INTO public.marca (id_marca, nombre, descripcion, activo) VALUES (9, 'Ebay', NULL, true);
INSERT INTO public.marca (id_marca, nombre, descripcion, activo) VALUES (10, 'Peya''s', NULL, true);
INSERT INTO public.marca (id_marca, nombre, descripcion, activo) VALUES (11, 'Flipton', NULL, true);
INSERT INTO public.marca (id_marca, nombre, descripcion, activo) VALUES (12, 'IPF', NULL, true);
INSERT INTO public.marca (id_marca, nombre, descripcion, activo) VALUES (13, 'Case', NULL, true);
INSERT INTO public.marca (id_marca, nombre, descripcion, activo) VALUES (14, 'Casio', NULL, true);
INSERT INTO public.marca (id_marca, nombre, descripcion, activo) VALUES (15, 'M3LeeStar', NULL, true);


--
-- TOC entry 2384 (class 0 OID 16455)
-- Dependencies: 200
-- Data for Name: parte; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.parte (id_parte, nombre, descripcion, activo) VALUES (1, 'Monitor', NULL, true);
INSERT INTO public.parte (id_parte, nombre, descripcion, activo) VALUES (2, 'Mouse', NULL, true);
INSERT INTO public.parte (id_parte, nombre, descripcion, activo) VALUES (3, 'CPU', NULL, true);
INSERT INTO public.parte (id_parte, nombre, descripcion, activo) VALUES (4, 'Teclado', NULL, true);
INSERT INTO public.parte (id_parte, nombre, descripcion, activo) VALUES (5, 'Camara Web', NULL, true);
INSERT INTO public.parte (id_parte, nombre, descripcion, activo) VALUES (6, 'Bocinas', NULL, true);
INSERT INTO public.parte (id_parte, nombre, descripcion, activo) VALUES (7, 'Cartuchos', NULL, true);
INSERT INTO public.parte (id_parte, nombre, descripcion, activo) VALUES (8, 'Antena', NULL, true);
INSERT INTO public.parte (id_parte, nombre, descripcion, activo) VALUES (9, 'Resistor', NULL, true);
INSERT INTO public.parte (id_parte, nombre, descripcion, activo) VALUES (10, 'Lente', NULL, true);
INSERT INTO public.parte (id_parte, nombre, descripcion, activo) VALUES (11, 'Bateria', NULL, true);
INSERT INTO public.parte (id_parte, nombre, descripcion, activo) VALUES (12, 'Case', NULL, true);
INSERT INTO public.parte (id_parte, nombre, descripcion, activo) VALUES (13, 'Ventilador', NULL, true);
INSERT INTO public.parte (id_parte, nombre, descripcion, activo) VALUES (14, 'Transformador', NULL, true);
INSERT INTO public.parte (id_parte, nombre, descripcion, activo) VALUES (15, 'Cargador', NULL, true);


--
-- TOC entry 2382 (class 0 OID 16443)
-- Dependencies: 198
-- Data for Name: articulo; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.articulo (id_articulo, id_marca, id_parte, nombre, descripcion, activo) VALUES (1, 1, 1, 'Monitor-HP', NULL, true);
INSERT INTO public.articulo (id_articulo, id_marca, id_parte, nombre, descripcion, activo) VALUES (2, 1, 3, 'CPU-HP', NULL, true);
INSERT INTO public.articulo (id_articulo, id_marca, id_parte, nombre, descripcion, activo) VALUES (3, 2, 2, 'Mouse-Toshiba', NULL, true);
INSERT INTO public.articulo (id_articulo, id_marca, id_parte, nombre, descripcion, activo) VALUES (4, 6, 3, 'CPU-Xing', NULL, true);
INSERT INTO public.articulo (id_articulo, id_marca, id_parte, nombre, descripcion, activo) VALUES (5, 5, 1, 'Monitor-Asus', NULL, true);
INSERT INTO public.articulo (id_articulo, id_marca, id_parte, nombre, descripcion, activo) VALUES (6, 7, 7, 'Cartuchos-M4', NULL, false);
INSERT INTO public.articulo (id_articulo, id_marca, id_parte, nombre, descripcion, activo) VALUES (7, 1, 7, 'Cartuchos-HP', NULL, false);
INSERT INTO public.articulo (id_articulo, id_marca, id_parte, nombre, descripcion, activo) VALUES (8, 10, 8, 'Antena-peya''s', NULL, true);
INSERT INTO public.articulo (id_articulo, id_marca, id_parte, nombre, descripcion, activo) VALUES (9, 6, 1, 'Monitor-Xing', NULL, false);
INSERT INTO public.articulo (id_articulo, id_marca, id_parte, nombre, descripcion, activo) VALUES (10, 14, 10, 'Lente-Casio', NULL, false);


--
-- TOC entry 2420 (class 0 OID 0)
-- Dependencies: 197
-- Name: articulo_id_articulo_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.articulo_id_articulo_seq', 1, false);


--
-- TOC entry 2378 (class 0 OID 16422)
-- Dependencies: 194
-- Data for Name: modelo; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.modelo (id_modelo, nombre, activo, descripcion) VALUES (1, 'Pavilion', true, NULL);
INSERT INTO public.modelo (id_modelo, nombre, activo, descripcion) VALUES (2, 'Satelite', true, NULL);
INSERT INTO public.modelo (id_modelo, nombre, activo, descripcion) VALUES (3, 'Latitude', true, NULL);
INSERT INTO public.modelo (id_modelo, nombre, activo, descripcion) VALUES (4, 'Aspire', true, NULL);
INSERT INTO public.modelo (id_modelo, nombre, activo, descripcion) VALUES (5, 'Canon', true, NULL);
INSERT INTO public.modelo (id_modelo, nombre, activo, descripcion) VALUES (6, 'Lee', true, NULL);
INSERT INTO public.modelo (id_modelo, nombre, activo, descripcion) VALUES (7, 'Wiston', true, NULL);
INSERT INTO public.modelo (id_modelo, nombre, activo, descripcion) VALUES (8, 'Sherman', true, NULL);
INSERT INTO public.modelo (id_modelo, nombre, activo, descripcion) VALUES (9, 'M5Stats', true, NULL);
INSERT INTO public.modelo (id_modelo, nombre, activo, descripcion) VALUES (10, 'Caldero''s', true, NULL);
INSERT INTO public.modelo (id_modelo, nombre, activo, descripcion) VALUES (11, 'T54Lee', true, NULL);
INSERT INTO public.modelo (id_modelo, nombre, activo, descripcion) VALUES (12, 'Montier', true, NULL);
INSERT INTO public.modelo (id_modelo, nombre, activo, descripcion) VALUES (13, 'Flip', true, NULL);
INSERT INTO public.modelo (id_modelo, nombre, activo, descripcion) VALUES (14, 'Datus', true, NULL);
INSERT INTO public.modelo (id_modelo, nombre, activo, descripcion) VALUES (15, 'StarWat', true, NULL);


--
-- TOC entry 2414 (class 0 OID 16599)
-- Dependencies: 230
-- Data for Name: unidad; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.unidad (id_unidad, nombre) VALUES (1, 'UESFMOcc');


--
-- TOC entry 2373 (class 0 OID 16401)
-- Dependencies: 189
-- Data for Name: equipo; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.equipo (id_equipo, id_modelo, id_unidad, codigo_correlativo) VALUES (1, 1, 1, 'FL129040-09');
INSERT INTO public.equipo (id_equipo, id_modelo, id_unidad, codigo_correlativo) VALUES (2, 3, 1, 'GB217379-10');
INSERT INTO public.equipo (id_equipo, id_modelo, id_unidad, codigo_correlativo) VALUES (3, 5, 1, 'XX229900-30');
INSERT INTO public.equipo (id_equipo, id_modelo, id_unidad, codigo_correlativo) VALUES (4, 1, 1, 'TG906754-12');
INSERT INTO public.equipo (id_equipo, id_modelo, id_unidad, codigo_correlativo) VALUES (5, 5, 1, 'ET347890-50');
INSERT INTO public.equipo (id_equipo, id_modelo, id_unidad, codigo_correlativo) VALUES (6, 1, 1, 'RV679834-10');
INSERT INTO public.equipo (id_equipo, id_modelo, id_unidad, codigo_correlativo) VALUES (7, 5, 1, 'TF340978-19');
INSERT INTO public.equipo (id_equipo, id_modelo, id_unidad, codigo_correlativo) VALUES (8, 2, 1, 'OP091287-89');
INSERT INTO public.equipo (id_equipo, id_modelo, id_unidad, codigo_correlativo) VALUES (9, 4, 1, 'HM896534-58');
INSERT INTO public.equipo (id_equipo, id_modelo, id_unidad, codigo_correlativo) VALUES (10, 10, 1, 'KP230968-01');
INSERT INTO public.equipo (id_equipo, id_modelo, id_unidad, codigo_correlativo) VALUES (11, 15, 1, 'JS670129-95');
INSERT INTO public.equipo (id_equipo, id_modelo, id_unidad, codigo_correlativo) VALUES (12, 11, 1, 'XD726549-04');
INSERT INTO public.equipo (id_equipo, id_modelo, id_unidad, codigo_correlativo) VALUES (13, 14, 1, 'MC569510-75');
INSERT INTO public.equipo (id_equipo, id_modelo, id_unidad, codigo_correlativo) VALUES (14, 8, 1, 'PQ378286-07');
INSERT INTO public.equipo (id_equipo, id_modelo, id_unidad, codigo_correlativo) VALUES (15, 7, 1, 'DS785012-78');


--
-- TOC entry 2387 (class 0 OID 16473)
-- Dependencies: 203
-- Data for Name: calendario; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 2375 (class 0 OID 16409)
-- Dependencies: 191
-- Data for Name: calendario_equipo; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 2421 (class 0 OID 0)
-- Dependencies: 190
-- Name: calendario_equipo_id_calendario_equipo_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.calendario_equipo_id_calendario_equipo_seq', 1, false);


--
-- TOC entry 2422 (class 0 OID 0)
-- Dependencies: 202
-- Name: calendario_id_calendario_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.calendario_id_calendario_seq', 1, false);


--
-- TOC entry 2370 (class 0 OID 16388)
-- Dependencies: 186
-- Data for Name: solicitud; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.solicitud (id_solicitud, unidad, solicitante, estado) VALUES (2, 'Departamento de Matematicas', 'Susana Herrera', true);
INSERT INTO public.solicitud (id_solicitud, unidad, solicitante, estado) VALUES (3, 'Departamento de Economia', 'Flor de Maria', false);
INSERT INTO public.solicitud (id_solicitud, unidad, solicitante, estado) VALUES (1, 'Departemento de Ingenieria', 'Marvin Escobar', true);
INSERT INTO public.solicitud (id_solicitud, unidad, solicitante, estado) VALUES (4, 'Departamento de Fisica', 'Oscar Flores', true);
INSERT INTO public.solicitud (id_solicitud, unidad, solicitante, estado) VALUES (5, 'Departemento de Ciencias ', 'Omar Medina', false);
INSERT INTO public.solicitud (id_solicitud, unidad, solicitante, estado) VALUES (6, 'Departamento de Tecnologia', 'Juan Escoses', true);
INSERT INTO public.solicitud (id_solicitud, unidad, solicitante, estado) VALUES (7, 'Bibloteca', 'Marta López', NULL);


--
-- TOC entry 2388 (class 0 OID 16479)
-- Dependencies: 204
-- Data for Name: calendario_solicitud; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 2402 (class 0 OID 16540)
-- Dependencies: 218
-- Data for Name: diagnostico; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.diagnostico (id_diagnostico, nombre, descripcion) VALUES (1, 'Infeccion de virus', NULL);
INSERT INTO public.diagnostico (id_diagnostico, nombre, descripcion) VALUES (2, 'Limpieza', NULL);
INSERT INTO public.diagnostico (id_diagnostico, nombre, descripcion) VALUES (3, 'motherboard quemada', NULL);
INSERT INTO public.diagnostico (id_diagnostico, nombre, descripcion) VALUES (4, 'Cambio de disco duro', NULL);
INSERT INTO public.diagnostico (id_diagnostico, nombre, descripcion) VALUES (5, 'Cambio de pantalla', NULL);
INSERT INTO public.diagnostico (id_diagnostico, nombre, descripcion) VALUES (6, 'cambio de RAM', NULL);


--
-- TOC entry 2423 (class 0 OID 0)
-- Dependencies: 217
-- Name: diagnostico_id_diagnostico_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.diagnostico_id_diagnostico_seq', 1, false);


--
-- TOC entry 2411 (class 0 OID 16586)
-- Dependencies: 227
-- Data for Name: diagnostico_parte; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.diagnostico_parte (id_diagnostico, id_diagnostico_parte, id_parte) VALUES (1, 1, 3);
INSERT INTO public.diagnostico_parte (id_diagnostico, id_diagnostico_parte, id_parte) VALUES (3, 2, 3);
INSERT INTO public.diagnostico_parte (id_diagnostico, id_diagnostico_parte, id_parte) VALUES (2, 3, 1);
INSERT INTO public.diagnostico_parte (id_diagnostico, id_diagnostico_parte, id_parte) VALUES (2, 4, 2);
INSERT INTO public.diagnostico_parte (id_diagnostico, id_diagnostico_parte, id_parte) VALUES (2, 5, 3);
INSERT INTO public.diagnostico_parte (id_diagnostico, id_diagnostico_parte, id_parte) VALUES (2, 6, 4);


--
-- TOC entry 2424 (class 0 OID 0)
-- Dependencies: 226
-- Name: diagnostico_parte_id_diagnostico_parte_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.diagnostico_parte_id_diagnostico_parte_seq', 1, false);


--
-- TOC entry 2376 (class 0 OID 16415)
-- Dependencies: 192
-- Data for Name: equipo_detalle; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.equipo_detalle (id_equipo, numero_serie, id_articulo) VALUES (1, '123456789-0', 1);
INSERT INTO public.equipo_detalle (id_equipo, numero_serie, id_articulo) VALUES (1, '123456798-2', 2);
INSERT INTO public.equipo_detalle (id_equipo, numero_serie, id_articulo) VALUES (2, '123456879-9', 10);
INSERT INTO public.equipo_detalle (id_equipo, numero_serie, id_articulo) VALUES (1, '098765431-2', 3);
INSERT INTO public.equipo_detalle (id_equipo, numero_serie, id_articulo) VALUES (2, '098756432-5', 8);
INSERT INTO public.equipo_detalle (id_equipo, numero_serie, id_articulo) VALUES (2, '098765432-1', 9);
INSERT INTO public.equipo_detalle (id_equipo, numero_serie, id_articulo) VALUES (3, '098675432-8', 4);
INSERT INTO public.equipo_detalle (id_equipo, numero_serie, id_articulo) VALUES (3, '098764532-3', 9);
INSERT INTO public.equipo_detalle (id_equipo, numero_serie, id_articulo) VALUES (3, '123456879-3', 3);
INSERT INTO public.equipo_detalle (id_equipo, numero_serie, id_articulo) VALUES (3, '123546789-4', 8);


--
-- TOC entry 2425 (class 0 OID 0)
-- Dependencies: 188
-- Name: equipo_id_equipo_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.equipo_id_equipo_seq', 1, false);


--
-- TOC entry 2426 (class 0 OID 0)
-- Dependencies: 195
-- Name: marca_id_marca_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.marca_id_marca_seq', 1, false);


--
-- TOC entry 2385 (class 0 OID 16465)
-- Dependencies: 201
-- Data for Name: modelo_detalle; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.modelo_detalle (id_modelo, id_articulo, activo) VALUES (1, 1, true);
INSERT INTO public.modelo_detalle (id_modelo, id_articulo, activo) VALUES (1, 2, true);
INSERT INTO public.modelo_detalle (id_modelo, id_articulo, activo) VALUES (2, 3, true);
INSERT INTO public.modelo_detalle (id_modelo, id_articulo, activo) VALUES (6, 4, true);
INSERT INTO public.modelo_detalle (id_modelo, id_articulo, activo) VALUES (4, 5, true);


--
-- TOC entry 2427 (class 0 OID 0)
-- Dependencies: 193
-- Name: modelo_id_modelo_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.modelo_id_modelo_seq', 1, false);


--
-- TOC entry 2392 (class 0 OID 16494)
-- Dependencies: 208
-- Data for Name: prioridad; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.prioridad (id_prioridad, nombre, descripcion) VALUES (1, 'Alta', NULL);
INSERT INTO public.prioridad (id_prioridad, nombre, descripcion) VALUES (2, 'Media', NULL);
INSERT INTO public.prioridad (id_prioridad, nombre, descripcion) VALUES (3, 'Baja', NULL);
INSERT INTO public.prioridad (id_prioridad, nombre, descripcion) VALUES (4, 'Muy baja', NULL);


--
-- TOC entry 2394 (class 0 OID 16502)
-- Dependencies: 210
-- Data for Name: tipo_mantenimiento; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.tipo_mantenimiento (id_tipo_mantenimiento, nombre, descripcion) VALUES (1, 'Preventidos Programados', NULL);
INSERT INTO public.tipo_mantenimiento (id_tipo_mantenimiento, nombre, descripcion) VALUES (2, 'Preventidos No Programados', NULL);
INSERT INTO public.tipo_mantenimiento (id_tipo_mantenimiento, nombre, descripcion) VALUES (3, 'Correctivos', NULL);


--
-- TOC entry 2390 (class 0 OID 16486)
-- Dependencies: 206
-- Data for Name: orden_trabajo; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.orden_trabajo (id_orden_trabajo, id_solicitud, id_equipo, id_prioridad, id_tipo_mantenimiento, fecha) VALUES (1, 1, 1, 1, 2, '2018-06-11 00:00:00');
INSERT INTO public.orden_trabajo (id_orden_trabajo, id_solicitud, id_equipo, id_prioridad, id_tipo_mantenimiento, fecha) VALUES (2, 2, 2, 4, 2, '2018-07-10 00:00:00');
INSERT INTO public.orden_trabajo (id_orden_trabajo, id_solicitud, id_equipo, id_prioridad, id_tipo_mantenimiento, fecha) VALUES (3, 3, 5, 2, 1, '2018-12-31 00:00:00');
INSERT INTO public.orden_trabajo (id_orden_trabajo, id_solicitud, id_equipo, id_prioridad, id_tipo_mantenimiento, fecha) VALUES (4, 4, 10, 4, 1, '2018-12-30 00:00:00');
INSERT INTO public.orden_trabajo (id_orden_trabajo, id_solicitud, id_equipo, id_prioridad, id_tipo_mantenimiento, fecha) VALUES (5, 5, 11, 3, 2, '2018-09-18 00:00:00');
INSERT INTO public.orden_trabajo (id_orden_trabajo, id_solicitud, id_equipo, id_prioridad, id_tipo_mantenimiento, fecha) VALUES (6, 6, 6, 1, 3, '2018-05-23 00:00:00');
INSERT INTO public.orden_trabajo (id_orden_trabajo, id_solicitud, id_equipo, id_prioridad, id_tipo_mantenimiento, fecha) VALUES (7, 7, 7, 2, 2, '2018-03-06 00:00:00');
INSERT INTO public.orden_trabajo (id_orden_trabajo, id_solicitud, id_equipo, id_prioridad, id_tipo_mantenimiento, fecha) VALUES (8, 1, 10, 2, 1, '2018-12-21 00:00:00');
INSERT INTO public.orden_trabajo (id_orden_trabajo, id_solicitud, id_equipo, id_prioridad, id_tipo_mantenimiento, fecha) VALUES (9, 2, 12, 3, 1, '2018-09-30 00:00:00');
INSERT INTO public.orden_trabajo (id_orden_trabajo, id_solicitud, id_equipo, id_prioridad, id_tipo_mantenimiento, fecha) VALUES (10, 3, 15, 2, 3, '2018-08-20 00:00:00');
INSERT INTO public.orden_trabajo (id_orden_trabajo, id_solicitud, id_equipo, id_prioridad, id_tipo_mantenimiento, fecha) VALUES (11, 4, 3, 2, 1, '2018-09-23 00:00:00');


--
-- TOC entry 2400 (class 0 OID 16532)
-- Dependencies: 216
-- Data for Name: tipo_responsable; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.tipo_responsable (id_tipo_responsable, nombre, observacion) VALUES (1, 'Estudiante', NULL);
INSERT INTO public.tipo_responsable (id_tipo_responsable, nombre, observacion) VALUES (2, 'Tecnico', NULL);
INSERT INTO public.tipo_responsable (id_tipo_responsable, nombre, observacion) VALUES (3, 'Catedratico', NULL);


--
-- TOC entry 2398 (class 0 OID 16524)
-- Dependencies: 214
-- Data for Name: responsable; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.responsable (id_responsable, nombre, id_tipo_reponsable) VALUES (1, 'Roberto Cortez', 1);
INSERT INTO public.responsable (id_responsable, nombre, id_tipo_reponsable) VALUES (2, 'Maria Hernandez', 2);
INSERT INTO public.responsable (id_responsable, nombre, id_tipo_reponsable) VALUES (3, 'Carolina Matinez', 1);
INSERT INTO public.responsable (id_responsable, nombre, id_tipo_reponsable) VALUES (4, 'Jóse López', 3);
INSERT INTO public.responsable (id_responsable, nombre, id_tipo_reponsable) VALUES (5, 'Maria de los Angeles ', 1);
INSERT INTO public.responsable (id_responsable, nombre, id_tipo_reponsable) VALUES (6, 'Eugenio chicas', 2);
INSERT INTO public.responsable (id_responsable, nombre, id_tipo_reponsable) VALUES (7, 'Luis Gonse', 1);
INSERT INTO public.responsable (id_responsable, nombre, id_tipo_reponsable) VALUES (8, 'Fernando Cueller', 3);
INSERT INTO public.responsable (id_responsable, nombre, id_tipo_reponsable) VALUES (9, 'Jackson P', 2);
INSERT INTO public.responsable (id_responsable, nombre, id_tipo_reponsable) VALUES (10, 'John Rockerfeller', 2);


--
-- TOC entry 2396 (class 0 OID 16513)
-- Dependencies: 212
-- Data for Name: orden_trabajo_detalle; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.orden_trabajo_detalle (id_orden_trabajo_detalle, id_orden_trabajo, id_equipo_detalle, id_responsable, observacion) VALUES (1, 1, '123456789-0', 1, NULL);
INSERT INTO public.orden_trabajo_detalle (id_orden_trabajo_detalle, id_orden_trabajo, id_equipo_detalle, id_responsable, observacion) VALUES (2, 1, '123456798-2', 1, NULL);
INSERT INTO public.orden_trabajo_detalle (id_orden_trabajo_detalle, id_orden_trabajo, id_equipo_detalle, id_responsable, observacion) VALUES (3, 1, '098765431-2', 1, NULL);
INSERT INTO public.orden_trabajo_detalle (id_orden_trabajo_detalle, id_orden_trabajo, id_equipo_detalle, id_responsable, observacion) VALUES (4, 2, '098756432-5', 3, NULL);
INSERT INTO public.orden_trabajo_detalle (id_orden_trabajo_detalle, id_orden_trabajo, id_equipo_detalle, id_responsable, observacion) VALUES (5, 2, '098765432-1', 3, NULL);
INSERT INTO public.orden_trabajo_detalle (id_orden_trabajo_detalle, id_orden_trabajo, id_equipo_detalle, id_responsable, observacion) VALUES (6, 2, '123456879-9', 3, NULL);
INSERT INTO public.orden_trabajo_detalle (id_orden_trabajo_detalle, id_orden_trabajo, id_equipo_detalle, id_responsable, observacion) VALUES (7, 11, '098675432-8', 5, NULL);
INSERT INTO public.orden_trabajo_detalle (id_orden_trabajo_detalle, id_orden_trabajo, id_equipo_detalle, id_responsable, observacion) VALUES (8, 11, '098764532-3', 5, NULL);
INSERT INTO public.orden_trabajo_detalle (id_orden_trabajo_detalle, id_orden_trabajo, id_equipo_detalle, id_responsable, observacion) VALUES (9, 11, '123456879-3', 5, NULL);
INSERT INTO public.orden_trabajo_detalle (id_orden_trabajo_detalle, id_orden_trabajo, id_equipo_detalle, id_responsable, observacion) VALUES (10, 11, '123546789-4', 5, NULL);


--
-- TOC entry 2407 (class 0 OID 16567)
-- Dependencies: 223
-- Data for Name: pasos; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.pasos (id_paso, nombre) VALUES (1, 'Activar el antivirus');
INSERT INTO public.pasos (id_paso, nombre) VALUES (2, 'Seleccionar el escaneo de virus');
INSERT INTO public.pasos (id_paso, nombre) VALUES (3, 'Listar virus detectados');
INSERT INTO public.pasos (id_paso, nombre) VALUES (4, 'Seleccionar Virus');
INSERT INTO public.pasos (id_paso, nombre) VALUES (5, 'Eliminar virus seleccionados');
INSERT INTO public.pasos (id_paso, nombre) VALUES (6, 'LLenar reporte de virus eliminados');
INSERT INTO public.pasos (id_paso, nombre) VALUES (7, 'Compra de la licencia');
INSERT INTO public.pasos (id_paso, nombre) VALUES (8, 'Verificar la licencia del SO');
INSERT INTO public.pasos (id_paso, nombre) VALUES (9, 'Llenar el formulario de Activacion');
INSERT INTO public.pasos (id_paso, nombre) VALUES (10, 'Verificar si se realizo la activacion ');
INSERT INTO public.pasos (id_paso, nombre) VALUES (11, 'Preparar los limpiadores');
INSERT INTO public.pasos (id_paso, nombre) VALUES (12, 'Posicionar el equipo adecuadamente');
INSERT INTO public.pasos (id_paso, nombre) VALUES (13, 'Limpiar cuidadosamente la superficie del equipo
');
INSERT INTO public.pasos (id_paso, nombre) VALUES (14, 'Elimimar residuos de los equipo');
INSERT INTO public.pasos (id_paso, nombre) VALUES (16, 'Desarmar equipo cuidadosamente');
INSERT INTO public.pasos (id_paso, nombre) VALUES (17, 'Armar equipo cuidadosamente');
INSERT INTO public.pasos (id_paso, nombre) VALUES (15, 'Almacenar limpiadores');


--
-- TOC entry 2405 (class 0 OID 16556)
-- Dependencies: 221
-- Data for Name: procedimiento; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.procedimiento (id_procedimiento, nombre) VALUES (1, 'Escaneo de virus');
INSERT INTO public.procedimiento (id_procedimiento, nombre) VALUES (2, 'Eliminacion de virus');
INSERT INTO public.procedimiento (id_procedimiento, nombre) VALUES (3, 'Limpieza de Case');
INSERT INTO public.procedimiento (id_procedimiento, nombre) VALUES (4, 'Limpieza de Monitor');
INSERT INTO public.procedimiento (id_procedimiento, nombre) VALUES (5, 'Formateo');
INSERT INTO public.procedimiento (id_procedimiento, nombre) VALUES (6, 'Activacion de SO');
INSERT INTO public.procedimiento (id_procedimiento, nombre) VALUES (7, 'Limpieza ');


--
-- TOC entry 2409 (class 0 OID 16578)
-- Dependencies: 225
-- Data for Name: procedimiento_paso; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.procedimiento_paso (id_procedimiento, id_paso, id_procedimiento_paso) VALUES (1, 1, 1);
INSERT INTO public.procedimiento_paso (id_procedimiento, id_paso, id_procedimiento_paso) VALUES (1, 2, 2);
INSERT INTO public.procedimiento_paso (id_procedimiento, id_paso, id_procedimiento_paso) VALUES (1, 3, 3);
INSERT INTO public.procedimiento_paso (id_procedimiento, id_paso, id_procedimiento_paso) VALUES (2, 4, 4);
INSERT INTO public.procedimiento_paso (id_procedimiento, id_paso, id_procedimiento_paso) VALUES (2, 5, 5);
INSERT INTO public.procedimiento_paso (id_procedimiento, id_paso, id_procedimiento_paso) VALUES (2, 6, 6);
INSERT INTO public.procedimiento_paso (id_procedimiento, id_paso, id_procedimiento_paso) VALUES (6, 7, 7);
INSERT INTO public.procedimiento_paso (id_procedimiento, id_paso, id_procedimiento_paso) VALUES (6, 8, 8);
INSERT INTO public.procedimiento_paso (id_procedimiento, id_paso, id_procedimiento_paso) VALUES (6, 9, 9);
INSERT INTO public.procedimiento_paso (id_procedimiento, id_paso, id_procedimiento_paso) VALUES (6, 10, 10);
INSERT INTO public.procedimiento_paso (id_procedimiento, id_paso, id_procedimiento_paso) VALUES (4, 11, 11);
INSERT INTO public.procedimiento_paso (id_procedimiento, id_paso, id_procedimiento_paso) VALUES (4, 12, 12);
INSERT INTO public.procedimiento_paso (id_procedimiento, id_paso, id_procedimiento_paso) VALUES (4, 13, 13);
INSERT INTO public.procedimiento_paso (id_procedimiento, id_paso, id_procedimiento_paso) VALUES (4, 14, 14);
INSERT INTO public.procedimiento_paso (id_procedimiento, id_paso, id_procedimiento_paso) VALUES (4, 15, 15);
INSERT INTO public.procedimiento_paso (id_procedimiento, id_paso, id_procedimiento_paso) VALUES (3, 16, 16);
INSERT INTO public.procedimiento_paso (id_procedimiento, id_paso, id_procedimiento_paso) VALUES (3, 11, 17);
INSERT INTO public.procedimiento_paso (id_procedimiento, id_paso, id_procedimiento_paso) VALUES (3, 12, 18);
INSERT INTO public.procedimiento_paso (id_procedimiento, id_paso, id_procedimiento_paso) VALUES (3, 13, 19);
INSERT INTO public.procedimiento_paso (id_procedimiento, id_paso, id_procedimiento_paso) VALUES (3, 14, 20);
INSERT INTO public.procedimiento_paso (id_procedimiento, id_paso, id_procedimiento_paso) VALUES (3, 15, 21);
INSERT INTO public.procedimiento_paso (id_procedimiento, id_paso, id_procedimiento_paso) VALUES (3, 17, 22);
INSERT INTO public.procedimiento_paso (id_procedimiento, id_paso, id_procedimiento_paso) VALUES (7, 11, 23);
INSERT INTO public.procedimiento_paso (id_procedimiento, id_paso, id_procedimiento_paso) VALUES (7, 12, 24);
INSERT INTO public.procedimiento_paso (id_procedimiento, id_paso, id_procedimiento_paso) VALUES (7, 13, 25);
INSERT INTO public.procedimiento_paso (id_procedimiento, id_paso, id_procedimiento_paso) VALUES (7, 14, 26);
INSERT INTO public.procedimiento_paso (id_procedimiento, id_paso, id_procedimiento_paso) VALUES (7, 15, 27);


--
-- TOC entry 2403 (class 0 OID 16549)
-- Dependencies: 219
-- Data for Name: orden_trabajo_detalle_estado_paso; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.orden_trabajo_detalle_estado_paso (id_orden_trabajo_detalle, id_procedimiento_paso, completado) VALUES (1, 11, true);
INSERT INTO public.orden_trabajo_detalle_estado_paso (id_orden_trabajo_detalle, id_procedimiento_paso, completado) VALUES (1, 12, true);
INSERT INTO public.orden_trabajo_detalle_estado_paso (id_orden_trabajo_detalle, id_procedimiento_paso, completado) VALUES (1, 13, true);
INSERT INTO public.orden_trabajo_detalle_estado_paso (id_orden_trabajo_detalle, id_procedimiento_paso, completado) VALUES (1, 14, false);
INSERT INTO public.orden_trabajo_detalle_estado_paso (id_orden_trabajo_detalle, id_procedimiento_paso, completado) VALUES (1, 15, false);
INSERT INTO public.orden_trabajo_detalle_estado_paso (id_orden_trabajo_detalle, id_procedimiento_paso, completado) VALUES (3, 23, true);
INSERT INTO public.orden_trabajo_detalle_estado_paso (id_orden_trabajo_detalle, id_procedimiento_paso, completado) VALUES (3, 24, false);
INSERT INTO public.orden_trabajo_detalle_estado_paso (id_orden_trabajo_detalle, id_procedimiento_paso, completado) VALUES (3, 25, false);
INSERT INTO public.orden_trabajo_detalle_estado_paso (id_orden_trabajo_detalle, id_procedimiento_paso, completado) VALUES (3, 26, false);
INSERT INTO public.orden_trabajo_detalle_estado_paso (id_orden_trabajo_detalle, id_procedimiento_paso, completado) VALUES (3, 27, false);
INSERT INTO public.orden_trabajo_detalle_estado_paso (id_orden_trabajo_detalle, id_procedimiento_paso, completado) VALUES (2, 16, true);
INSERT INTO public.orden_trabajo_detalle_estado_paso (id_orden_trabajo_detalle, id_procedimiento_paso, completado) VALUES (2, 17, true);
INSERT INTO public.orden_trabajo_detalle_estado_paso (id_orden_trabajo_detalle, id_procedimiento_paso, completado) VALUES (2, 18, false);
INSERT INTO public.orden_trabajo_detalle_estado_paso (id_orden_trabajo_detalle, id_procedimiento_paso, completado) VALUES (2, 19, false);
INSERT INTO public.orden_trabajo_detalle_estado_paso (id_orden_trabajo_detalle, id_procedimiento_paso, completado) VALUES (2, 20, false);
INSERT INTO public.orden_trabajo_detalle_estado_paso (id_orden_trabajo_detalle, id_procedimiento_paso, completado) VALUES (2, 21, false);
INSERT INTO public.orden_trabajo_detalle_estado_paso (id_orden_trabajo_detalle, id_procedimiento_paso, completado) VALUES (2, 22, false);
INSERT INTO public.orden_trabajo_detalle_estado_paso (id_orden_trabajo_detalle, id_procedimiento_paso, completado) VALUES (5, 11, true);
INSERT INTO public.orden_trabajo_detalle_estado_paso (id_orden_trabajo_detalle, id_procedimiento_paso, completado) VALUES (5, 12, true);
INSERT INTO public.orden_trabajo_detalle_estado_paso (id_orden_trabajo_detalle, id_procedimiento_paso, completado) VALUES (5, 13, true);
INSERT INTO public.orden_trabajo_detalle_estado_paso (id_orden_trabajo_detalle, id_procedimiento_paso, completado) VALUES (5, 14, true);
INSERT INTO public.orden_trabajo_detalle_estado_paso (id_orden_trabajo_detalle, id_procedimiento_paso, completado) VALUES (5, 15, false);
INSERT INTO public.orden_trabajo_detalle_estado_paso (id_orden_trabajo_detalle, id_procedimiento_paso, completado) VALUES (4, 23, true);
INSERT INTO public.orden_trabajo_detalle_estado_paso (id_orden_trabajo_detalle, id_procedimiento_paso, completado) VALUES (4, 24, false);
INSERT INTO public.orden_trabajo_detalle_estado_paso (id_orden_trabajo_detalle, id_procedimiento_paso, completado) VALUES (4, 25, false);
INSERT INTO public.orden_trabajo_detalle_estado_paso (id_orden_trabajo_detalle, id_procedimiento_paso, completado) VALUES (4, 26, false);
INSERT INTO public.orden_trabajo_detalle_estado_paso (id_orden_trabajo_detalle, id_procedimiento_paso, completado) VALUES (4, 27, false);
INSERT INTO public.orden_trabajo_detalle_estado_paso (id_orden_trabajo_detalle, id_procedimiento_paso, completado) VALUES (6, 23, true);
INSERT INTO public.orden_trabajo_detalle_estado_paso (id_orden_trabajo_detalle, id_procedimiento_paso, completado) VALUES (6, 24, true);
INSERT INTO public.orden_trabajo_detalle_estado_paso (id_orden_trabajo_detalle, id_procedimiento_paso, completado) VALUES (6, 25, false);
INSERT INTO public.orden_trabajo_detalle_estado_paso (id_orden_trabajo_detalle, id_procedimiento_paso, completado) VALUES (6, 26, false);
INSERT INTO public.orden_trabajo_detalle_estado_paso (id_orden_trabajo_detalle, id_procedimiento_paso, completado) VALUES (6, 27, false);


--
-- TOC entry 2428 (class 0 OID 0)
-- Dependencies: 211
-- Name: orden_trabajo_detalle_id_orden_trabajo_detalle_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.orden_trabajo_detalle_id_orden_trabajo_detalle_seq', 1, false);


--
-- TOC entry 2429 (class 0 OID 0)
-- Dependencies: 205
-- Name: orden_trabajo_id_orden_trabajo_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.orden_trabajo_id_orden_trabajo_seq', 1, false);


--
-- TOC entry 2430 (class 0 OID 0)
-- Dependencies: 199
-- Name: parte_id_parte_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.parte_id_parte_seq', 1, false);


--
-- TOC entry 2431 (class 0 OID 0)
-- Dependencies: 222
-- Name: pasos_id_paso_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.pasos_id_paso_seq', 1, false);


--
-- TOC entry 2432 (class 0 OID 0)
-- Dependencies: 207
-- Name: prioridad_id_prioridad_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.prioridad_id_prioridad_seq', 1, false);


--
-- TOC entry 2412 (class 0 OID 16592)
-- Dependencies: 228
-- Data for Name: procedimiento__diagnostico_parte; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.procedimiento__diagnostico_parte (id_procedimiento, id_diagnostico_parte) VALUES (1, 1);
INSERT INTO public.procedimiento__diagnostico_parte (id_procedimiento, id_diagnostico_parte) VALUES (2, 1);


--
-- TOC entry 2433 (class 0 OID 0)
-- Dependencies: 220
-- Name: procedimiento_id_procedimiento_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.procedimiento_id_procedimiento_seq', 1, false);


--
-- TOC entry 2434 (class 0 OID 0)
-- Dependencies: 224
-- Name: procedimiento_paso_id_procedimiento_paso_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.procedimiento_paso_id_procedimiento_paso_seq', 1, false);


--
-- TOC entry 2435 (class 0 OID 0)
-- Dependencies: 213
-- Name: responsable_id_responsable_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.responsable_id_responsable_seq', 1, false);


--
-- TOC entry 2371 (class 0 OID 16394)
-- Dependencies: 187
-- Data for Name: solicitud_equipo; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.solicitud_equipo (id_solicitud, id_equipo) VALUES (3, 1);
INSERT INTO public.solicitud_equipo (id_solicitud, id_equipo) VALUES (2, 2);
INSERT INTO public.solicitud_equipo (id_solicitud, id_equipo) VALUES (1, 3);
INSERT INTO public.solicitud_equipo (id_solicitud, id_equipo) VALUES (4, 1);
INSERT INTO public.solicitud_equipo (id_solicitud, id_equipo) VALUES (5, 4);
INSERT INTO public.solicitud_equipo (id_solicitud, id_equipo) VALUES (1, 10);
INSERT INTO public.solicitud_equipo (id_solicitud, id_equipo) VALUES (2, 11);
INSERT INTO public.solicitud_equipo (id_solicitud, id_equipo) VALUES (6, 8);
INSERT INTO public.solicitud_equipo (id_solicitud, id_equipo) VALUES (2, 15);


--
-- TOC entry 2436 (class 0 OID 0)
-- Dependencies: 185
-- Name: solicitud_id_solicitud_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.solicitud_id_solicitud_seq', 1, false);


--
-- TOC entry 2437 (class 0 OID 0)
-- Dependencies: 209
-- Name: tipo_mantenimiento_id_tipo_mantenimiento_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.tipo_mantenimiento_id_tipo_mantenimiento_seq', 1, false);


--
-- TOC entry 2438 (class 0 OID 0)
-- Dependencies: 215
-- Name: tipo_responsable_id_tipo_responsable_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.tipo_responsable_id_tipo_responsable_seq', 1, false);


--
-- TOC entry 2439 (class 0 OID 0)
-- Dependencies: 229
-- Name: unidad_id_unidad_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.unidad_id_unidad_seq', 1, false);


-- Completed on 2018-06-12 18:41:48 CST

--
-- PostgreSQL database dump complete
--

