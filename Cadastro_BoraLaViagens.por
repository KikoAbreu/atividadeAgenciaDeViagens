/*Pseudocódigo usando conceitos de programação estruturada, construído para compor Atividade Prática do Módulo 2, para atender a seguinte demanda:

Usando Pseudocódigo: 

Usando conceitos de programação estruturada (Vetor), criar em pseudocódigo um menu para simular
um cadastro para uma agência de viagens com as seguintes funções: cadastro de cliente e cadastro
de destino, criar também uma consulta para cada estrutura de dados. 

Aluno: Kilderys Abreu.
Obrigado à todos! 
*/


programa {
	funcao inicio() {
	    /*Declaração de variáveis*/
		cadeia nomeClientes[3]
		cadeia Destino[3]
		inteiro Ids[3]
		inteiro IdsDestino[3]
		inteiro i,i2, opcao, idConsulta
		opcao = 0 
		i = 0
		i2 = 0
		/*Menu*/
		enquanto (opcao != 7) {
		    escreva("==== Bem-vindo à Bora Lá Viagens! ====\n")
		    escreva("1 - Cadastrar cliente\n")
		    escreva("2 - Consultar clientes\n")
		    escreva("3 - Consultar cliente por ID\n")
		    escreva("4 - Cadastrar destino\n")
		    escreva("5 - Consultar destinos\n")
		    escreva("6 - Consultar destino por ID\n")
		    escreva("7 - Sair\n")
		    escreva("======================================\n")
		    escreva("Escolha uma opção: ")
		    leia(opcao)
		   
	   /*Processamento das operações a partir da opção selecionada pelo usuário final.*/  
	    escolha (opcao)
		{
		  caso 1:
		    se (i >= 0 e i < 3)
		    {
		        limpa()
		        escreva("== 1- Cadastrar cliente ==\n")
    		    escreva("Digite o nome do cliente ", i + 1, ": ")
    		    leia(nomeClientes[i])
    		    escreva("Digite o ID do cliente ", i + 1, ": ")
    		    leia(Ids[i])
    		    i++ 
    		    
		    } 
		    senao
		    {
		        escreva("\nDesculpe! Número máximo de cadastros atingido.\nVerifique novamente mais tarde!")
		        
		    }
		    pare 
		    
          caso 2:
                limpa()
    		    escreva("== 2 - Clientes cadastrados ==\n")
    		    para (inteiro index = 0; index < 3; index ++)
		    {
		        escreva("Nome: ", nomeClientes[index], " - ID: ", Ids[index],"\n")
		    }
		    pare
		    
		  caso 3: 
		    escreva("== 3 - Consultar cliente por ID ==\n")
		    escreva("Digite o ID do cliente a ser consultado: ")
		    leia(idConsulta)
		    para (inteiro index = 0; index < 3; index ++)
		    {
		        se (Ids[index] == idConsulta)
    		        {
    		         escreva("\nNome: ", nomeClientes[index], "\nID: ", Ids[index],"\n")   
    		         pare
    		        }
    		    senao 
    		    {
    		        escreva("\nID inexistente.\n")    
    		    }
		    }
		    pare
		    
		  caso 4:
		    se (i >= 0 e i < 3)
		    {
		        limpa()
		        escreva("== 4 - Cadastrar destino ==\n")
    		    escreva("Digite o destino ", i2 + 1, ": ")
    		    leia(Destino[i2])
    		    escreva("Digite o ID do destino ", i2 + 1, ": ")
    		    leia(IdsDestino[i2])
    		    i2++ 
    		    
		    } 
		    senao
		    {   
		        escreva("\nDesculpe! Máximo de cadastros para destinos atingido.\nVerifique novamente mais tarde!")
		        
		    }
		    pare 
		  caso 5:
		    limpa()
    		    escreva("== 2 - Destinos Cadastrados ==\n")
    		    para (inteiro index = 0; index < 3; index ++)
		    {
		        escreva("Nome: ", Destino[index], " - ID: ", IdsDestino[index],"\n")
		    }
		    pare
		    
		  caso 6: 
		    escreva("== 3 - Consultar destino por ID ==\n")
		    escreva("Digite o ID do destino a ser consultado: ")
		    leia(idConsulta)
		    para (inteiro index = 0; index < 3; index ++)
		    {
		        se (IdsDestino[index] == idConsulta)
    		        {
    		         escreva("\nNome: ", Destino[index], "\nID: ", IdsDestino[index],"\n")   
    		         pare
    		        }
    		    senao 
    		    {
    		        escreva("\nID inexistente.\n")    
    		    }
		    }
		    pare
		  
		  caso contrario: 
		    escreva("==== Obrigado por escolher a Bora Lá Viagens ====\n")
		    escreva("=== Nossa missão é oferecer o melhor pra você! ===\n")
		    
		} /* fim swich-case */
		  
		  
		} /* fim enquanto */
	}
}
