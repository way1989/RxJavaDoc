/**
 * created by jiang, 16/3/13
 * Copyright (c) 2016, jyuesong@gmail.com All Rights Reserved.
 * *                #                                                   #
 * #                       _oo0oo_                     #
 * #                      o8888888o                    #
 * #                      88" . "88                    #
 * #                      (| -_- |)                    #
 * #                      0\  =  /0                    #
 * #                    ___/`---'\___                  #
 * #                  .' \\|     |# '.                 #
 * #                 / \\|||  :  |||# \                #
 * #                / _||||| -:- |||||- \              #
 * #               |   | \\\  -  #/ |   |              #
 * #               | \_|  ''\---/''  |_/ |             #
 * #               \  .-\__  '-'  ___/-. /             #
 * #             ___'. .'  /--.--\  `. .'___           #
 * #          ."" '<  `.___\_<|>_/___.' >' "".         #
 * #         | | :  `- \`.;`\ _ /`;.`/ - ` : | |       #
 * #         \  \ `_.   \_ __\ /__ _/   .-` /  /       #
 * #     =====`-.____`.___ \_____/___.-`___.-'=====    #
 * #                       `=---='                     #
 * #     ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~   #
 * #                                                   #
 * #               佛祖保佑         永无BUG              #
 * #                                                   #
 */

package com.ape.rxjavadoc.util;

import com.ape.rxjavadoc.adapter.BaseHeaderAdapter;
import com.ape.rxjavadoc.entitiy.Operator;
import com.ape.rxjavadoc.entitiy.PinnedHeaderEntity;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by jiang on 16/3/13.
 */
public class DataUtils {
    private static final String COMPUTATION = "computation";
    private static final String DEFAULT = "默认线程";
    private static final String TRAMPOLINE = "trampoline";
    private static final String IMMEDIATE = "immediate";

    public static List<PinnedHeaderEntity<Operator>> getData() {
        List<PinnedHeaderEntity<Operator>> lists = new ArrayList<>();
        lists.add(new PinnedHeaderEntity<Operator>(null, BaseHeaderAdapter.TYPE_HEADER, "RxJava 2.x"));
        getRxJava2List(lists, "RxJava 2.x");
        lists.add(new PinnedHeaderEntity<Operator>(null, BaseHeaderAdapter.TYPE_HEADER, "RxJava 介绍"));
        getIntroduceList(lists, "RxJava 介绍");
        lists.add(new PinnedHeaderEntity<Operator>(null, BaseHeaderAdapter.TYPE_HEADER, "创建操作"));
        getCreatingList(lists, "创建操作");
        lists.add(new PinnedHeaderEntity<Operator>(null, BaseHeaderAdapter.TYPE_HEADER, "变换操作"));
        getTransformList(lists, "变换操作");
        lists.add(new PinnedHeaderEntity<Operator>(null, BaseHeaderAdapter.TYPE_HEADER, "过滤操作"));
        getFilterList(lists, "过滤操作");
        lists.add(new PinnedHeaderEntity<Operator>(null, BaseHeaderAdapter.TYPE_HEADER, "结合操作"));
        getCombinList(lists, "结合操作");
        lists.add(new PinnedHeaderEntity<Operator>(null, BaseHeaderAdapter.TYPE_HEADER, "错误处理"));
        getErrorList(lists, "错误处理");
        lists.add(new PinnedHeaderEntity<Operator>(null, BaseHeaderAdapter.TYPE_HEADER, "辅助操作"));
        getUtilityList(lists, "辅助操作");
        lists.add(new PinnedHeaderEntity<Operator>(null, BaseHeaderAdapter.TYPE_HEADER, "条件和布尔操作"));
        getConditionalList(lists, "条件和布尔操作");
        lists.add(new PinnedHeaderEntity<Operator>(null, BaseHeaderAdapter.TYPE_HEADER, "算术和聚合操作"));
        getMathList(lists, "算术和聚合操作");
        lists.add(new PinnedHeaderEntity<Operator>(null, BaseHeaderAdapter.TYPE_HEADER, "异步操作"));
        getSayncList(lists, "异步操作");
        lists.add(new PinnedHeaderEntity<Operator>(null, BaseHeaderAdapter.TYPE_HEADER, "连接操作"));
        getConnectList(lists, "连接操作");
        lists.add(new PinnedHeaderEntity<Operator>(null, BaseHeaderAdapter.TYPE_HEADER, "阻塞操作"));
        getBlockList(lists, "阻塞操作");
        lists.add(new PinnedHeaderEntity<Operator>(null, BaseHeaderAdapter.TYPE_HEADER, "字符串操作"));
        getStringList(lists, "字符串操作");
        lists.add(new PinnedHeaderEntity<Operator>(null, BaseHeaderAdapter.TYPE_HEADER, "其他的相关操作"));
        getOthersList(lists, "其他的相关操作");
        return lists;
    }

    private static void getRxJava2List(List<PinnedHeaderEntity<Operator>> operators, String pinnedHeaderName) {
        operators.add(new PinnedHeaderEntity<>(
                new Operator("RxJava2.x有什么不同", DEFAULT, "RxJava2.x与RxJava1.x的区别", CommonString.SPLASH_INDEX_URL, OperatorsUrl.R_2_INDEX),
                BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("Flowable", DEFAULT, "Flowable操作符的使用", CommonString.SPLASH_INDEX_URL, OperatorsUrl.R_2_FLOWABLE),
                BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("其他相关类", DEFAULT, "Single Completable Subject/Processor", CommonString.SPLASH_INDEX_URL, OperatorsUrl.R_2_OTHER),
                BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
    }


    private static void getOthersList(List<PinnedHeaderEntity<Operator>> operators, String pinnedHeaderName) {
        operators.add(new PinnedHeaderEntity<>(
                new Operator("实现自己的操作符", DEFAULT, "实现自己的操作符", CommonString.SPLASH_INDEX_URL, OperatorsUrl.OWN_OPERATE),
                BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("自定义插件", DEFAULT, "自定义插件", CommonString.SPLASH_INDEX_URL, OperatorsUrl.OWN_CHAJIAN),
                BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("Android模块", DEFAULT, "Android模块", CommonString.SPLASH_INDEX_URL, OperatorsUrl.ANDROID_MODULE),
                BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("错误处理", DEFAULT, "错误处理", CommonString.SPLASH_INDEX_URL, OperatorsUrl.ERROR_HANDLE),
                BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
    }


    private static void getStringList(List<PinnedHeaderEntity<Operator>> operators, String pinnedHeaderName) {
        operators.add(new PinnedHeaderEntity<>(
                new Operator("byLine()", DEFAULT, "将一个字符串的Observable转换为一个行序列的Observable，这个Observable将原来的序列当做流处理，然后按换行符分割", CommonString.byLine, OperatorsUrl.byLine), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("decode()", DEFAULT, "将一个多字节的字符流转换为一个Observable，它按字符边界发射字节数组", CommonString.decode, OperatorsUrl.decode), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("encode()", DEFAULT, "对一个发射字符串的Observable执行变换操作，变换后的Observable发射一个在原始字符串中表示多字节字符边界的字节数组", CommonString.encode, OperatorsUrl.encode), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("from()", DEFAULT, "将一个字符流或者Reader转换为一个发射字节数组或者字符串的Observable", CommonString.from_String, OperatorsUrl.from_String), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("join()", DEFAULT, "将一个发射字符串序列的Observable转换为一个发射单个字符串的Observable，后者用一个指定的字符串连接所有的字符串", CommonString.join, OperatorsUrl.join), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("split()", DEFAULT, "将一个发射字符串的Observable转换为另一个发射字符串的Observable，后者使用一个指定的正则表达式边界分割前者发射的所有字符串", CommonString.split, OperatorsUrl.split), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("stringConcat()", DEFAULT, "将一个发射字符串序列的Observable转换为一个发射单个字符串的Observable，后者连接前者发射的所有字符串", CommonString.stringConcat, OperatorsUrl.stringConcat), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
    }


    private static void getBlockList(List<PinnedHeaderEntity<Operator>> operators, String pinnedHeaderName) {
        operators.add(new PinnedHeaderEntity<>(
                new Operator("forEach()", DEFAULT, "对Observable发射的每一项数据调用一个方法，会阻塞直到Observable完成", CommonString.forEach, OperatorsUrl.forEach), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("first()", DEFAULT, "阻塞直到Observable发射了一个数据，然后返回第一项数据", CommonString.first, OperatorsUrl.first), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("firstOrDefault()", DEFAULT, "阻塞直到Observable发射了一个数据或者终止，返回第一项数据，或者返回默认值", CommonString.firstOrDefault, OperatorsUrl.firstOrDefault), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("last()", DEFAULT, "阻塞直到Observable终止，然后返回最后一项数据", CommonString.last, OperatorsUrl.last), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("lastOrDefault()", DEFAULT, "阻塞直到Observable终止，然后返回最后一项的数据，或者返回默认值()", CommonString.lastOrDefault, OperatorsUrl.lastOrDefault), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("mostRecent()", DEFAULT, "返回一个总是返回Observable最近发射的数据的iterable", CommonString.mostRecent, OperatorsUrl.mostRecent), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("next()", DEFAULT, "返回一个Iterable，会阻塞直到Observable发射了另一个值，然后返回那个值", CommonString.next, OperatorsUrl.next), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("single()", DEFAULT, " 如果Observable终止时只发射了一个值，返回那个值，否则抛出异常", CommonString.single, OperatorsUrl.single), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("singleOrDefault()", DEFAULT, "如果Observable终止时只发射了一个值，返回那个值，否则否好默认值", CommonString.singleOrDefault, OperatorsUrl.singleOrDefault), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("toFuture()", DEFAULT, "将Observable转换为一个Future", CommonString.toFuture, OperatorsUrl.toFuture), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("toIterable()", DEFAULT, "将一个发射数据序列的Observable转换为一个Iterable", CommonString.toIterable, OperatorsUrl.toIterable), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("getIterator()", DEFAULT, " 将一个发射数据序列的Observable转换为一个Iterator", CommonString.getIterator, OperatorsUrl.getIterator), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
    }

    private static void getConnectList(List<PinnedHeaderEntity<Operator>> operators, String pinnedHeaderName) {
        operators.add(new PinnedHeaderEntity<>(
                new Operator("connect()", DEFAULT, "指示一个可连接的Observable开始发射数据", CommonString.connect, OperatorsUrl.connect), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("publish()", DEFAULT, "将一个Observable转换为一个可连接的Observable", CommonString.publish, OperatorsUrl.publish), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("replay()", DEFAULT, "确保所有的订阅者看到相同的数据序列，即使它们在Observable开始发射数据之后才订阅", CommonString.replay, OperatorsUrl.replay), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("refCount()", DEFAULT, "让一个可连接的Observable表现得像一个普通的Observable", CommonString.refCount, OperatorsUrl.refCount), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
    }


    private static void getSayncList(List<PinnedHeaderEntity<Operator>> operators, String pinnedHeaderName) {
        operators.add(new PinnedHeaderEntity<>(
                new Operator("start()", DEFAULT, "创建一个Observable，它发射一个函数的返回值", CommonString.start, OperatorsUrl.start), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("toAsync() or asyncAction() or asyncFunc()", DEFAULT, " 将一个函数或者Action转换为已Observable，它执行这个函数并发射函数的返回值", CommonString.toAsync, OperatorsUrl.start), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("startFuture()", DEFAULT, "将一个返回Future的函数转换为一个Observable，它发射Future的返回值", CommonString.startFuture, OperatorsUrl.start), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("deferFuture()", DEFAULT, "将一个返回Observable的Future转换为一个Observable，但是并不尝试获取这个Future返回的Observable，直到有订阅者订阅它", CommonString.deferFuture, OperatorsUrl.start), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("forEachFuture()", DEFAULT, "传递Subscriber方法给一个Subscriber，但是同时表现得像一个Future一样阻塞直到它完成", CommonString.forEachFuture, OperatorsUrl.start), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("fromAction()", DEFAULT, "将一个Action转换为Observable，当一个订阅者订阅时，它执行这个action并发射它的返回值", CommonString.fromAction, OperatorsUrl.start), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("fromCallable()", DEFAULT, "将一个Callable转换为Observable，当一个订阅者订阅时，它执行这个Callable并发射Callable的返回值，或者发射异常", CommonString.fromCallable, OperatorsUrl.start), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("fromRunnable()", DEFAULT, "convert a Runnable into an Observable that invokes the runable and emits its result when a Subscriber subscribes将一个Runnable转换为Observable，当一个订阅者订阅时，它执行这个Runnable并发射Runnable的返回值", CommonString.fromRunnable, OperatorsUrl.start), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("runAsync()", DEFAULT, "返回一个StoppableObservable，它发射某个Scheduler上指定的Action生成的多个actions", CommonString.runAsync, OperatorsUrl.start), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
    }

    private static void getMathList(List<PinnedHeaderEntity<Operator>> operators, String pinnedHeaderName) {
        operators.add(new PinnedHeaderEntity<>(
                new Operator("rxjava-math模块", DEFAULT, "模块的操作符", CommonString.MATH, OperatorsUrl.MATH), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("concat()", DEFAULT, "顺序连接多个Observables", CommonString.concat, OperatorsUrl.concat), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("count() and countLong()", DEFAULT, "计算数据项的个数并发射结果", CommonString.count, OperatorsUrl.count), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("reduce()", DEFAULT, "对序列使用reduce()函数并发射对吼的结果", CommonString.reduce, OperatorsUrl.reduce), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("collect()", DEFAULT, "将原始Observable发射的数据放到一个单一的可变的数据结构中，然后返回一个发射这个数据结构的Observable", CommonString.collect, OperatorsUrl.collect), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("toList()", DEFAULT, "收集原始Observable发射的所有数据到一个列表，然后返回这个列表", CommonString.toList, OperatorsUrl.toList), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("toSortedList()", DEFAULT, "收集原始Observable发射的所有数据到一个有序列表，然后返回这个列表", CommonString.toSortedList, OperatorsUrl.toSortedList), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("toMap()", DEFAULT, "将序列数据转换为一个Map，Map的key是根据一个函数计算的", CommonString.toMap, OperatorsUrl.toMap), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("toMultiMap()", DEFAULT, "将序列数据转换为一个列表，同时也是一个Map，Map的key是根据一个函数计算的", CommonString.toMultiMap, OperatorsUrl.toMultiMap), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
    }

    private static void getConditionalList(List<PinnedHeaderEntity<Operator>> operators, String pinnedHeaderName) {
        operators.add(new PinnedHeaderEntity<>(
                new Operator("amb()", DEFAULT, "给定多个Observable，只让第一个发射数据的Observable发射全部数据", CommonString.amb, OperatorsUrl.amb), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("defaultIfEmpty()", DEFAULT, "发射来自原始Observable的数据，如果原始Observable没有发射数据，就发射一个默认数据", CommonString.defaultIfEmpty, OperatorsUrl.amb), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("doWhile()", DEFAULT, "发射原始Observable的数据序列，然后重复发射这个序列直到不满足这个条件为止", CommonString.doWhile, OperatorsUrl.amb), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("ifThen()", DEFAULT, "只有当某个条件为真时才发射原始Observable的数据序列，否则发射一个空的或默认的序列", CommonString.ifThen, OperatorsUrl.amb), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("skipUntil()", DEFAULT, "丢弃原始Observable发射的数据，直到第二个Observable发射了一个数据，然后发射原始Observable的剩余数据", CommonString.skipUntil, OperatorsUrl.amb), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("skipWhile()", DEFAULT, "丢弃原始Observable发射的数据，直到一个特定的条件为假，然后发射原始Observable剩余的数据", CommonString.skipWhile, OperatorsUrl.amb), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("switchCase()", DEFAULT, "基于一个计算结果，发射一个指定Observable的数据序列", CommonString.switchCase, OperatorsUrl.amb), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("takeUntil()", DEFAULT, "发射来自原始Observable的数据，直到第二个Observable发射了一个数据或一个通知", CommonString.takeUntil, OperatorsUrl.amb), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("takeWhile(),takeWhileWithIndex()", DEFAULT, "射原始Observable的数据，直到一个特定的条件为真，然后跳过剩余的数据", CommonString.takeWhile, OperatorsUrl.amb), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("whileDo()", DEFAULT, "if a condition is true, emit the source Observable's sequence and then repeat the sequence as long as the condition remains true如果满足一个条件，发射原始Observable的数据，然后重复发射直到不满足这个条件为止", CommonString.takeWhile, CommonString.GITHUB_URL), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("all()", DEFAULT, "判断是否所有的数据项都满足某个条件", CommonString.all, OperatorsUrl.BOOLEAN_ALL), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("contains()", DEFAULT, "判断Observable是否会发射一个指定的值", CommonString.contains, OperatorsUrl.BOOLEAN_ALL), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("exists(),isEmpty()", DEFAULT, "判断Observable是否发射了一个值", CommonString.exists, OperatorsUrl.BOOLEAN_ALL), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("sequenceEqual()", DEFAULT, " test the equality of the sequences emitted by two Observables判断两个Observables发射的序列是否相等", CommonString.sequenceEqual, OperatorsUrl.BOOLEAN_ALL), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
    }


    private static void getUtilityList(List<PinnedHeaderEntity<Operator>> operators, String pinnedHeaderName) {
        operators.add(new PinnedHeaderEntity<>(
                new Operator("Materialize()", DEFAULT, "将Observable转换成一个通知列表convert an Observable into a list of Notifications", CommonString.Materialize, OperatorsUrl.Materialize), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("Dematerialize()", DEFAULT, "将上面的结果逆转回一个Observable", CommonString.Dematerialize, OperatorsUrl.Dematerialize), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("Timestamp()", IMMEDIATE, "给Observable发射的每个数据项添加一个时间戳", CommonString.Timestamp, OperatorsUrl.Timestamp), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("Serialize()", DEFAULT, "强制Observable按次序发射数据并且要求功能是完好的", CommonString.Serialize, OperatorsUrl.Serialize), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("ObserveOn()", DEFAULT, "指定观察者观察Observable的调度器", CommonString.ObserveOn, OperatorsUrl.ObserveOn), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("SubscribeOn()", DEFAULT, "指定Observable执行任务的调度器", CommonString.SubscribeOn, OperatorsUrl.SubscribeOn), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("doOnEach()", DEFAULT, "注册一个动作，对Observable发射的每个数据项使用", CommonString.doOnEach, OperatorsUrl.doOnEach), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("doOnSubscribe()", DEFAULT, "注册一个动作，在观察者订阅时使用", CommonString.doOnSubscribe, OperatorsUrl.doOnSubscribe), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("doOnUnsubscribe()", DEFAULT, "注册一个动作，在观察者取消订阅时使用", CommonString.doOnUnsubscribe, OperatorsUrl.doOnUnsubscribe), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("doOnCompleted()", DEFAULT, "注册一个动作，对正常完成的Observable使用", CommonString.doOnCompleted, OperatorsUrl.doOnCompleted), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("doOnError()", DEFAULT, "注册一个动作，对Observable发射的每个数据项使用", CommonString.doOnError, OperatorsUrl.doOnError), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("doOnTerminate()", DEFAULT, "注册一个动作，对完成的Observable使用，无论是否发生错误", CommonString.doOnTerminate, OperatorsUrl.doOnTerminate), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("finallyDo()", DEFAULT, "注册一个动作，在Observable完成时使用", CommonString.finallyDo, OperatorsUrl.finallyDo), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("Delay()", DEFAULT, "延时发射Observable的结果", CommonString.Delay, OperatorsUrl.Delay), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("delaySubscription()", DEFAULT, "延时处理订阅请求", CommonString.delaySubscription, OperatorsUrl.delaySubscription), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("TimeInterval()", DEFAULT, "定期发射数据", CommonString.TimeInterval, OperatorsUrl.TimeInterval), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("Using()", DEFAULT, " 创建一个只在Observable生命周期存在的资源", CommonString.Using, OperatorsUrl.Using), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("single()", DEFAULT, " 强制返回单个数据，否则抛出异常", CommonString.First, OperatorsUrl.First), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("toFuture(), toIterable(), toList()", DEFAULT, "将Observable转换为其它对象或数据结构,只能用于BlockingObservable", CommonString.To, OperatorsUrl.To), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
    }


    private static void getErrorList(List<PinnedHeaderEntity<Operator>> operators, String pinnedHeaderName) {
        operators.add(new PinnedHeaderEntity<>(
                new Operator("onErrorResumeNext()", DEFAULT, "指示Observable在遇到错误时发射一个数据序列", CommonString.EMPTY, OperatorsUrl.ERROR), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("onErrorReturn()", DEFAULT, "指示Observable在遇到错误时发射一个特定的数据", CommonString.EMPTY, OperatorsUrl.ERROR), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("onExceptionResumeNext()", DEFAULT, "instructs an Observable to continue emitting items after it encounters an exception (but not another variety of throwable)指示Observable遇到错误时继续发射数据", CommonString.EMPTY, OperatorsUrl.ERROR), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("retry()", DEFAULT, "指示Observable遇到错误时重试", CommonString.RETRY, OperatorsUrl.RETRY), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("retryWhen()", DEFAULT, "指示Observable遇到错误时，将错误传递给另一个Observable来决定是否要重新给订阅这个Observable", CommonString.RETRYWHEN, OperatorsUrl.RETRY), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
    }


    private static void getCombinList(List<PinnedHeaderEntity<Operator>> operators, String pinnedHeaderName) {
        operators.add(new PinnedHeaderEntity<>(
                new Operator("startWith()", DEFAULT, "在数据序列的开头增加一项数据", CommonString.STARTWITH, OperatorsUrl.STARTWITH), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("merge()", DEFAULT, "将多个Observable合并为一个", CommonString.MERGE, OperatorsUrl.MERGE), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("mergeDelayError()", DEFAULT, "合并多个Observables，让没有错误的Observable都完成后再发射错误通知", CommonString.MERGEDELAY, OperatorsUrl.MERGEDELAY), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("zip()", DEFAULT, "使用一个函数组合多个Observable发射的数据集合，然后再发射这个结果", CommonString.ZIP, OperatorsUrl.ZIP), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("and(), then(), and when()", DEFAULT, "(rxjava-joins)通过模式和计划组合多个Observables发射的数据集合", CommonString.AND, OperatorsUrl.AND), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("combineLatest()", DEFAULT, "当两个Observables中的任何一个发射了一个数据时，通过一个指定的函数组合每个Observable发射的最新数据（一共两个数据），然后发射这个函数的结果", CommonString.COMBINLASTED, OperatorsUrl.COMBINLASTED), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("join() and groupJoin()", DEFAULT, "无论何时，如果一个Observable发射了一个数据项，只要在另一个Observable发射的数据项定义的时间窗口内，就将两个Observable发射的数据合并发射", CommonString.JOIN, OperatorsUrl.JOIN), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("switchOnNext()", DEFAULT, "将一个发射Observables的Observable转换成另一个Observable，后者发射这些Observables最近发射的数据", CommonString.SWITHONNEXT, OperatorsUrl.SWITHONNEXT), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
    }


    private static void getIntroduceList(List<PinnedHeaderEntity<Operator>> operators, String pinnedHeaderName) {
        operators.add(new PinnedHeaderEntity<>(
                new Operator("ReactiveX", DEFAULT, "什么是Rx，Rx的理念和优势", CommonString.SPLASH_INDEX_URL, OperatorsUrl.INTRODUCE), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("RxJava入门指南", DEFAULT, "RxJava入门指南", CommonString.SPLASH_INDEX_URL, OperatorsUrl.GUIDE_OPEN), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("RxJava使用示例", DEFAULT, "RxJava使用示例", CommonString.SPLASH_INDEX_URL, OperatorsUrl.SAMPLE_FIRST), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("Observables", DEFAULT, "简要介绍Observable的观察者模型", CommonString.OBSERVABLES, OperatorsUrl.OBSERVABLES), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("Single", DEFAULT, "一种特殊的只发射单个值的Observable", CommonString.SPLASH_INDEX_URL, OperatorsUrl.SINGLE), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("Subject", DEFAULT, "Observable和Observer的复合体，也是二者的桥梁", CommonString.SUBJECT, OperatorsUrl.SUBJECT), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("Scheduler", DEFAULT, "介绍了各种异步任务调度和默认调度器", CommonString.SPLASH_INDEX_URL, OperatorsUrl.SCHEDULE), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
    }

    private static void getCreatingList(List<PinnedHeaderEntity<Operator>> operators, String pinnedHeaderName) {

        operators.add(new PinnedHeaderEntity<>(
                new Operator("just()", DEFAULT, "将一个或多个对象转换成发射这个或这些对象的一个Observable", CommonString.JUST, OperatorsUrl.JUST), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("from()", DEFAULT, "将一个Iterable, 一个Future, 或者一个数组转换成一个Observable", CommonString.FROM, OperatorsUrl.FROM), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("repeat()", TRAMPOLINE, "创建一个重复发射指定数据或数据序列的Observable", CommonString.REPEAT, OperatorsUrl.REPEAT), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("repeatWhen()", TRAMPOLINE, "创建一个重复发射指定数据或数据序列的Observable，它依赖于另一个Observable发射的数据", CommonString.REPEAT_WHEN, OperatorsUrl.REPEAT), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("create()", DEFAULT, "使用一个函数从头创建一个Observable", CommonString.CREATE, OperatorsUrl.CREATE), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("defer()", DEFAULT, "只有当订阅者订阅才创建Observable；为每个订阅创建一个新的Observable", CommonString.DEFER, OperatorsUrl.DEFER), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("range()", DEFAULT, "创建一个发射指定范围的整数序列的Observable", CommonString.RANGE, OperatorsUrl.RANGE), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("interval()", COMPUTATION, "创建一个按照给定的时间间隔发射整数序列的Observable", CommonString.INTERVAL, OperatorsUrl.INTERVAL), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("timer()", COMPUTATION, "创建一个按照给定的时间间隔发射整数序列的Observable", CommonString.TIMER, OperatorsUrl.TIMER), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("empty()", DEFAULT, "创建一个什么都不做直接通知完成的Observable", CommonString.EMPTY, OperatorsUrl.EMPTY), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("error()", DEFAULT, "创建一个什么都不做直接通知错误的Observable", CommonString.EMPTY, OperatorsUrl.EMPTY), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("never()", DEFAULT, "创建一个不发射任何数据的Observable", CommonString.EMPTY, OperatorsUrl.EMPTY), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
    }

    private static void getTransformList(List<PinnedHeaderEntity<Operator>> operators, String pinnedHeaderName) {
        operators.add(new PinnedHeaderEntity<>(
                new Operator("map()", DEFAULT, "对序列的每一项都应用一个函数来变换Observable发射的数据序列", CommonString.MAP, OperatorsUrl.MAP), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("flatMap()", DEFAULT, "将Observable发射的数据集合变换为Observables集合，然后将这些Observable发射的数据平坦化的放进一个单独的Observable", CommonString.FLATMAP, OperatorsUrl.FLATMAP), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("concatMap()", DEFAULT, "将Observable发射的数据集合变换为Observables集合，然后将这些Observable发射的数据平坦化的放进一个单独的Observable", CommonString.CONTACTMAP, OperatorsUrl.CONTACTMAP), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("switchMap()", DEFAULT, "将Observable发射的数据集合变换为Observables集合，然后只发射这些Observables最近发射的数据", CommonString.SWITCHMAP, OperatorsUrl.SWITCHMAP), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("scan()", DEFAULT, "对Observable发射的每一项数据应用一个函数，然后按顺序依次发射每一个值", CommonString.SCAN, OperatorsUrl.SCAN), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("groupBy()", DEFAULT, "将Observable分拆为Observable集合，将原始Observable发射的数据按Key分组，每一个Observable发射一组不同的数据", CommonString.GROUPBY, OperatorsUrl.GROUPBY), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("buffer()", COMPUTATION, "它定期从Observable收集数据到一个集合，然后把这些数据集合打包发射，而不是一次发射一个", CommonString.BUFFER, OperatorsUrl.BUFFER), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("window()", COMPUTATION, "定期将来自Observable的数据分拆成一些Observable窗口，然后发射这些窗口，而不是每次发射一项", CommonString.WINDOW, OperatorsUrl.WINDOW), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("cast()", DEFAULT, "在发射之前强制将Observable发射的所有数据转换为指定类型", CommonString.CAST, OperatorsUrl.CAST), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
    }

    private static void getFilterList(List<PinnedHeaderEntity<Operator>> operators, String pinnedHeaderName) {
        operators.add(new PinnedHeaderEntity<>(
                new Operator("filter()", DEFAULT, "过滤数据", CommonString.FILTER, OperatorsUrl.FILTER), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("takeLast()", DEFAULT, "只发射最后的N项数据", CommonString.TAKE_LAST, OperatorsUrl.TAKE_LAST), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("last()", DEFAULT, "只发射最后的一项数据", CommonString.LAST, OperatorsUrl.LAST), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("lastOrDefault()", DEFAULT, "只发射最后的一项数据，如果Observable为空就发射默认值", CommonString.LAST_OR_DEFAULT, OperatorsUrl.LAST_OR_DEFAULT), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("takeLastBuffer()", DEFAULT, "将最后的N项数据当做单个数据发射", CommonString.TAKE_LAST_BUFFER, OperatorsUrl.TAKE_LAST_BUFFER), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("skip()", DEFAULT, "跳过开始的N项数据", CommonString.SKIP, OperatorsUrl.SKIP), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("skipLast()", DEFAULT, "跳过最后的N项数据", CommonString.SKIP_LAST, OperatorsUrl.SKIP_LAST), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("take()", DEFAULT, "只发射开始的N项数据", CommonString.TAKE, OperatorsUrl.TAKE), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("first() and takeFirst()", DEFAULT, "只发射第一项数据，或者满足某种条件的第一项数据", CommonString.FIRST, OperatorsUrl.FIRST), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("firstOrDefault()", DEFAULT, "只发射第一项数据，如果Observable为空就发射默认值", CommonString.FIRST_DEFAULT, OperatorsUrl.FIRST_DEFAULT), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("elementAt()", DEFAULT, "发射第N项数据", CommonString.ELEMENT_AT, OperatorsUrl.ELEMENT_AT), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("elementAtOrDefault()", DEFAULT, "发射第N项数据，如果Observable数据少于N项就发射默认值", CommonString.ELEMENT_DEFAULT, OperatorsUrl.ELEMENT_DEFAULT), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("sample() or throttleLast()", DEFAULT, "定期发射Observable最近的数据", CommonString.SAMPLE, OperatorsUrl.SAMPLE), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("throttleFirst()", COMPUTATION, "定期发射Observable发射的第一项数据", CommonString.THROLFIRST, OperatorsUrl.THROLFIRST), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("throttleWithTimeout() or debounce()", DEFAULT, "只有当Observable在指定的时间后还没有发射数据时，才发射一个数据", CommonString.DEBOUND, OperatorsUrl.DEBOUND), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("timeout()", "immediate", "如果在一个指定的时间段后还没发射数据，就发射一个异常", CommonString.TIMEOUT, OperatorsUrl.TIMEOUT), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("distinct()", DEFAULT, "过滤掉重复数据", CommonString.DISTINCT, OperatorsUrl.DISTINCT), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("distinctUntilChanged()", DEFAULT, "过滤掉连续重复的数据", CommonString.UNTILCHANGED, OperatorsUrl.UNTILCHANGED), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("ofType()", DEFAULT, "只发射指定类型的数据", CommonString.OF_TYPE, OperatorsUrl.OF_TYPE), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
        operators.add(new PinnedHeaderEntity<>(
                new Operator("ignoreElements()", DEFAULT, "丢弃所有的正常数据，只发射错误或完成通知", CommonString.IGNORE_ELEMENT, OperatorsUrl.IGNORE_ELEMENT), BaseHeaderAdapter.TYPE_DATA, pinnedHeaderName));
    }

}
