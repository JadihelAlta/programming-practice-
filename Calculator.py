print("Calculadora")
print("1. Suma")
print("2. Multiplicacion")
print("3. Resta")
print("4. Division")
print("5. Salir")

opcion = int(input("Elige una opcion: "))

if opcion == 5:
    print("Salir")

elif opcion >= 1 and opcion <= 4:

    num1 = int(input("Dame el primer numero: "))
    num2 = int(input("Dame el segundo numero: "))

    if opcion == 1:
        print("El resultado de la suma es", num1 + num2)

    elif opcion == 2:
        print("El resultado de la multiplicacion es", num1 * num2)

    elif opcion == 3:
        print("El resultado de la resta es", num1 - num2)

    elif opcion == 4:
        print("El resultado de la division es", num1 / num2)

else:
    print("Opcion no valida")

print("Programa con exito")