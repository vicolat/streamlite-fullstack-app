import streamlit as st

st.title("Streamlite Fullstack App")
st.write("Welcome to the frontend!")
st.write("This is connected to your backend once you add API calls.")

# Example input/output
name = st.text_input("Enter your name:")
if name:
    st.write(f"Hello, {name}!")