package com.hillel.lecture_11_12_13;

import com.hillel.lecture_11.homeMessEnumErrors.MyViber;
import com.hillel.lecture_11.homeMessEnumErrors.Telegram;
import com.hillel.lecture_11.homeMessEnumErrors.WhatsApp;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class UserMessengerTest {
    MyViber viber = new MyViber();
    Telegram telegram = new Telegram();
    WhatsApp whatsApp = new WhatsApp();

    @Test
    public void testConnectionViber() {
        assertEquals(viber.checkConnection(), true);
        viber.switchConnection(false);
        assertEquals(viber.checkConnection(), false);
    }

    @Test
    public void testConnectionTelegram() {
        assertEquals(telegram.checkConnection(), true);
        telegram.switchConnection(false);
        assertEquals(telegram.checkConnection(), false);
    }

    @Test
    public void testConnectionWhatsApp() {
        assertEquals(whatsApp.checkConnection(), true);
        whatsApp.switchConnection(false);
        assertEquals(whatsApp.checkConnection(), false);
    }


}
