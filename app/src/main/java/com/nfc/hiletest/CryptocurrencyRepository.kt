package com.nfc.hiletest

interface CryptocurrencyRepository {
    fun getCryptoCurrency(): List<Cryptocurrency>
}