/*
 *    Copyright (C) 2016 Amit Shekhar
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.flatbuffer.flatmodel;// automatically generated, do not modify

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class People extends Table {
  public static People getRootAsPeople(ByteBuffer _bb) { return getRootAsPeople(_bb, new People()); }
  public static People getRootAsPeople(ByteBuffer _bb, People obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public People __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public String id() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer idAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public long index() { int o = __offset(6); return o != 0 ? bb.getLong(o + bb_pos) : 0; }
  public String guid() { int o = __offset(8); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer guidAsByteBuffer() { return __vector_as_bytebuffer(8, 1); }
  public String name() { int o = __offset(10); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer nameAsByteBuffer() { return __vector_as_bytebuffer(10, 1); }
  public String gender() { int o = __offset(12); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer genderAsByteBuffer() { return __vector_as_bytebuffer(12, 1); }
  public String company() { int o = __offset(14); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer companyAsByteBuffer() { return __vector_as_bytebuffer(14, 1); }
  public String email() { int o = __offset(16); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer emailAsByteBuffer() { return __vector_as_bytebuffer(16, 1); }
  public Friend friends(int j) { return friends(new Friend(), j); }
  public Friend friends(Friend obj, int j) { int o = __offset(18); return o != 0 ? obj.__init(__indirect(__vector(o) + j * 4), bb) : null; }
  public int friendsLength() { int o = __offset(18); return o != 0 ? __vector_len(o) : 0; }

  public static int createPeople(FlatBufferBuilder builder,
      int idOffset,
      long index,
      int guidOffset,
      int nameOffset,
      int genderOffset,
      int companyOffset,
      int emailOffset,
      int friendsOffset) {
    builder.startObject(8);
    People.addIndex(builder, index);
    People.addFriends(builder, friendsOffset);
    People.addEmail(builder, emailOffset);
    People.addCompany(builder, companyOffset);
    People.addGender(builder, genderOffset);
    People.addName(builder, nameOffset);
    People.addGuid(builder, guidOffset);
    People.addId(builder, idOffset);
    return People.endPeople(builder);
  }

  public static void startPeople(FlatBufferBuilder builder) { builder.startObject(8); }
  public static void addId(FlatBufferBuilder builder, int idOffset) { builder.addOffset(0, idOffset, 0); }
  public static void addIndex(FlatBufferBuilder builder, long index) { builder.addLong(1, index, 0); }
  public static void addGuid(FlatBufferBuilder builder, int guidOffset) { builder.addOffset(2, guidOffset, 0); }
  public static void addName(FlatBufferBuilder builder, int nameOffset) { builder.addOffset(3, nameOffset, 0); }
  public static void addGender(FlatBufferBuilder builder, int genderOffset) { builder.addOffset(4, genderOffset, 0); }
  public static void addCompany(FlatBufferBuilder builder, int companyOffset) { builder.addOffset(5, companyOffset, 0); }
  public static void addEmail(FlatBufferBuilder builder, int emailOffset) { builder.addOffset(6, emailOffset, 0); }
  public static void addFriends(FlatBufferBuilder builder, int friendsOffset) { builder.addOffset(7, friendsOffset, 0); }
  public static int createFriendsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startFriendsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endPeople(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
};

