/*
 * Copyright (c) 2016-2021 Michael Zhang <yidongnan@gmail.com>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 * documentation files (the "Software"), to deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the
 * Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR
 * OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.grpc.spring.server.service;

import com.grpc.spring.api.order.GetOrderReply;
import com.grpc.spring.api.order.GetOrderRequest;
import com.grpc.spring.api.order.OrderServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Value;

import java.util.Random;

/**
 * 订单服务接口实现
 */
@GrpcService
public class GrpcOrderService extends OrderServiceGrpc.OrderServiceImplBase {

    @Value("${server.port}")
    private String serverPort;

    @Override
    public void getOrderInfo(GetOrderRequest request, StreamObserver<GetOrderReply> responseObserver) {
        GetOrderReply reply =GetOrderReply.newBuilder().setOrderNo(request.getOrderNo())
                .setAddress("广东省深圳市,端口号" + serverPort)
                .setUserName("tester")
                .setPrice(System.currentTimeMillis())
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}
