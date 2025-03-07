import pandas as pd
from mlxtend.preprocessing import TransactionEncoder
from mlxtend.frequent_patterns import apriori, association_rules

# Step 1: Read the dataset
file_path = r"C:\Users\amres\Downloads\Market_Basket_Optimisation.csv"
df = pd.read_csv(file_path, header=None)  # No headers in market basket data

# Step 2: Preprocess the data
df.dropna(inplace=True)

# Convert transaction data to list of lists
transactions = df.apply(lambda x: x.dropna().tolist(), axis=1).tolist()

# Step 3: Apply one-hot encoding
te = TransactionEncoder()
onehot = te.fit_transform(transactions)
df_encoded = pd.DataFrame(onehot, columns=te.columns_)

# Step 4: Apply Apriori algorithm
frequent_itemsets = apriori(df_encoded, min_support=0.1, use_colnames=True)

# Step 5: Generate association rules
rules = association_rules(frequent_itemsets, metric="confidence", min_threshold=0.5)

# Extract support and confidence values
support_values = rules['support']
confidence_values = rules['confidence']

# Display results
print("Frequent Itemsets:")
print(frequent_itemsets)

print("\nAssociation Rules (Confidence Values):")
print(confidence_values)
