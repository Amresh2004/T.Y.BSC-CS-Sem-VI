from mlxtend.preprocessing import TransactionEncoder
from mlxtend.frequent_patterns import apriori, association_rules
import pandas as pd

# Create the dataset
data = [
    ['Bread', 'Milk'],
    ['Bread', 'Diaper', 'Beer', 'Eggs'],
    ['Milk', 'Diaper', 'Beer', 'Cake'],
    ['Bread', 'Milk', 'Diaper', 'Beer'],
    ['Bread', 'Milk', 'Diaper', 'Coke']
]

# Convert categorical values into numeric format
te = TransactionEncoder()
te_ary = te.fit_transform(data)
df = pd.DataFrame(te_ary, columns=te.columns_)

# Apply Apriori algorithm with min_sup=2 (at least 2 transactions)
frequent_itemsets = apriori(df, min_support=2/len(df), use_colnames=True)

# Generate association rules
rules = association_rules(frequent_itemsets, metric="confidence", min_threshold=0.5)

# Extract support and confidence values
support_values = rules['support']
confidence_values = rules['confidence']

# Print frequent itemsets and association rules
print("Frequent Itemsets:")
print(frequent_itemsets)

print("\nAssociation Rules (Support & Confidence):")
print(rules[['antecedents', 'consequents', 'support', 'confidence']])
