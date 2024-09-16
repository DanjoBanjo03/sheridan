declare
v_last_name varchar(25);
v_salary number;
begin
select last_name, salary into v_last_name, v_salary
from hr.employees
where employee_id =110;
dbms_output.put_line(v_last_name||' '|| v_salary);
end;