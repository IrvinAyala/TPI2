-- Database generated with pgModeler (PostgreSQL Database Modeler).
-- pgModeler  version: 0.8.1
-- PostgreSQL version: 9.4
-- Project Site: pgmodeler.com.br
-- Model Author: ---


-- Database creation must be done outside an multicommand file.
-- These commands were put in this file only for convenience.
-- -- object: new_database | type: DATABASE --
-- -- DROP DATABASE IF EXISTS new_database;
-- CREATE DATABASE new_database
-- ;
-- -- ddl-end --
-- 

-- object: public.solicitud | type: TABLE --
-- DROP TABLE IF EXISTS public.solicitud CASCADE;
CREATE TABLE public.solicitud(
	id_solicitud serial NOT NULL,
	unidad varchar(100) NOT NULL,
	solicitante varchar(100) NOT NULL,
	estado boolean,
	CONSTRAINT id_solicitud PRIMARY KEY (id_solicitud)

);
-- ddl-end --
ALTER TABLE public.solicitud OWNER TO postgres;
-- ddl-end --

-- object: public.solicitud_equipo | type: TABLE --
-- DROP TABLE IF EXISTS public.solicitud_equipo CASCADE;
CREATE TABLE public.solicitud_equipo(
	id_solicitud int4 NOT NULL,
	id_equipo int4 NOT NULL,
	CONSTRAINT id_solicitud_equipo PRIMARY KEY (id_solicitud,id_equipo)

);
-- ddl-end --
ALTER TABLE public.solicitud_equipo OWNER TO postgres;
-- ddl-end --

-- object: public.equipo | type: TABLE --
-- DROP TABLE IF EXISTS public.equipo CASCADE;
CREATE TABLE public.equipo(
	id_equipo serial NOT NULL,
	id_modelo int4 NOT NULL,
	id_unidad int4 NOT NULL,
	codigo_correlativo varchar(250) NOT NULL,
	CONSTRAINT id_equipo PRIMARY KEY (id_equipo)

);
-- ddl-end --
ALTER TABLE public.equipo OWNER TO postgres;
-- ddl-end --

-- object: public.calendario_equipo | type: TABLE --
-- DROP TABLE IF EXISTS public.calendario_equipo CASCADE;
CREATE TABLE public.calendario_equipo(
	id_equipo int4 NOT NULL,
	periodo int4 NOT NULL,
	id_calendario_equipo serial NOT NULL,
	CONSTRAINT id_calendario_equipo PRIMARY KEY (id_calendario_equipo)

);
-- ddl-end --
ALTER TABLE public.calendario_equipo OWNER TO postgres;
-- ddl-end --

-- object: public.equipo_detalle | type: TABLE --
-- DROP TABLE IF EXISTS public.equipo_detalle CASCADE;
CREATE TABLE public.equipo_detalle(
	id_equipo int4 NOT NULL,
	numero_serie varchar(100) NOT NULL,
	id_articulo int4 NOT NULL,
	CONSTRAINT id_equipo_detalle PRIMARY KEY (numero_serie)

);
-- ddl-end --
ALTER TABLE public.equipo_detalle OWNER TO postgres;
-- ddl-end --

-- object: public.modelo | type: TABLE --
-- DROP TABLE IF EXISTS public.modelo CASCADE;
CREATE TABLE public.modelo(
	id_modelo serial NOT NULL,
	nombre varchar(100) NOT NULL,
	activo boolean NOT NULL DEFAULT true,
	descripcion text DEFAULT null,
	CONSTRAINT id_modelo PRIMARY KEY (id_modelo)

);
-- ddl-end --
ALTER TABLE public.modelo OWNER TO postgres;
-- ddl-end --

-- object: public.marca | type: TABLE --
-- DROP TABLE IF EXISTS public.marca CASCADE;
CREATE TABLE public.marca(
	id_marca serial NOT NULL,
	nombre varchar(100) NOT NULL,
	descripcion varchar(100),
	activo boolean NOT NULL DEFAULT true,
	CONSTRAINT id_marca PRIMARY KEY (id_marca)

);
-- ddl-end --
ALTER TABLE public.marca OWNER TO postgres;
-- ddl-end --

-- object: public.articulo | type: TABLE --
-- DROP TABLE IF EXISTS public.articulo CASCADE;
CREATE TABLE public.articulo(
	id_articulo serial NOT NULL,
	id_marca int4 NOT NULL,
	id_parte int4 NOT NULL,
	nombre varchar(255) NOT NULL,
	descripcion text DEFAULT null,
	activo boolean NOT NULL DEFAULT true,
	CONSTRAINT id_articulo PRIMARY KEY (id_articulo)

);
-- ddl-end --
ALTER TABLE public.articulo OWNER TO postgres;
-- ddl-end --

-- object: public.parte | type: TABLE --
-- DROP TABLE IF EXISTS public.parte CASCADE;
CREATE TABLE public.parte(
	id_parte serial NOT NULL,
	nombre varchar(100) NOT NULL,
	descripcion text DEFAULT null,
	activo boolean NOT NULL DEFAULT true,
	CONSTRAINT id_parte PRIMARY KEY (id_parte)

);
-- ddl-end --
ALTER TABLE public.parte OWNER TO postgres;
-- ddl-end --

-- object: public.modelo_detalle | type: TABLE --
-- DROP TABLE IF EXISTS public.modelo_detalle CASCADE;
CREATE TABLE public.modelo_detalle(
	id_modelo int4 NOT NULL,
	id_articulo int4 NOT NULL,
	activo boolean NOT NULL DEFAULT true,
	CONSTRAINT id_modelo_detalle PRIMARY KEY (id_modelo,id_articulo)

);
-- ddl-end --
ALTER TABLE public.modelo_detalle OWNER TO postgres;
-- ddl-end --

-- object: public.calendario | type: TABLE --
-- DROP TABLE IF EXISTS public.calendario CASCADE;
CREATE TABLE public.calendario(
	id_equipo int4 NOT NULL,
	fecha date NOT NULL,
	id_calendario serial NOT NULL,
	CONSTRAINT id_calendario PRIMARY KEY (id_calendario)

);
-- ddl-end --
ALTER TABLE public.calendario OWNER TO postgres;
-- ddl-end --

-- object: public.calendario_solicitud | type: TABLE --
-- DROP TABLE IF EXISTS public.calendario_solicitud CASCADE;
CREATE TABLE public.calendario_solicitud(
	id_solicitud int4 NOT NULL,
	id_calendario int4 NOT NULL,
	CONSTRAINT id_calendario_solicitud PRIMARY KEY (id_solicitud,id_calendario)

);
-- ddl-end --
ALTER TABLE public.calendario_solicitud OWNER TO postgres;
-- ddl-end --

-- object: public.orden_trabajo | type: TABLE --
-- DROP TABLE IF EXISTS public.orden_trabajo CASCADE;
CREATE TABLE public.orden_trabajo(
	id_orden_trabajo serial NOT NULL,
	id_solicitud int4 NOT NULL,
	id_prioridad int4 NOT NULL,
	id_tipo_mantenimiento int4 NOT NULL,
	CONSTRAINT id_orden_trabajo PRIMARY KEY (id_orden_trabajo)

);
-- ddl-end --
ALTER TABLE public.orden_trabajo OWNER TO postgres;
-- ddl-end --

-- object: public.prioridad | type: TABLE --
-- DROP TABLE IF EXISTS public.prioridad CASCADE;
CREATE TABLE public.prioridad(
	id_prioridad serial NOT NULL,
	nombre varchar(100) NOT NULL,
	descripcion varchar(100),
	CONSTRAINT id_prioridad PRIMARY KEY (id_prioridad)

);
-- ddl-end --
ALTER TABLE public.prioridad OWNER TO postgres;
-- ddl-end --

-- object: public.tipo_mantenimiento | type: TABLE --
-- DROP TABLE IF EXISTS public.tipo_mantenimiento CASCADE;
CREATE TABLE public.tipo_mantenimiento(
	id_tipo_mantenimiento serial NOT NULL,
	nombre varchar(100) NOT NULL,
	descripcion text,
	CONSTRAINT id_mantenimiento PRIMARY KEY (id_tipo_mantenimiento)

);
-- ddl-end --
ALTER TABLE public.tipo_mantenimiento OWNER TO postgres;
-- ddl-end --

-- object: public.orden_trabajo_detalle | type: TABLE --
-- DROP TABLE IF EXISTS public.orden_trabajo_detalle CASCADE;
CREATE TABLE public.orden_trabajo_detalle(
	id_orden_trabajo_detalle serial NOT NULL,
	id_orden_trabajo int4 NOT NULL,
	id_equipo_detalle varchar(100) NOT NULL,
	id_responsable int4 NOT NULL,
	observacion text,
	CONSTRAINT id_orden_trabajo_detalle PRIMARY KEY (id_orden_trabajo_detalle)

);
-- ddl-end --
ALTER TABLE public.orden_trabajo_detalle OWNER TO postgres;
-- ddl-end --

-- object: public.responsable | type: TABLE --
-- DROP TABLE IF EXISTS public.responsable CASCADE;
CREATE TABLE public.responsable(
	id_responsable serial NOT NULL,
	nombre varchar(100) NOT NULL,
	id_tipo_reponsable int4 NOT NULL,
	CONSTRAINT id_responsable PRIMARY KEY (id_responsable)

);
-- ddl-end --
ALTER TABLE public.responsable OWNER TO postgres;
-- ddl-end --

-- object: public.tipo_responsable | type: TABLE --
-- DROP TABLE IF EXISTS public.tipo_responsable CASCADE;
CREATE TABLE public.tipo_responsable(
	id_tipo_responsable serial NOT NULL,
	nombre varchar(100) NOT NULL,
	observacion varchar(100),
	CONSTRAINT id_tipo_responsable PRIMARY KEY (id_tipo_responsable)

);
-- ddl-end --
ALTER TABLE public.tipo_responsable OWNER TO postgres;
-- ddl-end --

-- object: public.diagnostico | type: TABLE --
-- DROP TABLE IF EXISTS public.diagnostico CASCADE;
CREATE TABLE public.diagnostico(
	id_diagnostico serial NOT NULL,
	nombre varchar(100) NOT NULL,
	descripcion text,
	CONSTRAINT id_diagnostico PRIMARY KEY (id_diagnostico)

);
-- ddl-end --
ALTER TABLE public.diagnostico OWNER TO postgres;
-- ddl-end --

-- object: public.orden_trabajo_detalle_estado_paso | type: TABLE --
-- DROP TABLE IF EXISTS public.orden_trabajo_detalle_estado_paso CASCADE;
CREATE TABLE public.orden_trabajo_detalle_estado_paso(
	id_orden_trabajo_detalle int4 NOT NULL,
	id_procedimiento_paso int4 NOT NULL,
	completado bool NOT NULL,
	CONSTRAINT id_orden_trabajo_detalle__estado_pasos PRIMARY KEY (id_procedimiento_paso,id_orden_trabajo_detalle)

);
-- ddl-end --
ALTER TABLE public.orden_trabajo_detalle_estado_paso OWNER TO postgres;
-- ddl-end --

-- object: public.procedimiento | type: TABLE --
-- DROP TABLE IF EXISTS public.procedimiento CASCADE;
CREATE TABLE public.procedimiento(
	id_procedimiento serial NOT NULL,
	nombre text NOT NULL,
	CONSTRAINT id_procedimiento PRIMARY KEY (id_procedimiento)

);
-- ddl-end --
ALTER TABLE public.procedimiento OWNER TO postgres;
-- ddl-end --

-- object: public.pasos | type: TABLE --
-- DROP TABLE IF EXISTS public.pasos CASCADE;
CREATE TABLE public.pasos(
	id_paso serial NOT NULL,
	nombre text NOT NULL,
	CONSTRAINT id_paso PRIMARY KEY (id_paso)

);
-- ddl-end --
ALTER TABLE public.pasos OWNER TO postgres;
-- ddl-end --

-- object: public.procedimiento_paso | type: TABLE --
-- DROP TABLE IF EXISTS public.procedimiento_paso CASCADE;
CREATE TABLE public.procedimiento_paso(
	id_procedimiento int4 NOT NULL,
	id_paso int4 NOT NULL,
	id_procedimiento_paso serial NOT NULL,
	CONSTRAINT id_procedimiento_paso PRIMARY KEY (id_procedimiento_paso)

);
-- ddl-end --
ALTER TABLE public.procedimiento_paso OWNER TO postgres;
-- ddl-end --

-- object: public.diagnostico_parte | type: TABLE --
-- DROP TABLE IF EXISTS public.diagnostico_parte CASCADE;
CREATE TABLE public.diagnostico_parte(
	id_diagnostico int4 NOT NULL,
	id_diagnostico_parte serial NOT NULL,
	id_parte int4 NOT NULL,
	CONSTRAINT id_diagnostico_parte PRIMARY KEY (id_diagnostico_parte)

);
-- ddl-end --
ALTER TABLE public.diagnostico_parte OWNER TO postgres;
-- ddl-end --

-- object: public.procedimiento__diagnostico_parte | type: TABLE --
-- DROP TABLE IF EXISTS public.procedimiento__diagnostico_parte CASCADE;
CREATE TABLE public.procedimiento__diagnostico_parte(
	id_procedimiento int4 NOT NULL,
	id_diagnostico_parte int4 NOT NULL,
	CONSTRAINT id_procedimiento_diagnostico_parte PRIMARY KEY (id_procedimiento,id_diagnostico_parte)

);
-- ddl-end --
ALTER TABLE public.procedimiento__diagnostico_parte OWNER TO postgres;
-- ddl-end --

-- object: public.unidad | type: TABLE --
-- DROP TABLE IF EXISTS public.unidad CASCADE;
CREATE TABLE public.unidad(
	id_unidad serial NOT NULL,
	nombre varchar(100) NOT NULL,
	CONSTRAINT id_unidad PRIMARY KEY (id_unidad)

);
-- ddl-end --
ALTER TABLE public.unidad OWNER TO postgres;
-- ddl-end --

-- object: id_solicitud | type: CONSTRAINT --
-- ALTER TABLE public.solicitud_equipo DROP CONSTRAINT IF EXISTS id_solicitud CASCADE;
ALTER TABLE public.solicitud_equipo ADD CONSTRAINT id_solicitud FOREIGN KEY (id_solicitud)
REFERENCES public.solicitud (id_solicitud) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --

-- object: id_equipo | type: CONSTRAINT --
-- ALTER TABLE public.solicitud_equipo DROP CONSTRAINT IF EXISTS id_equipo CASCADE;
ALTER TABLE public.solicitud_equipo ADD CONSTRAINT id_equipo FOREIGN KEY (id_equipo)
REFERENCES public.equipo (id_equipo) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --

-- object: id_modelo | type: CONSTRAINT --
-- ALTER TABLE public.equipo DROP CONSTRAINT IF EXISTS id_modelo CASCADE;
ALTER TABLE public.equipo ADD CONSTRAINT id_modelo FOREIGN KEY (id_modelo)
REFERENCES public.modelo (id_modelo) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --

-- object: id_unidad | type: CONSTRAINT --
-- ALTER TABLE public.equipo DROP CONSTRAINT IF EXISTS id_unidad CASCADE;
ALTER TABLE public.equipo ADD CONSTRAINT id_unidad FOREIGN KEY (id_unidad)
REFERENCES public.unidad (id_unidad) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --

-- object: id_equipo | type: CONSTRAINT --
-- ALTER TABLE public.calendario_equipo DROP CONSTRAINT IF EXISTS id_equipo CASCADE;
ALTER TABLE public.calendario_equipo ADD CONSTRAINT id_equipo FOREIGN KEY (id_equipo)
REFERENCES public.equipo (id_equipo) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --

-- object: id_equipo | type: CONSTRAINT --
-- ALTER TABLE public.equipo_detalle DROP CONSTRAINT IF EXISTS id_equipo CASCADE;
ALTER TABLE public.equipo_detalle ADD CONSTRAINT id_equipo FOREIGN KEY (id_equipo)
REFERENCES public.equipo (id_equipo) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --

-- object: id_marca | type: CONSTRAINT --
-- ALTER TABLE public.articulo DROP CONSTRAINT IF EXISTS id_marca CASCADE;
ALTER TABLE public.articulo ADD CONSTRAINT id_marca FOREIGN KEY (id_marca)
REFERENCES public.marca (id_marca) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --

-- object: id_parte | type: CONSTRAINT --
-- ALTER TABLE public.articulo DROP CONSTRAINT IF EXISTS id_parte CASCADE;
ALTER TABLE public.articulo ADD CONSTRAINT id_parte FOREIGN KEY (id_parte)
REFERENCES public.parte (id_parte) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --

-- object: id_modelo | type: CONSTRAINT --
-- ALTER TABLE public.modelo_detalle DROP CONSTRAINT IF EXISTS id_modelo CASCADE;
ALTER TABLE public.modelo_detalle ADD CONSTRAINT id_modelo FOREIGN KEY (id_modelo)
REFERENCES public.modelo (id_modelo) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --

-- object: id_articulo | type: CONSTRAINT --
-- ALTER TABLE public.modelo_detalle DROP CONSTRAINT IF EXISTS id_articulo CASCADE;
ALTER TABLE public.modelo_detalle ADD CONSTRAINT id_articulo FOREIGN KEY (id_articulo)
REFERENCES public.articulo (id_articulo) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --

-- object: id_equipo | type: CONSTRAINT --
-- ALTER TABLE public.calendario DROP CONSTRAINT IF EXISTS id_equipo CASCADE;
ALTER TABLE public.calendario ADD CONSTRAINT id_equipo FOREIGN KEY (id_equipo)
REFERENCES public.equipo (id_equipo) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --

-- object: id_solicitud | type: CONSTRAINT --
-- ALTER TABLE public.calendario_solicitud DROP CONSTRAINT IF EXISTS id_solicitud CASCADE;
ALTER TABLE public.calendario_solicitud ADD CONSTRAINT id_solicitud FOREIGN KEY (id_solicitud)
REFERENCES public.solicitud (id_solicitud) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --

-- object: id_calendario | type: CONSTRAINT --
-- ALTER TABLE public.calendario_solicitud DROP CONSTRAINT IF EXISTS id_calendario CASCADE;
ALTER TABLE public.calendario_solicitud ADD CONSTRAINT id_calendario FOREIGN KEY (id_calendario)
REFERENCES public.calendario (id_calendario) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --

-- object: id_solicitud | type: CONSTRAINT --
-- ALTER TABLE public.orden_trabajo DROP CONSTRAINT IF EXISTS id_solicitud CASCADE;
ALTER TABLE public.orden_trabajo ADD CONSTRAINT id_solicitud FOREIGN KEY (id_solicitud)
REFERENCES public.solicitud (id_solicitud) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --

-- object: id_prioridad | type: CONSTRAINT --
-- ALTER TABLE public.orden_trabajo DROP CONSTRAINT IF EXISTS id_prioridad CASCADE;
ALTER TABLE public.orden_trabajo ADD CONSTRAINT id_prioridad FOREIGN KEY (id_prioridad)
REFERENCES public.prioridad (id_prioridad) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --

-- object: id_tipo_mantenimiento | type: CONSTRAINT --
-- ALTER TABLE public.orden_trabajo DROP CONSTRAINT IF EXISTS id_tipo_mantenimiento CASCADE;
ALTER TABLE public.orden_trabajo ADD CONSTRAINT id_tipo_mantenimiento FOREIGN KEY (id_tipo_mantenimiento)
REFERENCES public.tipo_mantenimiento (id_tipo_mantenimiento) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --

-- object: id_responsable | type: CONSTRAINT --
-- ALTER TABLE public.orden_trabajo_detalle DROP CONSTRAINT IF EXISTS id_responsable CASCADE;
ALTER TABLE public.orden_trabajo_detalle ADD CONSTRAINT id_responsable FOREIGN KEY (id_responsable)
REFERENCES public.responsable (id_responsable) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --

-- object: id_orden_trabajo | type: CONSTRAINT --
-- ALTER TABLE public.orden_trabajo_detalle DROP CONSTRAINT IF EXISTS id_orden_trabajo CASCADE;
ALTER TABLE public.orden_trabajo_detalle ADD CONSTRAINT id_orden_trabajo FOREIGN KEY (id_orden_trabajo)
REFERENCES public.orden_trabajo (id_orden_trabajo) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --

-- object: id_tipo_responsable | type: CONSTRAINT --
-- ALTER TABLE public.responsable DROP CONSTRAINT IF EXISTS id_tipo_responsable CASCADE;
ALTER TABLE public.responsable ADD CONSTRAINT id_tipo_responsable FOREIGN KEY (id_tipo_reponsable)
REFERENCES public.tipo_responsable (id_tipo_responsable) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --

-- object: id_orden_trabajo_detalle | type: CONSTRAINT --
-- ALTER TABLE public.orden_trabajo_detalle_estado_paso DROP CONSTRAINT IF EXISTS id_orden_trabajo_detalle CASCADE;
ALTER TABLE public.orden_trabajo_detalle_estado_paso ADD CONSTRAINT id_orden_trabajo_detalle FOREIGN KEY (id_orden_trabajo_detalle)
REFERENCES public.orden_trabajo_detalle (id_orden_trabajo_detalle) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --

-- object: id_procedimiento_paso | type: CONSTRAINT --
-- ALTER TABLE public.orden_trabajo_detalle_estado_paso DROP CONSTRAINT IF EXISTS id_procedimiento_paso CASCADE;
ALTER TABLE public.orden_trabajo_detalle_estado_paso ADD CONSTRAINT id_procedimiento_paso FOREIGN KEY (id_procedimiento_paso)
REFERENCES public.procedimiento_paso (id_procedimiento_paso) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --

-- object: id_paso | type: CONSTRAINT --
-- ALTER TABLE public.procedimiento_paso DROP CONSTRAINT IF EXISTS id_paso CASCADE;
ALTER TABLE public.procedimiento_paso ADD CONSTRAINT id_paso FOREIGN KEY (id_paso)
REFERENCES public.pasos (id_paso) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --

-- object: id_procedimiento | type: CONSTRAINT --
-- ALTER TABLE public.procedimiento_paso DROP CONSTRAINT IF EXISTS id_procedimiento CASCADE;
ALTER TABLE public.procedimiento_paso ADD CONSTRAINT id_procedimiento FOREIGN KEY (id_procedimiento)
REFERENCES public.procedimiento (id_procedimiento) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --

-- object: id_parte | type: CONSTRAINT --
-- ALTER TABLE public.diagnostico_parte DROP CONSTRAINT IF EXISTS id_parte CASCADE;
ALTER TABLE public.diagnostico_parte ADD CONSTRAINT id_parte FOREIGN KEY (id_parte)
REFERENCES public.parte (id_parte) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --

-- object: id_diagnostico | type: CONSTRAINT --
-- ALTER TABLE public.diagnostico_parte DROP CONSTRAINT IF EXISTS id_diagnostico CASCADE;
ALTER TABLE public.diagnostico_parte ADD CONSTRAINT id_diagnostico FOREIGN KEY (id_diagnostico)
REFERENCES public.diagnostico (id_diagnostico) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --

-- object: id_procedimiento | type: CONSTRAINT --
-- ALTER TABLE public.procedimiento__diagnostico_parte DROP CONSTRAINT IF EXISTS id_procedimiento CASCADE;
ALTER TABLE public.procedimiento__diagnostico_parte ADD CONSTRAINT id_procedimiento FOREIGN KEY (id_procedimiento)
REFERENCES public.procedimiento (id_procedimiento) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --

-- object: id_diagnostico_parte | type: CONSTRAINT --
-- ALTER TABLE public.procedimiento__diagnostico_parte DROP CONSTRAINT IF EXISTS id_diagnostico_parte CASCADE;
ALTER TABLE public.procedimiento__diagnostico_parte ADD CONSTRAINT id_diagnostico_parte FOREIGN KEY (id_diagnostico_parte)
REFERENCES public.diagnostico_parte (id_diagnostico_parte) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --


