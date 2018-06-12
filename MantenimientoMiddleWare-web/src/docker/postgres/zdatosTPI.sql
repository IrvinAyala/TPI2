--
-- PostgreSQL database dump
--

-- Dumped from database version 9.6.3
-- Dumped by pg_dump version 9.6.9

-- Started on 2018-06-12 01:40:58 CST

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
INSERT INTO public.equipo_detalle (id_equipo, numero_serie, id_articulo) VALUES (2, '098765432-1', 1);


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


--
-- TOC entry 2396 (class 0 OID 16513)
-- Dependencies: 212
-- Data for Name: orden_trabajo_detalle; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.orden_trabajo_detalle (id_orden_trabajo_detalle, id_orden_trabajo, id_equipo_detalle, id_responsable, observacion) VALUES (1, 1, '1', 1, NULL);
INSERT INTO public.orden_trabajo_detalle (id_orden_trabajo_detalle, id_orden_trabajo, id_equipo_detalle, id_responsable, observacion) VALUES (2, 2, '2', 3, NULL);


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


--
-- TOC entry 2405 (class 0 OID 16556)
-- Dependencies: 221
-- Data for Name: procedimiento; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.procedimiento (id_procedimiento, nombre) VALUES (1, 'Escaneo de virus');
INSERT INTO public.procedimiento (id_procedimiento, nombre) VALUES (2, 'Eliminacion de virus');


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


--
-- TOC entry 2403 (class 0 OID 16549)
-- Dependencies: 219
-- Data for Name: orden_trabajo_detalle_estado_paso; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.orden_trabajo_detalle_estado_paso (id_orden_trabajo_detalle, id_procedimiento_paso, completado) VALUES (1, 1, true);
INSERT INTO public.orden_trabajo_detalle_estado_paso (id_orden_trabajo_detalle, id_procedimiento_paso, completado) VALUES (2, 2, true);


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


-- Completed on 2018-06-12 01:41:00 CST

--
-- PostgreSQL database dump complete
--

