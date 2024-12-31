def alternating_string_worth(binary_string, worth_list):
    n = len(binary_string)
    
    # Case 1: Pattern starts with '0'
    last_char = '0'
    removed_worth_1 = 0
    for i in range(n):
        if binary_string[i] != last_char:
            last_char = binary_string[i]
        else:
            removed_worth_1 += worth_list[i]

    # Case 2: Pattern starts with '1'
    last_char = '1'
    removed_worth_2 = 0
    for i in range(n):
        if binary_string[i] != last_char:
            last_char = binary_string[i]
        else:
            removed_worth_2 += worth_list[i]
    
    # We return the minimum of the removed worth for both cases
    return min(removed_worth_1, removed_worth_2)

# Reading input
binary_string = input().strip()
worth_list = list(map(int, input().split()))

# Output the result
print(alternating_string_worth(binary_string, worth_list))
