from mlxtend.preprocessing import TransactionEncoder
from mlxtend.frequent_patterns import apriori, association_rules
import pandas as pd

# Sample transactions data
transactions = [
    ['milk', 'bread', 'eggs'],
    ['bread', 'butter'],
    ['milk', 'bread', 'butter'],
    ['milk', 'eggs'],
    ['bread', 'butter'],
    ['milk', 'bread', 'butter'],
    ['milk', 'bread', 'butter', 'eggs'],
    ['milk', 'bread'],
    ['bread', 'butter', 'eggs']
]

# Convert transactions to one-hot encoded format
encoder = TransactionEncoder()
onehot = encoder.fit_transform(transactions)
df = pd.DataFrame(onehot, columns=encoder.columns_)

# Find frequent itemsets
frequent_itemsets = apriori(df, min_support=0.2, use_colnames=True)
print("Frequent Itemsets:")
print(frequent_itemsets)

# Generate association rules
rules = association_rules(frequent_itemsets, metric="confidence", min_threshold=0.5)
print("\nAssociation Rules:")
print(rules[['antecedents', 'consequents', 'support', 'confidence']])

# Extract support and confidence values
support_values = rules['support']
confidence_values = rules['confidence']

print("\nSupport Values:")
print(support_values)
print("\nConfidence Values:")
print(confidence_values)
