from datetime import datetime

dia_ini = input(str())
hora_ini = input(str())

dia_fim = input(str())
hora_fim = input(str())

dia_ini_splited = dia_ini.split(" ")
hora_ini.replace(" ", "")

data_e_hora_em_texto_ini = f"{dia_ini_splited[1]}/01/2021 {hora_ini}"
data_e_hora_ini = datetime.strptime(data_e_hora_em_texto_ini, '%d/%m/%Y %H:%M:%S')

dia_fim_splited = dia_ini.split(" ")
hora_fim.replace(" ", "")

data_e_hora_em_texto_ini = f"{dia_fim_splited[1]}/01/2021 {hora_fim}"
data_e_hora_ini = datetime.strptime(data_e_hora_em_texto_ini, '%d/%m/%Y %H:%M:%S')

