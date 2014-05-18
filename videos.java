// ORM class for table 'videos'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Sat May 17 16:50:52 PDT 2014
// For connector: org.apache.sqoop.manager.PostgresqlManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class videos extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private String vid;
  public String get_vid() {
    return vid;
  }
  public void set_vid(String vid) {
    this.vid = vid;
  }
  public videos with_vid(String vid) {
    this.vid = vid;
    return this;
  }
  private String etag;
  public String get_etag() {
    return etag;
  }
  public void set_etag(String etag) {
    this.etag = etag;
  }
  public videos with_etag(String etag) {
    this.etag = etag;
    return this;
  }
  private java.sql.Timestamp created_at;
  public java.sql.Timestamp get_created_at() {
    return created_at;
  }
  public void set_created_at(java.sql.Timestamp created_at) {
    this.created_at = created_at;
  }
  public videos with_created_at(java.sql.Timestamp created_at) {
    this.created_at = created_at;
    return this;
  }
  private String channelid;
  public String get_channelid() {
    return channelid;
  }
  public void set_channelid(String channelid) {
    this.channelid = channelid;
  }
  public videos with_channelid(String channelid) {
    this.channelid = channelid;
    return this;
  }
  private String thumbnailsdefault;
  public String get_thumbnailsdefault() {
    return thumbnailsdefault;
  }
  public void set_thumbnailsdefault(String thumbnailsdefault) {
    this.thumbnailsdefault = thumbnailsdefault;
  }
  public videos with_thumbnailsdefault(String thumbnailsdefault) {
    this.thumbnailsdefault = thumbnailsdefault;
    return this;
  }
  private String thumbnailsmedium;
  public String get_thumbnailsmedium() {
    return thumbnailsmedium;
  }
  public void set_thumbnailsmedium(String thumbnailsmedium) {
    this.thumbnailsmedium = thumbnailsmedium;
  }
  public videos with_thumbnailsmedium(String thumbnailsmedium) {
    this.thumbnailsmedium = thumbnailsmedium;
    return this;
  }
  private String thumbnailshigh;
  public String get_thumbnailshigh() {
    return thumbnailshigh;
  }
  public void set_thumbnailshigh(String thumbnailshigh) {
    this.thumbnailshigh = thumbnailshigh;
  }
  public videos with_thumbnailshigh(String thumbnailshigh) {
    this.thumbnailshigh = thumbnailshigh;
    return this;
  }
  private String thumbnailsstandard;
  public String get_thumbnailsstandard() {
    return thumbnailsstandard;
  }
  public void set_thumbnailsstandard(String thumbnailsstandard) {
    this.thumbnailsstandard = thumbnailsstandard;
  }
  public videos with_thumbnailsstandard(String thumbnailsstandard) {
    this.thumbnailsstandard = thumbnailsstandard;
    return this;
  }
  private String channeltitle;
  public String get_channeltitle() {
    return channeltitle;
  }
  public void set_channeltitle(String channeltitle) {
    this.channeltitle = channeltitle;
  }
  public videos with_channeltitle(String channeltitle) {
    this.channeltitle = channeltitle;
    return this;
  }
  private Integer youtubecategoryid;
  public Integer get_youtubecategoryid() {
    return youtubecategoryid;
  }
  public void set_youtubecategoryid(Integer youtubecategoryid) {
    this.youtubecategoryid = youtubecategoryid;
  }
  public videos with_youtubecategoryid(Integer youtubecategoryid) {
    this.youtubecategoryid = youtubecategoryid;
    return this;
  }
  private Integer viewcount;
  public Integer get_viewcount() {
    return viewcount;
  }
  public void set_viewcount(Integer viewcount) {
    this.viewcount = viewcount;
  }
  public videos with_viewcount(Integer viewcount) {
    this.viewcount = viewcount;
    return this;
  }
  private Integer likecount;
  public Integer get_likecount() {
    return likecount;
  }
  public void set_likecount(Integer likecount) {
    this.likecount = likecount;
  }
  public videos with_likecount(Integer likecount) {
    this.likecount = likecount;
    return this;
  }
  private Integer dislikecount;
  public Integer get_dislikecount() {
    return dislikecount;
  }
  public void set_dislikecount(Integer dislikecount) {
    this.dislikecount = dislikecount;
  }
  public videos with_dislikecount(Integer dislikecount) {
    this.dislikecount = dislikecount;
    return this;
  }
  private Integer favoritecount;
  public Integer get_favoritecount() {
    return favoritecount;
  }
  public void set_favoritecount(Integer favoritecount) {
    this.favoritecount = favoritecount;
  }
  public videos with_favoritecount(Integer favoritecount) {
    this.favoritecount = favoritecount;
    return this;
  }
  private Integer commentcount;
  public Integer get_commentcount() {
    return commentcount;
  }
  public void set_commentcount(Integer commentcount) {
    this.commentcount = commentcount;
  }
  public videos with_commentcount(Integer commentcount) {
    this.commentcount = commentcount;
    return this;
  }
  private String embedhtml;
  public String get_embedhtml() {
    return embedhtml;
  }
  public void set_embedhtml(String embedhtml) {
    this.embedhtml = embedhtml;
  }
  public videos with_embedhtml(String embedhtml) {
    this.embedhtml = embedhtml;
    return this;
  }
  private String title;
  public String get_title() {
    return title;
  }
  public void set_title(String title) {
    this.title = title;
  }
  public videos with_title(String title) {
    this.title = title;
    return this;
  }
  private String description;
  public String get_description() {
    return description;
  }
  public void set_description(String description) {
    this.description = description;
  }
  public videos with_description(String description) {
    this.description = description;
    return this;
  }
  private String category;
  public String get_category() {
    return category;
  }
  public void set_category(String category) {
    this.category = category;
  }
  public videos with_category(String category) {
    this.category = category;
    return this;
  }
  private String dancer;
  public String get_dancer() {
    return dancer;
  }
  public void set_dancer(String dancer) {
    this.dancer = dancer;
  }
  public videos with_dancer(String dancer) {
    this.dancer = dancer;
    return this;
  }
  private Double heuristic;
  public Double get_heuristic() {
    return heuristic;
  }
  public void set_heuristic(Double heuristic) {
    this.heuristic = heuristic;
  }
  public videos with_heuristic(Double heuristic) {
    this.heuristic = heuristic;
    return this;
  }
  private Integer relevance;
  public Integer get_relevance() {
    return relevance;
  }
  public void set_relevance(Integer relevance) {
    this.relevance = relevance;
  }
  public videos with_relevance(Integer relevance) {
    this.relevance = relevance;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof videos)) {
      return false;
    }
    videos that = (videos) o;
    boolean equal = true;
    equal = equal && (this.vid == null ? that.vid == null : this.vid.equals(that.vid));
    equal = equal && (this.etag == null ? that.etag == null : this.etag.equals(that.etag));
    equal = equal && (this.created_at == null ? that.created_at == null : this.created_at.equals(that.created_at));
    equal = equal && (this.channelid == null ? that.channelid == null : this.channelid.equals(that.channelid));
    equal = equal && (this.thumbnailsdefault == null ? that.thumbnailsdefault == null : this.thumbnailsdefault.equals(that.thumbnailsdefault));
    equal = equal && (this.thumbnailsmedium == null ? that.thumbnailsmedium == null : this.thumbnailsmedium.equals(that.thumbnailsmedium));
    equal = equal && (this.thumbnailshigh == null ? that.thumbnailshigh == null : this.thumbnailshigh.equals(that.thumbnailshigh));
    equal = equal && (this.thumbnailsstandard == null ? that.thumbnailsstandard == null : this.thumbnailsstandard.equals(that.thumbnailsstandard));
    equal = equal && (this.channeltitle == null ? that.channeltitle == null : this.channeltitle.equals(that.channeltitle));
    equal = equal && (this.youtubecategoryid == null ? that.youtubecategoryid == null : this.youtubecategoryid.equals(that.youtubecategoryid));
    equal = equal && (this.viewcount == null ? that.viewcount == null : this.viewcount.equals(that.viewcount));
    equal = equal && (this.likecount == null ? that.likecount == null : this.likecount.equals(that.likecount));
    equal = equal && (this.dislikecount == null ? that.dislikecount == null : this.dislikecount.equals(that.dislikecount));
    equal = equal && (this.favoritecount == null ? that.favoritecount == null : this.favoritecount.equals(that.favoritecount));
    equal = equal && (this.commentcount == null ? that.commentcount == null : this.commentcount.equals(that.commentcount));
    equal = equal && (this.embedhtml == null ? that.embedhtml == null : this.embedhtml.equals(that.embedhtml));
    equal = equal && (this.title == null ? that.title == null : this.title.equals(that.title));
    equal = equal && (this.description == null ? that.description == null : this.description.equals(that.description));
    equal = equal && (this.category == null ? that.category == null : this.category.equals(that.category));
    equal = equal && (this.dancer == null ? that.dancer == null : this.dancer.equals(that.dancer));
    equal = equal && (this.heuristic == null ? that.heuristic == null : this.heuristic.equals(that.heuristic));
    equal = equal && (this.relevance == null ? that.relevance == null : this.relevance.equals(that.relevance));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.vid = JdbcWritableBridge.readString(1, __dbResults);
    this.etag = JdbcWritableBridge.readString(2, __dbResults);
    this.created_at = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.channelid = JdbcWritableBridge.readString(4, __dbResults);
    this.thumbnailsdefault = JdbcWritableBridge.readString(5, __dbResults);
    this.thumbnailsmedium = JdbcWritableBridge.readString(6, __dbResults);
    this.thumbnailshigh = JdbcWritableBridge.readString(7, __dbResults);
    this.thumbnailsstandard = JdbcWritableBridge.readString(8, __dbResults);
    this.channeltitle = JdbcWritableBridge.readString(9, __dbResults);
    this.youtubecategoryid = JdbcWritableBridge.readInteger(10, __dbResults);
    this.viewcount = JdbcWritableBridge.readInteger(11, __dbResults);
    this.likecount = JdbcWritableBridge.readInteger(12, __dbResults);
    this.dislikecount = JdbcWritableBridge.readInteger(13, __dbResults);
    this.favoritecount = JdbcWritableBridge.readInteger(14, __dbResults);
    this.commentcount = JdbcWritableBridge.readInteger(15, __dbResults);
    this.embedhtml = JdbcWritableBridge.readString(16, __dbResults);
    this.title = JdbcWritableBridge.readString(17, __dbResults);
    this.description = JdbcWritableBridge.readString(18, __dbResults);
    this.category = JdbcWritableBridge.readString(19, __dbResults);
    this.dancer = JdbcWritableBridge.readString(20, __dbResults);
    this.heuristic = JdbcWritableBridge.readDouble(21, __dbResults);
    this.relevance = JdbcWritableBridge.readInteger(22, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(vid, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(etag, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(created_at, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(channelid, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(thumbnailsdefault, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(thumbnailsmedium, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(thumbnailshigh, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(thumbnailsstandard, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(channeltitle, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(youtubecategoryid, 10 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(viewcount, 11 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(likecount, 12 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(dislikecount, 13 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(favoritecount, 14 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(commentcount, 15 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(embedhtml, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(title, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(description, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(category, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(dancer, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDouble(heuristic, 21 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeInteger(relevance, 22 + __off, 4, __dbStmt);
    return 22;
  }
  public void readFields(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.vid = null;
    } else {
    this.vid = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.etag = null;
    } else {
    this.etag = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.created_at = null;
    } else {
    this.created_at = new Timestamp(__dataIn.readLong());
    this.created_at.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.channelid = null;
    } else {
    this.channelid = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.thumbnailsdefault = null;
    } else {
    this.thumbnailsdefault = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.thumbnailsmedium = null;
    } else {
    this.thumbnailsmedium = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.thumbnailshigh = null;
    } else {
    this.thumbnailshigh = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.thumbnailsstandard = null;
    } else {
    this.thumbnailsstandard = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.channeltitle = null;
    } else {
    this.channeltitle = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.youtubecategoryid = null;
    } else {
    this.youtubecategoryid = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.viewcount = null;
    } else {
    this.viewcount = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.likecount = null;
    } else {
    this.likecount = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.dislikecount = null;
    } else {
    this.dislikecount = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.favoritecount = null;
    } else {
    this.favoritecount = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.commentcount = null;
    } else {
    this.commentcount = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.embedhtml = null;
    } else {
    this.embedhtml = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.title = null;
    } else {
    this.title = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.description = null;
    } else {
    this.description = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.category = null;
    } else {
    this.category = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.dancer = null;
    } else {
    this.dancer = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.heuristic = null;
    } else {
    this.heuristic = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.relevance = null;
    } else {
    this.relevance = Integer.valueOf(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.vid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, vid);
    }
    if (null == this.etag) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, etag);
    }
    if (null == this.created_at) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.created_at.getTime());
    __dataOut.writeInt(this.created_at.getNanos());
    }
    if (null == this.channelid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, channelid);
    }
    if (null == this.thumbnailsdefault) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, thumbnailsdefault);
    }
    if (null == this.thumbnailsmedium) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, thumbnailsmedium);
    }
    if (null == this.thumbnailshigh) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, thumbnailshigh);
    }
    if (null == this.thumbnailsstandard) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, thumbnailsstandard);
    }
    if (null == this.channeltitle) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, channeltitle);
    }
    if (null == this.youtubecategoryid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.youtubecategoryid);
    }
    if (null == this.viewcount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.viewcount);
    }
    if (null == this.likecount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.likecount);
    }
    if (null == this.dislikecount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.dislikecount);
    }
    if (null == this.favoritecount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.favoritecount);
    }
    if (null == this.commentcount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.commentcount);
    }
    if (null == this.embedhtml) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, embedhtml);
    }
    if (null == this.title) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, title);
    }
    if (null == this.description) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, description);
    }
    if (null == this.category) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, category);
    }
    if (null == this.dancer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, dancer);
    }
    if (null == this.heuristic) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.heuristic);
    }
    if (null == this.relevance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.relevance);
    }
  }
  private final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(vid==null?"null":vid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(etag==null?"null":etag, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(created_at==null?"null":"" + created_at, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(channelid==null?"null":channelid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(thumbnailsdefault==null?"null":thumbnailsdefault, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(thumbnailsmedium==null?"null":thumbnailsmedium, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(thumbnailshigh==null?"null":thumbnailshigh, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(thumbnailsstandard==null?"null":thumbnailsstandard, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(channeltitle==null?"null":channeltitle, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(youtubecategoryid==null?"null":"" + youtubecategoryid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(viewcount==null?"null":"" + viewcount, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(likecount==null?"null":"" + likecount, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(dislikecount==null?"null":"" + dislikecount, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(favoritecount==null?"null":"" + favoritecount, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(commentcount==null?"null":"" + commentcount, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(embedhtml==null?"null":embedhtml, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(title==null?"null":title, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(description==null?"null":description, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(category==null?"null":category, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(dancer==null?"null":dancer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(heuristic==null?"null":"" + heuristic, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(relevance==null?"null":"" + relevance, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  private final DelimiterSet __inputDelimiters = new DelimiterSet((char) 9, (char) 10, (char) 0, (char) 13, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str;
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.vid = null; } else {
      this.vid = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.etag = null; } else {
      this.etag = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.created_at = null; } else {
      this.created_at = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.channelid = null; } else {
      this.channelid = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.thumbnailsdefault = null; } else {
      this.thumbnailsdefault = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.thumbnailsmedium = null; } else {
      this.thumbnailsmedium = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.thumbnailshigh = null; } else {
      this.thumbnailshigh = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.thumbnailsstandard = null; } else {
      this.thumbnailsstandard = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.channeltitle = null; } else {
      this.channeltitle = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.youtubecategoryid = null; } else {
      this.youtubecategoryid = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.viewcount = null; } else {
      this.viewcount = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.likecount = null; } else {
      this.likecount = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.dislikecount = null; } else {
      this.dislikecount = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.favoritecount = null; } else {
      this.favoritecount = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.commentcount = null; } else {
      this.commentcount = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.embedhtml = null; } else {
      this.embedhtml = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.title = null; } else {
      this.title = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.description = null; } else {
      this.description = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.category = null; } else {
      this.category = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.dancer = null; } else {
      this.dancer = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.heuristic = null; } else {
      this.heuristic = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.relevance = null; } else {
      this.relevance = Integer.valueOf(__cur_str);
    }

  }

  public Object clone() throws CloneNotSupportedException {
    videos o = (videos) super.clone();
    o.created_at = (o.created_at != null) ? (java.sql.Timestamp) o.created_at.clone() : null;
    return o;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("vid", this.vid);
    __sqoop$field_map.put("etag", this.etag);
    __sqoop$field_map.put("created_at", this.created_at);
    __sqoop$field_map.put("channelid", this.channelid);
    __sqoop$field_map.put("thumbnailsdefault", this.thumbnailsdefault);
    __sqoop$field_map.put("thumbnailsmedium", this.thumbnailsmedium);
    __sqoop$field_map.put("thumbnailshigh", this.thumbnailshigh);
    __sqoop$field_map.put("thumbnailsstandard", this.thumbnailsstandard);
    __sqoop$field_map.put("channeltitle", this.channeltitle);
    __sqoop$field_map.put("youtubecategoryid", this.youtubecategoryid);
    __sqoop$field_map.put("viewcount", this.viewcount);
    __sqoop$field_map.put("likecount", this.likecount);
    __sqoop$field_map.put("dislikecount", this.dislikecount);
    __sqoop$field_map.put("favoritecount", this.favoritecount);
    __sqoop$field_map.put("commentcount", this.commentcount);
    __sqoop$field_map.put("embedhtml", this.embedhtml);
    __sqoop$field_map.put("title", this.title);
    __sqoop$field_map.put("description", this.description);
    __sqoop$field_map.put("category", this.category);
    __sqoop$field_map.put("dancer", this.dancer);
    __sqoop$field_map.put("heuristic", this.heuristic);
    __sqoop$field_map.put("relevance", this.relevance);
    return __sqoop$field_map;
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("vid".equals(__fieldName)) {
      this.vid = (String) __fieldVal;
    }
    else    if ("etag".equals(__fieldName)) {
      this.etag = (String) __fieldVal;
    }
    else    if ("created_at".equals(__fieldName)) {
      this.created_at = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("channelid".equals(__fieldName)) {
      this.channelid = (String) __fieldVal;
    }
    else    if ("thumbnailsdefault".equals(__fieldName)) {
      this.thumbnailsdefault = (String) __fieldVal;
    }
    else    if ("thumbnailsmedium".equals(__fieldName)) {
      this.thumbnailsmedium = (String) __fieldVal;
    }
    else    if ("thumbnailshigh".equals(__fieldName)) {
      this.thumbnailshigh = (String) __fieldVal;
    }
    else    if ("thumbnailsstandard".equals(__fieldName)) {
      this.thumbnailsstandard = (String) __fieldVal;
    }
    else    if ("channeltitle".equals(__fieldName)) {
      this.channeltitle = (String) __fieldVal;
    }
    else    if ("youtubecategoryid".equals(__fieldName)) {
      this.youtubecategoryid = (Integer) __fieldVal;
    }
    else    if ("viewcount".equals(__fieldName)) {
      this.viewcount = (Integer) __fieldVal;
    }
    else    if ("likecount".equals(__fieldName)) {
      this.likecount = (Integer) __fieldVal;
    }
    else    if ("dislikecount".equals(__fieldName)) {
      this.dislikecount = (Integer) __fieldVal;
    }
    else    if ("favoritecount".equals(__fieldName)) {
      this.favoritecount = (Integer) __fieldVal;
    }
    else    if ("commentcount".equals(__fieldName)) {
      this.commentcount = (Integer) __fieldVal;
    }
    else    if ("embedhtml".equals(__fieldName)) {
      this.embedhtml = (String) __fieldVal;
    }
    else    if ("title".equals(__fieldName)) {
      this.title = (String) __fieldVal;
    }
    else    if ("description".equals(__fieldName)) {
      this.description = (String) __fieldVal;
    }
    else    if ("category".equals(__fieldName)) {
      this.category = (String) __fieldVal;
    }
    else    if ("dancer".equals(__fieldName)) {
      this.dancer = (String) __fieldVal;
    }
    else    if ("heuristic".equals(__fieldName)) {
      this.heuristic = (Double) __fieldVal;
    }
    else    if ("relevance".equals(__fieldName)) {
      this.relevance = (Integer) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
}
