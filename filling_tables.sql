INSERT INTO public.field_types (name, able_to_have_options) VALUES 
('DATE', false),
('COMBOBOX', true),
('CHECKBOX', true),
('RADIOBUTTON', true),
('MULTI LINE TEXT', true),
('SINGLE LINE TEXT', true);

INSERT INTO public.gender_types (name, shown_name) VALUES 
('FEMALE', 'Женский'),
('MALE', 'Мужской');

INSERT INTO public.user_roles (name, shown_name) VALUES 
('MEMBER', 'Пользователь'),
('ADMIN', 'Администратор');