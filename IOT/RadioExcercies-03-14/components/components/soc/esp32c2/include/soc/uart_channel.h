/*
 * SPDX-FileCopyrightText: 2020-2022 Espressif Systems (Shanghai) CO LTD
 *
 * SPDX-License-Identifier: Apache-2.0
 */

#ifndef _SOC_UART_CHANNEL_H
#define _SOC_UART_CHANNEL_H

//UART channels
#define UART_GPIO1_DIRECT_CHANNEL       UART_NUM_0
#define UART_NUM_0_TXD_DIRECT_GPIO_NUM  1
#define UART_GPIO3_DIRECT_CHANNEL       UART_NUM_0
#define UART_NUM_0_RXD_DIRECT_GPIO_NUM  3
#define UART_GPIO19_DIRECT_CHANNEL      UART_NUM_0
#define UART_NUM_0_CTS_DIRECT_GPIO_NUM  19
#define UART_GPIO22_DIRECT_CHANNEL      UART_NUM_0
#define UART_NUM_0_RTS_DIRECT_GPIO_NUM  22

#define UART_TXD_GPIO1_DIRECT_CHANNEL   UART_GPIO1_DIRECT_CHANNEL
#define UART_RXD_GPIO3_DIRECT_CHANNEL   UART_GPIO3_DIRECT_CHANNEL
#define UART_CTS_GPIO19_DIRECT_CHANNEL  UART_GPIO19_DIRECT_CHANNEL
#define UART_RTS_GPIO22_DIRECT_CHANNEL  UART_GPIO22_DIRECT_CHANNEL

#define UART_GPIO10_DIRECT_CHANNEL      UART_NUM_1
#define UART_NUM_1_TXD_DIRECT_GPIO_NUM  10
#define UART_GPIO9_DIRECT_CHANNEL       UART_NUM_1
#define UART_NUM_1_RXD_DIRECT_GPIO_NUM  9
#define UART_GPIO6_DIRECT_CHANNEL       UART_NUM_1
#define UART_NUM_1_CTS_DIRECT_GPIO_NUM  6
#define UART_GPIO11_DIRECT_CHANNEL      UART_NUM_1
#define UART_NUM_1_RTS_DIRECT_GPIO_NUM  11

#define UART_TXD_GPIO10_DIRECT_CHANNEL  UART_GPIO10_DIRECT_CHANNEL
#define UART_RXD_GPIO9_DIRECT_CHANNEL   UART_GPIO9_DIRECT_CHANNEL
#define UART_CTS_GPIO6_DIRECT_CHANNEL   UART_GPIO6_DIRECT_CHANNEL
#define UART_RTS_GPIO11_DIRECT_CHANNEL  UART_GPIO11_DIRECT_CHANNEL

#define UART_GPIO17_DIRECT_CHANNEL      UART_NUM_2
#define UART_NUM_2_TXD_DIRECT_GPIO_NUM  17
#define UART_GPIO16_DIRECT_CHANNEL      UART_NUM_2
#define UART_NUM_2_RXD_DIRECT_GPIO_NUM  16
#define UART_GPIO8_DIRECT_CHANNEL       UART_NUM_2
#define UART_NUM_2_CTS_DIRECT_GPIO_NUM  8
#define UART_GPIO7_DIRECT_CHANNEL       UART_NUM_2
#define UART_NUM_2_RTS_DIRECT_GPIO_NUM  7

#define UART_TXD_GPIO17_DIRECT_CHANNEL  UART_GPIO17_DIRECT_CHANNEL
#define UART_RXD_GPIO16_DIRECT_CHANNEL  UART_GPIO16_DIRECT_CHANNEL
#define UART_CTS_GPIO8_DIRECT_CHANNEL   UART_GPIO8_DIRECT_CHANNEL
#define UART_RTS_GPIO7_DIRECT_CHANNEL   UART_GPIO7_DIRECT_CHANNEL

#endif
