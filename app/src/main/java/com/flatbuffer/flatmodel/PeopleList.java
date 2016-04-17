package com.flatbuffer.flatmodel;// automatically generated, do not modify

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class PeopleList extends Table {
  public static PeopleList getRootAsPeopleList(ByteBuffer _bb) { return getRootAsPeopleList(_bb, new PeopleList()); }
  public static PeopleList getRootAsPeopleList(ByteBuffer _bb, PeopleList obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public PeopleList __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public People peoples(int j) { return peoples(new People(), j); }
  public People peoples(People obj, int j) { int o = __offset(4); return o != 0 ? obj.__init(__indirect(__vector(o) + j * 4), bb) : null; }
  public int peoplesLength() { int o = __offset(4); return o != 0 ? __vector_len(o) : 0; }

  public static int createPeopleList(FlatBufferBuilder builder,
      int peoplesOffset) {
    builder.startObject(1);
    PeopleList.addPeoples(builder, peoplesOffset);
    return PeopleList.endPeopleList(builder);
  }

  public static void startPeopleList(FlatBufferBuilder builder) { builder.startObject(1); }
  public static void addPeoples(FlatBufferBuilder builder, int peoplesOffset) { builder.addOffset(0, peoplesOffset, 0); }
  public static int createPeoplesVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startPeoplesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endPeopleList(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
  public static void finishPeopleListBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
};

